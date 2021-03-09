package org.program;

public class SecondLeast {
	public static void main(String[] args) {
		int a[]= {100,20,10,5,10,25};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					//System.out.println(a[j]);
				}}}
	for (int i = 0; i < a.length; i++) {
		//System.out.println(a[i]);
			
		}
	System.out.println(a[a.length-2]);
	}

}
