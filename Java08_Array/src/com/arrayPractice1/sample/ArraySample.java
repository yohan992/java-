package com.arrayPractice1.sample;

import java.util.Random;
import java.util.Scanner;

public class ArraySample {
	
	Scanner sc=new Scanner(System.in);
	
	public void test1() {
		
		int[] a=new int[10];
		int sum=0;
		
		for(int i=0;i<10;i++) {
			a[i]=(int)(Math.random()*100)+1;
			sum+=a[i];
		}
		
		System.out.println(sum);
		
	}
	
	public void test2() {
		
		int[] a=new int[10];
		
		for(int i=0;i<10;i++) {
			a[i]=(int)(Math.random()*100)+1;
		}
		
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length-1;i++) {
			if(a[i]<a[i+1])
				max=a[i+1];
			
			if(a[i]<a[i+1])
				min=a[i];
		}
		
		System.out.printf("Max : %d\nMin : %d\n",max,min);
		
	}
	
	public void test3() {
		
		byte[] a=new byte[10];
		int sum=0;

		Random ran=new Random();
		
		ran.nextBytes(a);
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]%2==0)
				sum+=a[i];
			
			System.out.print(a[i]+" ");
			
		}
		System.out.println();
		System.out.print(sum);
		
		
	}
	
	public void test4() {
		
		System.out.print("정수 입력 : ");
		String s = sc.next();
		int sum=0;
		
		for(int i=0;i<s.length();i++) {
			
			System.out.println(s.substring(i,i+1));
			sum+=Integer.parseInt(s.substring(i,i+1));
			
		}
		
		System.out.println(sum);
	}
	
	public void test5() {
		
		System.out.print("정수 입력 : ");
		String s = sc.next();
		int sum=0;
		
		for(int i =0;i<s.length();i++) {
			
			System.out.println(s.charAt(i));
			sum+=(int)(s.charAt(i)-'0');
			
		}
		
		System.out.println(sum);
		
	}

}
