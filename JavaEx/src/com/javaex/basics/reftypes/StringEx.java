package com.javaex.basics.reftypes;

public class StringEx {

	public static void main(String[] args) {
		
		stringBasic();

	}
	
	private static void stringBasic() {
		
		//문자열 선언
		String str1; // -> 아직 할당된 값이 없어 null 상태
		str1="자바"; //할당 -> Literal(코드에 직접 입력한 값)
		
		String str2="자바"; //선언+할당 : Literal(코드에 직접 입력한 값)
		
		String str3=new String("자바"); //새 객체 생성
		
		//Literal로 설정한 객체들은 String Pool이라는 메모리 영역에서 관리된다.
		//새 객체로 만든 String은 다른 메모리 영역에서 관리된다.
		//참조 변수는 객체의 주소를 가지고 있다.
		System.out.println("str1==str2 ? "+(str1==str2));
		System.out.println("str1==str3 ? " +(str1==str3));
		
		//참조 변수의 값을 비교하고 싶다면 equals를 사용한다.
		System.out.println("str1과 str2의 내용이 같은가? "+str1.equals(str2));
		System.out.println("str1과 str3의 내용이 같은가? "+str1.equals(str3));
	}

}
