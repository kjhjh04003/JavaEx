package com.javaex.api.wrapper;

public class WrapperEx {

	public static void main(String[] args) {
		// 기본 생성 -> 더이상 사용 안함(Deprecated)
		//	Wrapper 클래스 객체 생성 시 new 를 이용하지 않는다.(Deprecated)
		// valueOf()를 이용		
		Integer i=new Integer(10);
		Character c=new Character('c');
	
		//valueOf 메서드를 이용하여 생성한다.
		Float f=Float.valueOf(3.14159f);
		//문자열로 된 데이터를 변환
		Integer i1=Integer.valueOf("11");
		Double d1=Double.valueOf("3.14159");
		//주의 : 매개 변수 문자열의 형태가 기본 타입의 형태를 맞춰 줘야 한다.
		
		//자동 박싱
		Integer i2=2021; //Integer i2=Integer.valueOf(2021);
		
		//parse개열 메서드
		System.out.println(Integer.parseInt("-123")); //문자열을 정수로 변환
		System.out.println(Integer.parseInt("FF",16)); //16진수FF문자열을 정수로 변환
		System.out.println(Integer.toBinaryString(2021)); //정수를 2진수 문자열로 변환
		System.out.println(Integer.toHexString(255)); //정수를 16진수 문자열로
	
		//형변환
		System.out.println(i2.doubleValue()); //정수형을 double형으로 변환
		
		Integer i3=Integer.valueOf(2021);
		Integer i4=Integer.valueOf(2021);
		
		System.out.println("i3 == i4 ? "+(i3==i4)); //객체의 주소를 비교하는 것
		//언박싱 비교
		System.out.println("값의 비교(언박싱) : "+ (i3.intValue()==i4.intValue()));
		//equals 비교
		System.out.println("값의 비교(equals) : "+i3.equals(i4));
	}

}
