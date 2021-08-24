package com.test01;

public class ArrayTest02 {
	
	
	public static void main(String[] args) {
		
		char[] ch = new char[26];
				
		for(int i=0;i<26;i++) {
			ch[i]=(char)('a'+i);
		}
		
		ArrayTest02.prn(ch);
		ArrayTest02.reverse(ch);
		ArrayTest02.upper(ch);
		
	}
	
	public static void prn(char[] ch) {
		
		for(int i=0;i<ch.length;i++)
			System.out.print(ch[i]+" ");
		
		System.out.println();
		
	}
	
	public static void reverse(char[] ch) {
		
		for(int i=ch.length-1;i>=0;i--)
			System.out.print(ch[i]+" ");
		
		System.out.println();
		
	}
	
	public static void upper(char[] ch) {
		
		for(int i=0;i<ch.length;i++) {
			ch[i]=(char)(ch[i]+('A'-'a')); //ch[i]=Character.toUpperCase(ch[i]); 
			System.out.print(ch[i]+" ");
		}
		
		System.out.println();
	}
}
