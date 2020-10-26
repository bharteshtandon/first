package saas;

import java.util.Scanner;

public class q112 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter the dimension of maze m x m");
		Scanner sc1 =new Scanner(System.in);
		int m=sc1.nextInt();
		
		System.out.println("eneter the elements");
		String[][] mat = new String[m][m];
		
		Scanner sc2 =new Scanner(System.in);
		for(int i=0;i<m;i++) {
			for(int j=0;j<m;j++) {
				mat[i][j]=sc2.nextLine();
			}
		}
		
		int[][] sol = new int[m][m];
		for(int i=0;i<m;i++) {
			for(int j=0;j<m;j++) {
				sol[i][j]=0;
			}
		}
		
		int[][] pos = new int[2][2];
		for(int i=0;i<m;i++) {
			for(int j=0;j<m;j++) {
				if(mat[i][j]=="#") { //pos of starting point
					pos[0][0]=i;
					pos[0][1]=j;
				}
				else if(mat[i][j]=="@") {//pos ending
					pos[1][0]=i;
					pos[1][1]=j;
				}
			}
		}
		
		
		int k=maze_solve(mat,sol,m,pos[0][0],pos[0][1],pos);
		System.out.println(k);
		

	
	}
	
	public static int maze_solve(String mat[][],int sol[][],int m,int x,int y,int pos[][]) {	
		
		if(x==pos[1][0]&&y==pos[1][1]) {
			int count = 0;
			for(int i=0;i<m;i++) {
				for(int j=0;j<m;j++) {
					if(sol[i][j]==1) {
						count++;
					}
				}
			}
		   return count-1;
		}
		
		if(x>=m||x<0||y>=m||y<0||mat[x][y]=="0"||sol[x][y]==1) {
		   return 0;
		}
		
		sol[x][y]=1;
		maze_solve(mat,sol,m,x-1,y,pos);//upper
		maze_solve(mat,sol,m,x+1,y,pos);//down
		maze_solve(mat,sol,m,x,y+1,pos);//right
		maze_solve(mat,sol,m,x,y-1,pos);//left
		sol[x][y]=0;
		
	}
	

}
