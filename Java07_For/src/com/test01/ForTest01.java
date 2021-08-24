package com.test01;

import java.util.Scanner;

public class ForTest01 {

	public static void main(String[] args) {
		
		//test3();
		//new ForTest01().test4();
		new ForTest01().test5();
		
		
	}
	
	
	public static void test1() {
		
		int no=0;
		while(no<=10) {
			System.out.println(no);
			no++;
		}
		
		
		for(int i=0;i<=10;i++) {
			
			System.out.println(i);
			
		}
		
		
	}
	
	
	public static void test3() {
		
		for(int i=1;i<10;i+=2) {
			
			System.out.println(i+"번째");
		}
		System.out.println();
		
		
		for(int i=0,j=10;i<10&&j>0;i++,j--) {
			
			System.out.println(i+"번째");
			System.out.println(j+"번째");
		}
		
		
		int i=1;
		for(;;) {
			System.out.print(i+" ");
			i++;
			
			if(i==100)
				break;
		}
		
		
	}
	
	
	public void test4() {
		
		int i=(int)(Math.random()*100)+1;
		int sum=0;
		for(int j=0;j<=i;j++) {
			sum+=j;
			
		}
		System.out.println(sum);
	}
	
	public void test5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int i=sc.nextInt();
		
		System.out.print("정수 입력 : ");
		int j=sc.nextInt();
		
		int sum=0;
		
		if(i>=j) {
			for(;j<=i;j++)
				sum+=j;
		}
		else {
			for(;i<=j;i++)
				sum+=i;
		}
		
		System.out.println(sum);
		
	}
	
}
