package org.program;

public class SwapAll {
	public static void main(String[] args) {
		String s="welcome to java class";
		String emp="";
		String space=" ";
		String[] res=s.split(" ");
		System.out.println(res.length);
		for (int i =res.length-1; i>=0; i--) {
			
			emp=emp+res[i]+" ";
			
			
		
		}
		
		System.out.println(emp);
	}

}
