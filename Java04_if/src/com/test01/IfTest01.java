package com.test01;

import java.util.Scanner;

public class IfTest01 {
	
	
	//단독 if문
	public void testIf() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		if(num%2==0)
			System.out.println("짝수");
		
		if(num%2!=0)
			System.out.println("홀수");
		
		
		System.out.println("종료");
		
	}
	
	
	
}
