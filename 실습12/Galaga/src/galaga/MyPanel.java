package galaga;

import java.awt.Graphics;
import java.io.IOException;

import javax.swing.JPanel;

public class MyPanel extends JPanel{
	Enermy enermy;
	SpaceShip spaceship;
	Missile missile;
	
	public MyPanel() throws IOException{
		super();
		
		enermy = new Enermy("C:\\Users\\LG\\Desktop\\18\\2학기\\컴프2\\enermy.jpg");
		spaceship = new SpaceShip("C:\\Users\\LG\\Desktop\\18\\2학기\\컴프2\\spaceship.jpg");
		missile = new Missile("C:\\Users\\LG\\Desktop\\18\\2학기\\컴프2\\Missile.png");
		
		Thread t = new Thread(new MyThread(this, enermy, spaceship, missile));
		t.start();
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		enermy.draw(g);
		spaceship.draw(g);
		missile.draw(g);
	}

}
