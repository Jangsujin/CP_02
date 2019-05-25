package draw;

import javax.imageio.ImageIO;
import javax.swing.*;



import java.awt.*;
import java.awt.geom.Arc2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MyFrame extends JFrame{
	BufferedImage img;
	BufferedImage img2;
	public MyFrame() {
		setTitle("별 달 그리기");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			img = ImageIO.read(new File("C:\\Users\\LG\\Desktop\\18\\2학기\\컴프2\\background.jpg"));
			img2 = ImageIO.read(new File("C:\\Users\\LG\\Desktop\\18\\2학기\\컴프2\\star.png"));
		} catch(IOException e) {
			e.printStackTrace();
		}
		MyPanel p = new MyPanel();
		add(p);
		
		setVisible(true);
		
	}
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img,0,0,null);
			Moon m1 = new Moon(10,10,g);
			Star s1 = new Star(100,100,g);
			Star s2 = new Star(150,150,g);
			Star s3 = new Star(80,160,g);
			Star s4 = new Star(170,30,g);
			
		}
	}
	class Moon extends JPanel{
		public Moon(int x, int y, Graphics g) {

				Graphics2D g2 = (Graphics2D) g;
				Shape arc1 = new Arc2D.Float(x,y,100,100,50,180,Arc2D.CHORD);
				g2.setColor(Color.yellow);
				g2.fill(arc1);
				g2.draw(arc1);

		}
		
	}
	class Star extends JPanel{
		public Star(int x, int y, Graphics g) {
			g.drawImage(img2,x,y,null);
		}
	}
	public static void main(String args[]) {
		MyFrame f = new MyFrame();
	}

}
