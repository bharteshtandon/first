package saas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		boolean k=false;
		
		if(a+b>c) {
			System.out.println("its a traingle");
			k= true;
			
		}
		else {

		     System.out.println("not tringle");	}
		
		if(k==true) {
		
		 if(a*a + b*b == c*c) {			
			System.out.println("its a right tringle");			
		}
		
		 else if(a==b||b==c||a==c) {
			System.out.println("its a isocellesec tringle");
		}
		 
		 
		}
		
		
		
		
		
		

	}

}
