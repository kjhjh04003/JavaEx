package com.javaex.api.objectclass.v1;

//	Object 클래스의 기본 메서드들
//	출력 포맷의 재정의
//	특별히 상속받지 않아도 java.lang.Object를 상속 받음
//	java.long.Object -> 자바 객체의 최상위 클래스
public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}

	//	출력 포맷 재정의 - toStrin을 오버라이드 하자
	//	toString() - 객체의 정보를 문자열로 반환
	//	주로 print 계열의 메서드로 출력할 때
	//	문자열과 객체를 연결할 때 호출
	@Override
	public String toString() {
		return String.format("Point(%d, %d)",x,y);
	}
	
	

}
