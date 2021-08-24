package com.test01;

import java.util.Scanner;

public class ForTest02 {

	public static void main(String[] args) {
		
		//test1();
		//test2();
		//test3();
		test4();
	}
	
	
	public static void test1() {
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<5;j++) {
				System.out.printf("i=%d j=%d\n",i,j);
			}
			
		}
		
	}
	
	public static void test2() {
		
		for(int dan=2;dan<10;dan++)
			for(int su=1;su<10;su++)
				System.out.printf("%d*%d=%d\n",dan,su,dan*su);
		
	}
	
	public static void test3() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("출력할 줄 수: ");
		int row = sc.nextInt();
		
		for(int r=1;r<row;r++) {
			for(int c=1;c<=5;c++)
				System.out.print("*");
			
			System.out.println();
		}
		
	}
	
	public static void test4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("줄 수 : ");
		int row=sc.nextInt();
		
		System.out.print("칸 수 : ");
		int column=sc.nextInt();
		
		for(int r=0;r<row;r++) {
			for(int c=0;c<column;c++) {
				if(r==c)
					System.out.print(c+1);
				else
					System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}
	
	
}
