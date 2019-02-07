package simulations;

import casino.*;

public class Main {
	public static void main(String[] args) {
		int nbwin1 = 0;
		int nbwin2 = 0;
		int nbwin3 = 0;
		int nbwin4 = 0;
		int nbwin5 = 0;

		for (int i = 0; i < 1000000; i++) {
			// 1 dealer pour chaque partie
			Dealer dealer1 = new Dealer();
			Dealer dealer2 = new Dealer();
			Dealer dealer3 = new Dealer();
			Dealer dealer4 = new Dealer();
			Dealer dealer5 = new Dealer();

			//On verifie si la partie est gagné pour chacun des jeux
			if (Game1.first_Game(dealer1) == 1) nbwin1 += 1;
			if (Game2.second_Game(dealer2) == 1) nbwin2 += 1;
			if (Game3.thirdGame(dealer3) == 1) nbwin3 += 1;
			if (Game4.fourthGame(dealer4) == 1) nbwin4 += 1;
			if (Game5.fifthGame(dealer5) == 1) nbwin5 += 1;
		}

		//On affiche ces résultats
		System.out.printf("Il y a eu %d victoires, c est a dire un pourcentage de victoire pour le jeu 1 de : %f \n",
				nbwin1, ((double) (nbwin1 * 100)) / 1000000);
		System.out.printf("Il y a eu %d victoires, c est a dire un pourcentage de victoire pour le jeu 2 de : %f \n",
				nbwin2, ((double) (nbwin2) * 100) / 1000000);
		System.out.printf("Il y a eu %d victoires, c est a dire un pourcentage de victoire pour le jeu 3 de : %f \n",
				nbwin3, ((double) (nbwin3) * 100) / 1000000);
		System.out.printf("Il y a eu %d victoires, c est a dire un pourcentage de victoire pour le jeu 4 de : %f \n",
				nbwin4, ((double) (nbwin4) * 100) / 1000000);
		System.out.printf("Il y a eu %d victoires, c est a dire un pourcentage de victoire pour le jeu 5 de : %f \n",
				nbwin5, ((double) (nbwin5) * 100) / 1000000);
	}
}
