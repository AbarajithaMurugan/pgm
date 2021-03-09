package org.program;

public class StringSort {
	public static void main(String[] args) {
		String s = "amazon is a product based company";
		String s1 = "";
		String[] split = s.split(" ");
		for (int i = 0; i < split.length; i++) {
			String st1 = split[i];
			for (int j = 0; j < split.length; j++) {
				String st2 = split[j];

				if (st1.length() < st2.length()) {
					String temp = split[i];
					split[i] = split[j];
					split[j] = temp;
				} 
				else if (st1.length() == st2.length()) {
					int compareTo = st1.compareTo(st2);
					if (compareTo <= 0) {
						String temp = split[i];
						split[i] = split[j];
						split[j] = temp;
					}
				}
			}
		}
		for (int i = 0; i < split.length; i++) {
			s1 = s1 + split[i] + " ";
		}
		System.out.println(s1);
	}
}
