package com.test01;

import java.util.Scanner;

public class SwitchTest01 {

	public void test() {
		
		int i=1;
		
		switch(i) {
		
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		default:
			System.out.println("다른 숫자");
			break;
			
		}
		
	}
	
	public void test2() {
		
		char ch='a';
		
		switch(ch) {
		
		case 'a':
			System.out.println("a");
			break;
		case 'b':
			System.out.println("b");
			break;
		case 'c':
			System.out.println("c");
			break;
		default:
			System.out.println("다른 알파벳");
		
		}
		
		
			
		}
	
	public void test3() {
		
		int i=10;
		
		switch(i) {
		
		case 1:
		case 3:
		case 5:
			System.out.println("홀");
			break;
		case 2:
		case 4:
		case 6:
			System.out.println("짝");
			break;
		
		
		}
			
	}
	
	public void test4() {
		
		String s ="한국";
		
		switch(s) {
		
		case "한국":
			System.out.println("kor");
			break;
		case "미국":
			System.out.println("usa");
			break;
		case "영국":
			System.out.println("uk");
			break;
		default:
			System.out.println("다른 나라");
		
		}
		
		
	}

	public void test5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월 입력 : ");
		int i = sc.nextInt();

		while(i>12 || i<1) {
			
			System.out.print("다시 입력 하시오 (1~12) : ");
			i=sc.nextInt();
		}
		
		switch(i) {
		
		case 1:
		case 2:
		case 12:
			System.out.println("겨울");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		default:
			System.out.println("가을");
			
		
		}
		
		
	}
}
