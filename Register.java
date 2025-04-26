package GUI_Final;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Register  {
		JFrame jf=null;
		public Register()
		{
			jf=new JFrame("Register");
			JLabel l1,l2,l3,l4,l5,l6;
			JTextField t1,t2,t3,t4,t5,t6;
			JButton b=new JButton("Submitg");
			JButton b1=new JButton();
			l1=new JLabel("Customer_id");
			l2=new JLabel("First_name");
			l3=new JLabel("Last_name");
			l4=new JLabel("Phone_number");
			l5=new JLabel("Customer_city");
			l6=new JLabel("Password");
			t1=new JTextField();
			t2=new JTextField();
			t3=new JTextField();
			t4=new JTextField();
			t5=new JTextField();
			t6=new JTextField();
			
			//bounds
			l1.setBounds(100, 20, 100, 40);
			l2.setBounds(100, 100, 100, 40);
			l3.setBounds(100, 180, 100, 40);
			l4.setBounds(100, 260, 100, 40);
			l5.setBounds(100, 340, 100, 40);
			l6.setBounds(100, 420, 100, 40);
			t1.setBounds(200, 20, 150, 40);
			t2.setBounds(200, 100, 150, 40);
			t3.setBounds(200, 180, 150, 40);
			t4.setBounds(200, 260, 150, 40);
			t5.setBounds(200, 340, 150, 40);
			t6.setBounds(200, 420, 150, 40);
			b.setBounds(100,460,100,40);
			b1.setBounds(150, 440, 150, 40);
			//add
			jf.add(l1);
			jf.add(t1);
			jf.add(l2);
			jf.add(t2);
			jf.add(l3);
			jf.add(t3);
			jf.add(l4);
			jf.add(t4);
			jf.add(l5);
			jf.add(t5);
			jf.add(l6);
			jf.add(t6);
			jf.add(b);
			jf.add(b1);
			jf.setVisible(true);
			jf.setLayout(null);
			jf.setSize(500, 500);
			
			b1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
		}
		
}
