
package GUI_Final;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



import java.awt.*;
 public class login 
 {
	 protected static final String ActionListener = null;
	JFrame f;
	
	 login()
	 {
		 JButton b1,b2;
		 
		 f=new JFrame("Demo");
		 JLabel  l1=new JLabel("House Boat Management System");  
		 l1.setBounds(50,50, 250,50); 
		 b1=new JButton("Login");
		 b1.setBounds(100, 100, 100, 40);
		 b2=new JButton("Register");
		 b2.setBounds(100, 180, 100, 40);
		 
		 b1.addActionListener(new ActionListener() {
			
			/**
			 *
			 */
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				NextPage page=new NextPage();
				page.setVisible(true);
				JLabel lb1,lb2;
				
				lb1=new JLabel("Username :");
				lb1.setBounds(50, 50, 80, 40);
				JTextField tf1=new JTextField();
				
				tf1.setBounds(140,50,80,40);
				lb2=new JLabel("Password :");
				lb2.setBounds(50, 100, 80, 60);
				JPasswordField tf2=new JPasswordField();
				
				tf2.setBounds(140,110,80,40);
				JButton bt=new JButton("Submit");
				bt.setBounds(80, 160, 80, 40);
			
				
				bt.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						NextPage page2=new NextPage();
						page2.setVisible(true);
						String userName = tf1.getText();
				        String password = tf2.getText();
				        JTextField message=new JTextField();
				        if (userName.trim().equals("admin") && password.trim().equals("admin")) 
				        {
				            message.setText(" Hello " + userName  + "");
				            page2.add(message);
				            new userpage(1);
				            
				        }
				        else {
				        	NextPage page3=new NextPage();
				        	page3.setVisible(true);
				        	JTextField msg=new JTextField("Please Register First. Close this window to login again :)");
				        	
				        	page3.add(msg);
				        	
				        }
				        
						
					}
				});
			
				/*page.getContentPane().add(lb1);
				page.getContentPane().add(tf1);
				page.getContentPane().add(lb2);
				page.getContentPane().add(tf2);
				page.getContentPane().add(bt);
				page.getContentPane().setLayout(null);
				*/
				page.add(lb1);
				page.add(tf1);
				page.add(lb2);
				page.add(tf2);
				page.add(bt);
				page.setSize(400,300);
				page.setLayout(null);
			
			}

			
		});
		 
		 f.add(b1);
		 f.add(l1);
		 f.add(b2);
		 f.setLayout(null);
		 f.setVisible(true);
		 f.setSize(400,400);
		 b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Register();
				
				
			}
		});
		 
	 }
	 public static void main(String[] args)
	 {
		new login();
	 }
 }