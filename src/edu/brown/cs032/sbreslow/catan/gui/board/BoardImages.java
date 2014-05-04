/*
 * Thomas Mercurio, tmercuri
 * CS032, Spring 2014
 */

package edu.brown.cs032.sbreslow.catan.gui.board;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;

/**
 *
 * @author Thomas Mercurio
 */
public class BoardImages {
	public static class Node {
		public static final Image settlementRedGhost1 = new ImageIcon("images/pieces/settlement_red_ghost_1.png").getImage();
		public static final Image settlementRedGhost2 = new ImageIcon("images/pieces/settlement_red_ghost_2.png").getImage();
		public static final Image settlementRed = new ImageIcon("images/pieces/settlement_red.png").getImage();

		public static final Image settlementBlueGhost1 = new ImageIcon("images/pieces/settlement_blue_ghost_1.png").getImage();
		public static final Image settlementBlueGhost2 = new ImageIcon("images/pieces/settlement_blue_ghost_2.png").getImage();
		public static final Image settlementBlue = new ImageIcon("images/pieces/settlement_blue.png").getImage();

		public static final Image settlementOrangeGhost1 = new ImageIcon("images/pieces/settlement_orange_ghost_1.png").getImage();
		public static final Image settlementOrangeGhost2 = new ImageIcon("images/pieces/settlement_orange_ghost_2.png").getImage();
		public static final Image settlementOrange = new ImageIcon("images/pieces/settlement_orange.png").getImage();

		public static final Image settlementWhiteGhost1 = new ImageIcon("images/pieces/settlement_white_ghost_1.png").getImage();
		public static final Image settlementWhiteGhost2 = new ImageIcon("images/pieces/settlement_white_ghost_2.png").getImage();
		public static final Image settlementWhite = new ImageIcon("images/pieces/settlement_white.png").getImage();

		public static final Image cityRedGhost1 = new ImageIcon("images/pieces/city_red_ghost_1.png").getImage();
		public static final Image cityRedGhost2 = new ImageIcon("images/pieces/city_red_ghost_2.png").getImage();
		public static final Image cityRed = new ImageIcon("images/pieces/city_red.png").getImage();

		public static final Image cityBlueGhost1 = new ImageIcon("images/pieces/city_blue_ghost_1.png").getImage();
		public static final Image cityBlueGhost2 = new ImageIcon("images/pieces/city_blue_ghost_2.png").getImage();
		public static final Image cityBlue = new ImageIcon("images/pieces/city_blue.png").getImage();

		public static final Image cityOrangeGhost1 = new ImageIcon("images/pieces/city_orange_ghost_1.png").getImage();
		public static final Image cityOrangeGhost2 = new ImageIcon("images/pieces/city_orange_ghost_2.png").getImage();
		public static final Image cityOrange = new ImageIcon("images/pieces/city_orange.png").getImage();

		public static final Image cityWhiteGhost1 = new ImageIcon("images/pieces/city_white_ghost_1.png").getImage();
		public static final Image cityWhiteGhost2 = new ImageIcon("images/pieces/city_white_ghost_2.png").getImage();
		public static final Image cityWhite = new ImageIcon("images/pieces/city_white.png").getImage();

	}

	public static class Edge {
		public static final Image brickPort = new ImageIcon("images/ports/brick.png").getImage();
		public static final Image genericNorthPort = new ImageIcon("images/ports/generic_north.png").getImage();
		public static final Image genericNorthwestPort = new ImageIcon("images/ports/generic_northwest.png").getImage();
		public static final Image genericSoutheastPort = new ImageIcon("images/ports/generic_southeast.png").getImage();
		public static final Image genericSouthwestPort = new ImageIcon("images/ports/generic_southwest.png").getImage();
		public static final Image orePort = new ImageIcon("images/ports/ore.png").getImage();
		public static final Image sheepPort = new ImageIcon("images/ports/sheep.png").getImage();
		public static final Image wheatPort = new ImageIcon("images/ports/wheat.png").getImage();
		public static final Image woodPort = new ImageIcon("images/ports/wood.png").getImage();

		public static final Color redGhost1 = new Color(253, 153, 153);
		public static final Color redGhost2 = new Color(252, 77, 77);
		public static final Color red = new Color(252, 1, 1);

		public static final Color blueGhost1 = new Color(153, 188, 211);
		public static final Color blueGhost2 = new Color(76, 138, 179);
		public static final Color blue = new Color(0, 88, 147);

		public static final Color orangeGhost1 = new Color(253, 197, 153);
		public static final Color orangeGhost2 = new Color(252, 154, 76);
		public static final Color orange = new Color(251, 111, 0);

		public static final Color whiteGhost1 = new Color(201, 203, 203);
		public static final Color whiteGhost2 = new Color(226, 228, 228);
		public static final Color white = new Color(252, 254, 254);

	}

	public static class Tile {

		public static final Image brickTile = new ImageIcon("images/tiles/brick.png").getImage();
		public static final Image desertTile = new ImageIcon("images/tiles/desert.png").getImage();
		public static final Image oceanTile = new ImageIcon("images/tiles/ocean.png").getImage();
		public static final Image oreTile = new ImageIcon("images/tiles/ore.png").getImage();
		public static final Image sheepTile = new ImageIcon("images/tiles/sheep.png").getImage();
		public static final Image wheatTile = new ImageIcon("images/tiles/wheat.png").getImage();
		public static final Image woodTile = new ImageIcon("images/tiles/wood.png").getImage();


