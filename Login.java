package javaclasssheji;
import java.awt.BorderLayout;
import java.awt.color.*;
import javax.swing.*;
public class Login {
    public static void main(String arge[]) {
    	 JFrame f = new JFrame("Login");
    	 f.setSize(500, 300);
         f.setLocation(200, 200);
         f.setLayout(null);
         JButton x = new JButton("Login");
         JPanel jpa = new JPanel();
         jpa.add(x);
         f.setContentPane(jpa);
         f.setVisible(true);
    }
}
