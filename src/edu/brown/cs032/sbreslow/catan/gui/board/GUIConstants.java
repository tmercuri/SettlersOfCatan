/*
 * Thomas Mercurio, tmercuri
 * CS032, Spring 2014
 */

package edu.brown.cs032.sbreslow.catan.gui.board;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;

/**
 *
 * @author Thomas Mercurio
 */
public class GUIConstants {
	public static class Fonts {
		public static final Font DEFAULT_LABEL_FONT  = new Font("Georgia", Font.PLAIN, 14);
		public static final Font DEFAULT_BUTTON_FONT  = new Font("Georgia", Font.BOLD, 20);
		public static final Font MY_FONT_SMALL = new Font("Georgia", Font.BOLD, 13);
		public static final Font ALERT_MENU_FONT = new Font("Georgia", Font.BOLD, 40);
		public static final Font MY_FONT_ACTIVEPLAYER = new Font("Georgia", Font.BOLD, 15);
		public static final Font OVERVIEW_TAB_FONT = new Font("Georgia", Font.PLAIN, 15);
		public static final Font OVERVIEW_TAB_FONT_ACTIVEPLAYER = new Font("Georgia", Font.BOLD, 20);
		public static final Font OVERVIEW_TAB_FONT_HEADER = new Font("Georgia", Font.BOLD, 13);
	}
	
	public static class Colors {
		public static final Color CATAN_RED = new Color(225,25,10);
		public static final Color CATAN_BLUE = Color.BLUE;
		public static final Color CATAN_BLACK = Color.BLACK;
		public static final Color CATAN_WHITE = Color.WHITE;
		public static final Color CATAN_ORANGE = Color.ORANGE;
		public static final Color ACTIVE_PLAYER_OVERVIEW_COLOR = new Color(0,153,0);
	}
	
	public static class Dimensions {
		public static final Dimension MINIMUM_GUI_FRAME_SIZE = new Dimension(950, 600);
		public static final Dimension DEFAULT_BUTTON_SIZE  = new Dimension(200, 45);
		public static final Dimension DEFAULT_MENU_SIZE  = new Dimension(560, 560);
		public static final Dimension TEXTAREA_SIZE = new Dimension(400, 200);
		public static final Dimension POINTS_MENU_SIZE  = new Dimension(675, 125);
		public static final Dimension MENU_SIZE  = new Dimension(1000, 200);
		private static final int tabPanel = 150;
		public static final Dimension TAB_PANEL_MENU_SIZE = new Dimension(1000, tabPanel); // each tab in tab panel
		public static final Dimension TABBED_MENU_SIZE = new Dimension(1000, tabPanel + 10); // tabbed panel overall
		public static final Dimension GUI_SIZE = new Dimension(1000, 850);
		public static final Dimension ROLL_BUTTON = new Dimension(117,10);
		public static final Dimension PLAYER_STATS = new Dimension(375,25);
		public static final Dimension TUTORIAL_SIZE =  new Dimension(200, 75);
		public static final Dimension TUTORIAL_FRAME_SIZE = new Dimension(275, 75);;
	}
	
	
    public static class Node {
        public static final Image settlementRedGhost = new ImageIcon(GUIConstants.class.getResource("/images/pieces/settlement_red_ghost_1.png")).getImage();
        public static final Image settlementRed = new ImageIcon(GUIConstants.class.getResource("/images/pieces/settlement_red.png")).getImage();
        
        public static final Image settlementBlueGhost = new ImageIcon(GUIConstants.class.getResource("/images/pieces/settlement_blue_ghost_1.png")).getImage();
        public static final Image settlementBlue = new ImageIcon(GUIConstants.class.getResource("/images/pieces/settlement_blue.png")).getImage();
        
        public static final Image settlementOrangeGhost = new ImageIcon(GUIConstants.class.getResource("/images/pieces/settlement_orange_ghost_1.png")).getImage();
        public static final Image settlementOrange = new ImageIcon(GUIConstants.class.getResource("/images/pieces/settlement_orange.png")).getImage();
        
