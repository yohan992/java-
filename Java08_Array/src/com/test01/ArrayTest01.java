package com.test01;

import java.util.Scanner;

public class ArrayTest01 {
	
	public void test1() {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr=new int[5];
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.print("정수 입력 : ");
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		
		System.out.println("sum : "+sum);
		
	}
	
	
	public void test2() {
		//int[] arr;
		//char car[];
		
		//arr=new int[]; 크기 지정해주지 않으면 에러 
		
		int[] arr=new int[5];
		char car[]=new char[10];
		
		System.out.println("arr : "+arr);
		System.out.println("car : "+car);
		
		System.out.println(arr.hashCode());
		System.out.println(car.hashCode());
		
		System.out.println(arr.length);
		System.out.println(car.length);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 길이 : ");
		int size = sc.nextInt();
		
		double i[]=new double[30];
		
		System.out.println("hashcode : "+i.hashCode());
		System.out.println("길이 : "+i.length);
		
		i=null;
		
		System.out.println("i : "+i);
		System.out.println("길이 : "+i.length);
		
	}
	
	
	public void test3() {
		
		int[] arr=new int[5];
		
		for(int i=0; i<arr.length;i++) {
			System.out.println("arr["+i+"]의 값 : "+arr[i]);
		}
		
		int[] arr2=new int[] {11,22,33,44,55};
		System.out.println("arr2의 길이 : "+arr.length);
		
		String[] s= {"apple","banana","grape","orange"};
		
		for(int i=0; i<s.length;i++) {
			System.out.println(s[i]);
		}
		
	}
	

}
