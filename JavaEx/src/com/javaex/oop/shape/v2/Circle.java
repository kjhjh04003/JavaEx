package com.javaex.oop.shape.v2;

public class Circle extends Shape implements Drawable{ //implements는 인터페이스에 작성한 

	//필드
	protected double radius; //반지름
	
	//생성자 초기화
	public Circle(int x, int y, double radius) {
		super(x,y);
		this.radius=radius;
	}
	
	@Override
	public void draw() {
		System.out.printf("원[x=%d, y=%d, area=%.2f]을 그렸습니다.%n", x,y,area());
	}

	@Override
	public double area() {
		//면적 파이*반지름*반지름
		return Math.PI*radius*radius;
	}

}
