package com.test01;

public class Variable01 {
	public static void main(String[] args) {
		//타입 변수명= 값
		
		// 1. 메소드 실행 준비
		Variable01 test= new Variable01();
		//클래스명 변수명 = new 클래스명();
		
		// 2. 메소드 실행
		test.declareVariable();
		//변수명.메소드명();
		
		test.initVariable();
	}
	
	public void declareVariable() {
		
		//정수
		byte bnum;
		short snum;
		int inum;
		long lnum;
		
		//실수
		float fnum;
		double dnum;
		
		//논리
		boolean isTrue;
		
		//문자형
		char ch;
		
		//문자열
		String str;
		
		//---------------------------
		
		bnum=1;
		snum=2;
		inum=4;
		lnum=8l;
		
		fnum=4.0f;
		dnum=8.0;
		
		isTrue=false;
				
		ch='A';
		
		str="abcd";
		//-----------------------------
		System.out.println(bnum);
		System.out.println(snum);
		System.out.println(inum);
		System.out.println(lnum);
		System.out.println(fnum);
		System.out.println(dnum);
		System.out.println(isTrue);
		System.out.println(ch);
		System.out.println(str);
		
		
	}
	
	public void initVariable(){
		
		//정수
		byte bnum=1;
		short snum=2;
		int inum=4;
		long lnum=8l;
				
		//실수
		float fnum=4.0f;
		double dnum=8.0;
				
		//논리
		boolean isTrue=false;
				
		//문자형
		char ch='A';
				
		//문자열
		String str="안녕하세요";
		
		System.out.println(bnum);
		System.out.println(snum);
		System.out.println(inum);
		System.out.println(lnum);
		System.out.println(fnum);
		System.out.println(dnum);
		System.out.println(isTrue);
		System.out.println(ch);
		System.out.println(str);
		
	}
	
}
