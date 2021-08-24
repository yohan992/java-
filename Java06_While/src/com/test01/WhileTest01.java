package com.test01;

import java.util.Scanner;

public class WhileTest01 {
	
	
	
	public static void main(String[] args) {
		
		//test1();
		//test2();
		//test3();
		test5();
	}
	
	public static void test1() {
		
		int i=1;
		
		while(i<10) {
			
			System.out.println(i+"번째...");
			i++;
			
		}
		
		System.out.println("i값 : "+i);
		
	}
	
	public static void test2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String s = sc.next();
		
		for(int i=0;i<5;i++) {
			System.out.println(s.charAt(i));
		}
	
	}

	//1부터 입력받은 수까지의 정수들의 합
	public static void test3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int i=sc.nextInt();

		int j=1;
		int sum=0;
		
		while(j<=i) {
			
			sum+=j;
			j++;
		}
		
		System.out.println(sum);
		
	}
	
	
	//4입력되면 반복종료
	public static void test5() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("숫자 입력 : ");
			int i=sc.nextInt();
			
			if(i==4) {
				
				System.out.println("종료");
				break;
				
			}
			
			
			
		}
		
	}
	
}
