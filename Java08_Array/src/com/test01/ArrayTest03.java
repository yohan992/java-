package com.test01;

public class ArrayTest03 {
	
	public void shallowCopy() {
		
		int[] originArr= {1,2,3,4,5};
		int[] copyArr=originArr;
		
		
		String s="";
		
		for(int i =0;i<originArr.length;i++) {
			s+=originArr[i]+" ";
		}
		
		System.out.println("1.originArr : "+s);
		
		s="";
		for(int i=0;i<copyArr.length;i++){
			s+=copyArr[i]+" ";
		}
		
		System.out.println("2.copyArr : "+s);
		
		originArr[0]=99;
		
		s="";
		
		for(int i=0; i<originArr.length;i++) {
			s+=originArr[i]+" ";
		}
		
		System.out.println("3.originArr : "+s);
		
		s="";
		
		for(int i=0; i<copyArr.length;i++) {
			s+=copyArr[i]+" ";
		}
		
		System.out.println("4.copyArr : "+s);
	}
	
	public void deepCopy() {
		
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[5];
		
		for(int i=0;i<originArr.length;i++) {
			copyArr[i]=originArr[i];
		}
		
		String oStr="";
		String cStr="";
		for(int i=0;i<originArr.length;i++) {
			oStr+=originArr[i]+ " ";
			cStr+=copyArr[i]+ " ";
		}
		
		System.out.println("originArr : "+oStr);
		System.out.println("copyArr : "+cStr);
		
		originArr[0]=99;
		
		oStr="";
		cStr="";
		for(int i=0;i<originArr.length;i++) {
			oStr+=originArr[i]+ " ";
			cStr+=copyArr[i]+ " ";
		}
		
		System.out.println("originArr : "+oStr);
		System.out.println("copyArr : "+cStr);
		
	}
	
	public void deepCopy2() {
		//2.arraycopy()
		//java.lang.System에 있는 메소드
		
		int originArr[]= {1,2,3,4,5};
		int[] copyArr = new int[10];
		
		//arraycopy(Object sec,int srcPos,Object dest,int destPos,int length)
		//sec:원본배열,srcPos:복사시작위치,dest:카피배열,destPos:붙여넣기시작위치,length:복사된길이
		
		System.arraycopy(originArr, 0, copyArr, 4, originArr.length);
		
		String oStr="";
		String cStr="";
		for(int i=0;i<originArr.length;i++) {
			oStr+=originArr[i]+" ";		
		}
		
		for(int i=0;i<copyArr.length;i++) {
			cStr+=copyArr[i]+" ";		
		}
		
		System.out.println("originArr : "+oStr);
		System.out.println("copyArr : "+cStr);
		
		System.out.println("originArr hashcode : "+originArr.hashCode());
		System.out.println("copyArr hashcode : "+copyArr.hashCode());
		
		
		
	}
	
	public void deepCopy3() {
		//3.clone()
		int[] originArr= {1,2,3,4,5};
		int[] copyArr=new int[5];
		
		System.out.println("copyArr hashcode : "+copyArr.hashCode());
		
		copyArr = originArr.clone();
		
		String oStr="";
		String cStr="";
		
		for(int i=0;i<5;i++) {
			oStr+=originArr[i]+" ";
			cStr+=copyArr[i]+" ";
		}
		
		System.out.println("originArr : "+oStr);
		System.out.println("copyArr : "+cStr);
		
		System.out.println("originArr hashcode : "+originArr.hashCode());
		System.out.println("copyArr hashcode : "+copyArr.hashCode());
	}
	
}
