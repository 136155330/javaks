package javaclasssheji;
import java.awt.BorderLayout;
import java.awt.color.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Login {
	JFrame f = new JFrame("Login");
	private class things  implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			f.setVisible(false);
			new game_begin();
		}
		
	}
	public Login() {
    	 f.setBounds(0, 0, 500, 500);
         f.setLayout(null);
         JButton x = new JButton("Login");
         JPanel jpa = new JPanel();
         jpa.setLayout(null);
         jpa.setBounds(0, 0, 500, 500);
         JLabel text = new JLabel("»¶Ó­µÇÂ½ÓÎÏ·");
         text.setBounds(100, 100, 100, 50);
         text.setVisible(true);
         x.setBounds(150, 150, 100, 50);
         x.addActionListener(new things());
         jpa.add(x);
         jpa.add(text);
         f.add(jpa);
         f.setVisible(true);
	}
}
