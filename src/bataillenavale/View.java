package bataillenavale;

public class View {
	// Change symbol border here ->
	public static String border = "+";

	public static void showMy(int map[][]) {
		int x = 0;
		int y = 0;
		for (int i = 0; i < map.length + 2; i++) {
			System.out.print(border);
		}
		System.out.println();
		for (int i = 0; i < map[x].length; i++) {
			for (int j = 0; j <= map.length + 1; j++) {
				if (j == 0) {
					System.out.print(border);
				} else if (j == map.length + 1) {
					System.out.print(border);
				} else {
					System.out.print(map[x][y]);
					if (x + 1 == map.length && y == map[x].length) {
						System.out.println();
						System.out.println("error: out of array map, on load view");
					} else if (x + 1 == map.length) {
						x = 0;
						y++;
					} else {
						x++;
					}
				}
			}
			System.out.println();
		}
		for (int i = 0; i < map.length + 2; i++) {
			System.out.print(border);
		}
		System.out.println();
	}

	public static int hiddenShip(int dataMap) {
		// int result;
		int result = 0;
		// changer result selon la valeur des bateaux à cacher, afficher seulement les
		// bateaux touché/coulé et tire effectué
		return result;
	}

	public static void showHis(int[][] map) {
		int x = 0;
		int y = 0;
		for (int i = 0; i < map.length + 2; i++) {
			System.out.print(border);
		}
		System.out.println();
		for (int i = 0; i < map[x].length; i++) {
			for (int j = 0; j <= map.length + 1; j++) {
				if (j == 0) {
					System.out.print(border);
				} else if (j == map.length + 1) {
					System.out.print(border);
				} else {
					System.out.print(hiddenShip(map[x][y]));
					if (x + 1 == map.length && y == map[x].length) {
						System.out.println();
						System.out.println("error: out of array map, on load view");
					} else if (x + 1 == map.length) {
						x = 0;
						y++;
					} else {
						x++;
					}
				}
			}
			System.out.println();
		}
		for (int i = 0; i < map.length + 2; i++) {
			System.out.print(border);
		}
		System.out.println();
	}
}
