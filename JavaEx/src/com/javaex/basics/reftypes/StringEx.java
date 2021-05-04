package com.javaex.basics.reftypes;

public class StringEx {

	public static void main(String[] args) {
		
		stringBasic();
		stringFormatEx();

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
	
	private static void stringFormatEx() {
		//형식화된 문자열
		//%s(문자열), %d(정수), %f(실수), %n(개행), %%(%)
		//__개의 __중에서 __개를 먹었다. -> 문자열 생성
		String food="사과";
		int total=10;
		int eat=3;
		
		System.out.println(total+"개의 "+ food+"중에서 "+eat+"개를 먹었다.");
		System.out.printf("%d개의 %s중에서 %d개를 먹었다.\n", total, food, eat);
	
		//%d, %f 등의 포맷 문자에는 부가 정보를 담을 수 있다.
		float rate=1.234f;
		//현재 이자율을 __%d입니다.
		System.out.printf("현재 이자율은 %f%%입니다.%n",rate);
		System.out.printf("현재 이자율은 %.2f%%입니다.%n",rate);
		
		//포맷 형식은 String.format 메서드를 이용, 문자열 생성 시 활용 가능
		//해당 방식이 깔끔하여 많이 이용
		String fmt="%d개의 %s 중에서 %d개를 먹었다.%n"; //포맷을 미리 생성
		String result=String.format(fmt, 5,"바나나",2); //데이터 연결
		System.out.println(result);
		
	}

}
