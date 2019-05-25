package cal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class Calculator2 extends JFrame {
	JLabel l1,l2;
	JTextArea t;
	JButton [] b = new JButton[20];
	String tmp = "";
	String tmp2 = "";
	double start=0;
	char c1, c2;
	public Calculator2() {
		setTitle("계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p = new JPanel();
		p.add(MyPanel());
		add(p, BorderLayout.WEST);
		setVisible(true);
		pack();
	}
	private JPanel number() {
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(0,1));
		p.setBorder(new EmptyBorder(0,0,0,30));
		p.add(first());
		p.add(second());
		p.add(third());
		p.add(fourth());
		p.add(fifth());
		p.add(sixth());
		p.add(seventh());
		return p;
	}
	
	private JPanel MyPanel() {
		JPanel p = new JPanel();
		p.setLayout(new BorderLayout());
		p.setBorder(new EmptyBorder(5,5,15,30));
		p.add(number(), BorderLayout.WEST);
		p.add(right(), BorderLayout.EAST);
		return p;
	}
	
	private JPanel first() {
		JPanel p = new JPanel();
		p.setLayout(new BorderLayout());
		l1 = new JLabel("계산식");
		p.add(l1,BorderLayout.WEST);
		return p;
	}
	
	private JPanel second() {
		JPanel p = new JPanel();
		p.setLayout(new BorderLayout());
		l2 = new JLabel("계산");
		p.add(l2, BorderLayout.WEST);
		return p;
	}
	
	private JPanel third() {
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(1,4));
		b[0] = new JButton("c");
		b[0].addActionListener(new Action());
		b[1] = new JButton("");
		b[1].setVisible(false);
		b[2] = new JButton("");
		b[2].setVisible(false);
		b[3] = new JButton("");
		b[3].setVisible(false);
		for(int i=0;i<4;i++) {
			p.add(b[i]);
		}
		return p;
	} 
	private JPanel fourth() {
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(1,4));
		b[4] = new JButton("7");
		b[5] = new JButton("8");
		b[6] = new JButton("9");
		b[7] = new JButton("/");
		for(int i=4;i<8;i++) {
			b[i].addActionListener(new Action());
			p.add(b[i]);
		}
		return p;
	}
	private JPanel fifth() {
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(1,4));
		b[8] = new JButton("4");
		b[9] = new JButton("5");
		b[10] = new JButton("6");
		b[11] = new JButton("*");
		for(int i=8;i<12;i++) {
			b[i].addActionListener(new Action());
			p.add(b[i]);
		}
		return p;
	}
	private JPanel sixth() {
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(1,4));
		b[12] = new JButton("1");
		b[13] = new JButton("2");
		b[14] = new JButton("3");
		b[15] = new JButton("-");
		for(int i=12;i<16;i++) {
			b[i].addActionListener(new Action());
			p.add(b[i]);
		}
		return p;
	}
	private JPanel seventh() {
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(1,4));
		b[16] = new JButton("0");
		b[16].addActionListener(new Action());
		b[17] = new JButton("+/-");
		b[18] = new JButton("=");
		b[19] = new JButton("+");
		for(int i = 16;i<20;i++) {
			b[i].addActionListener(new Action());
			p.add(b[i]);
		}
		return p;
	}
	private JPanel right() {
		JPanel p = new JPanel();
		JLabel name = new JLabel("계산 log");
		t = new JTextArea(10,10);
		p.setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));
		p.add(name);
		p.add(t);
		return p;
	}
	
	class Action implements ActionListener{
		double x;
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == b[0]) {
				tmp = "";
				tmp2 = "";
				start =0;
				l1.setText(tmp);
				l2.setText(tmp2);
			}
			else if(e.getSource() == b[4]) {
				tmp += b[4].getText();
				tmp2 += b[4].getText();
				l2.setText(tmp);
				l1.setText(tmp2);
				
			}
			else if(e.getSource() == b[5]) {
				tmp += b[5].getText();
				tmp2 += b[5].getText();
				l2.setText(tmp);
				l1.setText(tmp2);
			}
			else if(e.getSource() == b[6]) {
				tmp += b[6].getText();
				tmp2 += b[6].getText();
				l2.setText(tmp);
				l1.setText(tmp2);
			}
			else if(e.getSource() == b[8]) {
				tmp += b[8].getText();
				tmp2 += b[8].getText();
				l2.setText(tmp);
				l1.setText(tmp2);
			}
			else if(e.getSource() == b[9]) {
				tmp += b[9].getText();
				tmp2 += b[9].getText();
				l2.setText(tmp);
				l1.setText(tmp2);
			}
			else if(e.getSource() == b[10]) {
				tmp += b[10].getText();
				tmp2 += b[10].getText();
				l2.setText(tmp);
				l1.setText(tmp2);
			}
			else if(e.getSource() == b[12]) {
				tmp += b[12].getText();
				tmp2 += b[12].getText();
				l2.setText(tmp);
				l1.setText(tmp2);
			}
			else if(e.getSource() == b[13]) {
				tmp += b[13].getText();
				tmp2 += b[13].getText();
				l2.setText(tmp);
				l1.setText(tmp2);
			}
			else if(e.getSource() == b[14]) {
				tmp += b[14].getText();
				tmp2 += b[14].getText();
				l2.setText(tmp);
				l1.setText(tmp2);
			}
			else if(e.getSource() == b[16]) {
				tmp += b[16].getText();
				tmp2 += b[16].getText();
				l2.setText(tmp);
				l1.setText(tmp2);
			}

			else if(e.getSource() == b[7]) {
				tmp2 += b[7].getText();
				l1.setText(tmp2);
				x = Double.parseDouble(tmp);
				if(start == 0) {
					start = x;
					c1 = '/';
				}
				else {
					c2 = c1;
					c1 = '/';
					operate(c2);
				}
				String tmp3 = String.format("%.1f",start);
				l2.setText(tmp3);
				tmp = "";
			}
			else if(e.getSource() == b[11]) {
				tmp2 += b[11].getText();
				l1.setText(tmp2);
				x = Double.parseDouble(tmp);
				if(start == 0) {
					start = x;
					c1 = '*';
				}
				else {
					c2 = c1;
					c1 = '*';
					operate(c2);
				}
				String tmp3 = String.format("%.1f",start);
				l2.setText(tmp3);
				tmp = "";
			}
			else if(e.getSource() == b[15]) {
				tmp2 += b[15].getText();
				l1.setText(tmp2);
				x = Double.parseDouble(tmp);
				if(start == 0) {
					start = x;
					c1 = '-';
				}
				else {
					c2 = c1;
					c1 = '-';
					operate(c2);
				}
				String tmp3 = String.format("%.1f",start);
				l2.setText(tmp3);
				tmp = "";
			}
			else if(e.getSource() == b[19]) {
				tmp2 += b[19].getText();
				l1.setText(tmp2);
				x = Double.parseDouble(tmp);
				if(start == 0) {
					start = x;
					c1 = '+';
				}
				else {
					c2 = c1;
					c1 = '+';
					operate(c2);
				}
				String tmp3 = String.format("%.1f", start);
				l2.setText(tmp3);
				tmp = "";
			}
			else if(e.getSource() == b[18]) {
				x = Double.parseDouble(tmp);
				c2 = c1;
				operate(c2);
				String tmp3 = String.format("%.1f", start);
				l2.setText(tmp3);
				t.append(tmp2 + '\n');
				tmp2 = "";
				l1.setText(tmp2);
				
			}
			
		}
		private double operate(char c) {
			char c11;
			c11 = c;
			if(c11 == '+') {
				start = start + x;
			} else if(c11 == '-') {
				start = start - x;
			} else if(c11 == '*') {
				start = start * x;
			} else if(c11 == '/') {
				start = start / x;
			} else {
				start = 0;
			}
			return start;
		}
	}
	
	public static void main(String args[]) {
		Calculator2 c = new Calculator2();
	}
}
