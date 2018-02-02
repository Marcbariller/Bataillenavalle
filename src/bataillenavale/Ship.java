package bataillenavale;	

public class Ship {

    public static int iD; //the type of the ship
    public static int x; //the row where the ship start
    public static int y; //the column where the ship start
    public static int width;//width of the ship

    public Ship(int iD, int y,int x, int width) {
        Ship.iD = iD;
        Ship.x = x;
        Ship.y = y;
        Ship.width = width;
    }

    public int getLength() {
        return width;
    }

    public void setLength(int width) {
        Ship.width = width;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        Ship.iD = iD;
    }

    public int gety() {
        return y;
    }

    public void sety(int y) {
        Ship.y = y;
    }

    public int getx() {
        return x;
    }

    public void setx(int x) {
        Ship.x = x;
    }
}
