package screensaver;


import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MyFrame extends JFrame implements Runnable {
	
	public MyFrame() {
		setTitle("화면보호기 만들기");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		while(true) {
			MyPanel[] p = new MyPanel[10];
			for(int i=0; i<10;i++) {
				p[i]= new MyPanel(i+1);
			}
			for(int i=0;i<10;i++) {
				add(p[i]);
				run();
				remove(p[i]);
				if(i==9) {
					repaint();
					run();
				}
			}
		}
	}
	class MyPanel extends JPanel{
		int n;
		public MyPanel(int n) {
			this.n = n;
		}
		public void paintComponent(Graphics g) {	
			super.paintComponent(g);
			Random r = new Random();
			Graphics2D g2 = (Graphics2D)g;
			for(int i=0;i<n;i++) {
				g2.drawLine(r.nextInt(500),r.nextInt(500),r.nextInt(500),r.nextInt(500));
			}		
		}
	}
	public void run() {
		try {
			setVisible(true);
			Thread.sleep(1000);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void main(String args[]) {
		MyFrame f = new MyFrame();
	}
}