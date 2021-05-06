package com.javaex.oop.goods.v2;

public class GoodsApp {

	public static void main(String[] args) {
		//210506.by 준형 - Goods 클래스 객체 생성
		Goods notebook=new Goods();
		
		//210506.by 준형 - 필드 셋팅

		//210506.by 준형 - Goods 클래스에 선언된 필드가 private로 선언되었기 때문에 다른 클래스에서 불러올 수 없다.
//		notebook.name="LG Gram";
//		notebook.price=1500000;

		notebook.setName("LG Gram");
		notebook.setPrice(1500000);
		
		Goods smartphone=new Goods();
//		smartphone.name="iPhone";
//		smartphone.price=1000000;

		smartphone.setName("iPhone");
		smartphone.setPrice(1000000);
		
		System.out.printf("%s, %d원%n", notebook.getName(),notebook.getPrice());
		System.out.printf("%s, %d원%n", smartphone.getName(), smartphone.getPrice());
		
		notebook.showInfo();
		smartphone.showInfo();
	}

}
