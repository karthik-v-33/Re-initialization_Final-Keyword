package com.GitHub_Updates;

public class FinalKeyWord {

	public static void main(String[] args) {
		int a=20;//declare and initialization
		System.out.println(a);
		a=40;//re-initialization
		System.out.println(a);
		a=80;//re-initialization
		System.out.println(a);
		
		final int b=30;//using final keyword variable value can't be changed
		System.out.println(b);
		
		/*Can't override due to final keyword
		b=40;
		System.out.println(b);*/
	}

}
