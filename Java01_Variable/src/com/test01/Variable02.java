package com.test01;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//전역선언

public class Variable02 {

	public static void main(String[] args){
		
		Variable02 test = new Variable02();
		
		//test.input1();
		test.input2();
		
	}
	
	
	public void input1() {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//한번에 다같이 선언 InputStreamReader를 따로 참조선언 안해줘도됨
		
		System.out.print("정수 값 한 개를 입력 하세요: ");
		
		String value;
		
		try {
			value = br.readLine();
			
			//System.out.println("계산 결과: "+(value*3)); 문자열변수타입이라 곱센연산이안됨
			
			int no = Integer.parseInt(value);
			
			System.out.println("께산 결과: "+(no*3));
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void input2() {
		
		//Scanner 클래스 이용

		java.util.Scanner sc = new java.util.Scanner(System.in);
		//지역선언
		
		System.out.print("name: ");
		String name = sc.nextLine();
		
		System.out.print("Age: ");
		int age= sc.nextInt();
		
		System.out.print("height(소수점 첫째 자리까지): ");
		double height = sc.nextDouble();
		
		System.out.print("gender(F/M): ");
		char gender=sc.next().charAt(0);
		
		
		System.out.println(name+"님은 " +age+"세, 키는"+height+"cm, 성별은 "+gender);
		
	}
	
	
	
}

