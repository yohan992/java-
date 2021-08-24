package com.practice;

import java.util.Scanner;

public class Example {
	
	Scanner sc = new Scanner(System.in);
	
	public void sample1() {
		
		System.out.print("국어 : ");
		int a=sc.nextInt();
		
		System.out.print("영어 : ");
		int b=sc.nextInt();
		
		System.out.print("수학 : ");
		int c=sc.nextInt();
		
		int sum=a+b+c;
		double avg=(a+b+c)/3.;
		
		String s=a>=40&&b>=40&&c>=40&&avg>=60?"합격":"불합격";
		System.out.println(s);
		
	}
	
	public void sample2() {
		

		System.out.print("학생이름 :");
		String name=sc.next();
		
		System.out.print("학년 :");
		int grade=sc.nextInt();
		
		System.out.print("반 :");
		int Class=sc.nextInt();
		
		System.out.print("번호 : ");
		int num=sc.nextInt();
		
		System.out.print("성별(M/F) : ");
		char gender=sc.next().charAt(0);
		
		System.out.print("성적(소수점 둘째자리까지) : ");
		double record=sc.nextDouble();
		
		String s=gender=='M'||gender=='m'?"남학생":"여학생";
		System.out.printf("%d학년 %d반 %d번 %s %s은 성적이 %.2f이다.",grade,Class,num,s,name,record);
		
	}
	
	public void sample3() {
		
		System.out.print("정수 입력 : ");
		int a=sc.nextInt();
		
		String s=a>0?"양수 O":"양수 X";
		System.out.println(s);
		
	}
	
	public void sample4() {
		
		System.out.print("정수 입력 : ");
		int a=sc.nextInt();
		
		String s=a%2==0?"짝수 O":"짝수 X";
		System.out.println(s);
	}
	
}
