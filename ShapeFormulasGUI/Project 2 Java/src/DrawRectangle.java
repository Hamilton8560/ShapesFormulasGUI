import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class DrawRectangle extends JFrame{

	JFrame frame =new JFrame();
	Graphics2D g;
	JTextField text = new JTextField();
	static int a;
	static int b;
	
	private static final DecimalFormat df = new DecimalFormat("0.00");
		
	
	DrawRectangle(double length,double base){
		double area;
		a=(int)base;
		b=(int)length;
		
		area=length*base;;
		
	
		
		String c="The area is: "+String.valueOf(df.format(area));
		
		text.setText(c);
		text.setPreferredSize(new Dimension(200,40));
		
		this.setTitle("RECTANGLE");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setSize(420,420);
		this.setLayout(new FlowLayout());
		this.setVisible(true);
		this.add(text);
		
		
		}
		
		

		public void paint(Graphics g) {
		
		Graphics2D g2d = (Graphics2D) g;
		g.setColor(Color.red);
		if(a+b<100){
		g2d.fillRect(100, 100, 5*a, 5*b);
		}
		else {
			g2d.fillRect(100, 100, a, b);
		}
		}


}