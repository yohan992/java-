package com.test01;

import java.util.Scanner;

public class IfTest02 {
	
	//둘중 한개를 선택하는 조건문
	public void test() {
		
		int i=20;
		
		if(i<10)
			System.out.println(i+"은 10보다 작음");
		else
			System.out.println(i+"은 10보다 크거나 같음");
		
		
		
		
	}
	
	
	//숫자를 하나 입력받아 홀수짝수인지 출력
	public void test2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		if(num%2==0)
			System.out.println("짝수");
		else
			System.out.println("홀수");
		
		
	}
	
	//50보다크면 짝,홀수 판단 출력
	//50보다 작으면 작다고 출력
	public void test3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0보다 큰 정수 입력 : ");
		int num = sc.nextInt();
		
		if(num>50) {
			
			if(num%2==0)
				System.out.println("짝수");
			else
				System.out.println("홀수");
			
		}
		else
			System.out.println("작다");
			
		
	}
	
	
	//숫자를 하나 입력 받아 양수인지 음수인지 출력
	//0이면 0출력
	public void test4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int i = sc.nextInt();
		
		if(i>0)
			System.out.println("양수");
		else if(i==0)
			System.out.println("0");
		else 
			System.out.println("음수");
		
	}

}
