package edu.brown.cs032.sbreslow.catan.gui.board;

import static edu.brown.cs032.sbreslow.catan.gui.board.GUIConstants.Edge.blue;
import static edu.brown.cs032.sbreslow.catan.gui.board.GUIConstants.Edge.orange;
import static edu.brown.cs032.sbreslow.catan.gui.board.GUIConstants.Edge.red;
import static edu.brown.cs032.sbreslow.catan.gui.board.GUIConstants.Edge.white;
import static edu.brown.cs032.sbreslow.catan.gui.board.GUIConstants.Node.*;
import edu.brown.cs032.tmercuri.catan.logic.Player;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.util.List;

public class Node extends BoardComponent{
    
    private static final long serialVersionUID = 6550573061205903539L;
	
	private List<Tile> _tiles = new ArrayList<>();
	private List<Edge> _edges = new ArrayList<>();
	private int _vp;
	private boolean _owned;
	private Ellipse2D _o;
	private Color _c;
	public final static int _diam = 20;
	private final int _scale = 1;
	private Player _owner;
	private int _port;
	
	public Node(int x, int y){
		super();
		this.setLocation(new Point(x,y));
		_owned = false;
		_owner = null;
		_o = new Ellipse2D.Double(this.getX(), this.getY(), _diam, _diam);
		_c = Color.BLACK;
		_vp = 0;
		this.setType(2);
		_port = 6;
	}
	
	public void setLoc(int x, int y){
		this.setLocation(new Point(x,y));
		_o = new Ellipse2D.Double(this.getX(), this.getY(), _diam, _diam);
	}
	
	public int getPort(){
		return _port;
	}
	
	public void setPort(int port){
		_port = port;
	}
	
	public boolean isOwned(){
		return _owned;
	}
	
	public void setOwner(Player p){
		_owned = true;
		_owner = p;
	}
	
	public Player getOwner(){
		if(_owned){
			return _owner;
		}
		else{
			return null;
		}
	}
	
	public List<Tile> getTiles(){
		return _tiles;
	}
	
	public Tile getTile(int index) throws ArrayIndexOutOfBoundsException{
		return _tiles.get(index);
	}
	
	public void setTiles(List<Tile> list){
		_tiles = list;
	}
	
	public List<Edge> getEdges(){
		return _edges;
	}
	
	public Edge getEdge(int index) throws ArrayIndexOutOfBoundsException{
		return _edges.get(index);
	}
	
	public void setEdges(List<Edge> list){
		_edges = list;
	}
	
	public void setVP(int vp){
		_vp = vp;
	}
	
	public int getVP(){
		return _vp;
	}
	
	/*public Port getPort(){
		return _port;
	}*/
	
	@Override
	public void paint(Graphics g){
		Graphics2D brush = (Graphics2D) g;
		brush.setColor(_c);
		brush.setStroke(new BasicStroke());
		//brush.fill(_o);
		brush.setColor(Color.WHITE);
		Rectangle r = _o.getBounds();
		if(_scale>1){
			brush.setColor(Color.black);
		}
		//brush.drawChars(toprint, 0, 1, (int)r.getCenterX()-Node._diam/4, (int)r.getCenterY()+Node._diam/4);
		//brush.fillOval(this.getX(), this.getY(), 4, 4);
        Image building = null;
        switch (_vp) {
        case 0:
            switch (_ghostLevel) {
                case 0:
                    break;
                case 1:
                    if (_lookerColor.equals(red)) building = settlementRedGhost;
                    else if (_lookerColor.equals(blue)) building = settlementBlueGhost;
                    else if (_lookerColor.equals(orange)) building = settlementOrangeGhost;
                    else if (_lookerColor.equals(white)) building = settlementWhiteGhost;
                    break;
                case 2:
                    if (_lookerColor.equals(red)) building = settlementRed;
                    else if (_lookerColor.equals(blue)) building = settlementBlue;
                    else if (_lookerColor.equals(orange)) building = settlementOrange;
                    else if (_lookerColor.equals(white)) building = settlementWhite;
                    break;
            }
            break;
        case 1:
            if (!_owner.getColor().equals(_lookerColor)) {
                if (_owner.getColor().equals(red)) {
                    building = settlementRed;
                } else if (_owner.getColor().equals(blue)) {
                    building = settlementBlue;
                } else if (_owner.getColor().equals(orange)) {
                    building = settlementOrange;
                } else if (_owner.getColor().equals(white)) {
                    building = settlementWhite;
                }
            } else {
                switch (_ghostLevel) {
                case 0:
                    break;
                case 1:
                    if (_lookerColor.equals(red)) building = cityRedGhost;
                    else if (_lookerColor.equals(blue)) building = cityBlueGhost;
                    else if (_lookerColor.equals(orange)) building = cityOrangeGhost;
                    else if (_lookerColor.equals(white)) building = cityWhiteGhost;
                    break;
                case 2:
                    if (_lookerColor.equals(red)) building = cityRed;
                    else if (_lookerColor.equals(blue)) building = cityBlue;
                    else if (_lookerColor.equals(orange)) building = cityOrange;
                    else if (_lookerColor.equals(white)) building = cityWhite;
                    break;
            }
            }
            break;
        case 2:
            if (_owner.getColor().equals(red)) {
                building = cityRed;
            } else if (_owner.getColor().equals(blue)) {
                building = cityBlue;
            } else if (_owner.getColor().equals(orange)) {
                building = cityOrange;
            } else if (_owner.getColor().equals(white)) {
                building = cityWhite;
            }
            break;
        }
        brush.drawImage(building, (int)r.getCenterX()-10, (int)r.getCenterY()-10, null);
	}
	
    @Override
	public Shape getShape(){
		return _o;
	}

	@Override
	public void setColor(Color c) {
		_c = c;
	}

    @Override
	public void grow() {
    	if(_vp==0 || _vp==1){
    		_vp++;
    	}
	}

}
