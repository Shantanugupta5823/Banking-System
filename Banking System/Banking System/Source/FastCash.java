package Source;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
public class FastCash extends JFrame implements ActionListener{
	JLabel  l1;
	JButton b1,b2,b3,b4,b5,b6,b7;
	String d = login.a;
	FastCash(){
		setFont(new Font("Arial",Font.BOLD,40));
        String pad = "";
        pad = String.format("%"+90+"s",pad);
        setTitle(pad + "STATE BANK OF INDIA");
        
        l1 = new JLabel("Amount You Want To Withdraw");
        l1.setFont(new Font("system", Font.BOLD, 28));
        
        b1 = new JButton("500");
        b1.setFont(new Font("Arial", Font.BOLD,25));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        b2 = new JButton("1000");
        b2.setFont(new Font("Arial", Font.BOLD,25));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
	
        b3 = new JButton("1500");
        b3.setFont(new Font("Arial", Font.BOLD,25));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        
        b4 = new JButton("2000");
        b4.setFont(new Font("Arial", Font.BOLD,25));
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        
        b5 = new JButton("5000");
        b5.setFont(new Font("Arial", Font.BOLD,25));
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
        
        b6 = new JButton("1000");
        b6.setFont(new Font("Arial", Font.BOLD,25));
        b6.setBackground(Color.BLACK);
        b6.setForeground(Color.WHITE);
        
        b7 = new JButton("OK");
        b7.setFont(new Font("Arial", Font.BOLD,25));
        b7.setBackground(Color.BLACK);
        b7.setForeground(Color.WHITE);
        
        setLayout(null);
        
        l1.setBounds(150,100,500,30);
        add(l1);
        
        b1.setBounds(100,200,200,60);
        add(b1);
        
        b2.setBounds(450,200,200,60);
        add(b2);
        
        b3.setBounds(100,300,200,60);
        add(b3);
        
        b4.setBounds(450,300,200,60);
        add(b4);
        
        b5.setBounds(100,400,200,60);
        add(b5);
        
        b6.setBounds(450,400,200,60);
        add(b6);
        
        b7.setBounds(500,550,100,40);
        add(b7);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(750,750);
    	setLocation(200,0);
    	setVisible(true);     
	}
	public void actionPerformed(ActionEvent ae) {
		try {
			SimpleDateFormat f1 = new SimpleDateFormat("dd/MM/yy");
			SimpleDateFormat f2 = new SimpleDateFormat("hh-mm-ss a");
			Date dat = new Date();
			String date = f1.format(dat);
			String time = f2.format(dat);
			conn c1 = new conn();
			String q1 = "";
			int balance= 0;
			ResultSet r = c1.s.executeQuery("select balance from "+d+" order by date desc, time desc limit 1;");
			if(r.next()) {
				balance = r.getInt(1);
			}
			if(ae.getSource() == b1) {
				balance -= 500;
				if(balance < 0) {
					JOptionPane.showMessageDialog(this,"Your account is low on balance");
				}else {
					q1 = "insert into "+d+" values('" +date+"', '"+time+"', '"+"0"+"', '"+"500"+"', '"+balance+"');";
				}
			}
			else if (ae.getSource() == b2) {
				balance -= 1000;
				if(balance < 0) {
					JOptionPane.showMessageDialog(this,"Your account is low on balance");
				}else {
					q1 = "insert into "+d+" values('" +date+"', '"+time+"', '"+"0"+"', '"+"1000"+"', '"+balance+"');";
				}
			}
			else if (ae.getSource() == b3) {
				balance -= 1500;
				if(balance < 0) {
					JOptionPane.showMessageDialog(this,"Your account is low on balance");
				}else {
					q1 = "insert into "+d+" values('" +date+"', '"+time+"', '"+"0"+"', '"+"1500"+"', '"+balance+"');";
				}
			}
			else if (ae.getSource() == b4) {
				balance -= 2000;
				if(balance < 0) {
					JOptionPane.showMessageDialog(this,"Your account is low on balance");
				}else {
					q1 = "insert into "+d+" values('" +date+"', '"+time+"', '"+"0"+"', '"+"2000"+"', '"+balance+"');";
				}
			}
			else if (ae.getSource() == b5) {
				balance -= 5000;
				if(balance < 0) {
					JOptionPane.showMessageDialog(this,"Your account is low on balance");
				}else {
					q1 = "insert into "+d+" values('" +date+"', '"+time+"', '"+"0"+"', '"+"5000"+"', '"+balance+"');";
				}
			}
			else if (ae.getSource() == b6) {
				balance -= 10000;
				if(balance < 0) {
					JOptionPane.showMessageDialog(this,"Your account is low on balance");
				}else {
					q1 = "insert into "+d+" values('" +date+"', '"+time+"', '"+"0"+"', '"+"10000"+"', '"+balance+"');";
				}
			}
			if(q1.isBlank() == false) {	
				c1.s.execute(q1);
				JOptionPane.showMessageDialog(null,"Transaction has been done");
			} 
			
			if (ae.getSource() == b7) {
				JOptionPane.showMessageDialog(this,"Going Back to Transaction Page");
				 setVisible(false);
			}
		}catch(Exception e ) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new FastCash().setVisible(true);
	}
}
