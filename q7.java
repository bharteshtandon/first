package saas;

import java.util.Arrays;
import java.util.Scanner;

public class q7 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter dimensions of the matrix");
		Scanner sc = new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[][] mat = new int[m][n];
		
		System.out.println("enter elements of the matrix");
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		print_mat(mat,m,n);
	
		int[] arr = new int[20];
		Arrays.fill(arr, 0);
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(mat[i][j]!=0) {arr[i]=2;} 
			}
		}
		int numof_0_rth=0;
		int i2=0;
		int i=0;
		
		int[][] newmat = new int[m][n];
		//row itteration
		for(i=0,i2=0;i<m;i++) {
			if(arr[i]==0) {
			   numof_0_rth++;
			   continue;}
			for(int j=0;j<n;j++) {
				newmat[i2][j]=mat[i][j];
			}
			i2++;
			
		}
		m=m-numof_0_rth;
		for(i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				mat[i][j]=newmat[i][j];
			}
		}
		
		//collum iteration 
		Arrays.fill(arr, 0);

		for(int j=0;j<n;j++) {
			for(i=0;i<m;i++) {
				if(mat[i][j]!=0) {
					arr[j]=2;
				}
			}
		}
		int numof_0_colm=0;
		
		for(int j=0,j21=0;j<n;j++) {
			if(arr[j]==0) {
				numof_0_colm++;
				continue;
			}
			for(i=0;i<m;i++) {
				newmat[i][j21]=mat[i][j];
			}
			j21++;
		}
		n=n-numof_0_colm;
		
		for(i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				mat[i][j]=newmat[i][j];
			}
		}
		
		for(i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(mat[i][j]);
			}
			System.out.println(" ");
		}		
		
		
	}

	
	public static void print_mat(int [][] mat,int m,int n) {
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(mat[i][j]);
			}
			System.out.println(" ");
		}
		
	}

}
