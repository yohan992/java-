package com.test02;

public class Test {
	
	public void test01(int i) {
		
		if(i%5==0)
			System.out.println("5의 배수");
		else
			System.out.println("5의 배수가 아니다");
	}
	
	public void test02(int i) {
		
		if(i%2==0&&i%3==0)
			System.out.println("2와 3의 배수");
		else
			System.out.println("2와 3의 배수가 아니다");
	}
	
	public void test03(char c) {
		
		if(c>='a'&&c<='z')
			System.out.println("소문자 입니다");
		else
			System.out.println("대문자 입니다");
		
		//Character.isUpperCase(c); 대문자 판별
		//Character.isLowerCase(c); 소문자 판별
	}
	

}
