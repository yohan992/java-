package com.example2;

import java.util.Scanner;


public class CastingSample {
	
	Scanner sc = new Scanner(System.in);
	
	public void printUniCode() {
		
		System.out.print("문자 입력: ");
		
		char c=sc.next().charAt(0);
		
		System.out.printf("%c is unicode : %d\n",c,(int)c);
		
	}
	
	public void calculatorScore() {
		
		
		System.out.print("국어 : ");
		double a=sc.nextDouble();
		
		System.out.print("영어 : ");
		double b=sc.nextDouble();
		
		System.out.print("수학 : ");
		double c=sc.nextDouble();
		
		System.out.printf("총점 : %d\n평균 : %d",(int)(a+b+c),(int)(a+b+c)/3);
		
	}
}
