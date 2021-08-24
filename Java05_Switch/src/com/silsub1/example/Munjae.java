package com.silsub1.example;

import java.util.Scanner;

public class Munjae {
	
		Scanner sc = new Scanner(System.in);
	
	public void test1() {
		
		
		
		System.out.print("국어 점수 : ");
		int i = sc.nextInt();
		
		System.out.print("영어 점수 : ");
		int j = sc.nextInt();
		
		System.out.print("수학 점수 : ");
		int k = sc.nextInt();
		
		double avg=(i+j+k)/3;
		
		if(i>=40&&j>=40&&k>=40&&avg>=60) {
			System.out.println("합격");
			System.out.printf("국어 %d점 영어 %d점 수학 %d점 평균 %.2f점\n",i,j,k,avg);
		}
		else
			System.out.println("불합격");
		
	}
	
	public void test2() {
		
		System.out.printf("1. 입력\n2. 수정\n3. 조회\n4. 삭제\n7. 종료\n");
		System.out.print("메뉴번호 입력 : ");
		int i = sc.nextInt();
		
		
		
		while(i!=1&&i!=2&&i!=3&&i!=4&&i!=7) {
			System.out.println("다시 입력하십시오");
			i=sc.nextInt();
		}
		
		switch(i) {
		case 1:
			System.out.println("입력메뉴가 선택되었습니다");
			break;
		case 2:
			System.out.println("수정메뉴가 선택되었습니다");
			break;
		case 3:
			System.out.println("조회메뉴가 선택되었습니다");
			break;
		case 4:
			System.out.println("삭제메뉴가 선택되었습니다");
			break;
		case 7:
			System.out.println("프로그램이 종료됩니다");
			break;
		
		}
		
	}
	
	public void test3() {
		
		System.out.print("정수 입력 : ");
		int i = sc.nextInt();
		
		if(i>0)
			System.out.println("양수");
		else
			System.out.println("양수가 아님");
		
	}
	
	public void test4() {
		
		String s;
		
		System.out.print("정수 입력 : ");
		int i = sc.nextInt();
		
		if(i>0) {
			if(i%2==0) {
				s="짝수";
				System.out.println(s);
			}
			else {
				s="홀수";
				System.out.println(s);
			}
		}
			
		
	}
	
	public void inputTest() {
		System.out.print("이름 : ");
		String name=sc.next();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("키 : ");
		double h=sc.nextDouble();
		
		if(name!=null&&age>0&&h>0)
			System.out.printf("확인 : %s의 나이는 %d세이고, 키는 %.1f 이다.",name,age,h);
		
	}
	
	public void test6() {
		
		System.out.print("정수 입력(1) : ");
		int i=sc.nextInt();
		System.out.print("정수 입력(2) : ");
		int j=sc.nextInt();
		
		if(i>0 && j>0) {
			System.out.printf("%d + %d = %d\n",i,j,i+j);
			System.out.printf("%d - %d = %d\n",i,j,i-j);
			System.out.printf("%d * %d = %d\n",i,j,i*j);
			System.out.printf("%d / %d = %d\n",i,j,i/j);
			System.out.printf("%d %% %d = %d\n",i,j,i%j);
			
		}
		
	}

	public void test7() {
		
		System.out.print("점수 입력 : ");
		int grade = sc.nextInt();
		char ch;
		
		if(grade>0) {
			if(grade>=90)
				ch='A';
			else if(grade>=80)
				ch='B';
			else if(grade>=70)
				ch='C';
			else if(grade>=60)
				ch='D';
			else
				ch='F';
			
			System.out.printf("점수는 %d점 학점은 %c\n",grade,ch);
		}
		
	}
	
}
