package saas;

import java.util.Scanner;

public class q12 {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter the dimenstion");
		
		Scanner scan =new Scanner(System.in);
		int m=scan.nextInt();
		int n=scan.nextInt();
		
		System.out.println("enter the values");
		
		String[][] mat = new String[m][n];
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				mat[i][j]= scan.toString();
			}
			
		}
		
		int[][] pos = new int[2][2];
		
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(mat[i][j]=="#") {
					pos[0][0]=i;
					pos[0][1]=j;
				}
				else if(mat[i][j]=="@") {
					pos[1][0]=i;
					pos[1][1]=j;
				}
			}
			
		}
		
		int x_dis= Math.abs(pos[0][0]-pos[1][0]);
		int y_dis= Math.abs(pos[0][1]-pos[1][1]);
		
		int ans=x_dis+y_dis;
		System.out.println(ans);
		
		

	}
	
	

}
