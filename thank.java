import java.awt.*;
import javax.swing.*;

public class thank extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	thank(){
		setLayout(null);
		
		JLabel mssg = new JLabel("Thank You");
		mssg.setFont(new Font("Arial",Font.BOLD,28));
		mssg.setBounds(350,300,600,40);
		add(mssg);
		
		JLabel submssg = new JLabel("We have received your response and will get back to you soon.");
		submssg.setFont(new Font("Arial",Font.PLAIN,18));
		submssg.setBounds(180,350,600,40);
		add(submssg);
		
		getContentPane().setBackground(Color.WHITE);
		setSize(850,800);
		setLocation(350,10);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new thank();
	}

}