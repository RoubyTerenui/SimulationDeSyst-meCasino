package casino;

public class Game3 {
	public Game3() {
		
	}
    public static int thirdGame(Dealer dealer){
        int[] firstCard = dealer.draw_Card_Without_Rep();
        int[] secondCard = dealer.draw_Card_Without_Rep();
        if(firstCard[0] < secondCard[0]) return 1;
        else return 0;
    }
}
