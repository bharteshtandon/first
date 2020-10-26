package saas;

import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int k=dot_pos(str);
		
		System.out.println(k);
		
		StringBuffer G=ending_string(str, k);
		StringBuffer J=starting_string(str);
		
		
		System.out.println(front);
		
		int num=0;		
		for(int i=0;i<J.length();i++) {
			if(J.charAt(i)=='0') num++;
			else break;
			
		}
		
		J=J.substring(0, J.length()-num);
		
		
		num=0;
		int i = 0;
		for(i=G.length()-1;i>=0;i--) {
			if(G.charAt(i)=='0')num++;
			else break;
		}
		G=G.substring(num, G.length());
		
		

	}
	
	
	public static int dot_pos(String str) {		
		
        int n=str.length();
        int i=0;
		for(i=0;i<n;i++) {
		 if(str.charAt(i)=='.') {
			break;
		}
		}
	  return i;
	}
	
	public static StringBuffer starting_string(String str) {
		StringBuffer start= new StringBuffer();
		int i=0;
		while(str.charAt(i)!='.') {
			start.append(str.charAt(i));
			i++;
		}
		
			return start;		
	}
	public static StringBuffer ending_string(String str,int position) {
		StringBuffer end= new StringBuffer();
		int i=0;
		for(i=position+1;i<=str.length();i++) {
			end.append(str.charAt(i));
		}	
		
		return end;		
	}	

}
