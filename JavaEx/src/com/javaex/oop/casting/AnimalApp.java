package com.javaex.oop.casting;

public class AnimalApp {
 
	//업캐스팅, 다운캐스팅
	public static void main(String[] args) {
		
		//자식 타입의 객체를 부모 타입의 클래스로 참조할 수 있다.
		Dog dog1 = new Dog("Snoopy");
		
		dog1.eat();
		dog1.walk();
		dog1.bark();

		//자식 객체를 부모 타입으로 참조하는 것 -> 업캐스팅(Updasting) - 객체 앞에 아무런 명시를 하지 않아도 된다.
		Animal dog2 = new Dog("doogy");
		dog2.eat();
		dog2.walk();
//		do2.bark(); //Animal 설계도에 없기 때문에 실행할 수 없다.
		
		//원래대로 돌려놓기 -> 다운 캐스팅 - 객체 앞에 돌려놓을 객체를 써준다.
		((Dog)dog2).bark();
		
		Animal pet=new Dog("Azi");
		pet.eat();
		pet.walk();
		
		pet=new Cat("Yaong");
		pet.eat();
		pet.walk();
		
		 //중요 -> 다운캐스팅 시, 실제 객체를 확인 후 해야한다. 
		// instanceof 연산자 활용
		if(pet instanceof Dog) { //pet이 Dog 클래스의 인스턴스인지
			((Dog)pet).bark();
			}
		else if(pet instanceof Cat) { //pet이 Cat 클래스의 인스턴스인지
			((Cat)pet).meow();
			
		}
	}

}
