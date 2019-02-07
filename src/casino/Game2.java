package casino;

public class Game2 {

    //attributes
	public Game2() {
		super();
	}

	//methods
    public static int second_Game(Dealer dealer){
	    //On tire deux cartes
        int[] firstCard = dealer.draw_Card_With_Rep();
        int[] secondCard = dealer.draw_Card_With_Rep();

        //Si la premiere carte est égale à la deuxieme carte (signes compris)
        if(firstCard[0] == secondCard[0] && firstCard[1] == secondCard[1]){

            //gagné
            return 1;
        }

        //Sinon perdu
        else return 0;
    }
}
