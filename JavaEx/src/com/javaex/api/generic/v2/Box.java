package com.javaex.api.generic.v2;

//1.Object를 다룰 수 있는 클래스를 생성하면 
//	캐스팅을 해야 하는 불편함이 있다.
//2.캐스팅 오류를 컴파일 타임에서 체크할 수 없다.
//이것을 안전하게 설정한 것이 제네릭이다.

//Generic 이용, 설계시에는 데이터 타입을 결정하지 않고
//인스턴스화 할 때 외부에서 데이터ㅣ 타입을 지정
//클래스 명 뒤의 <T>는 타입의 줄임말이고, 꼭 T문자를 사용하지 않아도 된다.
//많이 사용하는 파라미터 문자 : T->type의 줄임말, 데이티 타입 / R -> Return Type, 반환 타입 / K ->Key / V -> Value
//외부에서 new Box<타입>을 선언하면 넘어온다.
public class Box<T> {
	T content;

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}

}
