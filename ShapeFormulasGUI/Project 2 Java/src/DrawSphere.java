import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.text.DecimalFormat;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class DrawSphere extends JFrame{

	JFrame frame =new JFrame();
	Graphics2D g;
	JTextField text = new JTextField();
	static int d;
	
	static int b;
	ImageIcon image;
	private static final DecimalFormat df = new DecimalFormat("0.00");
	JLabel displayField = new JLabel();
	
	DrawSphere(double a){
		b=(int)a;
		a=(a*a*a);
		
		d=b;
		
		String c="The area is: "+String.valueOf(df.format(a));
		
		text.setText(c);
		text.setPreferredSize(new Dimension(200,40));
		
		this.setTitle("SPHERE");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setSize(420,420);
		this.setLayout(new FlowLayout());
		this.setVisible(true);
		this.add(text);
		
		
	try {
		image = new ImageIcon(getClass().getResource("sphere.png"));
		displayField = new JLabel(image);
		this.add(displayField);
	}catch(Exception e) {
		System.out.println("Image not found");
	}
	
	

}


}
