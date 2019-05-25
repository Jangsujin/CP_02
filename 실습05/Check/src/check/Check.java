package check;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Check extends JFrame {
	JCheckBox [] c = new JCheckBox[4];
	int sum = 0;
	JLabel l;
	public Check() {
		setTitle("�̹��� ���̺�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(p(), BorderLayout.NORTH);
		add(p2(), BorderLayout.SOUTH);
		pack();
		setVisible(true);
	}
	
	private JPanel p() {
		JPanel p = new JPanel();
		String [] s = {"�������� ��ȯ : 45000", "�ڵ� ���ӱ� ��ȯ : 80000", "������ ���� ��ȯ : 30000", "Ÿ�̾� ��ȯ : 100000"};
		for(int i = 0;i<4;i++) {
			c[i] = new JCheckBox(s[i]);
			p.add(c[i]);
			c[i].addItemListener(new Item());
		}
		return p;
	}
	private JPanel p2() {
		JPanel p = new JPanel();
		l = new JLabel("������ ������ 0���Դϴ�.");
		p.add(l);
		return p;
	}
	class Item implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
			Object source = e.getItemSelectable();
				if(source == c[0]) {
					if(e.getStateChange() == ItemEvent.DESELECTED) {
						sum = sum-45000;
					} else {
						sum = sum+45000;
					}
				}
				else if(source == c[1]) {
					if(e.getStateChange() == ItemEvent.DESELECTED) {
						sum = sum-80000;
					} else {
						sum = sum+80000;
					}
				}
				else if(source == c[2]) {
					if(e.getStateChange() == ItemEvent.DESELECTED) {
						sum = sum-30000;
					} else {
						sum = sum+30000;
					}
				}
				else if(source == c[3]) {
					if(e.getStateChange() == ItemEvent.DESELECTED) {
						sum = sum-100000;
					} else {
						sum = sum+100000;
					}
				}
				String price = String.format("��������� ������ %d�� �Դϴ�.",sum);
				l.setText(price);		
		}
	}
	public static void main(String args[]) {
		Check c = new Check();
	}

}
