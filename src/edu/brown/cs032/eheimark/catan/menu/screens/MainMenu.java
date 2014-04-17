package edu.brown.cs032.eheimark.catan.menu.screens;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import edu.brown.cs032.eheimark.catan.jcomponents.CatanMenuButton;
import edu.brown.cs032.eheimark.catan.menu.LaunchMenu;

public class MainMenu extends CatanMenu {
	private static final long serialVersionUID = 1L;
	private final JButton host, join, settings, profile, quit;
	
	public MainMenu() {
		super();

		host = new CatanMenuButton("Host");
		host.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				LaunchMenu.frame.setPage(new HostMenu());
			}
		});

		join = new CatanMenuButton("Join");
		join.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				LaunchMenu.frame.setPage(new JoinGameMenu());
			}
		});

		
		settings = new CatanMenuButton("Settings");
		settings.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				LaunchMenu.frame.setPage(new SettingsMenu());
			}
		});
		
		profile = new CatanMenuButton("Profile");
		profile.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				LaunchMenu.frame.setPage(new ProfileMenu());
			}
		});
		
		quit = new CatanMenuButton("Quit");
		quit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				LaunchMenu.frame.exit();
			}
		});

		addButton(host);
		addButton(join);
		addButton(profile);
		addButton(settings);
		addButton(quit);
	}
}