        public static final Image settlementWhiteGhost = new ImageIcon(GUIConstants.class.getResource("/images/pieces/settlement_white_ghost_1.png")).getImage();
        public static final Image settlementWhite = new ImageIcon(GUIConstants.class.getResource("/images/pieces/settlement_white.png")).getImage();
        
        public static final Image cityRedGhost = new ImageIcon(GUIConstants.class.getResource("/images/pieces/city_red_ghost_1.png")).getImage();
        public static final Image cityRed = new ImageIcon(GUIConstants.class.getResource("/images/pieces/city_red.png")).getImage();
        
        public static final Image cityBlueGhost = new ImageIcon(GUIConstants.class.getResource("/images/pieces/city_blue_ghost_1.png")).getImage();
        public static final Image cityBlue = new ImageIcon(GUIConstants.class.getResource("/images/pieces/city_blue.png")).getImage();
        
        public static final Image cityOrangeGhost = new ImageIcon(GUIConstants.class.getResource("/images/pieces/city_orange_ghost_1.png")).getImage();
        public static final Image cityOrange = new ImageIcon(GUIConstants.class.getResource("/images/pieces/city_orange.png")).getImage();
        
        public static final Image cityWhiteGhost = new ImageIcon(GUIConstants.class.getResource("/images/pieces/city_white_ghost_1.png")).getImage();
        public static final Image cityWhite = new ImageIcon(GUIConstants.class.getResource("/images/pieces/city_white.png")).getImage();
    }
    
    public static class Edge {
        public static final Image brickPort = new ImageIcon(GUIConstants.class.getResource("/images/ports/brick.png")).getImage();
        public static final Image genericNorthPort = new ImageIcon(GUIConstants.class.getResource("/images/ports/generic_north.png")).getImage();
        public static final Image genericNorthwestPort = new ImageIcon(GUIConstants.class.getResource("/images/ports/generic_northwest.png")).getImage();
        public static final Image genericSoutheastPort = new ImageIcon(GUIConstants.class.getResource("/images/ports/generic_southeast.png")).getImage();
        public static final Image genericSouthwestPort = new ImageIcon(GUIConstants.class.getResource("/images/ports/generic_southwest.png")).getImage();
        public static final Image orePort = new ImageIcon(GUIConstants.class.getResource("/images/ports/ore.png")).getImage();
        public static final Image sheepPort = new ImageIcon(GUIConstants.class.getResource("/images/ports/sheep.png")).getImage();
        public static final Image wheatPort = new ImageIcon(GUIConstants.class.getResource("/images/ports/wheat.png")).getImage();
        public static final Image woodPort = new ImageIcon(GUIConstants.class.getResource("/images/ports/wood.png")).getImage();
        
        public static final Color redGhost = new Color(252, 77, 77);
        public static final Color red = new Color(252, 1, 1);
        
        public static final Color blueGhost = new Color(76, 138, 179);
        public static final Color blue = new Color(0, 88, 147);
        
        public static final Color orangeGhost = new Color(252, 154, 76);
        public static final Color orange = new Color(251, 111, 0);
        
        public static final Color whiteGhost = new Color(201, 203, 203);
        public static final Color white = new Color(252, 254, 254);
        
        
    }

	public static class Tile {

		public static final Image brickTile = new ImageIcon(GUIConstants.class.getResource("/images/tiles/brick.png")).getImage();
		public static final Image desertTile = new ImageIcon(GUIConstants.class.getResource("/images/tiles/desert.png")).getImage();
		public static final Image oceanTile = new ImageIcon(GUIConstants.class.getResource("/images/tiles/ocean.png")).getImage();
		public static final Image oreTile = new ImageIcon(GUIConstants.class.getResource("/images/tiles/ore.png")).getImage();
		public static final Image sheepTile = new ImageIcon(GUIConstants.class.getResource("/images/tiles/sheep.png")).getImage();
		public static final Image wheatTile = new ImageIcon(GUIConstants.class.getResource("/images/tiles/wheat.png")).getImage();
		public static final Image woodTile = new ImageIcon(GUIConstants.class.getResource("/images/tiles/wood.png")).getImage();


