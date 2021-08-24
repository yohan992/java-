package com.test01;

import java.util.Scanner;

public class WhileTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//test1();
		test2();
		
	}
	
	public static void test1() {
		
		int i=1;
		
		do {
			System.out.println(i);
			i++;
		}while(i<10);
		
		System.out.println("최종 i : "+i);
		
	}
	
	
	//키보드로 영어문자열 입력,출력, "exit" 입력되면 종료
	public static void test2() {
		
		Scanner sc=new Scanner(System.in);
		String s;
		
		do {
			System.out.print("문자열 입력 : ");
			s=sc.next();
			System.out.println(s);
		}while(!s.equals("exit"));
	}
	
	
	public static void test3() {
		
		Scanner sc=new Scanner(System.in);
		String s=null;
		
		
		do {
			
			System.out.println("문자열 입력 : ");
			s=sc.next();
			if(s.equals("exit"))
				break;
			
			
		}while(true);
		
		
	}
	
}
