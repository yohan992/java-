package com.test01;

import java.util.Scanner;

public class IfTest03 {
	
	//else if
	public void test() {
		
		int i=10, j=20;
		
		if(i>j) 
			System.out.printf("%d은 %d보다 크다\n",i,j);
		else if(i<j)
			System.out.printf("%d은 %d보다 작다\n",i,j);
		else
			System.out.println("같다");
	}
	
	
	//점수 하나 입력받아 등급을 나누어 점수와 등급을 출력
	public void test2() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int i=sc.nextInt();
		
		if(i>=90)
			System.out.println("A");
		else if(i<90&&i>=80)
			System.out.println("B");
		else if(i<80&&i>=70)
			System.out.println("C");
		else if(i<70&&i>=60)
			System.out.println("D");
		else
			System.out.println("F");
		
	}
	
	//위의 문제에서 각 등급별 중간점수 이상의 경우에는 +추가하여 출력
	public void test3() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int i=sc.nextInt();
		
		
		if(i>=90) {
			System.out.print("A");
			if(i>=95)
				System.out.println("+");
			else
				System.out.println();
		}
		else if(i>=80) {
			System.out.print("B");
			if(i>=85)
				System.out.println("+");
			else
				System.out.println();
			}
		else if(i>=70) {
			System.out.print("C");
			if(i>=75)
				System.out.println("+");
			else
				System.out.println();
		}
		else if(i>=60) {
			System.out.print("D");
			if(i>=65)
				System.out.println("+");
			else
				System.out.println();
		}
		else
			System.out.println("F");
		
	}
	
	
}
