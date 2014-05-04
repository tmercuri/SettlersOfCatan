package edu.brown.cs032.eheimark.catan.launch.screens.jcomponents;

import javax.swing.Action;
import javax.swing.JButton;

import edu.brown.cs032.eheimark.catan.gui.Constants;

/**
 * The Class CatanMenuButton is used to maintain settings for buttons on the launch menu.
 */
public class CatanMenuButton extends JButton {
	private static final long serialVersionUID = -2553782016402532610L;

	/**
	 * Instantiates a new catan menu button.
	 *
	 * @param name the name
	 */
	public CatanMenuButton(String name) {
		super(name);
		setPreferredSize(Constants.DEFAULT_BUTTON_SIZE);
		setMinimumSize(Constants.DEFAULT_BUTTON_SIZE);
		setMaximumSize(Constants.DEFAULT_BUTTON_SIZE);
		setFont(Constants.DEFAULT_BUTTON_FONT);
		setForeground(Constants.CATAN_RED);
	}
	
	public CatanMenuButton(Action e) {
		super(e);
		setPreferredSize(Constants.DEFAULT_BUTTON_SIZE);
		setMinimumSize(Constants.DEFAULT_BUTTON_SIZE);
		setMaximumSize(Constants.DEFAULT_BUTTON_SIZE);
		setFont(Constants.DEFAULT_BUTTON_FONT);
		setForeground(Constants.CATAN_RED);
	}
}
