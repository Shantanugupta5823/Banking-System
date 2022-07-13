package Source;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class miniStatement extends JFrame implements ActionListener{
	JLabel l1,l2,l3,l4;
	String d = login.a;
	JTable jt;
	JButton b1,b2;
	miniStatement(){
		setFont(new Font("Arial",Font.BOLD,40));
		String pad = "";
		pad = String.format("%"+90+"s",pad);
		setTitle(pad + "STATE BANK OF INDIA");
		
		l1 = new JLabel("MINI STATEMENT");
		l1.setFont(new Font("system", Font.BOLD, 28));
		
		b1 = new JButton("EXIT");
		b1.setFont(new Font ("Times New Roman", Font.BOLD,28));
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		
		
		b2 = new JButton("BACK");
		b2.setFont(new Font ("Times New Roman", Font.BOLD,28));
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		

		try {
			conn c1 = new conn();
			int form_no = 0;
			Long accNo = (long)0;
			 ResultSet rs = c1.s.executeQuery("Select * from login where id = '"+d+"';");
			 if(rs.next()) {
				  form_no = rs.getInt(1);
				  accNo = rs.getLong(3);
			 }
	
			ResultSet r = c1.s.executeQuery("Select * from signup1 where form_no = '"+form_no+"';");
			 if(r.next()) {
				String Name = r.getString(2);
				l2 = new JLabel("Account Holder's Name : " + Name);
				l2.setFont(new Font("Times New Roman", Font.PLAIN, 20));		
			 }
			 
			l3 = new JLabel("Account Number : " + accNo);
			l3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			
			int bal = 0;
			ResultSet R = c1.s.executeQuery("select balance from "+d+" order by date desc, time desc limit 1;");
			if(R.next()) {
				bal = R.getInt(1);
			}
			l4 = new JLabel("Your account balance : " + bal);
			l4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			
			ResultSet RS = c1.s.executeQuery("select * from (select * from "+d+" order by date desc,time desc limit 5) var1 order by date asc,time asc");
			String[][] data = new String[6][5];
			String[] Column = {"Date","Time","Credit","Debit","Balance"};
			data[0][0] = "Date";
			data[0][1] = "Time";
			data[0][2] = "Credit";
			data[0][3] = "Debit";
			data[0][4] = "Balance";
			int i = 1;
			while(RS.next()) {
				 data[i][0] = RS.getString(1);
				 data[i][1] = RS.getString(2);
				 data[i][2] = RS.getString(3);
				 data[i][3] = RS.getString(4);
				 data[i][4] = RS.getString(5);
				 
				 i++;
			}
			
		jt = new JTable(data,Column);
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		setLayout(null);
		
		l1.setBounds(250,60,400,40);
		add(l1);
		
		l2.setBounds(50,120,500,20);
		add(l2);
		
		l3.setBounds(50,150,500,20);
		add(l3);
		
		l4.setBounds(50,180,500,20);
		add(l4);
		
		jt.setBounds(50,250,650,400);
		add(jt);
		
		b1.setBounds(50,650,150,30);
		add(b1);
		
		b2.setBounds(500,650,150,30);
		add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		getContentPane().setBackground(Color.WHITE);
        setSize(750,750);
    	setLocation(200,0);
    	setVisible(true);     
	}
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource() == b1) {
			int s = JOptionPane.showConfirmDialog(this,"You are Exiting from system","EXIT",JOptionPane.YES_NO_OPTION);
			if(s == JOptionPane.YES_OPTION) {
			 System.exit(0);		 
				}
			}
		if(ae.getSource() == b2) {
			JOptionPane.showMessageDialog(this,"Going Back to Transaction Page");
			 setVisible(false);
			}
		}
	public static void main(String[] args) { 
		 new miniStatement().setVisible(true);
 
	}

}
