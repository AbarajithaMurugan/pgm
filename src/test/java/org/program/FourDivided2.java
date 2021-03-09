package org.program;

import com.google.common.base.CaseFormat;

public class FourDivided2 {
	public static void main(String[] args) {
	String s="6+6-4/2";
   char[] c=s.toCharArray();
   System.out.println(c);
   char d=c[0];
   System.out.println(d);
   int n0=Character.getNumericValue(d);
   for (int i = 0; i < c.length; i++) {
	   char e=c[i];
	   switch (e) {
	case '+':
		int n1=Character.getNumericValue(c[i+1]);
		n0=n0+n1;
		System.out.println(n0);
		break;
	   
	     
			case '-':
				int n2=Character.getNumericValue(c[i+1]);
				n0=n0-n2;
				System.out.println(n0);
				
				break;

			case '/':
				int n3=Character.getNumericValue(c[i+1]);
				n0=n0/n3;
				System.out.println(n0);
				
				break;

			
			
		
		   
	


	
	
}}}}