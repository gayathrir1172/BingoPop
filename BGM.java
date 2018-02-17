package project;
import javazoom.jl.player.*;
import java.io.FileInputStream;
public class bgm implements Runnable{
	Thread t;
	bgm(){
		t = new Thread(this,"BGM");
		t.start();
		}
	public void run(){
		try{
			FileInputStream fis = new FileInputStream("Rainbows.mp3");
			Player playMP3 = new Player(fis);
			playMP3.play();
		}
		catch(Exception e){
			System.out.println(e);
			}
	}
}