		public static final Image two = new ImageIcon(GUIConstants.class.getResource("/images/numbers/2.png")).getImage();
		public static final Image three = new ImageIcon(GUIConstants.class.getResource("/images/numbers/3.png")).getImage();
		public static final Image four = new ImageIcon(GUIConstants.class.getResource("/images/numbers/4.png")).getImage();
		public static final Image five = new ImageIcon(GUIConstants.class.getResource("/images/numbers/5.png")).getImage();
		public static final Image six = new ImageIcon(GUIConstants.class.getResource("/images/numbers/6.png")).getImage();
		public static final Image eight = new ImageIcon(GUIConstants.class.getResource("/images/numbers/8.png")).getImage();
		public static final Image nine = new ImageIcon(GUIConstants.class.getResource("/images/numbers/9.png")).getImage();
		public static final Image ten = new ImageIcon(GUIConstants.class.getResource("/images/numbers/10.png")).getImage();
		public static final Image eleven = new ImageIcon(GUIConstants.class.getResource("/images/numbers/11.png")).getImage();
		public static final Image twelve = new ImageIcon(GUIConstants.class.getResource("/images/numbers/12.png")).getImage();

		public static final Image robberGhost = new ImageIcon(GUIConstants.class.getResource("/images/pieces/robber_ghost_1.png")).getImage();
		public static final Image robber = new ImageIcon(GUIConstants.class.getResource("/images/pieces/robber.png")).getImage();
	}

	public static class Misc {
		public static final String DEFAULT_HOSTNAME = "localhost";
		public static final String DEFAULT_PORT = "1700";
		
		public static final ImageIcon robber = new ImageIcon(GUIConstants.class.getResource("/images/pieces/robber.png"));
		public static final ImageIcon brickTileIcon = new ImageIcon(GUIConstants.class.getResource("/images/tiles/brick.png"));
		public static final ImageIcon desertTileIcon = new ImageIcon(GUIConstants.class.getResource("/images/tiles/desert.png"));
		public static final ImageIcon oceanTileIcon = new ImageIcon(GUIConstants.class.getResource("/images/tiles/ocean.png"));
		public static final ImageIcon oreTileIcon = new ImageIcon(GUIConstants.class.getResource("/images/tiles/ore.png"));
		public static final ImageIcon sheepTileIcon = new ImageIcon(GUIConstants.class.getResource("/images/tiles/sheep.png"));
		public static final ImageIcon wheatTileIcon = new ImageIcon(GUIConstants.class.getResource("/images/tiles/wheat.png"));
		public static final ImageIcon woodTileIcon = new ImageIcon(GUIConstants.class.getResource("/images/tiles/wood.png"));
		public static final ImageIcon settlement = new ImageIcon(GUIConstants.class.getResource("/images/misc/settlement_large.png"));
		public static final ImageIcon city = new ImageIcon(GUIConstants.class.getResource("/images/misc/city_large.png"));
		public static final ImageIcon monopoly = new ImageIcon(GUIConstants.class.getResource("/images/dev_cards/monopoly.png"));
		public static final ImageIcon back = new ImageIcon(GUIConstants.class.getResource("/images/misc/back.png"));
		public static final ImageIcon forward = new ImageIcon(GUIConstants.class.getResource("/images/misc/forward.png"));
		

		public static final ImageIcon arrow = new ImageIcon(GUIConstants.class.getResource("/images/misc/arrow.png"));

		public static final Image ports = new ImageIcon(GUIConstants.class.getResource("/images/ports/ports.png")).getImage();

		public static final ImageIcon brickToken = new ImageIcon(GUIConstants.class.getResource("/images/resource_tokens/brick.png"));
		public static final ImageIcon oreToken = new ImageIcon(GUIConstants.class.getResource("/images/resource_tokens/ore.png"));
		public static final ImageIcon woolToken = new ImageIcon(GUIConstants.class.getResource("/images/resource_tokens/sheep.png"));
		public static final ImageIcon wheatToken = new ImageIcon(GUIConstants.class.getResource("/images/resource_tokens/wheat.png"));
		public static final ImageIcon woodToken = new ImageIcon(GUIConstants.class.getResource("/images/resource_tokens/wood.png"));

