package com.javaex.oop.shape.v1;

// 추상클래스이기 때문에 추상 메서드를 구현해주지 않으면 오류가 발생한다.
// 추상 클래스 상속 시 부모 클래스의 추상 메서드는 반드시 구현해 주어야 한다.

public class Rectangle extends Shape {

	//필드
	//사각형의 넓이를 구하는 필드
	protected int width;
	protected int height;
	
	//생성자 초기화
	public Rectangle(int x,int y, int width, int height) {
		super(x,y);
		this.width=width;
		this.height=height;
	}
	
	@Override
	public void draw() {
		System.out.printf("사각형[x=%d, y=%d , w=%d, h=%d, area=%.2f]을 그렸습니다.%n", x,y,width, height, area());	
	}

	//면적 구하는 메서드
	@Override
	public double area() {
		return width*height;
	}

}
