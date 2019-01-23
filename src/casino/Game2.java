package casino;

public class Game2 {
	public Game2() {
		super();
	}
    public static int second_Game(Dealer dealer){
        int[] firstCard = dealer.draw_Card_With_Rep();
        int[] secondCard = dealer.draw_Card_With_Rep();
        if(firstCard[0] == secondCard[0] && firstCard[1] == secondCard[1]){
            return 1;
        }
        else return 0;
    }
}
