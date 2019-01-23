package simulations;

import casino.Dealer;
import casino.Game1;
import casino.Game2;
import casino.Game3;
import casino.Game4;

public class Main {
	public static void main(String[] args) {
		int nbwin1 = 0;
		int nbwin2 = 0;
		int nbwin3 = 0;
		int nbwin4 = 0;
		for (int i = 0; i < 1000000; i++) {
			// 1 dealer pour chaque parti
			Dealer dealer1 = new Dealer();
			Dealer dealer2 = new Dealer();
			Dealer dealer3 = new Dealer();
			Dealer dealer4 = new Dealer();
			if (Game1.first_Game(dealer1) == 1) {
				nbwin1 += 1;
			}
			if (Game2.second_Game(dealer2) == 1) {
				nbwin2 += 1;
			}
			if (Game3.thirdGame(dealer3) == 1) {
				nbwin3 += 1;
			}
			if (Game4.fourthGame(dealer4) == 1) {
				nbwin4 += 1;
			}
		}
		System.out.printf("Il y a eu %d victoires  c'est à dire un pourcentage de victoire pour le jeu 1 de : %f \n",
				nbwin1, ((double) (nbwin1 * 100)) / 1000000);
		System.out.printf("Il y a eu %d victoires c'est à dire un pourcentage de victoire pour le jeu 2 de : %f \n",
				nbwin2, ((double) (nbwin2) * 100) / 1000000);
		System.out.printf("Il y a eu %d victoires c'est à dire un pourcentage de victoire pour le jeu 3 de : %f \n",
				nbwin3, ((double) (nbwin3) * 100) / 1000000);
		System.out.printf("Il y a eu %d victoires c'est à dire un pourcentage de victoire pour le jeu 4 de : %f \n",
				nbwin4, ((double) (nbwin4) * 100) / 1000000);
	}
}
