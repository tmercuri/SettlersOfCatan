package edu.brown.cs032.eheimark.catan.gui.tutorial;

import static edu.brown.cs032.sbreslow.catan.gui.board.GUIConstants.Dimensions.TUTORIAL_FRAME_SIZE;
import static edu.brown.cs032.sbreslow.catan.gui.board.GUIConstants.Misc.back;
import static edu.brown.cs032.sbreslow.catan.gui.board.GUIConstants.Misc.brickTileIcon;
import static edu.brown.cs032.sbreslow.catan.gui.board.GUIConstants.Misc.brickToken;
import static edu.brown.cs032.sbreslow.catan.gui.board.GUIConstants.Misc.forward;
import static edu.brown.cs032.sbreslow.catan.gui.board.GUIConstants.Misc.oreTileIcon;
import static edu.brown.cs032.sbreslow.catan.gui.board.GUIConstants.Misc.oreToken;
import static edu.brown.cs032.sbreslow.catan.gui.board.GUIConstants.Misc.sheepTileIcon;
import static edu.brown.cs032.sbreslow.catan.gui.board.GUIConstants.Misc.wheatTileIcon;
import static edu.brown.cs032.sbreslow.catan.gui.board.GUIConstants.Misc.wheatToken;
import static edu.brown.cs032.sbreslow.catan.gui.board.GUIConstants.Misc.woodTileIcon;
import static edu.brown.cs032.sbreslow.catan.gui.board.GUIConstants.Misc.woodToken;
import static edu.brown.cs032.sbreslow.catan.gui.board.GUIConstants.Misc.woolToken;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

/**
 * The Class Tutorial is the pop-up JFrame that is an in-game Settlers of Catan 
 * Tutorial.
 */
public class Tutorial extends JFrame{
	private static final long serialVersionUID = -4734812642841199492L;

	private JPanel _myTutorialPanel; // The main JPanel on the screen
	private final ArrayList<TutorialPage> _pages; // Array list of all the pages
	private final JButton forwardButton, backButton; // Back /forward buttons
	private int _idx; // Index to current page

