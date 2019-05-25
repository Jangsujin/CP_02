package counter;

import javax.swing.JLabel;

public class Counter extends Thread {
	double d = 0;
	JLabel l = null;
	
	public Counter(JLabel l) {
		this.l = l;
	}
	
	public void run() {
		while(!Thread.currentThread().isInterrupted()) {
			d=d+0.1;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			String s = String.format("%.3f", d);
			l.setText(s);
		}
	}
}