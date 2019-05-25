package mile;

import javax.swing.*;
import java.awt.*;

public class Mile extends JFrame {
	public Mile() {
		setTitle("마일을 킬로미터로 변환");
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
		Label a = new Label("거리를 마일 단위로 입력하시오 ");
		JTextField t = new JTextField("1");
		JPanel p = new JPanel();
		p.add(a);
		p.add(t);
		return p;
	}
	private static JPanel secondLine() {
		Button b1 = new Button("변환");
		b1.setPreferredSize(new Dimension(30,30));
		JPanel p = new JPanel();
		p.add(b1);
		return p;
	}
	private JPanel thirdLine() {
		JTextField t = new JTextField("1마일은 1.6킬로미터입니다.");
		t.setPreferredSize(new Dimension(200,20));
		JPanel p = new JPanel();
		p.add(t);
		return p;
	}
	public static void main(String args[]) {
		Mile m = new Mile();
	}

}
