package com.javaex.oop.casting;

public class Animal {

	//필드
	//상속을 위해 protected
	protected String name;
	
	//생성자
	public Animal(String name) {
		this.name=name;
	}
	
	//먹는 메서드
	public void eat() {
		System.out.println(name+" is eating...");
	}
	
	//걷기 메서드
	public void walk() {
		System.out.println(name+" is walking...");
	}

}
