package interest2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Interest2 extends JFrame{
	TextField t1, t2, t3;
	JButton b;
	public Interest2(){
		setTitle("���� ����");
		JPanel p = new JPanel();
		p.setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));
		p.add(first());
		p.add(second());
		p.add(third());
		p.add(fourth());
		add(p);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		pack();
	}
	
	private JPanel first() {
		JPanel p = new JPanel();
		JLabel l = new JLabel("������ �Է��Ͻÿ� ");
		t1 = new TextField("1000");
		p.add(l);
		p.add(t1);
		return p;
	}
	private JPanel second() {
		JPanel p = new JPanel();
		JLabel l = new JLabel("������ �Է��Ͻÿ� ");
		t2 = new TextField("7.5");
		p.add(l);
		p.add(t2);
		return p;
	}
	private JPanel third() {
		JPanel p = new JPanel();
		b = new JButton("��ȯ");
		b.addActionListener(new Action());
		p.add(b);
		return p;
	}
	private JPanel fourth() {
		JPanel p = new JPanel();
		t3 = new TextField("���ڴ� �� 75���� �Դϴ�.");
		p.add(t3);
		return p;
	}
	
	class Action implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == b) {
				String x = t1.getText();
				String y = t2.getText();
				double x_1 = Double.parseDouble(x);
				double y_1 = Double.parseDouble(y);
				double z = (x_1*y_1)/100;
				String temp = t3.getText();
				temp = String.format("���ڴ� �� %.1f�����Դϴ�.", z);
				t3.setText(temp);
				
			}
		}
	}
	
	public static void main(String args[]) {
		Interest2 i = new Interest2();
	}

}
