package project;
import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class register extends JFrame{
	ArrayList<String> list = new ArrayList<String>();
	public JButton b1, b2, b3, b4, b5;
	public JButton b6, b7, b8, b9, b10;
	public JButton b11, b12, b13, b14, b15;
	public JButton b16, b17, b18, b19, b20;
	public JButton b21, b22, b23, b24, b25;
	public static JButton b, i, n, g, o;
	public JLabel label;
	public static JTextField text;
	public static int score = 0;
	int flag1, flag2, flag3, flag4, flag5, flag6, flag7, flag8, flag9, flag10, flaga, flagb;
	String randomStr;
	public JButton start, stop;
	register(){
		super("BINGO");
		setLayout(null);
		bgm music = new bgm();
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(6,6));
for(int i=1;i<=75;i++){
			randomStr = Integer.toString(i);
			list.add(randomStr);}
		Collections.shuffle(list);		
		b = new JButton("B");
		b.setBackground(Color.pink);
		panel.add(b);
		i = new JButton("I");
		i.setBackground(Color.pink);
		panel.add(i);
		n = new JButton("N");
		n.setBackground(Color.pink);
		panel.add(n);
		g = new JButton("G");
		g.setBackground(Color.pink);
		panel.add(g);
		o = new JButton("O");
		o.setBackground(Color.pink);
		panel.add(o);
		int i=0;
		b1 = new JButton(list.get(i));
		b1.setBackground(Color.blue);
		b1.setForeground(Color.WHITE);
		panel.add(b1);
		i++;
		b2 = new JButton(list.get(i));
		b2.setBackground(Color.blue);
		b2.setForeground(Color.WHITE);
		panel.add(b2);
		i++;
		b3 = new JButton(list.get(i));
		b3.setBackground(Color.blue);
		b3.setForeground(Color.WHITE);
		panel.add(b3);
		i++;
		b4 = new JButton(list.get(i));
		b4.setBackground(Color.blue);
		b4.setForeground(Color.WHITE);
		panel.add(b4);
		i++;
		b5 = new JButton(list.get(i));
		b5.setBackground(Color.blue);
		b5.setForeground(Color.WHITE);
		panel.add(b5);
		i++;
		b6 = new JButton(list.get(i));
		b6.setBackground(Color.blue);
		b6.setForeground(Color.WHITE);
		panel.add(b6);
		i++;
		b7 = new JButton(list.get(i));
		b7.setBackground(Color.blue);
		b7.setForeground(Color.WHITE);
		panel.add(b7);
		i++;
		b8 = new JButton(list.get(i));
		b8.setBackground(Color.blue);
		b8.setForeground(Color.WHITE);
		panel.add(b8);
		i++;
		b9 = new JButton(list.get(i));
		b9.setBackground(Color.blue);
		b9.setForeground(Color.WHITE);
		panel.add(b9);
		i++;
		b10 = new JButton(list.get(i));
		b10.setBackground(Color.blue);
		b10.setForeground(Color.WHITE);
		panel.add(b10);
		i++;
		b11 = new JButton(list.get(i));
		b11.setBackground(Color.blue);
		b11.setForeground(Color.WHITE);
		panel.add(b11);
		i++;
		b12 = new JButton(list.get(i));
		b12.setBackground(Color.blue);
		b12.setForeground(Color.WHITE);
		panel.add(b12);
		i++;
		b13 = new JButton(list.get(i));
		b13.setBackground(Color.blue);
		b13.setForeground(Color.WHITE);
		panel.add(b13);
		i++;
		b14 = new JButton(list.get(i));
		b14.setBackground(Color.blue);
		b14.setForeground(Color.WHITE);
		panel.add(b14);
		i++;
		b15 = new JButton(list.get(i));
		b15.setBackground(Color.blue);
		b15.setForeground(Color.WHITE);
		panel.add(b15);
		i++;
		b16 = new JButton(list.get(i));
		b16.setBackground(Color.blue);
		b16.setForeground(Color.WHITE);
		panel.add(b16);
		i++;
		b17 = new JButton(list.get(i));
		b17.setBackground(Color.blue);
		b17.setForeground(Color.WHITE);
		panel.add(b17);
		i++;
		b18 = new JButton(list.get(i));
		b18.setBackground(Color.blue);
		b18.setForeground(Color.WHITE);
		panel.add(b18);
		i++;
		b19 = new JButton(list.get(i));
		b19.setBackground(Color.blue);
		b19.setForeground(Color.WHITE);
		panel.add(b19);
		i++;
		b20 = new JButton(list.get(i));
		b20.setBackground(Color.blue);
		b20.setForeground(Color.WHITE);
		panel.add(b20);
		i++;
		b21 = new JButton(list.get(i));
		b21.setBackground(Color.blue);
		b21.setForeground(Color.WHITE);
		panel.add(b21);
		i++;
		b22 = new JButton(list.get(i));
		b22.setBackground(Color.blue);
		b22.setForeground(Color.WHITE);
		panel.add(b22);
		i++;
		b23 = new JButton(list.get(i));
		b23.setBackground(Color.blue);
		b23.setForeground(Color.WHITE);
		panel.add(b23);
		add(panel);
		i++;
		b24 = new JButton(list.get(i));
		b24.setBackground(Color.blue);
		b24.setForeground(Color.WHITE);
		panel.add(b24);
		i++;
		b25 = new JButton(list.get(i));
		b25.setBackground(Color.blue);
		b25.setForeground(Color.WHITE);
panel.add(b25);
		Font f = new Font(Font.SANS_SERIF,Font.BOLD,20);
		b1.setFont(f);
		b2.setFont(f);
		b3.setFont(f);
		b4.setFont(f);
		b5.setFont(f);
		b6.setFont(f);
		b7.setFont(f);
		b8.setFont(f);
		b9.setFont(f);
		b10.setFont(f);
		b11.setFont(f);
		b12.setFont(f);
		b13.setFont(f);
		b14.setFont(f);
		b15.setFont(f);
		b16.setFont(f);
		b17.setFont(f);
		b18.setFont(f);
		b19.setFont(f);
		b20.setFont(f);
		b21.setFont(f);
		b22.setFont(f);
		b23.setFont(f);
		b24.setFont(f);
		b25.setFont(f);
		label = new JLabel("Click on this number ");
		label.setFont(f); 
		label.setForeground(Color.BLACK);
		label.setBounds(650, 100, 300, 100);
		add(label);
		text = new JTextField(15);
		text.setBounds(720,200,50,50);
		add(text);
		panel.setPreferredSize(new Dimension(300,300));
		panel.setMaximumSize(new Dimension(300,300));
		panel.setBounds(250, 50, 300, 300);
		add(panel);
		f = new Font(Font.SANS_SERIF,Font.BOLD,30);
		start = new JButton("START GAME");
		stop = new JButton("END GAME");
		start.setFont(f);
		stop.setFont(f);
		start.setBounds(200, 400, 250, 50);
		stop.setBounds(500, 400, 300, 50);
		add(start);
		add(stop);
		Collections.shuffle(list);
		String input;
		int balls = 35;
		for(int j=0;j<35;j++){
			input = list.get(j);
			System.out.println(input);
			text.setFont(f);
			text.setText(input);
		}
		HandlerClass1 hand = new HandlerClass1();
		start.addActionListener(hand);
		stop.addActionListener(hand);
		HandlerClass handler = new HandlerClass();
		b1.addActionListener(handler);
		b2.addActionListener(handler);
		b3.addActionListener(handler);
		b4.addActionListener(handler);
		b5.addActionListener(handler);
		b6.addActionListener(handler);
		b7.addActionListener(handler);
		b8.addActionListener(handler);
		b9.addActionListener(handler);
		b10.addActionListener(handler);
		b11.addActionListener(handler);
		b12.addActionListener(handler);
		b13.addActionListener(handler);
		b14.addActionListener(handler);
		b15.addActionListener(handler);
		b16.addActionListener(handler); 
		b17.addActionListener(handler);
		b18.addActionListener(handler);
		b19.addActionListener(handler);
		b20.addActionListener(handler);
		b21.addActionListener(handler);
		b22.addActionListener(handler);
		b23.addActionListener(handler);
		b24.addActionListener(handler);
		b25.addActionListener(handler);}
	private class HandlerClass implements ActionListener{
		public void actionPerformed(ActionEvent event){
	if((event.getSource()==b1)&&(b1.getBackground()!=Color.BLACK)&&(b1.getText()).equals(text.getText())){
				b1.setBackground(Color.RED);
				score = score + 5;
				bingocheck();
				}
	if(event.getSource()==b2&&(b2.getBackground()!=Color.BLACK)&&(b2.getText()).equals(text.getText())){
				b2.setBackground(Color.RED);
				score = score + 5;
				bingocheck();}		if((event.getSource()==b3)&&(b3.getBackground()!=Color.BLACK)&&(b3.getText()).equals(text.getText())){
				b3.setBackground(Color.RED);
				score = score + 5;
				bingocheck();}		if(event.getSource()==b4&&(b4.getBackground()!=Color.BLACK)&&(b4.getText()).equals(text.getText())){
				b4.setBackground(Color.RED);
				score = score + 5;
				bingocheck();}		if(event.getSource()==b5&&(b5.getBackground()!=Color.BLACK)&&(b5.getText()).equals(text.getText())){
				b5.setBackground(Color.RED);
				score = score + 5;
				bingocheck();}		if(event.getSource()==b6&&(b6.getBackground()!=Color.BLACK)&&(b6.getText()).equals(text.getText())){
				b6.setBackground(Color.RED);
				score = score + 5;
				bingocheck();}
	if(event.getSource()==b7&&(b7.getBackground()!=Color.BLACK)&&(b7.getText()).equals(text.getText())){
				b7.setBackground(Color.RED);
				score = score + 5;
				bingocheck();}		if(event.getSource()==b8&&(b8.getBackground()!=Color.BLACK)&&(b8.getText()).equals(text.getText())){
				b8.setBackground(Color.RED);
				score = score + 5;
bingocheck();}
if(event.getSource()==b9&&(b9.getBackground()!=Color.BLACK)&&(b9.getText()).equals(text.getText())){
				b9.setBackground(Color.RED);
				score = score + 5;
				bingocheck();}			if(event.getSource()==b10&&(b10.getBackground()!=Color.BLACK)&&(b10.getText()).equals(text.getText())){
				b10.setBackground(Color.RED);
				score = score + 5;
				bingocheck();}		if(event.getSource()==b11&&(b11.getBackground()!=Color.BLACK)&&(b11.getText()).equals(text.getText())){
				b11.setBackground(Color.RED);
				score = score + 5;
				bingocheck();}
	if(event.getSource()==b12&&(b12.getBackground()!=Color.BLACK)&&(b12.getText()).equals(text.getText())){
				b12.setBackground(Color.RED);
				score = score + 5;
				bingocheck();}		if(event.getSource()==b13&&(b13.getBackground()!=Color.BLACK)&&(b13.getText()).equals(text.getText())){
				b13.setBackground(Color.RED);
				score = score + 5;
				bingocheck();}		if(event.getSource()==b14&&(b14.getBackground()!=Color.BLACK)&&(b14.getText()).equals(text.getText())){
				b14.setBackground(Color.RED);
				score = score + 5;
				bingocheck();}
	if(event.getSource()==b15&&(b15.getBackground()!=Color.BLACK)&&(b15.getText()).equals(text.getText())){
				b15.setBackground(Color.RED);
				score = score + 5;
				bingocheck();}		if(event.getSource()==b16&&(b16.getBackground()!=Color.BLACK)&&(b16.getText()).equals(text.getText())){
				b16.setBackground(Color.RED);
				score = score + 5;
				bingocheck();}
	if(event.getSource()==b17&&(b17.getBackground()!=Color.BLACK)&&(b17.getText()).equals(text.getText())){
				b17.setBackground(Color.RED);
				score = score + 5;
				bingocheck();}		if(event.getSource()==b18&&(b18.getBackground()!=Color.BLACK)&&(b18.getText()).equals(text.getText())){
				b18.setBackground(Color.RED);
				score = score + 5;
				bingocheck();}
	if(event.getSource()==b19&&(b19.getBackground()!=Color.BLACK)&&(b19.getText()).equals(text.getText())){
				b19.setBackground(Color.RED);
				score = score + 5;
				bingocheck();}
	if(event.getSource()==b20&&(b20.getBackground()!=Color.BLACK)&&(b20.getText()).equals(text.getText())){
				b20.setBackground(Color.RED);
				score = score + 5;
				bingocheck();}
	if(event.getSource()==b21&&(b21.getBackground()!=Color.BLACK)&&(b21.getText()).equals(text.getText())){
				b21.setBackground(Color.RED);
				score = score + 5;
				bingocheck();}
	if(event.getSource()==b22&&(b22.getBackground()!=Color.BLACK)&&(b22.getText()).equals(text.getText())){
				b22.setBackground(Color.RED);
				score = score + 5;
				bingocheck();}
	if(event.getSource()==b23&&(b23.getBackground()!=Color.BLACK)&&(b23.getText()).equals(text.getText())){
				b23.setBackground(Color.RED);
				score = score + 5;
				bingocheck();}		if(event.getSource()==b24&&(b24.getBackground()!=Color.BLACK)&&(b24.getText()).equals(text.getText())){
				b24.setBackground(Color.RED);
				score = score + 5;
				bingocheck();}
	if(event.getSource()==b25&&(b25.getBackground()!=Color.BLACK)&&(b25.getText()).equals(text.getText())){
				b25.setBackground(Color.RED);
				score = score + 5;
				bingocheck();}}}
