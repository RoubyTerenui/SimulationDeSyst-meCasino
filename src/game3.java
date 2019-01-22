public class game3 {
    public int thirdGame(dealer dealer){
        int[] firstCard = dealer.draw_Card_Without_Rep();
        int[] secondCard = dealer.draw_Card_Without_Rep();
        if(firstCard[0] < secondCard[0]) return 1;
        else return 0;
    }
}
