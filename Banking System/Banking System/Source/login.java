package Source;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class login extends JFrame implements ActionListener{
    JLabel l1,l2,l3;
    JTextField tf1;
    JPasswordField pf2;
    JButton b1,b2,b3;
    static String a = "";
    login(){
        // Heading
        setFont(new Font("Arial",Font.BOLD,40));
        String pad = "";
        pad = String.format("%"+70+"s",pad);
        setTitle(pad + "STATE BANK OF INDIA");
        
        // Rest Titles
    
        l1 = new JLabel ("WELCOME TO SBI");
        l1.setFont(new Font("Times New Roman",Font.BOLD,40));
        
        l2 = new JLabel("Username : ");
        l2.setFont(new Font("Times New Roman",Font.BOLD,30));
        
        l3 = new JLabel("Password : ");
        l3.setFont(new Font("Times New Roman",Font.BOLD,30));
        
        tf1 = new JTextField(15);
        pf2 = new JPasswordField(15);
        
        b1 = new JButton("SIGN IN");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        b2 = new JButton("CLEAR");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        b3 = new JButton("SIGN UP");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        
        setLayout(null);
        
        l1.setBounds(110,20,450,100);
        add(l1);
        
        l2.setBounds(50,50,375,200);
        add(l2);
        
        l3.setBounds(50,100,375,200);
        add(l3);
        
        tf1.setFont(new Font("Arial",Font.BOLD,14));
        tf1.setBounds(220,140,300,30);
        add(tf1);
        
        pf2.setFont(new Font("Arial",Font.BOLD,14));
        pf2.setBounds(220,190,300,30);
        add(pf2);
        
        b1.setFont(new Font("Arial", Font.BOLD, 14));
        b1.setBounds(130,270,150,30);
        add(b1);
        
        b2.setFont(new Font("Arial", Font.BOLD,14));
        b2.setBounds(285,270,150,30);
        add(b2);
        
        b3.setFont(new Font("Arial", Font.BOLD,14));
        b3.setBounds(130,310,305,30);
        add(b3);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(600,400);
        setLocation(250,100);
        setVisible(true);
    
    }   
  
    public void actionPerformed(ActionEvent ae){
        try{
            conn cl = new conn();
            String c = tf1.getText();
            String b = pf2.getText();
            String q = "select * from login where id = '"+c+"' and password = '"+b+"'";
            ResultSet rs = cl.s.executeQuery(q);
            
            if(ae.getSource() == b1){
                if(rs.next()){
                	setVisible(false);
                	a = c;
                	new Transactions().setVisible(true);   
                }else{
                    JOptionPane.showMessageDialog(null,"Incorrect ID or Password");
                    
                }
            }else if(ae.getSource()== b2){
                tf1.setText("");
                pf2.setText("");
 
            }else if(ae.getSource() == b3){
            	setVisible(false);
            	new SignUp().setVisible(true);
                
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("error : "+ e);
        }
    }
    public static String serial() {
		return a;
	}
    public static void main(String args[]) {
        new login().setVisible(true);
    }
}