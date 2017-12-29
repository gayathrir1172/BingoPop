package project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class login extends JFrame{
	private JTextField t1;
	private JPasswordField t2;
	private JLabel l1,l2;
	private JButton b;
	login(){
		super("LOGIN");
		setLayout(null);
		l1 = new JLabel("Enter username : ");
		l1.setBounds(200, 100, 150, 25);
		add(l1);
		t1 = new JTextField(15);
		t1.setBounds(400, 100, 165, 25);
		add(t1);
		l2 = new JLabel("Enter password : ");
		l2.setBounds(200,150,150,25);
		add(l2);
		t2 = new JPasswordField(15);
		t2.setBounds(400,150,165,25);
		add(t2);
		b = new JButton("Click to Login!");
		b.setBounds(300,200,150,25);
		add(b);
		HandlerClass handler = new HandlerClass();
		b.addActionListener(handler);}
	private class HandlerClass implements ActionListener{
		int flag = 0;
		public void actionPerformed(ActionEvent event){
			String u,p;
			u = t1.getText();
			p = new String(t2.getPassword());
			String url = "jdbc:mysql://localhost:3306/";
			String user = "root";
			String password = "";
			String uname, pwd;
			try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
				Connection con = DriverManager.getConnection(url, user, password);
				
				Statement stt = con.createStatement();
				stt.execute("CREATE DATABASE IF NOT EXISTS PROJECT");
				stt.execute("USE PROJECT");
				
				stt.execute("DROP TABLE IF EXISTS LOGIN");
				stt.execute("CREATE TABLE LOGIN (" +
"ID BIGINT  NOT NULL  AUTO_INCREMENT,"+
						"username VARCHAR(25),"+
						"password VARCHAR(25),"+
						"PRIMARY KEY(ID)"+
						")");
				stt.execute("INSERT INTO LOGIN (username,password) VALUES"+
						"('aaa','123'),('bbb','qwerty')"
						);
				ResultSet res = stt.executeQuery("SELECT * FROM LOGIN");
		        while(res.next()){
		        	uname = res.getString("username");
		        	pwd = res.getString("password");
		        	if((u.equals(uname))&&(p.equals(pwd))){
		        		flag = 1;
		        		dispose();
		    			home h = new home(); 
		    			h.setSize(1000,500);
		   	h.getContentPane().setBackground(Color.ORANGE);
 			h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    			h.setVisible(true);}}
		        if(flag==0){
		        	JOptionPane.showMessageDialog(null, "Invalid username or password!!Retry once again!");
		        	t1.setText("");
		        	t2.setText("");}}
			catch(Exception e){
		    	e.printStackTrace();}}}}
