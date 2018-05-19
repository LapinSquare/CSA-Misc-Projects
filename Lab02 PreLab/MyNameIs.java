import java.util.Scanner; 
import java.text.*;

/**
 * A simple application to test use of String, Math, DecimalFormat and NumberFormat classes.
 *
 * @author CS121 instructors (starter code)
 * @author Kim Huynh 
 * @version 9/25/17
 */

public class MyNameIs
{
	/**
	 * @param args (unused)
	 */
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print("First name: ");
		String firstName = keyboard.nextLine();

		System.out.print("Last name: ");
		String lastName = keyboard.nextLine();

		System.out.print("Enter a number: ");
		double n1 = keyboard.nextDouble();

		System.out.print("Enter another number (between 0 and 1): ");
		double n2 = keyboard.nextDouble();   

		System.out.println("\nHi, my name is " + firstName + " " + lastName + "."); 
		System.out.println("\nYou will find me under \"" + lastName + ", " + firstName + "\"."); 
		System.out.println("\nMy name badge: \"" + firstName.substring(0,1) + ". " + lastName + ".\"");  
		
		double mult=n1*n2;  
		
		String pattern2= "##0.##%";
		DecimalFormat format2= new DecimalFormat(pattern2); 
		
		NumberFormat fmt = NumberFormat.getNumberInstance( );
		fmt.setMaximumFractionDigits(2); 
		fmt.setMinimumFractionDigits(2);
		
		System.out.println("\n"+format2.format(n2)+" of "+fmt.format(n1)+" is around "+fmt.format(mult));  
		
		double powwow=Math.pow(n1, n2);
		
		System.out.println("\n"+fmt.format(n1)+" raised to the power of "+fmt.format(n2)+" is approximately "+fmt.format(powwow));
		

		// TODO: Finish the program according to the lab specifications.

	}
}


