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

public class DrawCircle extends JFrame{

	JFrame frame =new JFrame();
	Graphics2D g;
	JTextField text = new JTextField();
	static int d;
	
	static int b;
	
	private static final DecimalFormat df = new DecimalFormat("0.00");
		
	
	DrawCircle(double a){
		b=(int)a;
		a=(a*a)*Math.PI;
		
		d=b;
		
		String c="The area is: "+String.valueOf(df.format(a));
		
		text.setText(c);
		text.setPreferredSize(new Dimension(200,40));
		
		this.setTitle("CIRCLE");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setSize(420,420);
		this.setLayout(new FlowLayout());
		this.setVisible(true);
		this.add(text);
		
		
		}
		
		

		public void paint(Graphics g) {
		
		Graphics2D g2d = (Graphics2D) g;
		g.setColor(Color.red);
		g2d.fillOval(150, 100, 5*d, 5*d);
		  
		}


}