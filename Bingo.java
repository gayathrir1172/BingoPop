package project;
import java.awt.*;
import project.register;
import javax.swing.JOptionPane;
public class bingo{
	bingo(){
		if(((register.b).getBackground())==Color.pink){
			(register.b).setBackground(Color.darkGray);
			(register.score) = (register.score)+10;	}
		else if(((register.i).getBackground())==Color.pink){
			(register.i).setBackground(Color.darkGray);
			(register.score) = (register.score)+10;}
		else if((register.n).getBackground()==Color.pink){
			(register.n).setBackground(Color.darkGray);
			(register.score) = (register.score)+10;}
		else if((register.g).getBackground()==Color.pink){
			(register.g).setBackground(Color.darkGray);
			(register.score) = (register.score)+10;}
		else if((register.o).getBackground()==Color.pink){
			(register.o).setBackground(Color.darkGray);
			(register.score) = (register.score)+10;
			JOptionPane.showMessageDialog(null, "BINGO");}}}
