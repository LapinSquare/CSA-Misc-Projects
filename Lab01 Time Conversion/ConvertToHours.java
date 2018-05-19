/** 
 * The popular sequel to the all-boring ConvertToSeconds!
 * @author Kim Huynh 
 * @version 9/7/2017
 */

import java.util.Scanner; 

public class ConvertToHours {

	public static void main(String[] args) { 
		int seconds;
		int minutes;
		int hours;
		double fhours;
		 
		System.out.println("The sequel to that one code no one cares about. This code can convert your seconds into hours, fractional hours, minutes, and seconds!"); 
		System.out.println("");
		
		Scanner in = new Scanner(System.in); 
		
		System.out.println("Enter your number of second(s)!"); 
		seconds = in.nextInt(); 
		System.out.println("Thank you for your input! The results are as follows...");  
		System.out.println("");  
		
		do
		{
		 fhours=seconds/3600.0;
		}
		while(seconds<3600);
	
		hours=seconds/3600; 
		minutes=(seconds%3600)/60; 
		seconds=((seconds%3600)%60);
		
		System.out.println("Fractional hour(s) would be "+fhours+" hours."); 
		System.out.println("Approximate hour(s) is: "+hours+". Minute(s) is: "+minutes+". Remaining second(s) is: "+seconds+".");
		

	}  

}
