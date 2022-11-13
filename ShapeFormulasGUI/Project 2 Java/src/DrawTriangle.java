import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class DrawTriangle extends JFrame {

	JFrame frame =new JFrame();
	Graphics2D g;
	JTextField text = new JTextField();
	static int d;
	static double area;
	static int b;
	
	private static final DecimalFormat df = new DecimalFormat("0.00");
		
	
		DrawTriangle(double base,double height){
		
		area = (base*height)/2;
		b=(int)base;
		d=(int) height;
		
		String c="The area is: "+String.valueOf(df.format(area));
		
		text.setText(c);
		text.setPreferredSize(new Dimension(200,40));
		
		this.setTitle("TRIANGLE");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setSize(420,420);
		this.setLayout(new FlowLayout());
		this.setVisible(true);
		this.add(text);
		
		
		}
		
		

		public void paint(Graphics g) {
			
		    Polygon triangle = new Polygon();
		    triangle.addPoint(50, 350);
		    triangle.addPoint(250, 350);
		    triangle.addPoint(150, 150);

		    g.setColor(Color.green);
		    g.fillPolygon(triangle);
		    
		  
		}


}