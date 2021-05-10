package com.javaex.api.arrayclass;

//	사용자 정의 객체의 비교를 위해서는 Comparable 인터페이스를 구현 해주어야 한다.
public class Member implements Comparable{
	//필드
	String name;
	
	//생성자 생성 및 초기화
	public Member(String name) {
		this.name=name;
	}

	
	//toString(), compareTo는 JVM이 필요할 때 호출하여 사용한다.
	//우리는 JVM에게 해당 메서드를 어떻게 수행할 건지를 알려주는 코드를 작성하는 것이다.
	@Override
	public String toString() {
		return "Member [name=" + name + "]";
	}

	@Override
	public int compareTo(Object o) {
		// 결과가 0이면 두 객체는 순서가 같다
		// 결과가 -1이면 앞의 객체가 먼저다.
		//	결과가 1이면 뒤의 객체가 먼저다.
		// Object의 객체와 Member의 객체를 비교한다.
		if(o instanceof Member) {
			Member other=(Member)o;
			//Member.name과 other.name을 비교한다.
			return name.compareTo(other.name);
		}
		return 0;
	}
	
	

}
