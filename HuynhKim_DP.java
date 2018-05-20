import javax.swing.JFrame;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.BorderLayout; 

/**
 * Drawings
 * @author Kim Huynh
 * @version 10/22/2017
 */

public class HuynhKim_DP extends JPanel
{
	public HuynhKim_DP() // set up graphics window
	{
		super(); 
		setBackground(Color.GRAY);
	}
	
	public void paintComponent(Graphics g) // draw graphics in the panel
	{
		int width = getWidth(); // width of window in pixels
		int height = getHeight(); // height of window in pixels
		super.paintComponent(g); // call superclass to make panel display correctly
		
		// Drawing code goes in this method below this comment  
		//Notes : (500, 400). Wide = horizontal. 
		
		//BACKGROUND  
		//UNCOLORED OVALS, LINE, ARCS
		g.setColor(Color.WHITE); 
		g.drawLine(0, 300, width, 300); 
		g.drawOval(10, 200, 20, 100); 
		g.drawOval(30, 180, 40, 120);
		g.drawOval(50, 160, 60, 140);
		g.drawOval(70, 140, 80, 160);
		g.drawOval(90, 120, 100, 180);
		g.drawLine(0, 120, width, 120); 
		g.drawArc(0, 140, width, height, 45, 180);
		
		//SHIRT  
		//COLORED OVAL
		g.setColor(Color.PINK); 
		g.fillOval( 12*width/25, 5*height/8, width/2 , height ); 
		
		//Original coordinates : g.fillOval( 240, 250, width/2 , height ); 
		
		//WORDING 
		//TEXT
		g.setColor(Color.WHITE); 
		g.drawString("TOUHOU - TOHO - TOUHOU - TOHO - TOUHOU - TOHO - TOUHOU - TOHO - TOUHOU - TOHO - TOUHOU - "
				+ "TOHO - TOUHOU - TOHO - TOUHOU - TOHO - TOUHOU - TOHO - TOUHOU - TOHO - TOUHOU - TOHO - TOUHOU - TOHO - TOUHOU - "
				+ "TOHO - TOUHOU - TOHO - TOUHOU - TOHO - TOUHOU - TOHO - TOUHOU - TOHO - TOUHOU - TOHO - TOUHOU -", 0, height/20);
		
		//HAIR
		//COLORED OVAL
		g.setColor(Color.BLACK); 
		g.fillOval( 12*width/25, height/4 , width/2 , 2*height/3 ); 
		
		//Original coordinates : g.fillOval( 240, 100 , width/2 , 2*height/3 ); 
		
		//BUNNY EARS
		//COLORED OVALS
		g.setColor(Color.WHITE); 
		g.fillOval( 23*width/50, height/20 , width/5 , height/2 ); 
		g.fillOval( 39*width/50, height/20 ,width/5 , height/2 ); 
		
		//Original coordinates : g.fillOval( 230, 20 , width/5 , height/2 ); 
		//Original coordinates : g.fillOval( 390, 20 ,width/5 , height/2 ); 
		
		//EAR COLOR 
		//COLORED OVALS
		g.setColor(Color.PINK);  
		g.fillOval( 51*width/100, height/8 ,width/10 , height/3 ); 
		g.fillOval( 83*width/100, height/8 , width/10 , height/3 ); 
		
		//Original coordinates : g.fillOval( 255, 50 ,width/10 , height/3 ); 
		//Original coordinates : g.fillOval( 415, 50 ,width/10 , height/3 ); 
		
		//FACE W/ BANGS 
		//COLORED OVALS, COLORED RECTANGLES, NEW COLOR DECLARATION
		Color skin = new Color(255, 250, 240);
		g.setColor(skin);  
		g.fillOval( 14*width/25, 21*height/40 , width/3 , 2*height/5 );
		
		//Original coordinates : g.fillOval( 280, 200 , width/3 , 2*height/5 ); 
		
		g.setColor(Color.BLACK); 
		g.fillRect( width/2, height/2 ,23*width/50, 3*height/40);
		
		//Original coordinates : g.fillRect( 250, 200 , 230 , 30); 
		
		
	}
	
	public static void main(String[] args)
	{
		//Do not edit this method!!!
		
		HuynhKim_DP panel = new HuynhKim_DP(); // window for drawing
		JFrame application = new JFrame(); // the program itself
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set frame to exit
		// when it is closed
		application.add(panel);
		application.setSize(500, 400); // window is 500 pixels wide, 400 high
		application.setVisible(true); 
		application.setTitle("Tewi Inaba - Touhou");
	}
}

