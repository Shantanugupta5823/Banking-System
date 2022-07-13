package Source;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import com.toedter.calendar.JDateChooser;
public class SignUp extends JFrame implements ActionListener {
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
	JTextField tf1, tf2, tf3, tf4,tf5,tf6,tf7;
	JRadioButton rb1, rb2,rb3,rb4,rb5;
	JButton b1,b2;

	JDateChooser datechooser;
	int num = serial();
	
	SignUp() {
			num = num+1;
			setFont(new Font("Arial",Font.BOLD,40));
	        String pad = "";
	        pad = String.format("%"+90+"s",pad);
	        setTitle(pad + "STATE BANK OF INDIA");
	       
	        l1 = new JLabel ("APPLICATION FORM . " + num);
	        l1.setFont(new Font("Times New Roman",Font.BOLD,30));
	        
	        l2 = new JLabel ("PAGE 1. Personal Details");
	        l2.setFont(new Font("Times New Roman",Font.BOLD,20));
	        
	        l3 = new JLabel ("Name :");
	        l3.setFont(new Font("Times New Roman",Font.BOLD,20));
	        
	        l4 = new JLabel ("Father's Name :");
	        l4.setFont(new Font("Times New Roman",Font.BOLD,20));
	        
	        l5 = new JLabel ("Date Of Birth : ");
	        l5.setFont(new Font("Times New Roman",Font.BOLD,20));
	        
	        l6 = new JLabel ("Gender : ");
	        l6.setFont(new Font("Times New Roman",Font.BOLD,20));
	
	        l7 = new JLabel ("Email Address : ");
	        l7.setFont(new Font("Times New Roman",Font.BOLD,20));
	
	        l8 = new JLabel ("Marital Status : ");
	        l8.setFont(new Font("Times New Roman",Font.BOLD,20));
	        
	        l9 = new JLabel ("Address");
	        l9.setFont(new Font("Times New Roman",Font.BOLD,20));
	
	        l10 = new JLabel ("City : ");
	        l10.setFont(new Font("Times New Roman",Font.BOLD,20));
	
	        l11 = new JLabel ("PinCode : ");
	        l11.setFont(new Font("Times New Roman",Font.BOLD,20));
	
	        l12 = new JLabel ("State : ");
	        l12.setFont(new Font("Times New Roman",Font.BOLD,20));

	        l13 = new JLabel ("Date");
	        l13.setFont(new Font("Times New Roman",Font.BOLD,20));
	        
	        l14 = new JLabel ("Month");
	        l14.setFont(new Font("Times New Roman",Font.BOLD,20));
	        
	        l15 = new JLabel ("Year");
	        l15.setFont(new Font("Times New Roman",Font.BOLD,20));
	        
	        tf1 = new JTextField(30);
	        tf1.setFont(new Font("Arial",Font.BOLD,14));
	       
	        tf2 = new JTextField(30);
	        tf2.setFont(new Font("Arial",Font.BOLD,14));
	        
	        tf3 = new JTextField(50);
	        tf3.setFont(new Font("Arial",Font.BOLD,14));
	        
	        tf4 = new JTextField(100);
	        tf4.setFont(new Font("Arial",Font.BOLD,14));
	        
	        tf5 = new JTextField(30);
	        tf5.setFont(new Font("Arial",Font.BOLD,14));
	        
	        tf6 = new JTextField(30);
	        tf6.setFont(new Font("Arial",Font.BOLD,14));
	        
	        tf7 = new JTextField(30);
	        tf7.setFont(new Font("Arial",Font.BOLD,14));
	        
	        b1 = new JButton("NEXT");
	        b1.setBackground(Color.BLACK);
	        b1.setForeground(Color.WHITE);
	        
	        b2 = new JButton("CANCEL");
	        b2.setBackground(Color.black);
	        b2.setForeground(Color.WHITE);
	        
	        rb1 = new JRadioButton("Male");
	        rb1.setFont(new Font("Arial",Font.BOLD,14));
	        rb1.setBackground(Color.WHITE);
	        rb1.setForeground(Color.BLACK); 
	        
	        rb2 = new JRadioButton("Female");
	        rb2.setFont(new Font("Arial",Font.BOLD,14));
	        rb2.setBackground(Color.WHITE);
	        rb2.setForeground(Color.BLACK); 
	        
	        ButtonGroup groupgender = new ButtonGroup();
	        groupgender.add(rb1);
	        groupgender.add(rb2);
	        
	        rb3 = new JRadioButton("Married");
	        rb3.setFont(new Font("Arial",Font.BOLD,14));
	        rb3.setBackground(Color.WHITE);
	        rb3.setForeground(Color.BLACK); 
	        
	        rb4 = new JRadioButton("Unmarried");
	        rb4.setFont(new Font("Arial",Font.BOLD,14));
	        rb4.setBackground(Color.WHITE);
	        rb4.setForeground(Color.BLACK);
	        
	        rb5 = new JRadioButton("Other");
	        rb5.setFont(new Font("Arial",Font.BOLD,14));
	        rb5.setBackground(Color.WHITE);
	        rb5.setForeground(Color.BLACK);
	        
	        ButtonGroup groupstatus = new ButtonGroup();
	        groupstatus.add(rb3);
	        groupstatus.add(rb4);
	        groupstatus.add(rb5);
	        
	        datechooser = new JDateChooser();
	        datechooser.setForeground(Color.WHITE);
	          
	        setLayout(null);
	        
	        l1.setBounds(250,20,600,40);
	        add(l1);
	        
	        l2.setBounds(335,70,600,30);
	        add(l2);
	        
	        l3.setBounds(100,140,100,30);
	        add(l3);
	        
	        tf1.setBounds(300,140,400,30);
	        add(tf1);
	        
	        l4.setBounds(100,190,200,30);
	        add(l4);
	        
	        tf2.setBounds(300,190,400,30);
	        add(tf2);
	        
	        l5.setBounds(100,240,200,30);
	        add(l5);
	        
	        datechooser.setBounds(300,240,400,30);
	        add(datechooser);
	        
	        l6.setBounds(100,290,200,30);
	        add(l6);
	        
	        rb1.setBounds(300,290,60,30);
	        add(rb1);
	        
	        rb2.setBounds(450,290,90,30);
	        add(rb2);
	        
	        l7.setBounds(100,340,200,30);
	        add(l7);
	        
	        tf3.setBounds(300,340,400,30);
	        add(tf3);
	        
	        l8.setBounds(100,390,200,30);
	        add(l8);
	        
	        rb3.setBounds(300,390,120,30);
	        add(rb3);
	        
	        rb4.setBounds(450,390,150,30);
	        add(rb4);
	        
	        rb5.setBounds(630,390,70,30);
	        add(rb5);
	        
	        l9.setBounds(100,440,200,30);
	        add(l9);
	        
	        tf4.setBounds(300,440,400,30);
	        add(tf4);
	        
	        l10.setBounds(100,490,200,30);
	        add(l10);
	        
	        tf5.setBounds(300,490,400,30);
	        add(tf5);
	        
	        l11.setBounds(100,540,200,30);
	        add(l11);
	        
	        tf6.setBounds(300,540,400,30);
	        add(tf6);
	        
	        l12.setBounds(100,590,200,30);
	        add(l12);
	        
	        tf7.setBounds(300,590,400,30);
	        add(tf7);
	        
	        b1.setBounds(600,650,80,30);
	        add(b1);
	        
	        b2.setBounds(100,650,100,30);
	        add(b2);
	        
	        b1.addActionListener(this);
	        b2.addActionListener(this);
	        getContentPane().setBackground(Color.WHITE);
	        
	         setSize(850,750);
	         setLocation(150,00);
	         setVisible(true);
	         
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		 String a = tf1.getText();
		 String b = tf2.getText();
		 String c = ((JTextField) datechooser.getDateEditor().getUiComponent()).getText();
		 String d = null;
		 if(rb1.isSelected()) {
			 d = "Male";
		 }else if(rb2.isSelected()) {
			 d = "Female";
		 }
		 
		 String e = tf3.getText();
		 
		 String f = null;
		 if(rb3.isSelected()) {
			 f = "Married";
			}else if(rb4.isSelected()) {
				f = "Unmarried";
			}else if(rb5.isSelected()) {
				f = "Other";
			}
			
			String g = tf4.getText();
			String h = tf5.getText();
			String i = tf6.getText();
			String j = tf7.getText();
			

		try {
			if(ae.getSource() == b2) {
				 int s = JOptionPane.showConfirmDialog(this,"Application information will not be stored","WARNING",JOptionPane.YES_NO_OPTION);
			  if(s == JOptionPane.YES_OPTION) {
				  System.exit(0);
			  }
			}
			conn c1 = new conn();
			String q1 = "Insert into signup1 values('"+num+"','"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"','"+i+"','"+j+"')"; 
			if(ae.getSource() == b1 && (a.isBlank() || b.isBlank()|| c.isBlank() || d.isBlank() || f.isBlank() || g.isBlank()||h.isBlank() || i.isBlank() || j.isBlank())) {
				JOptionPane.showMessageDialog(this,"Enter information");
			}else {
				c1.s.executeUpdate(q1);
				setVisible(false);
				new SignUp2().setVisible(true);
			  }	    
		}catch(Exception E) {
			E.printStackTrace();
		}
		
	}
	public static int serial() {
		int num = 0;
		 try {
        	conn c1 = new conn();
        	String q = "Select form_no from signup1;";
        	ResultSet rs = c1.s.executeQuery(q);
        	
        	while(rs.next()) {
        		num = rs.getInt(1);
        	}
        }catch (Exception r) {
        	r.printStackTrace();
        }
		
		return num;
	}
	
	public static void main(String[] args) {
		  new SignUp().setVisible(true);

	}

}
