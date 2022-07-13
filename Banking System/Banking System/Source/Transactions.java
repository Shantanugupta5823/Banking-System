package Source;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Transactions extends JFrame implements ActionListener{
	JLabel l1;
	JButton b1,b2,b3,b4,b5,b6,b7,b8;
    String d = login.a; 
    Transactions() {
	setFont(new Font("Arial",Font.BOLD,40));
	String pad = "";
	pad = String.format("%"+90+"s",pad);
	setTitle(pad + "STATE BANK OF INDIA");
	
	l1 = new JLabel("Please Select Your Transaction");
	l1.setFont(new Font("system", Font.BOLD, 28));

	b1 = new JButton("Deposit");
	b1.setFont(new Font("system", Font.BOLD, 20));
	b1.setBackground(Color.BLACK);
	b1.setForeground(Color.WHITE);

	b2 = new JButton("Cash Withdrawl");
	b2.setFont(new Font("system", Font.BOLD, 20));
	b2.setBackground(Color.BLACK);
	b2.setForeground(Color.WHITE);

	b3 = new JButton("Fast Cash");
	b3.setFont(new Font("system", Font.BOLD, 20));
	b3.setBackground(Color.BLACK);
	b3.setForeground(Color.WHITE);

	b4 = new JButton("Mini Statement");
	b4.setFont(new Font("system", Font.BOLD, 20)); 
	b4.setBackground(Color.BLACK);
	b4.setForeground(Color.WHITE);

	b5 = new JButton("Pin Change");
	b5.setFont(new Font("system", Font.BOLD, 20));
	b5.setBackground(Color.BLACK);
	b5.setForeground(Color.WHITE);

	b6 = new JButton("Balance Enquiry");
	b6.setFont(new Font("system", Font.BOLD, 20));
	b6.setBackground(Color.BLACK);
	b6.setForeground(Color.WHITE);

	b7 = new JButton("Exit");
	b7.setFont(new Font("system", Font.BOLD, 20));
	b7.setBackground(Color.BLACK);
	b7.setForeground(Color.WHITE);
	
	b8 = new JButton("BACK");
	b8.setFont(new Font("system", Font.BOLD, 20));
	b8.setBackground(Color.BLACK);
	b8.setForeground(Color.WHITE);
	setLayout(null);
	
	l1.setBounds(150,50,500,40);
	add(l1);
	
	b1.setBounds(50,150,250,60);
	add(b1);

	b2.setBounds(400,150,250,60);
	add(b2);
      
	b3.setBounds(50,250,250,60);
	add(b3);

	b4.setBounds(400,250,250,60);
	add(b4);

	b5.setBounds(50,350,250,60);
	add(b5);
 
	b6.setBounds(400,350,250,60);
	add(b6);
           
	b8.setBounds(50,500,100,40);
	add(b8);
	
	b7.setBounds(550,500,100,40);
	add(b7);
	
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);
	b6.addActionListener(this);
	b7.addActionListener(this);
	b8.addActionListener(this);
	getContentPane().setBackground(Color.WHITE);
 
	setSize(750,750);
	setLocation(200,0);
	setVisible(true);       
    
}
	public void actionPerformed(ActionEvent ae) {
		SimpleDateFormat f1 = new SimpleDateFormat("dd/MM/yy");
		SimpleDateFormat f2 = new SimpleDateFormat("hh-mm-ss a");
		Date dat = new Date();
		String date = f1.format(dat);
		String time = f2.format(dat);
		String q1 = "";
		int balance = 0;
		try {
			conn c1 = new conn();
			ResultSet r = c1.s.executeQuery("select balance from "+d+" order by date desc, time desc limit 1;");
			if(r.next()) {
				balance = r.getInt(1);
			}
			if(ae.getSource()==b1){
				int amount = Integer.parseInt(JOptionPane.showInputDialog(this,"Enter the Amount you want to Deposit"));
				balance += amount;
				q1 = "insert into "+d+" values('"+date+"', '"+time+"', '"+amount+"', '0', '"+balance+"');";
			}else if (ae.getSource()==b2){
				int amount = Integer.parseInt(JOptionPane.showInputDialog(this,"Enter the Amount you want to Withdraw"));
				balance -= amount;
				if(balance < 0) {
					JOptionPane.showMessageDialog(this,"Your account is low on balance");
				}else {
					q1 = "insert into "+d+" values('" +date+"', '"+time+"', '"+"0"+"', '"+amount+"', '"+balance+"');";
				}
			}else if (ae.getSource()==b3){
  			new FastCash().setVisible(true);
			}else if (ae.getSource()==b4){
    	  		new miniStatement().setVisible(true);	
			}else if (ae.getSource()==b5){
				String s = JOptionPane.showInputDialog(this,"Enter the Old Pin" );
				ResultSet ra = c1.s.executeQuery("select password from login where id = '"+ d+"';");
				String oldpass = null;
				if(ra.next()) {
					oldpass = ra.getString(1);
				}
				if (oldpass.contentEquals(s)) {
					String newpass = JOptionPane.showInputDialog(this,"Enter new Pin ");
					if(newpass == null) {
						JOptionPane.showMessageDialog(this, "Password can't be null");	
					}else {
						q1 = "update login set password = "+newpass+" where id = '"+d+"';";
						JOptionPane.showMessageDialog(this,"Password has been reset to : " + newpass);
					}
				}else {
					JOptionPane.showMessageDialog(this,"Password doesn't match, Enter correct Password");
				}
			}else if (ae.getSource()==b6){
				 JOptionPane.showMessageDialog(this,"Your account balance is :" + balance);
			}
			if(q1.isBlank() == false) {	
				c1.s.execute(q1);
				JOptionPane.showMessageDialog(null,"Transaction has been done");
			} 

		}catch (Exception e) {
			e.printStackTrace();
			}
		
		if(ae.getSource()==b7){    
			int s = JOptionPane.showConfirmDialog(this,"You are exiting transaction","EXIT",JOptionPane.YES_NO_OPTION);
			if(s == JOptionPane.YES_OPTION) {
				System.exit(0);
			}
		}
		if(ae.getSource() == b8) {
			int s = JOptionPane.showConfirmDialog(this,"You'll have to access Again","BACK", JOptionPane.YES_NO_OPTION);
			if(s == JOptionPane.YES_OPTION) {
				setVisible(false);
				new login().setVisible(true);
			}
		}
			
	}
        
	public static void main(String[] args) {
		new Transactions().setVisible(true);
	
	}
	
}



