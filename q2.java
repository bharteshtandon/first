package saas;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String k="hkjjgvkdj bnkrjnfrj jrnbnkjrnf rjfnej rjfj nfjrnfjrfnfjnfenfj  jkfnejkff knfe 56kkn jiigg kmgr";
		
		int n=k.length();
		int count=0;
		
		for(int i=0;i<n;i++) {
			if(k.charAt(i)==' '&&k.charAt(i+1)!=' ') {
				count++;
			}
		}
		
		System.out.println(count+1);		

	}

}
