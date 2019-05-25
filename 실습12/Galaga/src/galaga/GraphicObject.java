package galaga;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;

import javax.imageio.ImageIO;

public class GraphicObject {
	BufferedImage img = null;
	int x=0, y=0;
	
	public GraphicObject(String name) throws IOException {
		img = ImageIO.read(new File(name));
	}
	
	public void update() {}
	public void draw(Graphics g) {
		g.drawImage(img, x, y, null);
	}
	
	public void keyPress(KeyEvent event) {
		
	}

}
