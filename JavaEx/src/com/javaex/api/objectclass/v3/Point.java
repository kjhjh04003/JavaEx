package com.javaex.api.objectclass.v3;

// 객체의 복제
//	얕은 복제 -> 단순히 필드의 값을 복제
//	기본 타입의 필드는 문제가 되지는 않는다.
//	clone 메서드를 사용하기 위해서는 Cloneable 인터페이스를 구현
public class Point implements Cloneable{
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

	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Point) {
			//	캐스팅
			Point other=(Point)obj;
			return x==other.x&& y==other.y;
		}
		return super.equals(obj);
	}
	
	public Point getClone() {
		//Point 클래스의 필드와 동일한 필드 생성
		Point clone=null;
		
		try {
			clone=(Point)clone(); //	clone()->checked 메서드이다.
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
}
