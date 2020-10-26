package saas;

import java.util.Scanner;

public class qu3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);       
        String str = scanner.next();
               
        int pos=dot_pos(str);
                   
        String front=str.substring(0, pos);
        String back=str.substring(pos+1,str.length());
        
        
        
        int num=0;
        for(int i=0;i<back.length();i++){
            if(back.charAt(i)=='0') { 
            	num++;
            }
            else break;
        }
        
        back=back.substring(num,back.length());
        
        int num1=0;
        for(int i=front.length()-1;i>=0;i--){
            if(front.charAt(i)=='0') {
            	num1++;
            }
            else break;
        }
        
       

        for(int i=0;i<5;i++){
            if(i>back.length()-1){
                back+="#";
            }
        }
       
        
        front=front.substring(0, front.length()-num1);
        System.out.print(back+"."+front);        
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

}


