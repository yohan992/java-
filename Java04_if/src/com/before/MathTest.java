package com.before;

import java.util.Random;

public class MathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MathTest test = new MathTest();
		
		//test.testMath();
		//test.testRandom();
		
		test.praRandom();
	}
	
	
	public void testMath() {
		
		System.out.println("PI"+Math.PI);
		
		System.out.println("-7의 절대값 : "+Math.abs(-7));
		
		System.out.println("-123.4의 절대값 : "+Math.abs(-123.4));
		
		System.out.println("난수 : "+Math.random());
		
		
	}
	
	public void testRandom() {
		
		//1~100
		int random = (int)(Math.random()*100)+1;
		
		System.out.println("random : "+random);
		
		
		//0~99
		int ran = new Random().nextInt(10);
		
		System.out.println("ran : "+ran);
		
	}
	
	public void praRandom() {
		
		//0~9
		int ran1=(int)(Math.random()*10);
		
		System.out.println("0~9 : "+ran1);
		
		
		//1~10
		int ran2=(int)(Math.random()*10+1);
		
		System.out.println("1~10 : "+ran2);
		//20~35
		//int ran3=(int)(Math.random()*16+20);
		//int ran3=new Random().nextInt(16)+20
		while(true) {
			
			int ran3=(int)(Math.random()*100);
			
			if(ran3>=20&&ran3<=35) {
				System.out.println("20~35 : "+ran3);
				break;
			}
		}
			
		
		
		//0 or 1
		int ran4=new Random().nextInt(2);
		
		System.out.println("0 or 1 : "+ran4);
	}
	
	
}
