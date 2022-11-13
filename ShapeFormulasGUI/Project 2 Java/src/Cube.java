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

public class Cube extends JFrame implements ActionListener{

	JFrame frame = new JFrame();
	JButton myButton = new JButton("Submit");
	JLabel label = new JLabel("Enter Edge Length:");
	JTextField text = new JTextField("");
	 Graphics2D g;
	 double a;
	
	Cube(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420,420);
		this.setLayout(new FlowLayout());
		this.add(text);
		this.add(label);
		this.add(myButton);
		this.setVisible(true);
		
		label.setBounds(0,0,100,50);
		label.setFont(new Font(null,Font.PLAIN,25));
		myButton.setBounds(100,160,200,40);
		myButton.setFocusable(false);
		myButton.addActionListener(this);
		text.setPreferredSize(new Dimension(250,40));
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		a=0;
		if(e.getSource()==myButton) {
	
		try {
			
			a = Double.parseDouble(text.getText());
			this.dispose();
			new DrawCube(a);
			
		}
		catch(Exception e1){
			System.out.println("Invalid Entry");
			a=0;
		}
		}


}


		
		
	}
