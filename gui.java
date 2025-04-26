package GUI_Final;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;



public class gui implements ActionListener{
	
	private static JLabel appTitle;
	private static JLabel userLabel;
	private static JTextField usernameText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JButton loginButton;
	private static JButton okButton;
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		frame.setSize(800,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Boat Management System");
		
		placeComponents(panel);
		frame.add(panel);
		frame.setBackground(Color.GREEN);
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {


        panel.setLayout(null);
        
        appTitle = new JLabel("HOUSE BOAT MANAGEMENT SYSTEM");
        appTitle.setFont(new Font("DIALOG", Font.PLAIN, 25));
        appTitle.setBounds(150, 20, 500, 75);
        panel.add(appTitle);
        
        userLabel = new JLabel("Customer_ID");
        userLabel.setBounds(150,100,80,25);
        panel.add(userLabel);

        usernameText = new JTextField(20);
        usernameText.setBounds(240,100,165,25);
        panel.add(usernameText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(150,150,80,25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(240,150,165,25);
        panel.add(passwordText);

        loginButton = new JButton("login");
        loginButton.setBounds(200, 200, 80, 25);
        loginButton.addActionListener(new gui());
        panel.add(loginButton);
        
        okButton = new JButton("Ok");
    }

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Login Button Clicked");
		String customer_id = usernameText.getText();
		int password = Integer.parseInt(passwordText.getText());
		
		
		Connection connect = null;
		try{
			Class.forName("org.postgresql.Driver");
			System.out.println("class done");
			connect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/houseboat", "postgres", "manky");
			System.out.println("connect done");
			PreparedStatement st = (PreparedStatement) connect
                    .prepareStatement("SELECT Customer_id, Phone_Number FROM Customer WHERE Customer_id=? AND Phone_Number=?;");
			st.setString(1, customer_id);
            st.setInt(2, password);
            ResultSet rs = st.executeQuery();
            
            if (rs.next()) {
            	System.out.println("User " + customer_id + " logged in");
            	frame.dispose();
            	new page(customer_id);
            }
            
            else{
            	JOptionPane.showMessageDialog(okButton,"Login Again");
            	JLabel lab=new JLabel("Login Again");
            	new gui();
            }
			
		}catch (Exception e1) {
	         e1.printStackTrace();
	         System.exit(0);
		}
	}
    
}