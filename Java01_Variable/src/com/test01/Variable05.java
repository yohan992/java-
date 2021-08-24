package com.test01;

public class Variable05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Variable05 test = new Variable05();
		
		test.test1();
		test.test2();
		test.test3();

	}
	
	//형변환
	public void test1() {
		
		boolean flag=true;
		//flag=(boolean)100; boolean 자료형은 무조건 true,false만 가능(형변환 예외)
		
		int num = 'b';
		System.out.println(num);
		
		char ch = 98;
		System.out.println(ch);
		
		char ch2 = (char)num;
		System.out.println(ch2);
		
		int num2 = -98;
		char ch3= (char)num2;
		System.out.println(ch3);
	}
	
	public void test2() {
		
		int num=10;
		long lnum=100;
		
		int isum=num+(int)lnum;
		
		//--------------
		
		byte bnum = 1;
		short snum = 2;
		short sum = (short)(bnum+snum);
		int sum2 =bnum+snum;
		
	}
	
	public void test3() {
		
		long lnum = 100;
		
		float fnum=lnum;
		
		System.out.println(fnum);
		
		double dnum=12.3;
		
		int inum=(int)dnum;
		
		System.out.println(inum);
	}
	
}
