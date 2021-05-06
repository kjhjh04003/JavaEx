package com.javaex.oop.goods.v1;

public class GoodsApp {

	public static void main(String[] args) {
		//210506.by 준형 - Goods 클래스 객체 생성
		Goods notebook=new Goods();
		
		//210506.by 준형 - 필드 셋팅
		notebook.name="LG Gram";
		notebook.price=1500000;
		
		Goods smartphone=new Goods();
		smartphone.name="iPhone";
		smartphone.price=1000000;
		
		System.out.printf("%s, %d원%n", notebook.name,notebook.price);
		System.out.printf("%s, %d원%n", smartphone.name, smartphone.price);

	}

}
