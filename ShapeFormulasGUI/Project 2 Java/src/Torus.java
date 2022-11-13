
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Torus extends JFrame implements ActionListener{

	JFrame frame = new JFrame();
	JButton myButton = new JButton("Submit");
	JLabel label = new JLabel("Major Radius:");
	JLabel label_height = new JLabel("Minor radius:");
	JTextField text_height=new JTextField("");
	JTextField text = new JTextField("");
	 Graphics2D g;
	 double a, b;
	 
	Torus(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420,420);
		this.setLayout(null);
		this.add(text);
		this.add(text_height);
		this.add(label_height);
		this.add(label);
		this.add(myButton);
		this.setVisible(true);
		
		label_height.setBounds(0,50,100,50);
		label.setBounds(0,0,100,50);
		myButton.setBounds(100,100,200,40);
		myButton.setFocusable(false);
		myButton.addActionListener(this);
	
		text.setBounds(75,5,250,40);
		text_height.setBounds(75,50,250,40);
		
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==myButton) {
		
		try {
			
			a = Double.parseDouble(text.getText());
			b = Double.parseDouble(text_height.getText());
			this.dispose();
			new DrawTorus(a,b);
			
		}
		catch(Exception e1){
			System.out.println("Invalid Entry");
			a=0;
		
		}
		}

}


		
		
	}
