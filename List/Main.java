package by.jh;

import java.util.ArrayList;
import java.util.Random;

public class Main {
	private static ArrayList<Mobile> mobiles = new ArrayList<Mobile>();
	private static Random r = new Random();
	
// 2 вариант	
//	private static Mobile[] mobiles = new Mobile[3];
	
// 1 вариант	
//	private static String[][] mobiles= {
//		{"IPhone","12332112"},
//		{"IPhone","22222222"},
//		{"IPhone","33333333"}
///};
	
	public static void main(String[] args){
	//	for(int i=0;i<mobiles.length;i++){
	//		for(int k=0;k<mobiles[i].length;k++){
	//			System.out.println(mobiles[i][k]+ " ");
	//		}
	//		System.out.println();
	//	}
	
//		mobiles[0] = new Mobile(1234567,"IPhone");
//		mobiles[1] = new Mobile(1234567,"Samsung");
//		mobiles[2] = new Mobile(1234567,"Nokia");
//		for(Mobile m:mobiles){
//			System.out.println(m.getNumber()+" "+m.getName());
//		}
		for(int i=0;i<300;i++){
			mobiles.add(new Mobile(r.nextInt(9999999),"sdfsdfs"));
		}
		int x=0;
		for(Mobile m:mobiles){
			x++;
			System.out.println(m.getNumber()+" "+m.getName()+ " "+x);
		}
	}

}
 