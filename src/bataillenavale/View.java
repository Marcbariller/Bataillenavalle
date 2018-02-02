package bataillenavale;

public class View {

	public static void showMy(int map[][]) {
		// Change symbol border here
		String border = "+";
		for (int i = 0; i < map.length; i++) {
			System.out.print(border);
		}
		System.out.println();

		for (int i = 0; i < map.length - 2; i++) {
			for (int j = 0; j <= map[i].length; j++) {

				if (j == 0) {
					System.out.print(border);
				} else if (j == map.length - 1) {
					System.out.print(border);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = 0; i < map.length; i++) {
			System.out.print(border);
		}
		System.out.println();
	}

	public static void showHis(int[][] map) {

	}
}
