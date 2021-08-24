package com.test01;

public class Variable04 {

	public static void main(String[] args) {
		
		Variable04 test = new Variable04();
		
		test.printVarSize();
		test.testOverflow();
	}
	
	//변수의 사이즈 출력용 메소드
	
	public void printVarSize() {
		
		System.out.println("byte: "+Byte.BYTES+"byte");
		System.out.println("short: "+Short.BYTES+"byte");
		System.out.println("int: "+Integer.BYTES+"byte");
		
		System.out.println("float: "+Float.BYTES+"byte");
		System.out.println("double: "+Double.BYTES+"byte");
		
		System.out.println("char: "+Character.BYTES+"byte");
	}
	
	public void testOverflow() {
		
		//byte bnum=128;  byte 표현범위를 넘어버림
		
		byte bnum=127;
		bnum = (byte)(bnum+1);
		
		System.out.println(bnum);
		
	}
	
	
	
}
