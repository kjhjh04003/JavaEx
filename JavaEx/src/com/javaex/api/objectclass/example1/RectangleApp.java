package com.javaex.api.objectclass.example1;

public class RectangleApp {

	public static void main(String[] args) {
		
		Rectangle a=new Rectangle(6,4);
		Rectangle b=new Rectangle(12,2);
		Rectangle c=new Rectangle(6,6);
		
		//비교 기준을 명시하지 않아 결과 값이 다르게 나온다.
		//면적 비교 로직을 추가해야 한다.
		System.out.println("a.equals(b) : "+a.equals(b)); //	->true
		System.out.println("a.equals(c) : "+a.equals(c)); //	->false
		
		

	}

}
