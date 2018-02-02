package bataillenavale;

public class View {

	public static void showMy(int map[][]) {
		// Change symbol border here
		String border = "+";
		int x = 0;
		int y = 0;
		for (int i = 0; i < map[0].length + 2; i++) {
			System.out.print(border);
		}
		System.out.println();

		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j <= map[i].length + 1; j++) {
				
				if (j == 0) {
					System.out.print(border);
				} else if (j == map[i].length + 1) {
					System.out.print(border);
				} else {
					// Ne se deplace pas encore dans la map
					System.out.print(map[x][y]);

				}
			}
			System.out.println();
		}
		for (int i = 0; i < map[map.length -1].length + 2; i++) {
			System.out.print(border);
		}
		System.out.println();
	}

	public static void showHis(int[][] map) {

	}
}