	/**
	 * Instantiates a new tutorial.
	 */
	public Tutorial() {
		super("Tutorial");
		_myTutorialPanel = new JPanel();
		_pages = new ArrayList<>();

		backButton = new JButton(); // flip tutorial page left
		backButton.addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {
					@Override
					public void run() {
						swapPage(findPrevious());
					}
				});
			}
		}); 
		backButton.setIcon(back);

		forwardButton = new JButton(); // flip tutorial page right
		forwardButton.addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {
					@Override
					public void run() {
						swapPage(findNext());
					}
				});
			}
		}); 
		forwardButton.setIcon(forward);

		backButton.setPreferredSize(new Dimension(back.getIconWidth(), back.getIconHeight()));
		forwardButton.setPreferredSize(new Dimension(forward.getIconWidth(), forward.getIconHeight()));

		forwardButton.setOpaque(false);
		forwardButton.setContentAreaFilled(false);
		forwardButton.setBorderPainted(false);
		backButton.setOpaque(false);
		backButton.setContentAreaFilled(false);
		backButton.setBorderPainted(false);

		addPages(); // add the pages to the Tutorial
		_idx = -1; // findNext() increments by 1, so start at 0
		swapPage(findNext());

		setMaximumSize(TUTORIAL_FRAME_SIZE);
		setMinimumSize(TUTORIAL_FRAME_SIZE);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		pack();
		setVisible(true);
	}

	/**
	 * Find next page in tutorial.
	 *
	 * @return the tutorial page
	 */
	private TutorialPage findNext() {
		_idx = (_idx + 1) % _pages.size();
		return _pages.get(_idx);
	}

	/**
	 * Find previous page in tutorial.
	 *
	 * @return the tutorial page
	 */
	public TutorialPage findPrevious() {
		_idx = (_idx - 1 + _pages.size()) % _pages.size();
		return _pages.get(_idx);
	}

	/**
	 * Swap page: Switch out the current tutorial page
	 *
	 * @param page the new page to insert
	 */
	private void swapPage(TutorialPage page) {
		remove(_myTutorialPanel);
		_myTutorialPanel = new JPanel(new BorderLayout());
		_myTutorialPanel.add(backButton, BorderLayout.WEST);
		_myTutorialPanel.add(page, BorderLayout.NORTH);
		_myTutorialPanel.add(forwardButton, BorderLayout.EAST);
		JLabel pgNumber = new JLabel(_idx + "/" + (_pages.size() - 1)); // Show page # at bottom
		pgNumber.setHorizontalAlignment(SwingConstants.CENTER);
		_myTutorialPanel.add(pgNumber);
		add(_myTutorialPanel, BorderLayout.CENTER);
		_myTutorialPanel.repaint();
		_myTutorialPanel.revalidate();

	}

	/**
	 * Adds all of the pages to the tutorial.
	 */
	private void addPages() {
		_pages.add(new TutorialPage("***SETTLERS TUTORIAL***\n\nClick to continue."));
		_pages.add(new TutorialPage("In the game Settlers of Catan, there are five types of resources..."));
		_pages.add(new TutorialPage("Brick", brickToken));
		_pages.add(new TutorialPage("Ore", oreToken));
		_pages.add(new TutorialPage("Wool", woolToken));
		_pages.add(new TutorialPage("Wheat", wheatToken));
		_pages.add(new TutorialPage("Wood", woodToken));
		_pages.add(new TutorialPage("Each tile marked with the number rolled produces one resource for each adjacent village and two resources for each adjacent city."));
		_pages.add(new TutorialPage("There are five types of tiles..."));
		_pages.add(new TutorialPage("Brick Tile", brickTileIcon));
		_pages.add(new TutorialPage("Ore Tile", oreTileIcon));
		_pages.add(new TutorialPage("Sheep Tile", sheepTileIcon));
		_pages.add(new TutorialPage("Wheat Tile", wheatTileIcon));
		_pages.add(new TutorialPage("Wood Tile", woodTileIcon));
		_pages.add(new TutorialPage("You can use resources to build roads, settlements, cities, and development cards. A Settlement is worth one Victory Point. A City is worth two Victory Points."));
		_pages.add(new TutorialPage("\nThe first player to reach \nten Victory Points wins!"));
		_pages.add(new TutorialPage("The Robber (JJ): If a player rolls a seven, three actions are taken:\n(i) Any player with more than seven cards must discard half their cards."));
		_pages.add(new TutorialPage("(ii) The player moves the Robber to any tile other than its current tile.\n(iii) The active player steals a resource from a player with a village adj. to the Robber."));
		_pages.add(new TutorialPage("After rolling the die, users can:\n(a) build,\n(b) trade,\n(c) play a development card."));
		_pages.add(new TutorialPage("There are five types of development cards..."));
		_pages.add(new TutorialPage("Knight Dev. Card:\nMove robber. If you play 3x, you get the Largest Army."));
		_pages.add(new TutorialPage("Road Builder Dev. Card:\nBuild two roads."));
		_pages.add(new TutorialPage("Year of Plenty Dev. Card:\nTake any two resources from the bank."));
		_pages.add(new TutorialPage("Monopoly Dev. Card:\nChoose a resource and all resources of that type will be taken from all other players and given to you."));
		_pages.add(new TutorialPage("Victory Point Dev. Card:\n+1 VP."));
		_pages.add(new TutorialPage("The game begins by having players place two initial settlements and two initial roads. "));
		_pages.add(new TutorialPage("Once your turn begins, roll the dice. Then trade, build, or play a development card!"));
		_pages.add(new TutorialPage("To propose a trade, select your proposed trade by using drag and drop! Players can negotiate trades with other players using the chat system."));
		_pages.add(new TutorialPage("Ports allow players to trade via fixed exchange rates. To trade via ports, you must build a settlement on a coast."));
		_pages.add(new TutorialPage("After building a settlement on a coast, select ***MERCHANT*** on the trade menu to trade via ports."));
		_pages.add(new TutorialPage("A generic port (?) allows 3:1 trading, whereas a Port with a specific resource allows 2:1 trading for that resource."));
		_pages.add(new TutorialPage("Players can also trade with the ***MERCHANT***  at a 4:1 ratio at any time."));
		_pages.add(new TutorialPage("Use the chat box to chat, or /p <player> <msg> to private message. Use up/down for chat history."));
		_pages.add(new TutorialPage("There are also keyboard shortcuts..."));
		_pages.add(new TutorialPage("CTRL+C=ChatBox, CTRL+O=Overview, CTRL+B=Build, CTRL+T=Trade, CTRL+D=DevCard, CTRL+R=ROLL"));
		_pages.add(new TutorialPage("***END TUTORIAL***"));
	}
	
	public static void main(String[] args) {
		new Tutorial();
	}
}
