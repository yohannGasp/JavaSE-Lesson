package proj1;

import java.util.*;

public class thr {
	public static void main(String[] args){
		
		Thread t1 = new Thread(new pussy("1"));
		Thread t2 = new Thread(new pussy("2")); 
		Thread t3 = new Thread(new pussy("3")); 
		
		(new Thread(new pussy("4"))).start();
		t1.start();
		t2.start();
		t3.start();
	}

}

class pussy implements Runnable{
	int time;
	String name;
	Random r = new Random();
		
	public pussy (String name){
		this.name = name;
		this.time = r.nextInt(999);
	}
	
	public void run() {
			System.out.println("Поток "+name+" спит "+time+"\n");
		try{
			Thread.sleep(time);
		}catch(Exception e){}
		System.out.println("Поток "+name+" проснулся и закончился\n");
	}
	
}