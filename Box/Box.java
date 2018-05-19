import java.text.DecimalFormat; 

/**
 * Calculating box stuffs. 
 * @author Kim Huynh
 * @version 1/8/2018 and earlier.
 */

public class Box {

	public double length;
	public double width; 
	public double height; 
	private boolean full; 
	public Box(double l, double w, double h) { 
		length=l;  
		width=w;  
		height=h;
		full=false;
	} 
	public double getWidth() { 
		return width;
	} 
	public void setWidth(double w) { 
		width=w;
	} 
	public double getLength() { 
		return length;
	} 
	public void setLength(double w) { 
		length=w;
	} 
	public double getHeight() { 
		return height;
	} 
	public void setHeight(double w) { 
		height=w;
	}
	public boolean getFull() { 
		return full;
	} 
	public void setFull(boolean w) { 
		full=w;
	}
	
	//Others...
	
	public double volume() { 
		double v=length*width*height;
		return v;
	} 
	public double surfaceArea() { 
		double sa=(2*length*width)+(2*length*height)+(2*width*height);
		return sa;
	} 
	DecimalFormat twoDec = new DecimalFormat("#.00"); 
	
	@Override 
	//The "override" above is optional, ha...
	
	public String toString() { 
		if (full==false) { 
			return "An empty "+ twoDec.format(length)+" x "+twoDec.format(width)+" x "+twoDec.format(height)+" box.";
		} 
		if (full==true) { 
			return "A full "+ twoDec.format(length)+" x "+twoDec.format(width)+" x "+twoDec.format(height)+" box.";
		} 
		return "";
	}

}
