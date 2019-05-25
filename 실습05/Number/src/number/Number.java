package number;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Number extends JFrame {
	Random r = new Random();
	int rand = r.nextInt(100)+1; 
	JTextField t;
	JTextField show;
	JButton b1, b2;
	public Number() {
		setTitle("���ڰ���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p = new JPanel();
		p.add(p(), BorderLayout.NORTH);
		p.add(p1(), BorderLayout.CENTER);
		p.add(p2(), BorderLayout.SOUTH);
		add(p);
		setSize(300,300);
		setVisible(true);
	}

	private JPanel p() {
		JPanel p = new JPanel();
		JLabel l = new JLabel("���ڸ� �����Ͻÿ� : ");
		t = new JTextField(2);
		p.add(l);
		p.add(t);
		this.requestFocus();
		setFocusable(true);
		t.addActionListener(new Action());
		return p;
	}
	private JPanel p1() {
		JPanel p = new JPanel();
		show = new JTextField(15);
		p.add(show);
		return p;
	}
	private JPanel p2() {
		JPanel p = new JPanel();
		b1 = new JButton("�ٽ��ϱ�");
		b1.addActionListener(new Action2());
		b2 = new JButton("����");
		b2.addActionListener(new Action2());
		p.add(b1);
		p.add(b2);
		return p;
	}
	
	class Action implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String s = t.getText();
			int x = Integer.parseInt(s);
			if(e.getSource() == t) {
				if(rand > x ) {
					show.setText("�ʹ� �����ϴ�.");
					show.setBackground(Color.green);
				}
				else if(rand < x) {
					show.setText("�ʹ� �����ϴ�.");
					show.setBackground(Color.yellow);
				}
				else {
					show.setText("�����Դϴ�.");
					show.setBackground(Color.red);
				}
			}
		}
	}
	class Action2 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()== b1) {
				rand = r.nextInt(100)+1;
				t.setText("");
				show.setText("���ӽ���");
				show.setBackground(Color.white);
			}
			else if(e.getSource() == b2) {
				System.exit(0);
			}
		}
	}
	public static void main(String args[]) {
		Number n = new Number();
	}

}
