package bataillenavale;

import java.util.Random;

public class Map {

	public static int mapWidth = 18;
	public static int mapHeight = 24;
	private int[][] map = new int[mapHeight][mapWidth];

	public int[][] getMap() {
		return map;
	}

	public void setMap(int[][] map) {
		this.map = map;
	}
	
	public static int[][] initialization(int[][] map) {
		for (int i = 0; i < mapWidth; i++) {
			for (int j = 0; j < mapWidth; j++) {
				map[i][j] = 0;
			}
		}
		return map;
	}
	
	public static int[][] shipPlacing(int[][] map, int iD, int x,int y, int width, int direction ) {
		if (direction == 0) {
			for (int i = 0; i < Ship.width - 1; i++) {
				map[x + 1][y] = Ship.iD;
			}
		} else {
				for (int j = 0; j < Ship.width; j++) {
					map[x][y + 1] = Ship.iD;
				}
			}
		return map;
	}
	
	public static int[][] testShipPlacing(int[][] map, int iD, int width) {
		Random random = new Random();
		int xRand = random.nextInt(mapWidth);
		int yRand = random.nextInt(mapHeight);
		
		return map;
	}
	
}
