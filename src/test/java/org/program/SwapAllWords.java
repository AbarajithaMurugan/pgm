package org.program;

public class SwapAllWords {
	public static void main(String[] args) {
		int res=0;
		int rem;
		int num;
		int in;
	for (int i = 1; i <100; i++) {
		
		String s=String.valueOf(i);
		 in=s.length();
	 num=Integer.parseInt(s);
	 while(num>0) {
 rem=num%10;
	 res=res+(rem)^in;
	// System.out.println(res);
	 num=num/10;
	 
		
	 }
	 
	}System.out.println(res);	
	
	
	
	
	
	
	
	
		}

}
