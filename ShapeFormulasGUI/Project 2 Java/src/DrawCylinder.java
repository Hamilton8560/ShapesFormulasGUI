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

public class DrawCylinder extends JFrame{

	JFrame frame =new JFrame();
	Graphics2D g;
	JTextField text = new JTextField();
	static int d;
	static double area;
	static int b;
	ImageIcon image;
	
	private static final DecimalFormat df = new DecimalFormat("0.00");
	JLabel displayField = new JLabel();
	
	DrawCylinder(double radius,double height){
		area = (Math.PI)*(radius*radius)*height;
		
		String c="The area is: "+String.valueOf(df.format(area));
		
		text.setText(c);
		text.setPreferredSize(new Dimension(200,40));
		
		this.setTitle("Cylinder");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setSize(600,600);
		this.setLayout(new FlowLayout());
		this.setVisible(true);
		this.add(text);
		
		
	try {
		image = new ImageIcon(getClass().getResource("Cylinder.jpg"));
		displayField = new JLabel(image);
		this.add(displayField);
	}catch(Exception e) {
		System.out.println("Image not found");
	}
	
	

}


}