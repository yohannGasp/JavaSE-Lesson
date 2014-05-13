package proj1;

public class Main {

	public static void main(String args[]){
		int[] m = {21,12,33,14,25};
		int[] m1 = new int[5];
		int[][] m2 = new int[4][4];
		int [][] m3 = {{1,2},{2,1}};
		for(int row=0;row<m3.length;row++){
			for(int col=0;col<m3[row].length;col++)
				System.out.print(m3[row][col] + " ");
		}
		
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				m2[i][j]=i*j;
				System.out.print(m2[i][j]);
				try{
					Thread.sleep(1500);
				}catch(Exception e){} 
			}
			System.out.println();
		}
	}
	
	
}
