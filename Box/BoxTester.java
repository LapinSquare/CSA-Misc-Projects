import java.util.Scanner;

/**
 * Tests out the box class in the same folder.
 * @author Kim Huynh
 * @version 1/8/2018 and earlier.
 */

public class BoxTester {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		String ans;
		System.out.print("What is your box's length? ");
		double length = input.nextDouble( ); 
		System.out.print("\rWhat is your box's width? ");
		double width = input.nextDouble( ); 
		System.out.print("\rWhat is your box's height? ");
		double height = input.nextDouble( );  
		
		Box smallbox = new Box(length, width, height); 
		smallbox.setFull(false); 
		
		System.out.println("\r"+smallbox); 
		System.out.println("\rFor confirmation...");
		System.out.println("Box length = "+smallbox.getLength()); 
		System.out.println("Box width = "+smallbox.getWidth()); 
		System.out.println("Box height = "+smallbox.getHeight()); 
		System.out.println("Box volume = "+smallbox.volume()); 
		System.out.println("Box surface area = "+smallbox.surfaceArea()); 
		System.out.println("Is it full? "+smallbox.getFull());
		
		System.out.println("--------------");
		System.out.println("Do you want to make it full (Y/N)? ");
		ans=input.next();
		
		if (ans.equalsIgnoreCase("y")){ 
			System.out.println(""); 
			System.out.println("Change the dimensions for fun while we're at it!");
			System.out.print("\rWhat is your box's length? ");
			length = input.nextDouble( ); 
			System.out.print("\rWhat is your box's width? ");
			width = input.nextDouble( ); 
			System.out.print("\rWhat is your box's height? ");
			height = input.nextDouble( ); 
			smallbox.setLength(length); 
			smallbox.setHeight(height);  
			smallbox.setWidth(width); 
			smallbox.setFull(true); 
			System.out.println("\rHere are the new changes...!");
			System.out.println("\r"+smallbox); 
			System.out.println("\rFor confirmation...");
			System.out.println("Box length = "+smallbox.getLength()); 
			System.out.println("Box width = "+smallbox.getWidth()); 
			System.out.println("Box height = "+smallbox.getHeight()); 
			System.out.println("Box volume = "+smallbox.volume()); 
			System.out.println("Box surface area = "+smallbox.surfaceArea()); 
			System.out.println("Is it full? "+smallbox.getFull());
		} 
		if (ans.equalsIgnoreCase("n")){ 
			System.out.println(""); 
			System.out.println("Change the dimensions for fun, then!");
			System.out.println("");
			System.out.print("What is your box's length? ");
			length = input.nextDouble( ); 
			System.out.print("\rWhat is your box's width? ");
			width = input.nextDouble( ); 
			System.out.print("\rWhat is your box's height? ");
			height = input.nextDouble( ); 
			smallbox.setLength(length); 
			smallbox.setHeight(height);  
			smallbox.setWidth(width); 
			smallbox.setFull(false); 
			System.out.println("\rHere are the new changes...!");
			System.out.println("\r"+smallbox); 
			System.out.println("\rFor confirmation...");
			System.out.println("Box length = "+smallbox.getLength()); 
			System.out.println("Box width = "+smallbox.getWidth()); 
			System.out.println("Box height = "+smallbox.getHeight()); 
			System.out.println("Box volume = "+smallbox.volume()); 
			System.out.println("Box surface area = "+smallbox.surfaceArea()); 
			System.out.println("Is it full? "+smallbox.getFull());
		} 
		else { 
			System.out.println("");
			System.out.println("I am too lazy to make a loop.");
		}
		}

	}

