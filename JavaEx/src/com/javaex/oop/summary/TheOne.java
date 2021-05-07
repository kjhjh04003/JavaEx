package com.javaex.oop.summary;

public class TheOne extends Human implements KungfuSkill, Flyable {

	public TheOne(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void kunfu() {
		System.out.printf("%s: I Know Kungfu!!%n",name);

	}

	@Override
	public void fly() {
		System.out.printf("%s: I belive I can fly!%n", name);
		
	}


	
	

}
