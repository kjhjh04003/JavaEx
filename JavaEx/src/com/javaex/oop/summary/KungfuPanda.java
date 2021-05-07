package com.javaex.oop.summary;

//	상속(extends)은 오로지 한 부모로부터 받는다.
//	구현(implements)는 여러개의 인터페이스 가능
public class KungfuPanda extends Panda implements KungfuSkill{
	//1. 생성자를 추가하지 않으면 기본 생성차를 자동으로 추가한다.
	//2. 특별히 무언가를 명시하지 않으면 부모의 기본 생성자를 호출한다.
	//->panda의 기본 생성자는 super();
	//->panda는 기본 생성자가 없다.
//	public KungfuPanda() {
//		super();
//	}
	//생성자
	public KungfuPanda(String name, int age) {
		
		super(name, age);
	}

	@Override
	public void kunfu() {
		System.out.printf("%s: 아뵤~!",name);
		
	}
}
