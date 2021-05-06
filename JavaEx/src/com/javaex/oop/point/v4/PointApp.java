package com.javaex.oop.point.v4;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1=new Point(10,20);
		p1.draw();
		
		Point p2=new Point(30,40);
		p2.draw();
		
		//210506.by 준형 - 오버로딩 된 메서드 호출
		p1.draw(true);
		p1.draw(false);
		
		p2.draw(true);
		p2.draw(false);
		
		//상속받은 객체 사용
		Point cp1=new ColorPoint(50,60,"red");
		cp1.draw(true); //ColorPoint는 Point를 물려받았기 때문에 draw(boolean)을 사용할 수 있게 된다.
		
		Point cp2=new ColorPoint(100, 200, "blue");
		cp2.draw(false);
	}

}
