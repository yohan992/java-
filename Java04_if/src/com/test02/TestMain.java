package com.test02;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner sc =new Scanner(System.in);
		
		//System.out.print("정수 입력 : ");
		//int i = sc.nextInt();
				
		//입력받은 수가 5의 배수이면 "5의 배수"출력
		new Test().test01(11);
		
		//입력 받은수가 2의배수이면서 3의배수이면 "2와 3의 배수입니다."를 출력
		new Test().test02(6);
		
		//입력받은 문자가 소문자라면 "소문자",대문자면 "대문자" 출력
		new Test().test03('A');
		
	}

}
