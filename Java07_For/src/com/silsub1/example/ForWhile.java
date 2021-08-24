package com.silsub1.example;

import java.util.Scanner;

public class ForWhile {
	
	
	Scanner sc = new Scanner(System.in);
	
	public void printStar1() {
		
		System.out.print("정수 하나 입력 : ");
		int i=sc.nextInt();
		
		for(int j=0;j<i;j++) {
			for(int k=0;k<=j;k++)
			{
				if(k==j)
					System.out.println(k+1);
				else	
					System.out.print("*");
			}
		}
		
	}
	
	public void printStar2() {
		
		System.out.print("정수 입력 : ");
		int i=sc.nextInt();
		
		if(i>0) {
			for(int j=0;j<i;j++) {
				for(int k=0;k<=j;k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		else if(i<0) {
			for(int j=0;j>i;j--) {
				for(int k=i;k<j;k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		else
			System.out.println("출력기능이 없습니다.");
	}

	public void countInputCharacter() {
		System.out.print("문자열 입력 : ");
		String s=sc.next();
		System.out.print("문자 입력 : ");
		char c=sc.next().charAt(0);
		
		int count=0;
		
		
		for(int i=0;i<s.length();i++) {
			if(c==s.charAt(i))
				count++;
			
			if(s.charAt(i)<'A'||s.charAt(i)>'z'){
				System.out.println("영문자가 아닙니다.");
				count=-1;
				break;
			}
		}
		if(count!=-1)
			System.out.printf("포함된 갯수 : %d 개",count);
	}
}
