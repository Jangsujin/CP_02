package hello;

import java.util.Date;

public class Hello implements Runnable {
	public void run() {
		try {
			while(!Thread.currentThread().isInterrupted()) {
				Date d = new Date();
				System.out.println(d+" �ȳ��ϼ���?");
				System.out.println(d+" �ȳ��� �輼��.");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new Hello());
		t.start();
	}
}