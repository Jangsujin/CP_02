package galaga;

import javax.swing.JPanel;

public class MyThread extends JPanel implements Runnable{
	Enermy enermy;
	SpaceShip spaceship;
	Missile missile;
	JPanel p;
	public MyThread(JPanel p, Enermy enermy, SpaceShip spaceship, Missile missile) {
		this.enermy = enermy;
		this.spaceship = spaceship;
		this.missile = missile;
		this.p = p;
	}
	public void run() {
		while(true) {
			enermy.update();
			spaceship.update();
			missile.update();
			if(missile.x-enermy.x<=11&&missile.x-enermy.x>=-12&&missile.y>enermy.y-13) {
				System.out.println("맞았습니다.");
			}
			p.repaint();
			try {
				Thread.sleep(50);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
