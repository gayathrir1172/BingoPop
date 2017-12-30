package project;
import javax.swing.JFrame;
import java.awt.*;
public class main extends JFrame{
	public static void main(String[] args){
	    register obj = new register(); 
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.getContentPane().setBackground(Color.yellow);
		obj.setVisible(true);
		obj.setSize(1000,500);}}
