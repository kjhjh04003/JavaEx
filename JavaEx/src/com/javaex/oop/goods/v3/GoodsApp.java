package com.javaex.oop.goods.v3;

public class GoodsApp {

	public static void main(String[] args) {
		//210506.by 준형 - Goods 클래스 객체 생성
		//생성자가 생성되어 있기 때문에 기본 생성자 생성 시 오류가 발생한다.
//		Goods notebook=new Goods();
		
		//생성자를 이용한 객체의 초기화
		Goods notebook = new Goods("LG Gram", 1500000);

		//생성자를 이용한 객체의 초기화
		Goods smartphone=new Goods("iPhone", 1000000);

		
		System.out.printf("%s, %d원%n", notebook.getName(),notebook.getPrice());
		System.out.printf("%s, %d원%n", smartphone.getName(), smartphone.getPrice());
		
		//고의든, 실수든 값의 변경 발생
		//방지1. getter만 설정한다. -> setter가 설정되어 있지 않은 필드는 데이터를 변경할 수 없다.
//		notebook.setPrice(15000);
//		smartphone.setPrice(10000);
		
		//내장 메서드 호출
		notebook.showInfo();
		smartphone.showInfo();
	}

}
