package casino;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dealer {
	private List deck= new ArrayList();
	
	public Dealer() {
		super();
		for(int i=0;i<52;i++) {
			deck.add(i);
		}
		shuffle();
		shuffle();
	}
	
	private void shuffle() {

		Random rand = new Random(); 
		
		for(int i=0;i<deck.size();i++) {
			
			// Random for remaining positions. 
            int r = i + rand.nextInt(deck.size() - i); 
            
            //swapping the elements 
            int temp = (int)deck.get(r); 
            deck.set(r, deck.get(i)); 
            deck.set(i,temp); 
		}
	}
	
	public int[] draw_Card_With_Rep() {
		
		int[] result=new int[2];
		result[0]=(int)(deck.get(0))/13;
		result[1]=(int)(deck.get(0))%13;
		
		shuffle();
		shuffle();
		return result;
	}
	
	public int[] draw_Card_Without_Rep() {
		
		int[] result=new int[2];
		result[0]=(int)(deck.get(0))/13;
		result[1]=(int)(deck.get(0))%13;
		
		deck.remove(0);
		
		shuffle();
		return result;
	}
	
	public void reinitialize() {
		deck.clear();
		for(int i=0;i<52;i++) {
			deck.add(i);
		}
		shuffle();
		shuffle();
	}
}
