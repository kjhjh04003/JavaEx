package com.javaex.oop.shape.v1;

public class ShapeApp {

	public static void main(String[] args) {

//		Shape s=new Shape(); //추상 클래스틑 인스턴스화(실체화)할 수 었다.
		
		Shape r=new Rectangle(10,20,100,50);
		Shape c=new Circle(30,40,30);
		
		r.draw();
		c.draw();
		
	}

}
