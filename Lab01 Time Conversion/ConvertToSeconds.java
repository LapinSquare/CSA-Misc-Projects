/** 
 * Tick, tock, it's a seconds converter!
 * @author Kim Huynh
 * @version 9/7/2017
 */ 

import java.util.Scanner;

public class ConvertToSeconds {

	public static void main(String[] args) { 
		int seconds;
		int minutes;
		int hours;  
		
		System.out.println("Hello! This code can turn hours, minutes, and seconds into just seconds. Boring, isn't it?"); 
		System.out.println("");
		
		Scanner in = new Scanner(System.in); 
		 
	    System.out.println("Without further ado, enter your number of hour(s):");
	    hours = in.nextInt();
	    System.out.println("Your time count is currently "+hours+" hour(s). How many minute(s) do you have?"); 
	    minutes = in.nextInt(); 
	    System.out.println("Your time count is currently "+hours+ " hour(s) and "+minutes+" minute(s). How many second(s) do you have?"); 
	    seconds = in.nextInt();  
	    System.out.println("Your time count is currently "+hours+" hour(s) and "+minutes+" minute(s) and "+seconds+" second(s). Please look below for the results!");
	    
	    seconds= seconds+(hours*60*60)+(minutes*60); 
	    System.out.println("");
	    System.out.println("Your total time count in seconds is "+seconds+" seconds! Hooray!");
	    
	    in.close();	

	} 
	
}
