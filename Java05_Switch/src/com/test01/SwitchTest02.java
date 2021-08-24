package com.test01;

import java.util.Scanner;

public class SwitchTest02 {

	public void testSwitch() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int i=sc.nextInt();
		
		System.out.print("정수 입력 : ");
		int j=sc.nextInt();
		
		System.out.print("연산자 입력 : ");
		char c=sc.next().charAt(0);
		
		switch(c) {
		
		case '+':
			System.out.println(i+j);
			break;
		case '-':
			System.out.println(i-j);
			break;
		case '*':
			System.out.println(i*j);
			break;
		default:
			System.out.println(i/j);
		
		}
		
		
	}
	
	
}
