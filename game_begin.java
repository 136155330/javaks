package javaclasssheji;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class game_begin {
	JFrame f = new JFrame("begin");
	private class things implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			f.setVisible(false);
			
		}
	}
	private class thing implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			f.setVisible(false);
			
		}
		
	}
	public game_begin(){
		 f.setBounds(0, 0, 700, 700);
         f.setLayout(null);
         f.setVisible(true);
         /*
          * ����Ҫʵ�ֶ�ȡ�浵������Ϸ
          * */
         JPanel J1 = new JPanel();
         J1.setBounds(0, 0, 500, 500);
         JButton x1, x2;
         x1 = new JButton("�½��浵");
         x2 = new JButton("��ȡ�浵");
         x1.setBounds(250, 250, 100, 50);
         x2.setBounds(250, 300, 100, 50);
         J1.add(x1);
         J1.add(x2);
         f.add(x1);
         f.add(x2);
	}
}
