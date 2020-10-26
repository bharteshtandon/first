package saas;

import java.util.Scanner;

public class q10 {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		System.out.println("enter h and v");
		Scanner sc = new Scanner(System.in);
		
		int v=sc.nextInt();
		int h=sc.nextInt();
		System.out.println("enter the cordinates");
		
		int[][] ver = new int[10][3];
		int[][] hor = new int[10][3];
		
		for(int i=0;i<v;i++) {
			for(int j=0;j<3;j++) {
				ver[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<h;i++) {
			for(int j=0;j<3;j++) {
				hor[i][j]=sc.nextInt();
			}
		}
		
		int count=0;
		
		for(int i=0;i<h;i++)
	    {
	        for(int j=0;j<v;j++)
	        {
	            if( (hor[i][1] <= ver[j][0]) && (ver[j][0] <= hor[i][2]) && (ver[j][1] <= hor[i][0]) && (hor[i][0] <= ver[j][2]) )
	            count++;
	        }
	    }
		
		System.out.println(count);
		
		
		
		
		
		

	}

}
