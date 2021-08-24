package com.test01;

public class MethodTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//static 
		publicMethod();
		protectedMethod();
		MethodTest01.defaultMethod();
		privateMethod();
		
		//nonstatic
		MethodTest01 mt01=new MethodTest01();
		mt01.NonStaticMethod();
		
	}
	
	
	//접근제한자(ex public)
	//public:어디서나 접근 가능 ( +)
	//static 준비과정이 필요x
	public static void publicMethod() {
		System.out.println("publicMethod");
		
		
	}
	
	//상속일 경우 상속된 곳에서 ( #)
	//상속이 아닌경우 같은 패키지 안에서
	protected static void protectedMethod() {
		
		System.out.println("protectedMethod");
		
	}
	
	//같은 패키지 내에서
	static void defaultMethod() {
		
		System.out.println("defaultMethod");
		
	}
	
	//현재 클래스 안에서만( -)
	private static void privateMethod() {
		
		System.out.println("privateMethod");
		
	}
	
	public void NonStaticMethod() {
		
		System.out.println("NonStaticMethod");
		
	}
	
}
