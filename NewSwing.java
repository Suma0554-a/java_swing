//package dbc;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.border.*;
import javax.swing.*;
public class NewSwing 
{
	JFrame f,f1;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,la1,la2;
	JTextField t2,t3,t4,t5,t6,t8,t9,t10,t11,t12,t13,t14,tf1,tf2;
	JButton b1,b2,b3,b4,b5,b6,log;
	JDialog d,d1,d2;
	Border border=BorderFactory.createLineBorder(Color.red,1);
	Border border1=BorderFactory.createLineBorder(Color.black,1);
	NewSwing()
	{
		f=new JFrame();
		l1=new JLabel("REGISTRATION FORM");
		l2=new JLabel("First Name:");
		l3=new JLabel("Last Name:");
		l4=new JLabel("Email:");
		l5=new JLabel("Phone No:");
		l6=new JLabel("Gender:");
		l7=new JLabel("Address:");
		l8=new JLabel("Door No:");
		l9=new JLabel("Street Name:");
		l10=new JLabel("Village:");
		l11=new JLabel("State:");
		l12=new JLabel("Country:");
		l13=new JLabel("Pincode:");
		l14=new JLabel("Password:");
		t2=new JTextField();
		t3=new JTextField();
		t4=new JTextField();
		t5=new JTextField();
		t6=new JTextField();
		t8=new JTextField();
		t9=new JTextField();
		t10=new JTextField();
		t11=new JTextField();
		t12=new JTextField();
		t13=new JTextField();
		t14=new JTextField();
		b1=new JButton("SUBMIT");
		b2=new JButton("REFRESH");
		log=new JButton("Login");
		ScrollPane sp=new ScrollPane();
		l1.setBounds(100,50,200,50);
		l2.setBounds(50,100,100,30);
		l3.setBounds(50,150,100,30);
		l4.setBounds(50,200,100,30);
		l5.setBounds(50,250,100,30);
		l6.setBounds(50,300,100,30);
		l7.setBounds(50,350,100,30);
		l8.setBounds(50,400,100,30);
		l9.setBounds(50,450,100,30);
		l10.setBounds(50,500,100,30);
		l11.setBounds(50,550,100,30);
		l12.setBounds(50,600,100,30);
		l13.setBounds(50,650,100,30);
		l14.setBounds(50,700,100,30);
		t2.setBounds(150,100,100,30);
		t2.setBorder(border1);
		t2.setToolTipText("Enter your Name");
		t3.setBounds(150,150,100,30);
		t3.setBorder(border1);
		t3.setToolTipText("Enter your Surname");
		t4.setBounds(150,200,100,30);
		t4.setBorder(border1);
		t4.setToolTipText("Enter your Email");
		t5.setBounds(150,250,100,30);
		t5.setBorder(border1);
		t5.setToolTipText("Enter your PhoneNo");
		t6.setBounds(150,300,100,30);
		t6.setBorder(border1);
		t6.setToolTipText("Enter your Gender");
		t8.setBounds(150,400,100,30);
		t8.setBorder(border1);
		t8.setToolTipText("Enter your DoorNo");
		t9.setBounds(150,450,100,30);
		t9.setBorder(border1);
		t9.setToolTipText("Enter your StreetName");
		t10.setBounds(150,500,100,30);
		t10.setBorder(border1);
		t10.setToolTipText("Enter your Village");
		t11.setBounds(150,550,100,30);
		t11.setBorder(border1);
		t11.setToolTipText("Enter your State");
		t12.setBounds(150,600,100,30);
		t12.setBorder(border1);
		t12.setToolTipText("Enter your Country");
		t13.setBounds(150,650,100,30);
		t13.setBorder(border1);
		t13.setToolTipText("Enter your Pincode");
		t14.setBounds(150,700,100,30);
		t14.setBorder(border1);
		t14.setToolTipText("Enter your Password");
		b1.setBounds(70,750,120,30);
		b2.setBounds(200,750,120,30);
		log.setBounds(330,750,70,30);
		sp.setBounds(980,0,20,1000);
		Font font=new Font("Arial",Font.BOLD,16);
		l1.setFont(font);
		f.add(sp);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.add(l6);
		f.add(l7);
		f.add(l8);
		f.add(l9);
		f.add(l10);
		f.add(l11);
		f.add(l12);
		f.add(l13);
		f.add(l14);
		f.add(t2);
		f.add(t3);
		f.add(t4);
		f.add(t5);
		f.add(t6);
		f.add(t8);
		f.add(t9);
		f.add(t10);
		f.add(t11);
		f.add(t12);
		f.add(t13);
		f.add(t14);
		f.add(b1);
		f.add(b2);
		f.add(log);
		f.setSize(1000,1000);
		f.setLayout(null);
		f.setVisible(true);	
	log.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			f.dispose();
			f1=new JFrame();
			la1=new JLabel("UserName:");
			la2=new JLabel("Password:");
			b4=new JButton("Submit");
			tf1=new JTextField();
			tf1.setToolTipText("Enter your UserName");
			tf2=new JTextField();
			tf2.setToolTipText("Enter your Password");
			la1.setBounds(50,50,100,30);
			la2.setBounds(50,100,100,30);
			tf1.setBounds(150,50,100,30);
			tf2.setBounds(150,100,100,30);
			b4.setBounds(150,150,70,30);
			f1.add(la1);
			f1.add(la2);
			f1.add(tf1);
			f1.add(tf2);
			f1.add(b4);
			f1.setSize(500,500);
			f1.setLayout(null);
			f1.setVisible(true);
			b4.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					String uname,pass;
					String n,p;
					uname=tf1.getText();
					pass=tf2.getText();
					try
					{
						Class.forName("oracle.jdbc.driver.OracleDriver");
						Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","suma");
						Statement st=c.createStatement();
						ResultSet rs=st.executeQuery("select FIRSTNAME,PASSWORD from info where FIRSTNAME='"+uname+"'");
						rs.next();
						n=(rs.getString(1)).replaceAll("\\s","");
						p=(rs.getString(2)).replaceAll("\\s","");
						if(p.equals(pass) && uname!="" && pass!="")
						{
							d1=new JDialog(f1,"Success");
							d1.add(new Label("User Login Successful"));
							JButton b5=new JButton("OK");
							d1.add(b5);
							b5.addActionListener(new ActionListener()
							{
								public void actionPerformed(ActionEvent e)
								{
									System.exit(0);
								}
							});										
							d1.setSize(200,200);
							d1.setLayout(new FlowLayout());
							d1.setVisible(true);
						}
						else
						{
							d1=new JDialog(f1,"Error");
							d1.add(new Label("User Login Failed"));
							d1.add(new Label("Please check your details"));
							JButton b5=new JButton("OK");
							d1.setSize(200,200);
							d1.setLayout(new FlowLayout());
							d1.setVisible(true);
							d1.add(b5);
							b5.addActionListener(new ActionListener()
							{
								public void actionPerformed(ActionEvent e)
								{
									d1.dispose();
								}
							});									
						}
					}
					catch(Exception ex)
					{
						System.out.println(ex);
					}
				}
			});
		}});
	b1.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			String fname,lname,email,pno,gen,dno,stname,vil,state,coun,pincode,password;
			fname=t2.getText();
			lname=t3.getText();
			email=t4.getText();
			pno=t5.getText();
			gen=t6.getText();
			dno=t8.getText();
			stname=t9.getText();
			vil=t10.getText();
			state=t11.getText();
			coun=t12.getText();
			pincode=t13.getText();
			password=t14.getText();
			if(fname.isEmpty() || lname.isEmpty() || email.isEmpty() || pno.isEmpty() || gen.isEmpty() || dno.isEmpty() || stname.isEmpty() || vil.isEmpty() || state.isEmpty() || coun.isEmpty() || pincode.isEmpty() || password.isEmpty())
			{
				if(fname.isEmpty())
				{
					l2.setForeground(Color.red);
					t2.setBorder(border);
				}
				else
				{
					l2.setForeground(Color.black);
					t2.setBorder(border1);
				}
				if(lname.isEmpty())
				{
					l3.setForeground(Color.red);
					t3.setBorder(border);
				}
				else
				{
					l3.setForeground(Color.black);
					t3.setBorder(border1);
				}
				if(email.isEmpty())
				{
					l4.setForeground(Color.red);
					t4.setBorder(border);
				}
				else
				{
					l4.setForeground(Color.black);
					t4.setBorder(border1);
				}
				if(pno.isEmpty())
				{
					l5.setForeground(Color.red);
					t5.setBorder(border);
				}
				else
				{
					l5.setForeground(Color.black);
					t5.setBorder(border1);
				}
				if(gen.isEmpty())
				{
					l6.setForeground(Color.red);
					t6.setBorder(border);
				}
				else
				{
					l6.setForeground(Color.black);
					t6.setBorder(border1);
				}
				if(dno.isEmpty())
				{
					l8.setForeground(Color.red);
					t8.setBorder(border);
				}
				else
				{
					l8.setForeground(Color.black);
					t8.setBorder(border1);
				}
				if(stname.isEmpty())
				{
					l9.setForeground(Color.red);
					t9.setBorder(border);
				}
				else
				{
					l9.setForeground(Color.black);
					t9.setBorder(border1);
				}
				if(vil.isEmpty())
				{
					l10.setForeground(Color.red);
					t10.setBorder(border);
				}
				else
				{
					l10.setForeground(Color.black);
					t10.setBorder(border1);
				}
				if(state.isEmpty())
				{
					l11.setForeground(Color.red);
					t11.setBorder(border);
				}
				else
				{
					l11.setForeground(Color.black);
					t11.setBorder(border1);
				}
				if(coun.isEmpty())
				{
					l12.setForeground(Color.red);
					t12.setBorder(border);
				}
				else
				{
					l12.setForeground(Color.black);
					t12.setBorder(border1);
				}
				if(pincode.isEmpty())
				{
					l13.setForeground(Color.red);
					t13.setBorder(border);
				}
				else
				{
					l13.setForeground(Color.black);
					t13.setBorder(border1);
				}
				if(password.isEmpty()) 
				{
					l14.setForeground(Color.red);
					t14.setBorder(border);
				}
				else
				{
					l14.setForeground(Color.black);
					t14.setBorder(border1);
				}
			}
			else
			{
				try
				{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","suma");
					Statement st=c.createStatement();
					int b=st.executeUpdate("insert into info values('"+fname+"','"+lname+"','"+email+"','"+pno+"','"+gen+"','"+dno+"','"+stname+"','"+vil+"','"+state+"','"+coun+"','"+pincode+"','"+password+"')");
					if(b==1)
					{
						d1=new JDialog(f1,"Success");
						d1.add(new Label("User Registration Successful"));
						JButton b5=new JButton("OK");
						d1.add(b5);
						b5.addActionListener(new ActionListener()
						{
							public void actionPerformed(ActionEvent e)
							{
								d1.dispose();
							}
						});										
						d1.setSize(200,200);
						d1.setLayout(new FlowLayout());
						d1.setVisible(true);
					}
					c.close();
				}
				catch(Exception ex)
				{
					System.out.println(ex);
				}
			}
		}
	});
	b2.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
			t6.setText("");
			t8.setText("");
			t9.setText("");
			t10.setText("");
			t11.setText("");
			t12.setText("");
			t13.setText("");
			t14.setText("");
		}
	});
	
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args)
	{
		new NewSwing();
	}
}