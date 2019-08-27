package javaclasssheji;
import javax.swing.*;

public class register {
	JFrame J1 = new JFrame("register");
	public register(){
		J1.setBounds(0, 0, 500, 500);
		JTextField t = new JTextField();
		JLabel l = new JLabel("请输入用户名称:");
		l.setBounds(100, 100, 100, 50);
		JPanel p = new JPanel();
		p.setBounds(200, 100, 300, 400);
		JTextField name = new JTextField(20);
		name.setBounds(200, 200, 100, 50);
		String names = name.getText();
		p.add(name);
		//p.add(l);
		J1.add(p);
		J1.add(l);
		J1.setVisible(true);
	}
	public static void main(String arge[]) {
		register r = new register();
	}
}
