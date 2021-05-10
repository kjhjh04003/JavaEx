package com.javaex.api.generic.v1;

//	모든 객체를 담을 수 있는 Box설계 ->Object이용
public class Box {
	Object content; //내부 데이터가 object이기 때문에 object를 상속받은 모든 데이터 사용 가능

	public Object getContent() {
		return content;
	}

	public void setContent(Object content) {
		this.content = content;
	}
	
	
}
