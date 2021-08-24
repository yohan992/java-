package com.test01;

import java.util.Scanner;

public class Operator01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//static 메소드
		//클래스명.메소드명();
		
		//test();
		
		Operator01 op = new Operator01();
		
		op.test2();
			
	}
	
	public static void test() {
		
		// !논리값 : 논리값을 반대로 바꾸는 연산자
		
		System.out.println("true 부정 : "+!true);
		System.out.println("false 부정 : "+!false);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		System.out.println("입력한 정수가 양수인가? "+(num>0));
		System.out.println("입력한 정수가 양수아닌가? "+!(num>0));
		
		
		System.out.println("입력한 정수가 짝수인가? "+(num%2==0));
		System.out.println("입력한 정수가 짝수가 아닌가? "+(num%2!=0));
		
	}
	
	public void test2() {
		
		//++, --
		
		int age=20;
		
		System.out.println("현재 나이 : "+age);
		
		System.out.println("++age 결과 : "+(++age));
		
		age++;
		System.out.println("++age 결과 : "+(age));
		
		System.out.println("++age 결과 : "+(--age));
		
		age--;
		System.out.println("++age 결과 : "+(age));
		
		//------------------------------------------
		//후위 연산자
		int num1=20;
		
		int res = num1++ *3;
		
		System.out.println("res : "+res);
		System.out.println("num1 : "+num1);
		
		//전위 연산자
		
		int num2=20;
		int res2=++num2*3;
		
		System.out.println("res2 : "+res2);
		System.out.println("num2 : "+num2);
		
	}

}
