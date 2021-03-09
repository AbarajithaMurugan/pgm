package org.program;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TwoArray {
	 public static void main(String[] args) {
	 int a[]= {50,20,30};
	 int b[]= {80,60,10,40,45};
List<Integer>li=new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			
			
				li.add(a[i]);
		}
		for (int j = 0; j < b.length; j++) {
				li.add(b[j]);
				
			}
		//System.out.println(li);
	
		int[] arr=new int[li.size()];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=li.get(i);
			//System.out.println(arr[i]);
		}
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length; j++) {
			if (arr[i]<arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}}}
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			
			
		
		
	}
		
}}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//		System.arraycopy(a, 0, arr, 0, i1);
//		System.arraycopy(b, 0, arr, i1, i2);
	
	
		 
		 
	


			


