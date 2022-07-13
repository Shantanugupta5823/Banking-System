package Source;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;
public class SignUp3 extends JFrame implements ActionListener{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
	JRadioButton rb1,rb2,rb3,rb4;
	JButton b1,b2;
	JCheckBox c1,c2,c3,c4,c5,c6,c7;
	int num = SignUp.serial();
	
	SignUp3(){
		setFont(new Font("Arial",Font.BOLD,40));
        String pad = "";
        pad = String.format("%"+90+"s",pad);
        setTitle(pad + "STATE BANK OF INDIA");
        
        l1 = new JLabel("Form Number : " + num);
        l1.setFont(new Font("Times New Roman",Font.BOLD,15));
        
        l2 = new JLabel("Page 3 : Account Details ");
        l2.setFont(new Font("Times New Roman",Font.BOLD, 25));
        
        l3 = new JLabel("Account Type : ");
        l3.setFont(new Font("Times New Roman",Font.BOLD,20));
        
        rb1 = new JRadioButton("Saving Account");
        rb1.setFont(new Font("Times New Roman",Font.PLAIN,20));
        rb1.setBackground(Color.WHITE);
        rb1.setForeground(Color.BLACK);
	
        rb2 = new JRadioButton("Fixed Deposit Account");
        rb2.setFont(new Font("Times New Roman",Font.PLAIN,20));
        rb2.setBackground(Color.WHITE);
        rb2.setForeground(Color.BLACK);
        
        rb3 = new JRadioButton("Current Account");
        rb3.setFont(new Font("Times New Roman",Font.PLAIN,20));
        rb3.setBackground(Color.WHITE);
        rb3.setForeground(Color.BLACK);
        
        rb4 = new JRadioButton("Recurring Deposit Account");
        rb4.setFont(new Font("Times New Roman",Font.PLAIN,20));
        rb4.setBackground(Color.WHITE);
        rb4.setForeground(Color.BLACK);
        
        ButtonGroup bg1 = new ButtonGroup();
		bg1.add(rb1);
		bg1.add(rb2);
		bg1.add(rb3);
		bg1.add(rb4);
		
        l4 = new JLabel("Card Number :");
        l4.setFont(new Font("Times New Roman",Font.BOLD,20));
	
        l5 = new JLabel("XXXX-XXXX-XXXX-XXXX");
        l5.setFont(new Font("Times New Roman",Font.BOLD,20));
        
        l6 = new JLabel("(Your 16 - digit Card Number)");
        l6.setFont(new Font("Times New Roman",Font.BOLD,14));
        
        l7 = new JLabel("It would appear on ATM Card , Cheque Book and Statements");
        l7.setFont(new Font("Times New Roman",Font.BOLD,14));
        
        l8 = new JLabel("PIN :");
        l8.setFont(new Font("Times New Roman",Font.BOLD,20));
        
        l9 = new JLabel("XXXX");
        l9.setFont(new Font("Times New Roman",Font.BOLD,20));
   
        l10 = new JLabel("4-Digit Password");
        l10.setFont(new Font("Times New Roman",Font.BOLD,14));
        
        l11 = new JLabel("Services Required : ");
        l11.setFont(new Font("Times New Roman",Font.BOLD,20));
        
        c1 = new JCheckBox("ATM CARD");
        c1.setFont(new Font("Times New Roman",Font.BOLD,20));
        c1.setBackground(Color.WHITE);
        c1.setForeground(Color.BLACK);
        
        c2 = new JCheckBox("Internet Banking");
        c2.setFont(new Font("Times New Roman",Font.BOLD,20));
        c2.setBackground(Color.WHITE);
        c2.setForeground(Color.BLACK);
        
        c3 = new JCheckBox("Mobile Banking");
        c3.setFont(new Font("Times New Roman",Font.BOLD,20));
        c3.setBackground(Color.WHITE);
        c3.setForeground(Color.BLACK);
        
        c4 = new JCheckBox("EMAIL Alerts");
        c4.setFont(new Font("Times New Roman",Font.BOLD,20));
        c4.setBackground(Color.WHITE);
        c4.setForeground(Color.BLACK);
        
        c5 = new JCheckBox("Cheque Book");
        c5.setFont(new Font("Times New Roman",Font.BOLD,20));
        c5.setBackground(Color.WHITE);
        c5.setForeground(Color.BLACK);
        
        c6 = new JCheckBox("E-Statement");
        c6.setFont(new Font("Times New Roman",Font.BOLD,20));
        c6.setBackground(Color.WHITE);
        c6.setForeground(Color.BLACK);
        
        c7 = new JCheckBox("I hearby declares that the above entered details are correct to the best of my knowledge");
        c7.setFont(new Font("Times New Roman",Font.BOLD,16));
        c7.setBackground(Color.WHITE);
        c7.setForeground(Color.BLACK);
        
        b1  = new JButton("Submit");
        b1.setFont(new Font("Times New Roman",Font.BOLD,20));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.white);
        
