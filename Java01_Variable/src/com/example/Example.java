package com.example;

import java.util.Scanner;


public class Example {
	
	public void example1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수: ");
		int a = sc.nextInt();
		
		System.out.print("두번째 정수: ");
		int b = sc.nextInt();
		
		System.out.println("더하기 결과: "+(a+b));
		System.out.println("빼기 결과: "+(a-b));
		System.out.println("곱하기 결과: "+(a*b));
		System.out.println("나누기 결과: "+(a/b));
		System.out.println("나누기 나머지 결과: "+(a%b));
		
	}
	
	public void example2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로: ");
		double a = sc.nextDouble();
	
		System.out.print("세로: ");
		double b = sc.nextDouble();
		
		System.out.println("면적: "+(a*b));
		System.out.println("둘레: "+((a+b)*2));
		
		
	}
	
	public void example3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하시오: ");
		String s=sc.next();
		
		System.out.println("첫번쨰 문자: "+s.charAt(0));
		System.out.println("두번쨰 문자: "+s.charAt(1));
		System.out.println("세번쨰 문자: "+s.charAt(2));
	}
	
}
