import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.*;


public class Signup extends JFrame implements ActionListener{
	
	long randomNumber;
	JTextField userNameTextField,contactNumberTextField,userEmailTextField,
	userAddressTextField,userCityTextField,userStateTextField,userPincodeTextField;
	JButton submit;
	JRadioButton male,female,other;
	JDateChooser dateChooser;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Signup(){
		
		setLayout(null);
		
		
		Random ran = new Random();
		randomNumber = (Math.abs(ran.nextInt()%1000));
		
		
		//HEADING WITH REGISTRATION NO.
		JLabel formNo = new JLabel("REGISTRATION FORM NO: "+randomNumber);
		formNo.setFont(new Font("Arial",Font.BOLD,28));
		formNo.setBounds(200,10,600,40);
		add(formNo);
		
		//APPLICATION DETAILS
		JLabel personalDetails = new JLabel("Please Fillup Your Personal Details");
		personalDetails.setFont(new Font("Arial",Font.BOLD,18));
		personalDetails.setBounds(250,60,600,40);
		add(personalDetails);
		
		//NAME SECTION
		JLabel userName = new JLabel("Name : ");
		userName.setFont(new Font("Arial",Font.BOLD,18));
		userName.setBounds(100,140,100,30);
		add(userName);
		
		//NAME TEXTFIELD
		userNameTextField = new JTextField();
		userNameTextField.setFont(new Font("Arial",Font.PLAIN,18));
		userNameTextField.setBounds(300,140,400,30);
		add(userNameTextField);
		
		//FATHER'S NAME SECTION
		JLabel contactNumber = new JLabel("Contact Number : ");
		contactNumber.setFont(new Font("Arial",Font.BOLD,18));
		contactNumber.setBounds(100,190,200,30);
		add(contactNumber);
		
		//FATHER'S NAME TEXTFIELD
		contactNumberTextField = new JTextField();
		contactNumberTextField.setFont(new Font("Arial",Font.PLAIN,18));
		contactNumberTextField.setBounds(300,190,400,30);
		add(contactNumberTextField);
		
		//D.O.B
		JLabel dob = new JLabel("Date of Birth : ");
		dob.setFont(new Font("Arial",Font.BOLD,18));
		dob.setBounds(100,240,200,30);
		add(dob);
		
		//DOB SELECTOR
		dateChooser = new JDateChooser();
		dateChooser.setBounds(300,240,400,30);
		dateChooser.setForeground(Color.BLACK);
		add(dateChooser);
		
		//GENDER
		JLabel userGender = new JLabel("Gender : ");
		userGender.setFont(new Font("Arial",Font.BOLD,18));
		userGender.setBounds(100,290,200,30);
		add(userGender);
		
		//GENDER RADIO BUTTON
		male = new JRadioButton("Male");
		male.setBounds(300,290,100,30);
		male.setBackground(Color.white);
		add(male);
		
		female = new JRadioButton("Female");
		female.setBounds(450,290,100,30);
		female.setBackground(Color.white);
		add(female);
		
		other = new JRadioButton("Other");
		other.setBounds(600,290,100,30);
		other.setBackground(Color.white);
		add(other);
		
		ButtonGroup genderGroup = new ButtonGroup();
		genderGroup.add(male);
		genderGroup.add(female);
		genderGroup.add(other);
		
		//EMAIL ADD
		JLabel userEmail = new JLabel("Email Address : ");
		userEmail.setFont(new Font("Arial",Font.BOLD,18));
		userEmail.setBounds(100,340,200,30);
		add(userEmail);
		
		//EMAIL ADD TEXTFIELD
		userEmailTextField = new JTextField();
		userEmailTextField.setFont(new Font("Arial",Font.PLAIN,18));
		userEmailTextField.setBounds(300,340,400,30);
		add(userEmailTextField);
		
		//ADDRESS
		JLabel userAddress = new JLabel("Address : ");
		userAddress.setFont(new Font("Arial",Font.BOLD,18));
		userAddress.setBounds(100,390,200,30);
		add(userAddress);
		
		//ADDRESS TEXTFIELD
		userAddressTextField = new JTextField();
		userAddressTextField.setFont(new Font("Arial",Font.PLAIN,18));
		userAddressTextField.setBounds(300,390,400,30);
		add(userAddressTextField);
		
		//CITY
		JLabel userCity = new JLabel("City : ");
		userCity.setFont(new Font("Arial",Font.BOLD,18));
		userCity.setBounds(100,440,200,30);
		add(userCity);
		
		//CITY TEXTFIELD
		userCityTextField = new JTextField();
		userCityTextField.setFont(new Font("Arial",Font.PLAIN,18));
		userCityTextField.setBounds(300,440,400,30);
		add(userCityTextField);
		
		//STATE
		JLabel userState = new JLabel("State : ");
		userState.setFont(new Font("Arial",Font.BOLD,18));
		userState.setBounds(100,490,200,30);
		add(userState);
		
		//STATE TEXTFIELD
		userStateTextField = new JTextField();
		userStateTextField.setFont(new Font("Arial",Font.PLAIN,18));
		userStateTextField.setBounds(300,490,400,30);
		add(userStateTextField);
		
		//PINCODE
		JLabel userPincode = new JLabel("Pincode : ");
		userPincode.setFont(new Font("Arial",Font.BOLD,18));
		userPincode.setBounds(100,540,200,30);
		add(userPincode);
		
		//PINCODE TEXTFIELD
		userPincodeTextField = new JTextField();
		userPincodeTextField.setFont(new Font("Arial",Font.PLAIN,18));
		userPincodeTextField.setBounds(300,540,400,30);
		add(userPincodeTextField);
		
		submit = new JButton("SUBMIT");
		submit.setBackground(Color.black);
		submit.setForeground(Color.white);
		submit.setFont(new Font("Arial",Font.BOLD,18));
		submit.setBounds(350,620,150,40);
		submit.addActionListener(this);
		add(submit);
		
		
		getContentPane().setBackground(Color.WHITE);
		setSize(850,800);
		setLocation(350,10);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		String formno = "" + randomNumber;
		String userName = userNameTextField.getText();
		String contactNumber = contactNumberTextField.getText();
		String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
		String gender = null;
		if(male.isSelected()) {
			gender = "Male";
		} else if(female.isSelected()) {
			gender = "Female";
		} else {
			gender = "Other";
		}
		String email = userEmailTextField.getText();
		String address = userAddressTextField.getText();
		String city = userCityTextField.getText();
		String state = userStateTextField.getText();
		String pincode = userPincodeTextField.getText();
		
		try {
			if(userName.equals("")) {
				JOptionPane.showMessageDialog(null,"Name field cannot be left empty");
			} else {
				Connection c = new Connection();
				String query = "INSERT INTO register VALUES('"+formno+"','"+userName+"','"+contactNumber+"','"+dob+"','"+gender+"','"+email+"','"+address+"','"+city+"','"+state+"','"+pincode+"')";
				c.s.executeUpdate(query);
				
				if(ae.getSource()==submit) {
					setVisible(false);
					new thank().setVisible(true);
				}
			}
		} catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

	public static void main(String[] args) {
		new Signup();
	}

}