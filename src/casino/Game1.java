package casino;

public class Game1 {
	public Game1() {
		super();
	}
    public static int first_Game(Dealer dealer){
        int[] cardFromDealer = dealer.draw_Card_With_Rep();
        if(cardFromDealer[0] != 0) return 0;
        else return 1;
    }
}
