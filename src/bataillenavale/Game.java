package bataillenavale;

import java.util.Scanner;

public class Game {
//TODO 2 joueur ; hit (x,y), kill(Ship);
	// lancer la partie ; cloturer ; tours ; scanner de x et y 
	// pour le hit 	
	private int x;
	private int y;
	
	// tant que != tous coule (game) 
		
	// demander au joueur ou est ce qu'il veut lancer
	// tester dans le hit par le biais de Player.placement 
	//
	
	public static void hit() {
		
		Scanner choix = new Scanner(System.in);
		System.out.println("Où voulez vous tirez ?");
		System.out.println("En x ?" );
		int abscisse = choix.nextInt();
		System.out.println("En y ? ");
		int ordonnee = choix.nextInt();
		System.out.println("la case ciblée est " + abscisse +";" + ordonnee);
	//	if (Player.placement != 0 ) {
	/* si la case est vide alors tu remplaces l'id par un X sur les deux cartes 
	 * 	
	 */
		}
	}
	
//}
