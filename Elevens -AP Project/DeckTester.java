/**
 * This is a class that tests the Deck class.
 */
 
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"Ace", "Jack", "Queen", "King", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
		String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
		int[] pointValues = {11, 10, 10, 10, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		Deck d = new Deck(ranks, suits, pointValues);
		System.out.println(d);
		d.shuffle(); 
		System.out.println(d);
		
		
		//System.out.println("This set is empty: "+d.isEmpty()); 
		//System.out.println(d);
		

	}
}
