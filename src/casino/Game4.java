package casino;

public class Game4 {

    //attributes
	public Game4(){
		super();
	}

	//methods
    public static int fourthGame(Dealer dealer){
        int[] firstCard = dealer.draw_Card_Without_Rep();
        int[] secondCard = dealer.draw_Card_Without_Rep();
        int[] thirdCard = dealer.draw_Card_Without_Rep();
        int numberOfHeart = 0;
        if(firstCard[1] != 2) numberOfHeart++;
        if(secondCard[1] != 2) numberOfHeart++;
        if(thirdCard[1] != 2) numberOfHeart++;
        if(numberOfHeart != 0) return 1;
        else return 0;
    }
}