		public static final ImageIcon brickTokenGray = new ImageIcon(GUIConstants.class.getResource("/images/resource_tokens/brick_gray.png"));
		public static final ImageIcon oreTokenGray = new ImageIcon(GUIConstants.class.getResource("/images/resource_tokens/ore_gray.png"));
		public static final ImageIcon woolTokenGray = new ImageIcon(GUIConstants.class.getResource("/images/resource_tokens/sheep_gray.png"));
		public static final ImageIcon wheatTokenGray = new ImageIcon(GUIConstants.class.getResource("/images/resource_tokens/wheat_gray.png"));
		public static final ImageIcon woodTokenGray = new ImageIcon(GUIConstants.class.getResource("/images/resource_tokens/wood_gray.png"));

		public static final ImageIcon buildRoad = new ImageIcon(GUIConstants.class.getResource("/images/resource_tokens/build_road.png"));
		public static final ImageIcon buildSettlement = new ImageIcon(GUIConstants.class.getResource("/images/resource_tokens/build_settlement.png"));
		public static final ImageIcon buildCity = new ImageIcon(GUIConstants.class.getResource("/images/resource_tokens/build_city.png"));
		public static final ImageIcon buildDevCard = new ImageIcon(GUIConstants.class.getResource("/images/resource_tokens/build_dev_card.png"));

		public static final ImageIcon musicOn = new ImageIcon(GUIConstants.class.getResource("/images/misc/music_on.png"));
		public static final ImageIcon musicOff = new ImageIcon(GUIConstants.class.getResource("/images/misc/music_off.png"));
		public static final ImageIcon question = new ImageIcon(GUIConstants.class.getResource("/images/misc/question.png"));

	}

	public static class Background {
		public static final Image felt = new ImageIcon(GUIConstants.class.getResource("/images/backgrounds/felt.png")).getImage();
		public static final ImageIcon feltcon = new ImageIcon(GUIConstants.class.getResource("/images/backgrounds/felt.png"));
		public static final Image wood = new ImageIcon(GUIConstants.class.getResource("/images/backgrounds/wood.png")).getImage();
		public static final Image catanLaunchMenu = new ImageIcon(GUIConstants.class.getResource("/images/backgrounds/CatanScaled560x560.png")).getImage();
	}
    
    public static class Icon {
        public static final Image icon = new ImageIcon(GUIConstants.class.getResource("/images/icons/icon.png")).getImage();
    }

	public static class DevCard {
		public static final Image knight = new ImageIcon(GUIConstants.class.getResource("/images/dev_cards/knight.png")).getImage();
		public static final double w = new ImageIcon(GUIConstants.class.getResource("/images/dev_cards/knight.png")).getIconWidth();
		public static final double h = new ImageIcon(GUIConstants.class.getResource("/images/dev_cards/knight.png")).getIconHeight();
		public static final Image monopoly = new ImageIcon(GUIConstants.class.getResource("/images/dev_cards/monopoly.png")).getImage();
		public static final Image roadBuilder = new ImageIcon(GUIConstants.class.getResource("/images/dev_cards/road_builder.png")).getImage();
		public static final Image yearOfPlenty = new ImageIcon(GUIConstants.class.getResource("/images/dev_cards/year_of_plenty.png")).getImage();
		public static final Image victoryPoint = new ImageIcon(GUIConstants.class.getResource("/images/dev_cards/victory_point.png")).getImage();
		public static final double wVP = new ImageIcon(GUIConstants.class.getResource("/images/dev_cards/victory_point.png")).getIconWidth();
		public static final double hVP = new ImageIcon(GUIConstants.class.getResource("/images/dev_cards/victory_point.png")).getIconHeight();
	}
}
