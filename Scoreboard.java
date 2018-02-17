package project;
import javax.swing.*;
import java.awt.*;
public class scoreboard extends JFrame{
	private JLabel lab;
	scoreboard(){
		lab = new JLabel("You have scored "+(register.score));
		lab.setForeground(Color.WHITE);
		lab.setBackground(Color.BLACK);
		lab.setBounds(20, 10, 50, 20);
	}
}
