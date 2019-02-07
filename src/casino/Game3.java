package casino;

public class Game3 {

    //attributes
	public Game3() {
		super();
	}

	//methods
    public static int thirdGame(Dealer dealer){
	    //On tire deux cartes sans remises
        int[] firstCard = dealer.draw_Card_Without_Rep();
        int[] secondCard = dealer.draw_Card_Without_Rep();

        //Si la premiere carte est inferieur à la deuxieme : gagné
        if(firstCard[0] < secondCard[0]) return 1;

        //Sinon perdu
        else return 0;
    }
}
