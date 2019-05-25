package car;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class MyFrame extends JFrame{
	BufferedImage img;
	BufferedImage img2;
	public MyFrame() {
		setTitle("자동차");
		setSize(800,447); // setSize 이용하여 사진의 원래 크기 지정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			img = ImageIO.read(new File("C:\\Users\\LG\\Desktop\\18\\2학기\\컴프2\\HW02\\[컴프06]hw_02_201802150_장수진\\backGround2.jpg"));
			img2 = ImageIO.read(new File("C:\\Users\\LG\\Desktop\\18\\2학기\\컴프2\\HW02\\[컴프06]hw_02_201802150_장수진\\car.png"));
		} catch(IOException e){
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
			Car c = new Car(g);
			
		}
	}
	class Car {
		Random r = new Random();
		
		public Car(Graphics g) {
			int x = 10+r.nextInt(20);
			for(int i = 0;i<=x;i++) {
				g.drawImage(imageResize(),20+r.nextInt(681),200+r.nextInt(101),null);
			}
		}
		public Image imageResize() {
			try {
				int ratio = r.nextInt(41);
				int imgWidth = 30 + ratio;
				int imgHeight = 30 + ratio;
				Image resizeImg2 = img2.getScaledInstance(imgWidth,imgHeight,Image.SCALE_DEFAULT);
				return resizeImg2;
				
			}catch(Exception e){
				e.printStackTrace();
				return img2;
			}
		}
	}
	public static void main(String args[]) {
		MyFrame f = new MyFrame();
	}
}
