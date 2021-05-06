package com.javaex.oop.point.v4;

//상속 받기
public class ColorPoint extends Point{
	//부모로부터 필드와 메서드를 상속받을 수 있다.
	//1. 아직 ColorPoint 생성자를 만들지 않았기 때문에 기본 생성자 생성
	//ColorPoint(){
	//	super(); ->부모 클래스에 기본 생성자가 없기 때문에(?)
	//}
	
	private String color;
	//생성자
	public ColorPoint(int x, int y, String color) {
		//특별히 명시하지 않으면 부모의 기본 생성자를 선택하게 된다.
		super(x,y); //명시적으로 부모의 생성자 호출
		this.color=color;
	}
	
	//물려받은 메소드를 무시하고 자체적으로 재구현
	@Override
	public void draw() {
		//부모의 베서드 호출 -> super.메서드이름
//		System.out.printf("색상점[x=%d, y=%d, color=%s]을 그렸습니다.%n", super.getX(),super.getY(),color);

		//부모의 필드 접근 제한자를 protected로 바꾼다.
		//상속 관계일 때에는 위의 방법보다 protected로 바꾸는 것이 좋다.
		System.out.printf("색상점[x=%d, y=%d, color=%s]을 그렸습니다.%n", x,y,color);
	}

	//부모 메서드를 잘 모를 때 override 하는 방법
	@Override
	public void draw(boolean show) {
		String message=String.format("색상점[x=%d, y=%d, color=%s]을 ", x,y,color);
		message += show?"그렸습니다.":"지웠습니다.";
		System.out.println(message);
	
		//override를 해도 부모의 메서드가 지워지는 것은 아니다.
//		//명시적으로 super 키워드를 이용해 부모의 메서드에 접근할 수 있다.
//		System.out.println("부모의 메서드 호출 : ");
//		super.draw(show);
	}
	
	
	
}
