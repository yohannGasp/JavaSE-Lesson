package by.gui2;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


public class GUI extends JFrame {
	int i,k;
	String a,b;
	JLabel l1;
	JButton b1,b2;
	JTextField t1,t2;
	eHandler handler = new eHandler();
	
	public GUI(String s){
		super(s);
		setLayout(new FlowLayout());
		b1 = new JButton("Считать");
		b2 = new JButton("Очистить");
		l1 = new JLabel("text");
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		
		add(b1);
		add(b2);
		add(t1);
		add(t2);
		add(l1);
		
		b1.addActionListener(new eHandler());
		b2.addActionListener(handler);
		
	}
	
	public class eHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try{
				if(e.getSource()==b1){
					i = Integer.parseInt(t1.getText());
					k = Integer.parseInt(t2.getText());
					i++;
					k++;
					a = "= " + i;
					b = "= " + k;
					t1.setText(a);
					t2.setText(b);
					l1.setText("good");
				}
				if(e.getSource()==b2){
					t1.setText("");
					t2.setText("");
					l1.setText("");
				}
			}catch (Exception ex){JOptionPane.showMessageDialog(null, "Введите число");}
		}
		
	}
}
