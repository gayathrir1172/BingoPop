package project;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class home extends JFrame{
	private JLabel l1;
	private JLabel l2;
	private JButton b1;
	home(){
		super("HOME");
		setLayout(null);	
		Font f = new Font(Font.SANS_SERIF,Font.BOLD,20);
		l1 = new JLabel("Welcome! This is Home Page!!");
		l1.setFont(f);
		l1.setBounds(400,100,300,25);
		add(l1);
		f = new Font(Font.SERIF,Font.ITALIC,40);
		l2 = new JLabel("BINGO POP");
		l2.setFont(f);
		l2.setForeground(Color.BLUE);
		l2.setBounds(400,200,300,25);
		add(l2);
		b1 = new JButton("Click to PLay!!");
		add(b1);
		b1.setBounds(400, 300, 300, 20);
		HandlerClass handler = new HandlerClass();
		b1.addActionListener(handler);}
	private class HandlerClass implements ActionListener{
		public void actionPerformed(ActionEvent event){
			dispose();
			register r = new register();
			r.setDefaultCloseOperation(EXIT_ON_CLOSE);
			r.setBackground(Color.YELLOW);
			r.setVisible(true);
			r.setSize(1000, 500);}}}
