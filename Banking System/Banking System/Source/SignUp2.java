package Source;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class SignUp2 extends JFrame implements ActionListener{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,Title;
	JComboBox cb1,cb2,cb3,cb4,cb5;
	JTextField tf1,tf2;
	JRadioButton rb1,rb2,rb3,rb4;
	JButton b1,b2;
	int num = SignUp.serial();
	
	SignUp2(){
		
		setFont(new Font("Arial",Font.BOLD,40));
        String pad = "";
        pad = String.format("%"+90+"s",pad);
        setTitle(pad + "STATE BANK OF INDIA");
		
        l1 = new JLabel("Form Number : " + num);
        l1.setFont(new Font("Times New Roman",Font.BOLD,15));
        
        l2 = new JLabel("Religion : ");
        l2.setFont(new Font("Times New Roman",Font.BOLD,20));
        
        l3 = new JLabel("Category : ");
        l3.setFont(new Font("Times New Roman",Font.BOLD,20));
        
        l4 = new JLabel("Income : ");
        l4.setFont(new Font("Times New Roman",Font.BOLD,20));
        
        l5 = new JLabel("Education");
        l5.setFont(new Font("Times New Roman",Font.BOLD,20));
        
        l6 = new JLabel("Occupation : ");
        l6.setFont(new Font("Times New Roman",Font.BOLD,20));
        
        l7 = new JLabel("PAN Number : ");
        l7.setFont(new Font("Times New Roman",Font.BOLD,20));
        
        l8 = new JLabel("Aadhar Card No. : ");
        l8.setFont(new Font("Times New Roman",Font.BOLD,20));
        
        l9 = new JLabel("Senior Citizen : ");
        l9.setFont(new Font("Times New Roman",Font.BOLD,20));
        
        l10 = new JLabel("Old Account : ");
        l10.setFont(new Font("Times New Roman",Font.BOLD,20));
        
        Title = new JLabel("PAGE 2 : ADDITIONAL DETAILS ");
        Title.setFont(new Font("Times New Roman",Font.BOLD,25));
        
        String religion[] = {"Hindu","Muslim","Christian","Sikh","Other"}; 
        cb1 = new JComboBox(religion);
        
		String category[] = {"General", "OBC","SC","ST"};
		cb2 = new JComboBox(category);
		
		String Income[] = {"Below 1 Lakh","1-5 Lakh","5-10 Lakh","10-20 Lakh","Above 20 Lakh"};
		cb3 = new JComboBox(Income);
		
		String ed[] = {"Nil","High School","Senior Secondary","Under Graduation", "Graduation","Post Graduation"};
		cb4 = new JComboBox(ed);
		
		String occ[] = {"Goverment","Self-Employed","Non - Govt.","Bussiness"};
		cb5 = new JComboBox(occ);
		
		tf1 = new JTextField(30);
		tf1.setFont(new Font("Times New Roman",Font.PLAIN,20));
		
		tf2 = new JTextField(30);
		tf2.setFont(new Font("Times New Roman",Font.PLAIN,20));
		
		rb1 = new JRadioButton("Yes");
		rb1.setFont(new Font("Times New Roman",Font.PLAIN,20));
		
		rb2 = new JRadioButton("No");
		rb2.setFont(new Font("Times New Roman",Font.PLAIN,20));
		
		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(rb1);
		bg1.add(rb2);
		
		rb3 = new JRadioButton("Yes");
		rb3.setFont(new Font("Times New Roman",Font.PLAIN,20));
		
		rb4 = new JRadioButton("No");
		rb4.setFont(new Font("Times New Roman",Font.PLAIN,20));
		
		ButtonGroup bg2 = new ButtonGroup();
		bg2.add(rb3);
		bg2.add(rb4);
		
		b1 = new JButton("NEXT");
		b1.setFont(new Font("Times New Roman", Font.PLAIN,20));
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		    
		b2 = new JButton("BACK");
		b2.setFont(new Font("Times New Roman", Font.PLAIN,20));
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		
		setLayout(null);
		
		l1.setBounds(600,10,200,10);
		add(l1);
		
		Title.setBounds(200,50,550,20);
		add(Title);
		
		l2.setBounds(100,100,150,20);
		add(l2);
		
		cb1.setBounds(280,100,400,20);
		add(cb1);
		
		l3.setBounds(100,150,150,20);
		add(l3);
		
		cb2.setBounds(280,150,400,20);
		add(cb2);
		
		l4.setBounds(100,200,150,20);
		add(l4);
		
		cb3.setBounds(280,200,400,20);
		add(cb3);
		
		l5.setBounds(100,250,150,20);
		add(l5);
		
		cb4.setBounds(280,250,400,20);
		add(cb4);
		
		l6.setBounds(100,300,250,20);
		add(l6);
		
		cb5.setBounds(280,300,400,20);
		add(cb5);
		
		l7.setBounds(100,350,150,20);
		add(l7);
		
		tf1.setBounds(280,350,400,20);
		add(tf1);
		
		l8.setBounds(100,400,180,20);
		add(l8);
		
		tf2.setBounds(280,400,400,20);
		add(tf2);
		
		l9.setBounds(100,450,150,20);
		add(l9);
		
		rb1.setBounds(280,450,100,20);
		add(rb1);
		
		rb2.setBounds(400,450,100,20);
		add(rb2);
		
		l10.setBounds(100,500,150,20);
		add(l10);
		
		rb3.setBounds(280,500,100,20);
		add(rb3);
		
		rb4.setBounds(400,500,100,20);
		add(rb4);
		
		b1.setBounds(600,600,100,30);
		add(b1);
		
		b2.setBounds(50,600,100,30);
		add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		getContentPane().setBackground(Color.WHITE);
	    setSize(750,750);
	    setLocation(200,0);
	    setVisible(true);
	}
	
	public void  actionPerformed(ActionEvent ae) {
		
		String a = (String)cb1.getSelectedItem();
		String b = (String)cb2.getSelectedItem();
		String c = (String)cb3.getSelectedItem();
		String d = (String)cb4.getSelectedItem();
		String e = (String)cb5.getSelectedItem();
		
		String f = tf1.getText();
		String g = tf2.getText();
		
		String h = null;
		if(rb1.isSelected()) {
			h = "Yes";
		}else if(rb2.isSelected()) {
			h = "No";
		} 
		String i = null;
		if(rb3.isSelected()) {
			i = "Yes";
		}else if(rb4.isSelected()) {
			i = "No";
		} 
		try {
			conn c1  = new conn();
			String q2 = "Insert into signup2 values('"+(num)+"','"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"','"+i+"')";
			
			if(ae.getSource() == b1 && (a.isBlank() || b.isBlank()|| c.isBlank() || d.isBlank() || f.isBlank() || g.isBlank()||h.isBlank() || i.isBlank() )) {
				JOptionPane.showMessageDialog(this,"Enter Information");
			}else{
				c1.s.executeUpdate(q2);
				setVisible(false);
				new SignUp3().setVisible(true);
			}
				
			
			if(ae.getSource() == b2 && (h.isBlank() || i.isBlank())) {
				int s = JOptionPane.showConfirmDialog(this,"Stored information will be deleted","WARNING",JOptionPane.YES_NO_OPTION); 
				if(s == JOptionPane.YES_OPTION) {
					 conn c2 = new conn();
					  String k = "delete from signup1 where form_no =" +num+";";
					  c2.s.execute(k);
					  String r = "delete from signup2 where form_no =" +num+";";
					  c2.s.execute(r);
					  System.exit(0);
				  }
			}
		}catch (Exception w) {
			w.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		 new SignUp2().setVisible(true);
	}

}
