package casino;

public class Game1 {

    //attributes
	public Game1() {
		super();
	}

	//methods
    public static int first_Game(Dealer dealer){
	    //On tire une carte avec remise
        int[] cardFromDealer = dealer.draw_Card_With_Rep();

        //Si la carte est un As : gagné
        if(cardFromDealer[0] == 0) return 1;

        //Sinon perdu
        else return 0;
    }
}
