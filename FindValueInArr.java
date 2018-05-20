import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Kim Huynh
 * Practicing for-each loops.
 */

public class FindValueInArr {

	public static void main(String[] args) {
		int count = 0;
		int big = 0;
		int positionBig = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Array: ");
		Random rand = new Random(); 
		int[] numArray = {rand.nextInt(50) + 1,rand.nextInt(50) + 1,rand.nextInt(50) + 1,rand.nextInt(50) + 1,rand.nextInt(50) + 1,rand.nextInt(50) + 1,rand.nextInt(50) + 1,rand.nextInt(50) + 1,rand.nextInt(50) + 1,rand.nextInt(50) + 1};
		for(int i=0;i<numArray.length;i++) {
			if(numArray[i]>big) {
				big = numArray[i];
				positionBig=i;
			}
		}
		for (int x: numArray) {
			if (big<x) { 
				big=x;
			}
			System.out.print(x+" ");
		} 
		System.out.println("");
		System.out.print("Value to find : "); 
		int response = in.nextInt( );  
		System.out.println("");
		for (int x: numArray) {
			if (response ==x) { 
				count++;
				System.out.println(response+" is in the array.");
			}
		}  
		System.out.println(response+" was found "+count+" times.");
		System.out.println(""); 
		System.out.println("By the way, the largest value of the set is "+big);
		System.out.println("It is in slot "+ positionBig);
	}

}
