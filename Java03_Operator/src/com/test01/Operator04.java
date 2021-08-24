package com.test01;

import java.util.Scanner;

public class Operator04 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		opTest();
		
	}
	
	public static void opTest() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int a=sc.nextInt();
		
		String res = (a>0)?"양수":(a==0)?"0":"양수가 아니다";
		
		System.out.println(res);
		
	}

}
