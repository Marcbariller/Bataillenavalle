package bataillenavale;

public class Ship {

	public static int iD; // the type of the ship
	public static int y; // the row where the ship start (for painting)
	public static int x; // the column where the ship start (for painting)
	public static int width;// length of the ship

	public Ship(int iD, int x, int y, int width) {
		Ship.iD = iD;
		Ship.y = y;
		Ship.x = x;
		Ship.width = width;
	}

	public int getLength() {
		return width;
	}

	public void setWidth(int width) {
		Ship.width = width;
	}

	public int getShipType() {
		return iD;
	}

	public void setShipType(int shipType) {
		Ship.iD = shipType;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		Ship.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		Ship.x = x;
	}

}
