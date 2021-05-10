package com.javaex.api.generic.v2;

public class BoxApp {

	public static void main(String[] args) {
		//Box 생성할 때 내부 타입을 지정해주어야 한다.
		Box<Integer> intBox=new Box<>(); // 객체화 할 때 내부데이터 타입이 결정된다.
		intBox.setContent(2021); //intBox.setContent(Integer.valueOf(2021));
//		intBox.setContent("Java"); // 내부 데이터가 객체화 될 때 타입이 결정되어 컴파일 타임 때에 내부 데이터를 체크하여 에러 발생을 예방할 수 있다.
		
		
		// 내용물을 꺼내보자
		int retVal=intBox.getContent(); //타입 캐스팅의 번거로움을 제거 
		System.out.println("내용물 : "+retVal);

		//Box 생성 String값을 설정
		Box<String> strBox=new Box<>();
		strBox.setContent("Java");
		String strVal=strBox.getContent();
		System.out.println("strBox 내용물 : "+strVal);
		
		//캐스팅을 잘못 했다면
		//컴파일러가 내부 데이터 타입을 확인해서 실행 이전에 미리 체크할 수 있다.
//		strVal=(String)intBox.getContent();

		//1.Generic을 사용하면 
		//	캐스팅을 해야 하는 불편함을 해소할 수 있다.
		//2.캐스팅 오류를 컴파일 타임에서 체크할 수 있다.
		//이것을 안전하게 설정한 것이 제네릭이다.
	}

}
