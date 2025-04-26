package GUI_Final;

import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;




@SuppressWarnings("serial")
public class page  extends Frame{
	
	 JFrame frame = new JFrame();
	 JTabbedPane tp = new JTabbedPane();
	
	
	JPanel welcome=new JPanel();
	 JPanel booking = new JPanel();
	 JPanel display = new JPanel();
	
		page(String customer_id) {
		
		frame.setSize(800,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Hello" + " " + customer_id + " " + "Welcome to the Boat Management System");
		
	
		welcome(welcome,customer_id);
		booking(booking, customer_id);
		display(display, customer_id);
		tp.add("Welcome",welcome);
		tp.addTab("Boat Booking", booking);
		tp.addTab("Boat Information", display);
		
		frame.add(tp);
		frame.setVisible(true);
		
	}
		
		private void welcome(JPanel panel, String customer_id)
		{
			JLabel label=new JLabel("Hello WELCOME to House Boat Management System");
			label.setBounds(100, 40, 500, 50);
			label.setFont(new Font("SansSerif",Font.BOLD, 22));
			JButton bu=new JButton("Click Here to check availability");
			bu.setBounds(150, 100, 200, 30);
			panel.setLayout(null);
			panel.add(label);
			panel.add(bu);
			
			bu.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					booking(booking,customer_id);
				}
			});
		}

	private void booking(JPanel panel, String customer_id) {
		
		panel.setLayout(null);
		
		
		
		JLabel jl = new JLabel("Boat ID: ");
		jl.setFont(new Font("SansSerif", Font.BOLD, 22));
		jl.setBounds(10, 100, 180, 22);
		panel.add(jl);
		
		JTextField jf = new JTextField(20);
		jf.setBounds(200, 100, 200, 22);
		panel.add(jf);
		
		JLabel j3 = new JLabel("Boat Name: ");
		j3.setFont(new Font("SansSerif", Font.BOLD, 22));
		j3.setBounds(10, 200, 180, 25);
		panel.add(j3);
		
		JTextField jf1 = new JTextField(20);
		jf1.setBounds(200, 200, 200, 22);
		panel.add(jf1);
		
		JLabel j4 = new JLabel("Capacity: ");
		j4.setFont(new Font("SansSerif", Font.BOLD, 22));
		j4.setBounds(10, 300, 180, 25);
		panel.add(j4);
		
		JTextField jf2 = new JTextField(20);
		jf2.setBounds(200, 300, 200, 22);
		panel.add(jf2);
		
		JButton jb1 = new JButton("Press To Book");
		jb1.setFont(new Font("SansSerif", Font.BOLD, 22));
		jb1.setBounds(450, 250, 200, 22);
		panel.add(jb1);
		
		
		jb1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				/*boat i = new boat(customer_id);
				String id = jf.getText();
				String name = jf1.getText();
				int capacity = Integer.parseInt(jf2.getText());
				i.booking(id,name,capacity);*/
				new Register();
				
				
			}
		});

		
	}

	private void display(JPanel panel, String customer_id) {
		panel.setLayout(null);
		
		JLabel jl = new JLabel("Customer Details: ");
		jl.setFont(new Font("SansSerif", Font.BOLD, 35));
		jl.setBounds(550, 50, 500, 50);
		panel.add(jl);
		
		JButton jb6 = new JButton("Press To check");
		jb6.setFont(new Font("SansSerif", Font.BOLD, 22));
		jb6.setBounds(600, 150, 200, 25);
		panel.add(jb6);
		
		JLabel result1 = new JLabel("");
		result1.setFont(new Font("SansSerif", Font.BOLD, 22));
		result1.setBounds(30,200 , 1500, 20);
		panel.add(result1);
		
		jb6.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				boat i = new boat(customer_id);
				result1.setText(i.display(customer_id));
			
				
			}
		});
		
		
		
	}
		
	}