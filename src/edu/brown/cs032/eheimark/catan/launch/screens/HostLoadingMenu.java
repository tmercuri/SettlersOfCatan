package edu.brown.cs032.eheimark.catan.launch.screens;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.text.DefaultCaret;

import edu.brown.cs032.atreil.catan.networking.server.CatanServer;
import edu.brown.cs032.eheimark.catan.launch.SettlersOfCatan;
import edu.brown.cs032.eheimark.catan.launch.screens.jcomponents.CatanMenuButton;
import edu.brown.cs032.eheimark.catan.launch.screens.jcomponents.CatanScrollPane;

/**
 * The Class HostLoading is the launch menu page that displays host server status.
 * At the top of the page is a JTextArea that continually displays messages indicating server status.
 */
public class HostLoadingMenu extends CatanMenu {
	private static final long serialVersionUID = 1L;
	private final JButton back; // Back button
	private final CatanScrollPane jsp; // Scrollable pane for jta
	private final JTextArea jta; // JTA for server updates
	private final ServerUpdate su; // Thread to up the JTextArea with messages from the CatanServer
	private final SettlersOfCatan soc;
	private CatanServer cs; // Reference to Catan Server

	/**
	 * Instantiates a new host loading menu.
	 * @param socIn reference to Settlers Of Catan class instance (which contains launch configurations etc)
	 */
	public HostLoadingMenu(SettlersOfCatan socIn) {
		super();
		this.soc = socIn;
		jsp = new CatanScrollPane(); 
		jta = jsp.getTextArea();
		DefaultCaret caret = (DefaultCaret)jta.getCaret();
		caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
		jta.append("Trying to launch server...\n");
		back = new CatanMenuButton("Main Menu");
		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {
					@Override
					public void run() {
						if(cs != null) { 
							cs.kill(); 
						}
						if(su != null) {
							su.interrupt();
						}
						soc.getFrame().setPage(new MainMenu(soc));
						soc.getFrame().playMusic();
						repaint();
					}
				});
			}
		});
		addComponent(jsp);
		addComponent(back);
		su = new ServerUpdate();
		su.start();
	}

	/**
	 * The Class ServerUpdate updates the JTextArea with messages from the server
	 */
	private class ServerUpdate extends Thread {
		@SuppressWarnings("deprecation")
		@Override
		public void run() {
			try {
				cs = new CatanServer(soc.getLaunchConfiguration());
				cs.start();
				SwingUtilities.invokeLater(new Runnable() {
					@Override	
					public void run() {
						jta.append("Server launched successfully!\n");
					}
				});
				while(cs.isServerRunning()) {
					final String status = cs.readStatus();
					SwingUtilities.invokeLater(new Runnable() {
						@Override	
						public void run() {
							jta.append(status);
						}
					});
				}
			} catch (IllegalArgumentException | IOException e) {
				SwingUtilities.invokeLater(new Runnable() {
					@Override	
					public void run() {
						jta.append("Error: " + e.getMessage() + "\n");
						jta.append("Please try again!");
					}
				});
			}
		}
	}
	
	/**
	 * Sets the focus for easy keyboard shortcuts.
	 */
	@Override
	public void requestFocus() {
		super.requestFocus();
		back.requestFocus();
	}
}
