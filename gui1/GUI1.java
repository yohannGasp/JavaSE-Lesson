package by.gui1;

import javax.swing.JOptionPane;

public class GUI1 {
	private int i,k;
	private String n1,n2;
	
	public void Scan(){
		n1 = JOptionPane.showInputDialog("Введите первое число");
		n2 = JOptionPane.showInputDialog("Введите второе число");
		Set(Integer.parseInt(n1),Integer.parseInt(n2));
	} 
	public void Set(int a,int b){
		i = a;
		k = b;
	}
	
	public void Get(){
		JOptionPane.showMessageDialog(null, i);
		JOptionPane.showMessageDialog(null, k);
	} 


}

