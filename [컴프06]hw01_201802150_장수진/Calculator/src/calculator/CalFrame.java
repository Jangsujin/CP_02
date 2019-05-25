package calculator;

import javax.swing.*;
import java.awt.*;

public class CalFrame extends JFrame {
	public CalFrame() {
		setTitle("°è»ê±â");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p = new JPanel();
		p.add(panel());
		add(p,BorderLayout.WEST);
		pack();
		setVisible(true);
	}
	
	private static JPanel panel() {
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(0,1));
		p.add(first());
		p.add(second());
		p.add(third());
		p.add(fourth());
		p.add(fifth());
		p.add(sixth());
		return p;
	}
	private static JPanel first() {
		JTextField t = new JTextField("23");
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(1,1));
		p.add(t);
		return p;
	}
	private static JPanel second() {
		JButton b = new JButton("C");
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();
		b1.setVisible(false);
		b2.setVisible(false);
		b3.setVisible(false);
		JPanel p = new JPanel();
		p.add(b);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.setLayout(new GridLayout(1,4));
		return p;
	}
	private static JPanel third() {
		JButton b1 = new JButton("7");
		JButton b2 = new JButton("8");
		JButton b3 = new JButton("9");
		JButton b4 = new JButton("/");
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(1,4));
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		return p;
	}
	private static JPanel fourth() {
		JButton b1 = new JButton("4");
		JButton b2 = new JButton("5");
		JButton b3 = new JButton("6");
		JButton b4 = new JButton("*");
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(1,4));
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		return p;
	}
	private static JPanel fifth() {
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("-");
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(1,4));
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		return p;
	}
	private static JPanel sixth() {
		JButton b1 = new JButton("0");
		JButton b2 = new JButton("C");
		JButton b3 = new JButton("C");
		JButton b4 = new JButton("+");
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(1,4));
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		return p;
	}
	public static void main(String args[]) {
		CalFrame c = new CalFrame();
	}

}
