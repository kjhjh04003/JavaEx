package com.javaex.oop.shape.v2;

//210507.by준형
//추상클래스
//	스스로 객체화 불가
//	자식에게 물려주기 위한 설계도로만 존재
//	반드시 한 개 이상의 추상 메서드를 가져야 한다.
//	특정 기능의 구현을 강제하는 측면
public abstract class Shape { //acstract는 추상화를 할 때 사용
	//필드
	//해당 필드는 아직 실체화가 되지 않았다.
	protected int x;
	protected int y;
	
	//생성자
	public Shape(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	// 메서드는 추상 메서드 or 일반 메서드를 가질 수 있다.
	// 추상 메서드가 반드시 한 개 이상 있어야 한다.
//	public abstract void draw(); //선언만 한다 -> 구현은 실제 클래스에서 한다. -> Drawable 인터페이스로 위임
	public abstract double area(); //면적 구하는 메서드로 선언만 한다.
	

}
