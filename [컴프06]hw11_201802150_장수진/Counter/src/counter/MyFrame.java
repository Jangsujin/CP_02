package counter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyFrame extends JFrame {
	JButton b1, b2;
	JLabel l;
	Thread c;
	double d;

	public MyFrame() {
		JPanel p = new JPanel();
		p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
		p.add(p1());
		p.add(p2());
		p.add(p3());
		add(p);
		setSize(300,300);
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private JPanel p1() {
		JPanel p = new JPanel();
		b1 = new JButton("카운터 시작");
		b1.addActionListener(new Action());		
		p.add(b1);
		return p; 
	}
	private JPanel p2() {
		JPanel p = new JPanel();
		b2 = new JButton("카운터 중지");
		b2.addActionListener(new Action());
		p.add(b2);
		return p;
	}
	private JPanel p3() {
		JPanel p = new JPanel();
		l = new JLabel();
		c = new Counter(l);
		p.add(l);
		return p;
	}
	
	private class Action implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()== b1) {
				c.start();
			}
			if(e.getSource() == b2) {
				c.stop();
			}	
		}
	}

	public static void main(String[] args) {
		MyFrame m = new MyFrame();
	}
}
