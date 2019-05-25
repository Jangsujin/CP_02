package pizza;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class Pizza extends JFrame{
	JRadioButton k1, k2, k3, t1, t2, t3, t4, s1, s2, s3;
	int x = 0;
	int y = 0;
	int z = 0;
	JLabel result;
	JButton order;
	public Pizza() {
		setTitle("피자 주문");
		add(MyPanel());
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	private JPanel MyPanel() {
		JPanel p = new JPanel();
		p.setLayout(new BorderLayout());
		p.add(Name(), BorderLayout.NORTH);
		p.add(Kind(), BorderLayout.WEST);
		p.add(Topping(), BorderLayout.CENTER);
		p.add(Size(), BorderLayout.EAST);
		p.add(Result(), BorderLayout.SOUTH);
		return p;
	}
	private JPanel Name() {
		JPanel p = new JPanel();
		JLabel name = new JLabel("자바 피자에 오신 것을 환영합니다.");
		p.add(name);
		return p;
	}
	private JPanel Kind() {
		JPanel p = new JPanel();
		Border b = BorderFactory.createTitledBorder("종류");
		p.setBorder(b);
		p.setLayout(new GridLayout(0,1));
		ButtonGroup g = new ButtonGroup();
		Action a = new Action();
		k1 = new JRadioButton("콤보 : 8000");
		k2 = new JRadioButton("포테이토 : 9000");
		k3 = new JRadioButton("불고기 : 10000");
		g.add(k1); g.add(k2); g.add(k3);
		p.add(k1); p.add(k2); p.add(k3);
		k1.addActionListener(a);
		k2.addActionListener(a);
		k3.addActionListener(a);
		return p;
	}
	private JPanel Topping() {
		JPanel p = new JPanel();
		Border b = BorderFactory.createTitledBorder("추가 토핑");
		p.setBorder(b);
		p.setLayout(new GridLayout(0,2));
		ButtonGroup g = new ButtonGroup();
		Action a = new Action();
		t1 = new JRadioButton("피망 : 100");
		t2 = new JRadioButton("치즈 : 200");
		t3 = new JRadioButton("페퍼로니 : 300");
		t4 = new JRadioButton("베이컨 : 400");
		JRadioButton t_1 = new JRadioButton();
		t_1.setVisible(false);
		g.add(t1); g.add(t2); g.add(t3); g.add(t4);
		p.add(t1); p.add(t2); p.add(t3); p.add(t4); p.add(t_1);
		t1.addActionListener(a);
		t2.addActionListener(a);
		t3.addActionListener(a);
		t4.addActionListener(a);
		return p;	
	}
	private JPanel Size() {
		JPanel p = new JPanel();
		Border b = BorderFactory.createTitledBorder("크기");
		p.setBorder(b);
		p.setLayout(new GridLayout(0,1));
		ButtonGroup g = new ButtonGroup();
		Action a = new Action();
		s1 = new JRadioButton("Small : +1000");
		s2 = new JRadioButton("Medium : +2000");
		s3 = new JRadioButton("Large : +3000");
		g.add(s1); g.add(s2); g.add(s3);
		p.add(s1); p.add(s2); p.add(s3);
		s1.addActionListener(a);
		s2.addActionListener(a);
		s3.addActionListener(a);
		return p;
	}

	private JPanel Result() {
		JPanel p = new JPanel();
		order = new JButton("주문");
		order.addActionListener(new Action2());
		JButton cancel = new JButton("취소");
		result = new JLabel("결제금액 : ");
		p.add(order); p.add(cancel); p.add(result);
		return p;
	}
	
	class Action implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			Object s = e.getSource();
			if(s == k1) {
				x = 8000;
			} else if(s == k2){
				x = 9000;
			} else if(s == k3) {
				x = 10000;
			} else if(s == t1) {
				y = 100;
			} else if(s == t2) {
				y = 200;
			} else if(s == t3) {
				y = 300;
			} else if(s == t4) {
				y = 400;
			} else if(s == s1) {
				z = 1000;
			} else if(s == s2) {
				z = 2000;
			} else if(s == s3) {
				z = 3000;
			}
		}
		
	}
	class Action2 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == order) {
				String tmp = String.format("결제금액 : %d",x+y+z);
				result.setText(tmp);
			}
		}
	}
	public static void main(String args[]) {
		Pizza p = new Pizza();
	}
}
