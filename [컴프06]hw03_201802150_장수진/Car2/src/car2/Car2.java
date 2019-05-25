package car2;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.*;


public class Car2 extends JFrame{
	BufferedImage img;
	BufferedImage back;
	JButton b1;
	JButton b2;
	int x = 120;
	public Car2() {
		try {
			img = ImageIO.read(new File("C:\\Users\\LG\\Desktop\\18\\2학기\\컴프2\\HW03\\[컴프06]hw_03_201802150_장수진\\car2.png"));
			back = ImageIO.read(new File("C:\\Users\\LG\\Desktop\\18\\2학기\\컴프2\\HW03\\[컴프06]hw_03_201802150_장수진\\backGround3.jpg"));
		} catch(IOException e){
			e.printStackTrace();
		}
		setTitle("자동차");
		setSize(800,500);
		MyPanel p = new MyPanel();
		add(p);
		add(panel(), BorderLayout.SOUTH);
		this.requestFocus();
		setFocusable(true);
		addKeyListener(new Key());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponents(g);
			g.drawImage(back,0,0,null);
			g.drawImage(img,x,50,null);
			
		}
		
	}

		private JPanel panel() {
			JPanel p = new JPanel();
			Action a = new Action();
			b1 = new JButton("왼쪽으로 이동");
			b1.addActionListener(a);
			b2 = new JButton("오른쪽으로 이동");
			b2.addActionListener(a);
			p.add(b1);
			p.add(b2);
			return p;
		}

	
	class Key extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode() == e.VK_LEFT) {
				x -= 10;
			}
			else if(e.getKeyCode() == e.VK_RIGHT) {
				x += 10;
			}
			repaint();
		}
		
	}
	class Action implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == b1) {
				x -= 10;
			}
			else if(e.getSource() == b2) {
				x += 10;
			}
			repaint();
		}
	}
	public static void main(String args[]) {
		Car2 c = new Car2();
	}
}
