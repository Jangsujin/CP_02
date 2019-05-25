package circle;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MyFrame extends JFrame{
	public MyFrame() {
		setSize(500,500);
		setTitle("Random Circle »ý¼º");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel p = new MyPanel();
		add(p);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			Circle c1 = new Circle(Color.red, 30,30,g);
			Circle c2 = new Circle(Color.green, 20,20,g);
		}
	}
	class Circle extends JPanel {
		public Circle(Color c,int x, int y, Graphics g) {
			Color c1 = c;
			int width = x;
			int height = y;
			Graphics g1 = g;
			Random r = new Random();
			int z = r.nextInt(10);
			for(int i=0 ; i<=z;i++) {
			g.setColor(c);
			g.fillOval(r.nextInt(450),r.nextInt(450),x,y);
		}
		}
	}
			
	public static void main(String args[]) {
		MyFrame f = new MyFrame();
	}

}
