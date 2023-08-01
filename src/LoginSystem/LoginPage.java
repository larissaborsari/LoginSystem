package LoginSystem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage implements ActionListener {
	
	JFrame frame = new JFrame();
	JButton loginButton = new JButton("Login");
	JButton resetButton = new JButton("Reset");
	JTextField userIdField = new JTextField();
	JPasswordField userPasswordField = new JPasswordField();
	JLabel userIdLabel = new JLabel("userId: ");
	JLabel userPasswordLabel = new JLabel("password: ");
	JLabel messageLabel = new JLabel();
	
	HashMap<String,String> loginInfo = new HashMap<String,String>();
	
	LoginPage(HashMap<String,String> loginInfoSource){
		
		loginInfo = loginInfoSource;
		
		userIdLabel.setBounds(50,100,75,25);
		userPasswordLabel.setBounds(50,100,75,25);
		
		frame.add(userIdLabel);
		frame.add(userPasswordLabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
