package com.javaex.api.generic.v1;

public class BoxApp {

	public static void main(String[] args) {
		//Box 생성 int 값을 설정
		Box intBox=new Box();
		intBox.setContent(2021); //intBox.setContent(Integer.valueOf(2021));
		
		// 내용물을 꺼내보자
//		int retVal=intBox.getContent(); //getContent()의 리턴 값은 Object 타입이기 때문에 에러발생 -> Object를 Integer로 다운캐스팅 해야한다.
		int retVal=(int)intBox.getContent();
		System.out.println("내용물 : "+retVal);

		//Box 생성 String값을 설정
		Box strBox=new Box();
		strBox.setContent("Java");
		String strVal=(String)strBox.getContent();
		System.out.println("strBox 내용물 : "+strVal);
		
		//캐스팅을 잘못 했다면
//		strVal=(String)intBox.getContent(); //컴파일 상에서는 에러가 발생하지 않지만 실제 실행하면 에러가 발생한다.

		//1.Object를 다룰 수 있는 클래스를 생성하면 
		//	캐스팅을 해야 하는 불편함이 있다.
		//2.캐스팅 오류를 컴파일 타임에서 체크할 수 없다.
		//이것을 안전하게 설정한 것이 제네릭이다.
	}

}
