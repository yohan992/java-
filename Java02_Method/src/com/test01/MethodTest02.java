package com.test01;

public class MethodTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*method 호출방법
		 * static : class.method();
		*/
		
		MethodTest01.publicMethod();
		MethodTest01.protectedMethod();
		MethodTest01.defaultMethod();
		//MethodTest01.privateMethod(); 같은 클래스 안에서만 사용가능
		
		//non static
		MethodTest01 method01 = new MethodTest01();
		method01.NonStaticMethod();
	}

}
