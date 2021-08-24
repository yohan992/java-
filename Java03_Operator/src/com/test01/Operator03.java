package com.test01;

import java.util.Scanner;

public class Operator03 {

	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operator03 op=new Operator03();
		
		//op.opTest1();
		
		op.opTest2();
	}
	
	public void opTest1() {
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		// &&
		
		System.out.println("1~100사이인지 확인 : "+(num>=1 && num <=100));
		
		System.out.print("문자 입력: ");
		char ch= sc.next().charAt(0);
		
		System.out.println("대문자인지 확인 "+ (ch>='A' && ch<='Z'));
		
		// ||
		
		System.out.print("y or Y: ");
		char ch2 = sc.next().charAt(0);
		
		String s=(ch2=='y'||ch=='Y')?"계속...":"중지...";
		
		System.out.println(s);
	}
	
	public void opTest2() {
		
		int num = 10;
		
		int res=(false&&++num==0)?num:num;
		
		System.out.println(res);
		
	}

}
