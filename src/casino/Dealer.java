package casino;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dealer {
	//attributes
	private List deck= new ArrayList();

	//constructor
	public Dealer() {
		super();
		for(int i=0; i < 52; i++) {
			deck.add(i);
		}

		//On mélange deux fois pour copier à la réalité (raremment mélangé qu'une fois)
		shuffle();
		shuffle();
	}

	//methods
	//Cette methode va nous permettre de melanger le paquet
	private void shuffle() {
		Random rand = new Random();
		for(int i=0;i<deck.size();i++) {
            int r = i + rand.nextInt(deck.size() - i);
            int temp = (int)deck.get(r);
            deck.set(r, deck.get(i)); 
            deck.set(i,temp); 
		}
	}

	//Tirer des cartes avec remise
	public int[] draw_Card_With_Rep() {
		
		int[] result = new int[2];
		result[0]    = (int)(deck.get(0))/13;
		result[1]    = (int)(deck.get(0))%13;
		
		shuffle();
		shuffle();
		return result;
	}

	//Tirer des cartes sans remises
	public int[] draw_Card_Without_Rep() {
		
		int[] result=new int[2];
		result[0]=(int)(deck.get(0))/13;
		result[1]=(int)(deck.get(0))%13;
		
		deck.remove(0);
		
		shuffle();
		return result;
	}
}
