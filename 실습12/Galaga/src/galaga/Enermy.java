package galaga;

import java.io.IOException;
import java.util.Random;

public class Enermy extends GraphicObject {
	//int dx = -10;
	public Enermy(String name) throws IOException{
		super(name);
		x = 500;
		y = 0;
	}
	public void update() {
		Random r = new Random();
		x = r.nextInt(500);
		/*x += dx;
		if(x<0) dx = +10;
		if(x>500) dx = -10;*/
	}

}