		public static final Image two = new ImageIcon("images/numbers/2.png").getImage();
		public static final Image three = new ImageIcon("images/numbers/3.png").getImage();
		public static final Image four = new ImageIcon("images/numbers/4.png").getImage();
		public static final Image five = new ImageIcon("images/numbers/5.png").getImage();
		public static final Image six = new ImageIcon("images/numbers/6.png").getImage();
		public static final Image eight = new ImageIcon("images/numbers/8.png").getImage();
		public static final Image nine = new ImageIcon("images/numbers/9.png").getImage();
		public static final Image ten = new ImageIcon("images/numbers/10.png").getImage();
		public static final Image eleven = new ImageIcon("images/numbers/11.png").getImage();
		public static final Image twelve = new ImageIcon("images/numbers/12.png").getImage();

		public static final Image robberGhost1 = new ImageIcon("images/pieces/robber_ghost_1.png").getImage();
		public static final Image robberGhost2 = new ImageIcon("images/pieces/robber_ghost_2.png").getImage();
		public static final Image robber = new ImageIcon("images/pieces/robber.png").getImage();
	}

	public static class Misc {
		public static final ImageIcon brickTileIcon = new ImageIcon("images/tiles/brick.png");
		public static final ImageIcon desertTileIcon = new ImageIcon("images/tiles/desert.png");
		public static final ImageIcon oceanTileIcon = new ImageIcon("images/tiles/ocean.png");
		public static final ImageIcon oreTileIcon = new ImageIcon("images/tiles/ore.png");
		public static final ImageIcon sheepTileIcon = new ImageIcon("images/tiles/sheep.png");
		public static final ImageIcon wheatTileIcon = new ImageIcon("images/tiles/wheat.png");
		public static final ImageIcon woodTileIcon = new ImageIcon("images/tiles/wood.png");
		public static final ImageIcon settlement = new ImageIcon("images/pieces/settlement_red.png");
		public static final ImageIcon city = new ImageIcon("images/pieces/city_red.png");
		public static final ImageIcon road = new ImageIcon("images/pieces/road_red.png");
		public static final ImageIcon monopoly = new ImageIcon("images/dev_cards/monopoly.png");
		public static final ImageIcon back = new ImageIcon("images/back.png");
		public static final ImageIcon forward = new ImageIcon("images/forward.png");
		
		// stuff above is for the tutorial

		public static final ImageIcon arrow = new ImageIcon("images/misc/arrow.png");

		public static final Image ports = new ImageIcon("images/ports/ports.png").getImage();

		public static final ImageIcon brickToken = new ImageIcon("images/resource_tokens/brick.png");
		public static final ImageIcon oreToken = new ImageIcon("images/resource_tokens/ore.png");
		public static final ImageIcon woolToken = new ImageIcon("images/resource_tokens/sheep.png");
		public static final ImageIcon wheatToken = new ImageIcon("images/resource_tokens/wheat.png");
		public static final ImageIcon woodToken = new ImageIcon("images/resource_tokens/wood.png");

		public static final ImageIcon brickTokenGray = new ImageIcon("images/resource_tokens/brick_gray.png");
		public static final ImageIcon oreTokenGray = new ImageIcon("images/resource_tokens/ore_gray.png");
		public static final ImageIcon woolTokenGray = new ImageIcon("images/resource_tokens/sheep_gray.png");
		public static final ImageIcon wheatTokenGray = new ImageIcon("images/resource_tokens/wheat_gray.png");
		public static final ImageIcon woodTokenGray = new ImageIcon("images/resource_tokens/wood_gray.png");

		public static final ImageIcon buildRoad = new ImageIcon("images/resource_tokens/build_road.png");
		public static final ImageIcon buildSettlement = new ImageIcon("images/resource_tokens/build_settlement.png");
		public static final ImageIcon buildCity = new ImageIcon("images/resource_tokens/build_city.png");
		public static final ImageIcon buildDevCard = new ImageIcon("images/resource_tokens/build_dev_card.png");

		public static final ImageIcon musicOn = new ImageIcon("images/misc/music_on.png");
		public static final ImageIcon musicOff = new ImageIcon("images/misc/music_off.png");
		public static final ImageIcon question = new ImageIcon("images/misc/question.png");

	}

	public static class Background {
		public static final Image felt = new ImageIcon("images/backgrounds/felt.png").getImage();
		public static final ImageIcon feltcon = new ImageIcon("images/backgrounds/felt.png");
		public static final Image wood = new ImageIcon("images/backgrounds/wood.png").getImage();
	}

	public static class DevCard {
		public static final Image knight = new ImageIcon("images/dev_cards/knight.png").getImage();
		public static final double w = new ImageIcon("images/dev_cards/knight.png").getIconWidth();
		public static final double h = new ImageIcon("images/dev_cards/knight.png").getIconHeight();
		public static final Image monopoly = new ImageIcon("images/dev_cards/monopoly.png").getImage();
		public static final Image roadBuilder = new ImageIcon("images/dev_cards/road_builder.png").getImage();
		public static final Image yearOfPlenty = new ImageIcon("images/dev_cards/year_of_plenty.png").getImage();
		public static final Image victoryPoint = new ImageIcon("images/dev_cards/victory_point.png").getImage();
		public static final double wVP = new ImageIcon("images/dev_cards/victory_point.png").getIconWidth();
		public static final double hVP = new ImageIcon("images/dev_cards/victory_point.png").getIconHeight();
	}
}
