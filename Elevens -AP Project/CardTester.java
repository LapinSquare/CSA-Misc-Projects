/**
 * This is a class that tests the Card class.
 */
 
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used. 
	 * 
	 * Rank => King, Queen, 10 
	 * Suit => Hearts, diamonds, etc 
	 * Point Value => Ace =1, numbers = numbers, King+G+J = 10
	 */
	public static void main(String[] args) {
		
		Card ex1 = new Card ("King", "Hearts", 10);
		Card ex2 = new Card ("Queen", "Diamonds", 10);  
		Card ex3 = new Card ("Queen", "Diamonds", 10);  
		System.out.println(ex1.matches(ex2));
		System.out.println(ex2.matches(ex3));
		
	}
}
