import java.util.Formatter;
import java.util.Scanner;

public class dick {

	static Formatter x;
	static Scanner scn;

	public static void main(String args[]){
		try{
			x = new Formatter("res//1.txt");
			scn = new Scanner("System.in");
			System.out.println("Where age ?");
			int a = (int)Double.ParseDouble(scn.next());
			System.out.println("Where is name ?");
			String b = scn.next();
			System.out.println("Where is home ?");
			String c = scn.next();
			x.format("Name %s, age %d, im home in %s",b,a,c);
			x.Close();
		}catch(Exception e){};
	}

}