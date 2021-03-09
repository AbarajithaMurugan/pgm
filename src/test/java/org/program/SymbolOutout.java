package org.program;

public class SymbolOutout {
	public static void main(String[] args) {
		
		String s="abarajitha";
		String s1="";
		char ch='@';
		int co=0;
		for (int i = 0; i < s.length(); i++) {
		char c = s.charAt(i);
		if (c=='a') {
			co++;
			for (int j = 0; j <co; j++) {
				s1=s1+ch;
						
			}
			
		} else {
			s1=s1+c;

		}
		
			
		}System.out.println(s1);
		
	}

}
