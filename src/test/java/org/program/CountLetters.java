package org.program;

public class CountLetters {
	public static void main(String[] args) {
		String s="the quick known fox jumps over the lazy dog";
		int count=0;int sum=0;
		 for(int i = 0; i < s.length(); i++) {    
	            if(s.charAt(i)==' ')    
	                count++;    
	            else if (s.charAt(i)!=0) {
					sum++;
				}
	        }   
		 System.out.println(count+sum);
			
		}
	}


