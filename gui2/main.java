package by.gui2;

import javax.swing.JFrame;

public class main {
	public static void main(String args[]){
		GUI g = new GUI("GUI Form");
		g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		g.setResizable(false);
		g.setLocationRelativeTo(null);
		g.setSize(300,200);
		g.setVisible(true);
	}

}
