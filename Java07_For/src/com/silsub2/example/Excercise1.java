package com.silsub2.example;

import java.util.Scanner;

public class Excercise1 {
	
	public void excercise1() {
		int i=5,j=5;
		int count=0;
		int a[]=new int[25];
		int sum=0;
		
		for(int cnt=0;cnt<i;cnt++) {
			for(int cnt2=0;cnt2<j;cnt2++) {
				System.out.printf("%d ",count+1);
				a[count]=count+1;
				count++;
			}
			System.out.println();
		}
		
		for(int cnt=0;cnt<25;cnt+=6) {
			sum+=a[cnt];
		}
		
		for(int cnt=4;cnt<24;cnt+=4) {
			sum+=a[cnt];
		}
		System.out.println(sum);
		
	}

	public void excercise2() {
		
		Scanner sc = new Scanner(System.in);
		
		int ran=(int)(Math.random()*100);
		
		System.out.print("정수 입력 :");
		int i=sc.nextInt();
		
		for(int cnt=0;;cnt++) {
			if(i==ran) {
				System.out.println("정답");
				System.out.printf("%d번만에 맞추셨습니다.",cnt+1);
				break;
			}
			else if(i>ran) 
				System.out.println("입력하신 정수보다 작습니다.");
			else if(i<ran) 
				System.out.println("입력하신 정수보다 큽니다.");
				
		}
		
	}
}
