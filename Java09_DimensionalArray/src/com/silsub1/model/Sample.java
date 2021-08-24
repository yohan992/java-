package com.silsub1.model;

import java.util.Random;
import java.util.Scanner;

public class Sample {
	
	public void munjae1() {
		
		int[][] a=new int[4][4];
		
		Random r=new Random();
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a[i].length-1;j++) {
				a[i][j]=r.nextInt(100);
			}
		}
		
		
		System.out.println("0열  1열  2열  3열");
		for(int i=0;i<a.length;i++) {
			System.out.print(i+"행  ");
			for(int j=0;j<a[i].length-1;j++) {
				System.out.print(a[i][j]+"  ");
				a[i][3]+=a[i][j];   
				a[3][j]+=a[i][j];
			}
			System.out.print(a[i][3]);
			System.out.println();
		}
		
	}

	public void munjae2() {
		
		int[][] a=new int[3][];
		
		Scanner sc = new Scanner(System.in);
		Random r=new Random();
		
		int sum=0;
		int i;
		
		for(i=0;i<a.length;i++) {
			System.out.print(i+"행 열갯수 : ");
			int n=sc.nextInt();
			a[i]=new int[n];
		}
		
		
		
		for(i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=r.nextInt(100);
				System.out.print(a[i][j]+" ");
				sum+=a[i][j];
			}
			
			System.out.println();
			
			if(sum%5==0) {
				System.out.printf("%d행의 열 합계는 : %d",i,sum);
				System.out.println();
			}
			sum=0;
		}
		
		
		
	}
	
	
	
	public void munjae3() {
		
		//Scanner sc = new Scanner(System.in);
		
		int[][] a=new int[6][6];
		int isum=0,jsum=0;
		
		for(int i=0,n=1;i<a.length-1;i++) {
			for(int j=0;j<a[i].length-1;j++) {
				a[i][j]=n++;
			}
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length-1;j++) {
				System.out.print(a[i][j]+"  ");
				a[i][5]+=a[i][j];
				a[5][j]+=a[i][j];
			}
			System.out.print(a[i][5]);
			System.out.println();
			
		}
		
	}
	
	public void munjae4() {
		
		int[][] a=new int[5][5];
		
		for(int i=0,n=1;i<a.length;i++) {
			if(i%2==0) {
				for(int j=0;j<a[i].length;j++) {
					a[i][j]=n++;
				}
			}
			else {
				for(int j=4;j>=0;j--) {
					a[i][j]=n++;
				}
			}
			
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
	
	public void munjae5() {
		
		int[][] a=new int[5][5];
		int n=1;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[j][i]=n++;
			}
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}
