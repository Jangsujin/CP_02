package size;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

public class Size extends JFrame {
	JRadioButton b1,b2,b3;
	JLabel result;
	public Size() {
		setTitle("커피 주문");
		add(MyPanel());
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	private JPanel MyPanel() {
		JPanel p = new JPanel();
		p.setLayout(new BorderLayout());
		p.add(Name(), BorderLayout.NORTH);
		p.add(Size(), BorderLayout.CENTER);
		p.add(Result(), BorderLayout.SOUTH);
		return p;
	}
	private JPanel Name() {
		JPanel p = new JPanel();
		JLabel t = new JLabel("자바  카페에 오신 것을 환영합니다.");
		p.add(t);
		return p;
	}
	private JPanel Result() {
		JPanel p = new JPanel();
		result = new JLabel("결제 금액 : ");
		p.add(result);
		return p;
	}
	private JPanel Size() {
		JPanel p = new JPanel();
		Border border = BorderFactory.createTitledBorder("커피 크기");
		p.setBorder(border);
		p.setLayout(new GridLayout(0,1));
		b1 = new JRadioButton("Small : 3000");
		b2 = new JRadioButton("Medium : 4000");
		b3 = new JRadioButton("Large : 5000");
		ButtonGroup size = new ButtonGroup();
		size.add(b1); size.add(b2); size.add(b3);
		Action a = new Action();
		b1.addActionListener(a);
		b2.addActionListener(a);
		b3.addActionListener(a);
		p.add(b1); p.add(b2); p.add(b3);
		return p;
	}
	class Action implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==b1) {
				result.setText("결제금액 : 3000");
			}
			else if (e.getSource()==b2) {
				result.setText("결제금액 : 4000");
			}
			else if(e.getSource()==b3) {
				result.setText("결제금액 : 5000");
			}
		}
	}
	public static void main(String args[]) {
		Size s = new Size();
	}
}
