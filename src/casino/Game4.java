package casino;

public class Game4 {

    //attributes
	public Game4(){
		super();
	}

	//methods
    public static int fourthGame(Dealer dealer){
        //Je tire 3 cartes sans remises
        int[] firstCard = dealer.draw_Card_Without_Rep();
        int[] secondCard = dealer.draw_Card_Without_Rep();
        int[] thirdCard = dealer.draw_Card_Without_Rep();

        //J'ai besoin de savoir le nombre de coeur dans les cartes piochés
        int numberOfHeart = 0;

        //Je compte le nombre de coeur
        if(firstCard[0] == 2) numberOfHeart++;
        if(secondCard[0] == 2) numberOfHeart++;
        if(thirdCard[0] == 2) numberOfHeart++;

        //Si il y au moins un coeur : gagné
        if(numberOfHeart != 0) return 1;

        //Sinon perdu
        else return 0;
    }
}
