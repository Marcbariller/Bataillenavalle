package bataillenavale;

import java.util.Scanner;

public class Map {

	public static int mapWidth = 18;
	public static int mapHeight = 24;
	private int[][] map = new int[mapWidth][mapHeight];

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

	public static int[][] shipPlacing(int[][] map, int iD, int x, int y, int width, int direction) {
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
		Scanner scanner = new Scanner(System.in); 
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int direction = scanner.nextInt();
		boolean flag = true;
		
		if (direction == 0) {
			for (int i = 0; i < mapWidth; i++) {
				if (((x + i) >= mapWidth) || (map[x + i][y] != 0)) {
					flag = false;
				}
			}
		} else {
			for (int i = 0; i < mapHeight; i++) {
				if ((y + i >= mapHeight) || (map[x][y + i] != 0)) {
					flag = false;
				}
			}
		}
		if (flag == true) {
			shipPlacing(map, iD, x, y, width, direction);
		} else {
			System.out.println("Your ship cannot be placed in this place, thank you for choosing a new place :");
		}
		return map;
	}
}
