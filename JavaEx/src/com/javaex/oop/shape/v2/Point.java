package com.javaex.oop.shape.v2;

//인터페이스 구현 : implements
//추상메서드를 구현 안해주면 클래스에 오류가 난다.
public class Point implements Drawable{
	//필드
	protected int x;
	protected int y;
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}

	@Override
	public void draw() {
		System.out.printf("점[x=%d ,y=%d]을 그렸습니다.", x,y);
		
	}

}