public void bingocheck(){		if((flag1==0)&&((b1.getBackground()==Color.RED)||(b1.getBackground()==Color.BLACK))&&((b2.getBackground()==Color.RED)||(b2.getBackground()==Color.BLACK))&&((b3.getBackground()==Color.RED)||(b3.getBackground()==Color.BLACK))&&((b4.getBackground()==Color.RED)||(b4.getBackground()==Color.BLACK))&&((b5.getBackground()==Color.RED)||(b5.getBackground()==Color.BLACK))){	
			b1.setBackground(Color.BLACK);
			b2.setBackground(Color.BLACK);
			b3.setBackground(Color.BLACK);
			b4.setBackground(Color.BLACK);
			b5.setBackground(Color.BLACK);
			flag1 = 1;
			bingo bin = new bingo();}		if((flag2==0)&&((b6.getBackground()==Color.RED)||(b6.getBackground()==Color.BLACK))&&((b7.getBackground()==Color.RED)||(b7.getBackground()==Color.BLACK))&&((b8.getBackground()==Color.RED)||(b8.getBackground()==Color.BLACK))&&((b9.getBackground()==Color.RED)||(b9.getBackground()==Color.BLACK))&&((b10.getBackground()==Color.RED)||(b10.getBackground()==Color.BLACK))){	
			b6.setBackground(Color.BLACK);
			b7.setBackground(Color.BLACK);
			b8.setBackground(Color.BLACK);
			b9.setBackground(Color.BLACK);
			b10.setBackground(Color.BLACK);
			flag2 = 1;
			bingo bin = new bingo();}
	if((flag3==0)&&((b11.getBackground()==Color.RED)||(b11.getBackground()==Color.BLACK))&&((b12.getBackground()==Color.RED)||(b12.getBackground()==Color.BLACK))&&((b13.getBackground()==Color.RED)||(b13.getBackground()==Color.BLACK))&&((b14.getBackground()==Color.RED)||(b14.getBackground()==Color.BLACK))&&((b15.getBackground()==Color.RED)||(b15.getBackground()==Color.BLACK))){	
			b11.setBackground(Color.BLACK);
			b12.setBackground(Color.BLACK);
			b13.setBackground(Color.BLACK);
			b14.setBackground(Color.BLACK);
			b15.setBackground(Color.BLACK);
			flag3 = 1;
			bingo bin = new bingo();}
	if((flag4==0)&&((b16.getBackground()==Color.RED)||(b16.getBackground()==Color.BLACK))&&((b17.getBackground()==Color.RED)||(b17.getBackground()==Color.BLACK))&&((b18.getBackground()==Color.RED)||(b18.getBackground()==Color.BLACK))&&((b19.getBackground()==Color.RED)||(b19.getBackground()==Color.BLACK))&&((b20.getBackground()==Color.RED)||(b20.getBackground()==Color.BLACK))){	
			b16.setBackground(Color.BLACK);
			b17.setBackground(Color.BLACK);
			b18.setBackground(Color.BLACK);
			b19.setBackground(Color.BLACK);
			b20.setBackground(Color.BLACK);
			flag4 = 1;
			bingo bin = new bingo();}		if((flag5==0)&&((b21.getBackground()==Color.RED)||(b21.getBackground()==Color.BLACK))&&((b22.getBackground()==Color.RED)||(b22.getBackground()==Color.BLACK))&&((b23.getBackground()==Color.RED)||(b23.getBackground()==Color.BLACK))&&((b24.getBackground()==Color.RED)||(b24.getBackground()==Color.BLACK))&&((b25.getBackground()==Color.RED)||(b25.getBackground()==Color.BLACK))){	
			b21.setBackground(Color.BLACK);
			b22.setBackground(Color.BLACK);
			b23.setBackground(Color.BLACK);
			b24.setBackground(Color.BLACK);
			b25.setBackground(Color.BLACK);
			flag5 = 1;
			bingo bin = new bingo();}
	if((flag6==0)&&((b1.getBackground()==Color.RED)||(b1.getBackground()==Color.BLACK))&&((b6.getBackground()==Color.RED)||(b6.getBackground()==Color.BLACK))&&((b11.getBackground()==Color.RED)||(b11.getBackground()==Color.BLACK))&&((b16.getBackground()==Color.RED)||(b16.getBackground()==Color.BLACK))&&((b21.getBackground()==Color.RED)||(b21.getBackground()==Color.BLACK))){	
			b1.setBackground(Color.BLACK);
			b6.setBackground(Color.BLACK);
			b11.setBackground(Color.BLACK);
			b16.setBackground(Color.BLACK);
			b21.setBackground(Color.BLACK);
			flag6 = 1;
			bingo bin = new bingo();}
	if((flag7==0)&&((b2.getBackground()==Color.RED)||(b2.getBackground()==Color.BLACK))&&((b7.getBackground()==Color.RED)||(b7.getBackground()==Color.BLACK))&&((b12.getBackground()==Color.RED)||(b12.getBackground()==Color.BLACK))&&((b17.getBackground()==Color.RED)||(b17.getBackground()==Color.BLACK))&&((b22.getBackground()==Color.RED)||(b22.getBackground()==Color.BLACK))){	
			b2.setBackground(Color.BLACK);
			b7.setBackground(Color.BLACK);
			b12.setBackground(Color.BLACK);
			b17.setBackground(Color.BLACK);
			b22.setBackground(Color.BLACK);
			flag7 = 1;
			bingo bin = new bingo();}
	if((flag8==0)&&((b3.getBackground()==Color.RED)||(b3.getBackground()==Color.BLACK))&&((b8.getBackground()==Color.RED)||(b8.getBackground()==Color.BLACK))&&((b13.getBackground()==Color.RED)||(b13.getBackground()==Color.BLACK))&&((b18.getBackground()==Color.RED)||(b18.getBackground()==Color.BLACK))&&((b23.getBackground()==Color.RED)||(b23.getBackground()==Color.BLACK))){	
			b3.setBackground(Color.BLACK);
			b8.setBackground(Color.BLACK);
			b13.setBackground(Color.BLACK);
			b18.setBackground(Color.BLACK);
			b23.setBackground(Color.BLACK);
			flag8 = 1;
			bingo bin = new bingo();}		if((flag9==0)&&((b4.getBackground()==Color.RED)||(b4.getBackground()==Color.BLACK))&&((b9.getBackground()==Color.RED)||(b9.getBackground()==Color.BLACK))&&((b14.getBackground()==Color.RED)||(b14.getBackground()==Color.BLACK))&&((b19.getBackground()==Color.RED)||(b19.getBackground()==Color.BLACK))&&((b24.getBackground()==Color.RED)||(b24.getBackground()==Color.BLACK))){	
			b4.setBackground(Color.BLACK);
			b9.setBackground(Color.BLACK);
			b14.setBackground(Color.BLACK);
			b19.setBackground(Color.BLACK);
			b24.setBackground(Color.BLACK);
			flag9 = 1;
			bingo bin = new bingo();}
	if((flag10==0)&&((b5.getBackground()==Color.RED)||(b5.getBackground()==Color.BLACK))&&((b10.getBackground()==Color.RED)||(b10.getBackground()==Color.BLACK))&&((b15.getBackground()==Color.RED)||(b15.getBackground()==Color.BLACK))&&((b20.getBackground()==Color.RED)||(b20.getBackground()==Color.BLACK))&&((b25.getBackground()==Color.RED)||(b25.getBackground()==Color.BLACK))){	
			b5.setBackground(Color.BLACK);
			b10.setBackground(Color.BLACK);
			b15.setBackground(Color.BLACK);
			b20.setBackground(Color.BLACK);
			b25.setBackground(Color.BLACK);
			flag10 = 1;
			bingo bin = new bingo();}
	if((flaga==0)&&((b1.getBackground()==Color.RED)||(b1.getBackground()==Color.BLACK))&&((b7.getBackground()==Color.RED)||(b7.getBackground()==Color.BLACK))&&((b13.getBackground()==Color.RED)||(b13.getBackground()==Color.BLACK))&&((b19.getBackground()==Color.RED)||(b19.getBackground()==Color.BLACK))&&((b25.getBackground()==Color.RED)||(b25.getBackground()==Color.BLACK))){
			b1.setBackground(Color.BLACK);
			b7.setBackground(Color.BLACK);
			b13.setBackground(Color.BLACK);
			b19.setBackground(Color.BLACK);
			b25.setBackground(Color.BLACK);
			flaga = 1;
			bingo bin = new bingo();}
	if((flagb==0)&&((b5.getBackground()==Color.RED)||(b5.getBackground()==Color.BLACK))&&((b9.getBackground()==Color.RED)||(b9.getBackground()==Color.BLACK))&&((b13.getBackground()==Color.RED)||(b13.getBackground()==Color.BLACK))&&((b17.getBackground()==Color.RED)||(b17.getBackground()==Color.BLACK))&&((b21.getBackground()==Color.RED)||(b21.getBackground()==Color.BLACK))){
			b5.setBackground(Color.BLACK);
			b9.setBackground(Color.BLACK);
			b13.setBackground(Color.BLACK);
			b17.setBackground(Color.BLACK);
			b21.setBackground(Color.BLACK);
			flagb = 1;
			bingo bin = new bingo();}}
	private class HandlerClass1 implements ActionListener{
		Timer tim;
		int j=0;
		public void actionPerformed(ActionEvent e){
		if(e.getSource()==start){
				tim = new Timer(5000,new ActionListener(){
					public void actionPerformed(ActionEvent e){
						if(j==39){
							tim.stop();
							JOptionPane.showMessageDialog(null, "Game ended!");}
						text.setText(list.get(j));
						j++;}});
				tim.start();}
		if(e.getSource()==stop){
			tim.stop();
			JOptionPane.showMessageDialog(null, "Game ended!");
			JOptionPane.showMessageDialog(null, "Score"+score);}}}}
