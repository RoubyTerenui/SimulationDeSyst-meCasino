package casino;

import java.util.*;

public class Game5 {

    public Game5(){
        super();
    }

    public static int fifthGame(Dealer dealer){
        //Je tire 5 cartes sans remises
        int[] firstCard = dealer.draw_Card_Without_Rep();
        int[] secondCard = dealer.draw_Card_Without_Rep();
        int[] thirdCard = dealer.draw_Card_Without_Rep();
        int[] fourthCard = dealer.draw_Card_Without_Rep();
        int[] fifthCard = dealer.draw_Card_Without_Rep();

        //Je vais créer une liste qui viendra prendre les cartes tirées précédemment
        List<Integer> deck = new ArrayList<>();

        //La couleur ne m'importe pas donc je prend juste la valeur
        deck.add(firstCard[1]);
        deck.add(secondCard[1]);
        deck.add(thirdCard[1]);
        deck.add(fourthCard[1]);
        deck.add(fifthCard[1]);

        //J'ai besoin de créer un Set pour supprimmer les doublons pouvant fausser le calcul que l'on effectura
        Set set = new HashSet();
        set.addAll(deck);
        ArrayList deckWithoutDoublons = new ArrayList(set);

        //Je trie ma liste sans doublons par ordre croissant
        Collections.sort(deckWithoutDoublons);

        //Je verifie que cette liste sans doublons contient au moins 3 cartes
        if(deckWithoutDoublons.size() > 2){
            //On parcourt toute la liste
            for(int i=0; i < deckWithoutDoublons.size() - 2; i++){
                //On verifie que les cartes se suivent
                if((int)deckWithoutDoublons.get(i+1) == (int)deckWithoutDoublons.get(i) + 1 &&
                        (int)deckWithoutDoublons.get(i+2) == (int)deckWithoutDoublons.get(i+1) + 1){
                    return 1;
                }
            }
        }
        //perdu
        return 0;
    }
}
