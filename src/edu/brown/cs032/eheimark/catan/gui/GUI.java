package edu.brown.cs032.eheimark.catan.gui;

import java.awt.BorderLayout;
import java.io.IOException;
import java.net.UnknownHostException;

import javax.swing.JPanel;

import edu.brown.cs032.atreil.catan.networking.client.CatanClient;
import edu.brown.cs032.eheimark.catan.gui.navigator.TabbedPanel;
import edu.brown.cs032.eheimark.catan.menu.LaunchMenu;
import edu.brown.cs032.sbreslow.catan.gui.board.DrawingPanel;

public class GUI extends JPanel {
	private final CatanClient client;
	private JPanel gameBoard, tabbedMenu, chatBox;
	
	//TODO: Delete throws
	public GUI(CatanClient cc) {
		super(new BorderLayout());
		this.client = cc;
		gameBoard = new DrawingPanel();
		add(gameBoard, BorderLayout.CENTER);		
		tabbedMenu = new TabbedPanel(client);
		add(tabbedMenu, BorderLayout.SOUTH);

	}

}
