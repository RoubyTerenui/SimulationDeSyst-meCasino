public class game1 {
    public int first_Game(dealer dealer){
        int[] cardFromDealer = dealer.draw_Card_With_Rep();
        if(cardFromDealer[0] != 0) return 1;
        else return 0;
    }
}
