package org.program;

public class AzarjipgmExtends extends azarjipgm{
	@Override
	public void method1() {
		System.err.println("456");
		super.method1();
	}
	public static void main(String[] args) {
		AzarjipgmExtends x=new AzarjipgmExtends();
		x.method1();
		
	}

}
