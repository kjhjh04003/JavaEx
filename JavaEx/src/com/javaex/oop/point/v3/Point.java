package com.javaex.oop.point.v3;

//210506.by준형 - 필드 은닉, getter/setter, 내장메서드
//210506.by준형 - 생성자
public class Point {
	
	//은닉 필드 선언
	private int x;
	private int y;
	
	//생성자
	public Point(int x, int y) {
		//모든 필드 초기화
		this.x=x;
		this.y=y;
	}
	//getter/setter
	//x
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x=x;
	}
	
	//y
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y=y;
	}
	
	//내장 메서드
	public void draw() {
		System.out.printf("점[x=%d, y=%d]을 그렸습니다. %n", x,y);
	}
	
	//메서드 오버로딩 -> 다향성의 일부
	//다른 메서드와 같은 이름 / 매개변수의 타입, 개수, 순서 중 하나가 달라야된다.
	public void draw(boolean show) {
		String message=String.format("점[x=%d, y=%d]을 ", x,y);
		if(show==true)
			message+="그렸습니다.";
		else
			message+="지웠습니다.";
		System.out.println(message);
	}

}
