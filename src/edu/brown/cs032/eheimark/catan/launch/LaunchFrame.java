package edu.brown.cs032.eheimark.catan.launch;

import static edu.brown.cs032.sbreslow.catan.gui.board.GUIConstants.Icon.icon;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.newdawn.easyogg.OggClip;

import edu.brown.cs032.sbreslow.catan.gui.board.GUIConstants;

/**
 * The Class CatanFrame is the JFrame that contains the launch menus.
 */
public class LaunchFrame extends JFrame {
	private static final long serialVersionUID = 3217630893235110100L;
	private OggClip _music; // Launch music

	/**
	 * Instantiates a new Catan frame.
	 *
	 * @param p the initial pane
	 * @param name the name of the frame
	 */
	public LaunchFrame(JPanel p, String name) {
		super(name);
		setPage(p);
		setMusic();
		setResizable(false);
        setIconImage(icon);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setMinimumSize(GUIConstants.Dimensions.DEFAULT_MENU_SIZE);
		pack();
		setVisible(true);
		setLocationRelativeTo(null); // Java 1.8 has bug that requires you to set location after
	}

	/**
	 * Sets the music.
	 */
	private void setMusic() {
		try {
			_music = new OggClip("music/menu.ogg");
			_music.setGain(.75f);
			_music.loop();
		} catch (IOException ex) {
			System.err.println(String.format("ERROR: %s", ex.getMessage()));
		}
	}

	/**
	 * Stops the music.
	 */
	public void stopMusic() {
		_music.stop();
	}

	/**
	 * Plays the music.
	 */
	public void playMusic() {
		_music.setGain(.75f);
		_music.loop();
	}

	/**
	 * Sets the page.
	 *
	 * @param page the new page to swap out old JPanel for
	 */
	public void setPage(JPanel page) {
		setContentPane(page);
		page.requestFocus();
		pack();
		repaint();
	}

	/**
	 * Exits JFrame.
	 */
	public void exit() {
		super.setVisible(false);
		super.dispose();
		_music.stop();
	}
}
