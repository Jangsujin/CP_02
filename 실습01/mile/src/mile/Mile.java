package mile;

import javax.swing.*;
import java.awt.*;

public class Mile extends JFrame {
	public Mile() {
		setTitle("������ ų�ι��ͷ� ��ȯ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p = new JPanel();
		p.setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));
		p.add(firstLine());
		p.add(secondLine());
		p.add(thirdLine());
		add(p);
		pack();
		setVisible(true);
	
	}
	private static JPanel firstLine() {
		Label a = new Label("�Ÿ��� ���� ������ �Է��Ͻÿ� ");
		JTextField t = new JTextField("1");
		JPanel p = new JPanel();
		p.add(a);
		p.add(t);
		return p;
	}
	private static JPanel secondLine() {
		Button b1 = new Button("��ȯ");
		b1.setPreferredSize(new Dimension(30,30));
		JPanel p = new JPanel();
		p.add(b1);
		return p;
	}
	private JPanel thirdLine() {
		JTextField t = new JTextField("1������ 1.6ų�ι����Դϴ�.");
		t.setPreferredSize(new Dimension(200,20));
		JPanel p = new JPanel();
		p.add(t);
		return p;
	}
	public static void main(String args[]) {
		Mile m = new Mile();
	}

}
