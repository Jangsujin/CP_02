package interest;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("���� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p = new JPanel();
		p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
		p.add(firstLine());
		p.add(secondLine());
		p.add(thirdLine());
		p.add(fourthLine());
		add(p);
		pack();
		setVisible(true);
		
	}
	private static JPanel firstLine() {
		Label a = new Label("������ �Է��Ͻÿ� ");
		JTextField t = new JTextField("1000");
		JPanel p = new JPanel();
		p.add(a);
		p.add(t);
		return p;
	}
	private static JPanel secondLine() {
		Label a = new Label("������ �Է��Ͻÿ� ");
		JTextField t = new JTextField("7.5");
		JPanel p = new JPanel();
		p.add(a);
		p.add(t);
		return p;
	}
	private static JPanel thirdLine() {
		Button b = new Button("��ȯ");
		b.setPreferredSize(new Dimension(30,30));
		JPanel p = new JPanel();
		p.add(b);
		return p;	
	}
	private static JPanel fourthLine() {
		JTextField t = new JTextField("���ڴ� �� 75���� �Դϴ�.");
		t.setPreferredSize(new Dimension(200,20));
		JPanel p = new JPanel();
		p.add(t);
		return p;
	}
	public static void main(String args[]) {
		MyFrame f = new MyFrame();
	}
	

}
