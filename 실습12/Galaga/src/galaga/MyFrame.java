package galaga;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.swing.JFrame;

public class MyFrame extends JFrame implements KeyListener{
	MyPanel panel;
	public MyFrame() throws IOException{
		setTitle("My Game");
		add(panel=new MyPanel());
		setSize(500,500);
		this.addKeyListener(this);
		this.requestFocus();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void keyPressed(KeyEvent arg0) {
		panel.spaceship.keyPressed(arg0);
		panel.missile.keyPressed(arg0, panel.spaceship.x, panel.spaceship.y);
	}
	public void keyReleased(KeyEvent arg0) {}
	
	public void keyTyped(KeyEvent arg0) {}

	public static void main(String[] args) throws IOException {
		new MyFrame();

	}

}
