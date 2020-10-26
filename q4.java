package saas;

import java.util.Scanner;

public class q4 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		int l=Akerman(x,y);
		
		System.out.println(l);
		
		

	}
	
	public static int Akerman(int x,int y) {
		
		if(x==0) { return (y+1); }
		else if(y==0) { return Akerman(x-1,1);}
		
		else {return Akerman(x-1,Akerman(x,y-1));}
		
	
		
	}

}
