import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class MyFrame  extends JFrame implements ActionListener{
	
	JRadioButton circle_button;
	JRadioButton square_button;
	JRadioButton triangle_button;
	JRadioButton rectangle_button;
	JRadioButton sphere_button;
	JRadioButton cube_button;
	JRadioButton cone_button;
	JRadioButton cylinder_button;
	JRadioButton torus_button;
	ImageIcon circle;
	JLabel label;

	
	
	public static void main(String[] args) {
		
		MyFrame framedUp = new MyFrame();
	}
	MyFrame(){
		label= new JLabel("Choose a Shape");
		label.setBounds(0,0,100,50);
		label.setFont(new Font(null,Font.PLAIN,25));
		this.add(label);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setSize(500,130);
		this.setVisible(true);

		triangle_button = new JRadioButton("Triangle");
		circle_button = new JRadioButton("Circle");
		square_button = new JRadioButton("Square");
		rectangle_button = new JRadioButton("Rectangle");
		sphere_button = new JRadioButton("Sphere");
		cube_button = new JRadioButton("Cube");
		cone_button = new JRadioButton("Cone");
		cylinder_button = new JRadioButton("Cylinder");
		torus_button = new JRadioButton("Torus");
		
		
		
		
		ButtonGroup group = new ButtonGroup();
		
		group.add(torus_button);
		group.add(cylinder_button);
		group.add(cone_button);
		group.add(cube_button);
		group.add(sphere_button);
		group.add(rectangle_button);
		group.add(triangle_button);
		group.add(circle_button);
		group.add(square_button);
		this.add(triangle_button);
		this.add(circle_button);
		this.add(square_button);
		this.add(rectangle_button);
		this.add(sphere_button);
		this.add(cube_button);
		this.add(cone_button);
		this.add(cylinder_button);
		this.add(torus_button);
		triangle_button.addActionListener(this);
		circle_button.addActionListener(this);
		square_button.addActionListener(this);
		rectangle_button.addActionListener(this);
		sphere_button.addActionListener(this);
		cube_button.addActionListener(this);
		cone_button.addActionListener(this);
		cylinder_button.addActionListener(this);
		torus_button.addActionListener(this);
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==circle_button) {
			Circle circle= new Circle();
			this.dispose();
		}
		if(e.getSource()==square_button) {
			Square square = new Square();
			this.dispose();
		}
		if(e.getSource()==triangle_button) {
			Triangle triangle = new Triangle();
			this.dispose();
		}
		if(e.getSource()==rectangle_button) {
			Rectangle rectangle = new Rectangle();
			this.dispose();
		}
		if(e.getSource()==sphere_button) {
			Sphere sphere = new Sphere();
			this.dispose();
		}
		if(e.getSource()==cube_button) {
			Cube cube = new Cube();
			this.dispose();
		}
		if(e.getSource()==cone_button) {
			Cone cone = new Cone();
			this.dispose();
		}
		if(e.getSource()==cylinder_button) {
			Cylinder cylinder = new Cylinder();
			this.dispose();
		}
		if(e.getSource()==torus_button) {
			Torus torus = new Torus();
			this.dispose();
		}
	}
}
