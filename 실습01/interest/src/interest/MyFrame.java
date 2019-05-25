package interest;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("이자 계산기");
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
		Label a = new Label("원금을 입력하시오 ");
		JTextField t = new JTextField("1000");
		JPanel p = new JPanel();
		p.add(a);
		p.add(t);
		return p;
	}
	private static JPanel secondLine() {
		Label a = new Label("이율을 입력하시오 ");
		JTextField t = new JTextField("7.5");
		JPanel p = new JPanel();
		p.add(a);
		p.add(t);
		return p;
	}
	private static JPanel thirdLine() {
		Button b = new Button("변환");
		b.setPreferredSize(new Dimension(30,30));
		JPanel p = new JPanel();
		p.add(b);
		return p;	
	}
	private static JPanel fourthLine() {
		JTextField t = new JTextField("이자는 연 75만원 입니다.");
		t.setPreferredSize(new Dimension(200,20));
		JPanel p = new JPanel();
		p.add(t);
		return p;
	}
	public static void main(String args[]) {
		MyFrame f = new MyFrame();
	}
	

}
