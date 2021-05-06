package com.javaex.oop.casting;


//초기 상속 코드를 작성하면 생성자가 없기 때문에 발생하는 것
public class Dog extends Animal{
	
	//생성자
	public Dog(String name) {
		super(name);
	}
	
	public void bark() {
		System.out.println(name +" : 멍멍!");
	}

}