        b2  = new JButton("Cancel");
        b2.setFont(new Font("Times New Roman",Font.BOLD,20));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.white);
        
	
        setLayout(null);
        
        l1.setBounds(600,10,200,10);
        add(l1);
        
        l2.setBounds(230,50,300,25);
        add(l2);
        
        l3.setBounds(100,120,300,20);
        add(l3);

        rb1.setBounds(100,160,300,25);
        add(rb1);

        rb2.setBounds(400,160,300,25);
        add(rb2);

        rb3.setBounds(100,200,300,25);
        add(rb3);

        rb4.setBounds(400,200,300,25);
        add(rb4);

        l4.setBounds(100,250,220,25);
        add(l4);

        l5.setBounds(320,250,400,25);
        add(l5);

        l6.setBounds(100,280,220,15);
        add(l6);

        l7.setBounds(320,280,400,15);
        add(l7);

        l8.setBounds(100,330,200,25);
        add(l8);

        l9.setBounds(320,330,200,25);
        add(l9);

        l10.setBounds(100,360,200,15);
        add(l10);
        
        l11.setBounds(100,400,300,25);
        add(l11);

        c1.setBounds(100,440,250,25);
        add(c1);

        c2.setBounds(350,440,300,25);
        add(c2);

        c3.setBounds(100,470,250,25);
        add(c3);

        c4.setBounds(350,470,300,25);
        add(c4);

        c5.setBounds(100,500,250,25);
        add(c5);

        c6.setBounds(350,500,300,25);
        add(c6);

        c7.setBounds(50,600,700,25);
        add(c7);

        b1.setBounds(200,650,100,30);
        add(b1);

        b2.setBounds(400,650,100,30);
        add(b2);

        
        b1.addActionListener(this);
        b2.addActionListener(this);
		getContentPane().setBackground(Color.WHITE);
	    setSize(750,750);
	    setLocation(200,0);
	    setVisible(true);
	} 
	public void actionPerformed(ActionEvent ae) {
		String a = null;
		if(rb1.isSelected()){
			a = "Saving Account";
		}else if(rb2.isSelected()){
			a = "Fixed Deposit Account";
		}else if(rb3.isSelected()){
			a = "Current Account";
		}
		else if(rb4.isSelected()){
			a = "Recurring Deposit account";
		}
     
		Random ran = new Random();
		long first7 = (ran.nextLong() % 90000000L)+ 5040936000000000L;
		long first8 = Math.abs(first7);
             
		long first3 = (ran.nextLong() % 9000L)+ 1000L;
		long first4 = Math.abs(first3);

		SimpleDateFormat f1 = new SimpleDateFormat("dd/MM/yy");
		Date dat = new Date();
		String date = f1.format(dat);

		String b="";
		if(c1.isSelected()){
			b = b+"ATM Card ";
		}
		if(c2.isSelected()){
			b = b+"Internet Banking ";
		}
		if(c3.isSelected()){
			b = b+"Mobile Banking ";
		}
		if(c4.isSelected()){
			b = b+"Email Alerts ";
		}
		if(c5.isSelected()) {
			b += "Cheque Book ";
		}
		if(c6.isSelected()){
			b = b+"E Statement ";
		}
		try{
			if(ae.getSource()==b1){ 
				if(b.equals("") || a.equals("")){
					JOptionPane.showMessageDialog(null, "Fill all the required details ");
				}else{
					conn c1 = new conn();
					String s = JOptionPane.showInputDialog(this,"Login ID should have characters in it");
					String q3 = "create table "+s+"(Date varchar(10), Time varchar(12), Credit numeric(10), Debit numeric(10),Balance numeric(10));";
					c1.s.execute(q3);
					String q1 = "insert into signup3 values('"+num+"','"+s+"','"+a+"','"+b+"')";
					String q2 = "insert into login values('"+num+"', '"+s+"', '"+first8+"', '"+first4+"');";
					c1.s.executeUpdate(q1);
					c1.s.executeUpdate(q2);
					
					JOptionPane.showMessageDialog(null, "Card No." + first8 +"\nID : "+ s +"\nPin :"+ first4);
					setVisible(false);
                   	}
			}else if(ae.getSource()==b2){
				int s = JOptionPane.showConfirmDialog(this,"Stored information will be deleted","WARNING",JOptionPane.YES_NO_OPTION); 
				if(s == JOptionPane.YES_OPTION) {
					 conn c2 = new conn();
					  String k = "delete from signup1 where form_no =" +num+";";
					  c2.s.execute(k);
					  String r = "delete from signup2 where form_no =" +num+";";
					  c2.s.execute(r);
					  String e = "delete from signup3 where form_no =" +num+";";
					  c2.s.execute(e);
					  System.exit(0);
				  }
			}
		}catch(Exception ex){
			JOptionPane.showMessageDialog(this,"ID Already Taken, Please Submit Again");
			ex.printStackTrace();
		}
	}	
	public static void main(String[] args) {
		new SignUp3().setVisible(true);
	}

}
