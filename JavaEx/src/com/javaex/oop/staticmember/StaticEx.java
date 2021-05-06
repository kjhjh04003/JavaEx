package com.javaex.oop.staticmember;

public class StaticEx {
	
	//
	public static int refCount; // 클래스(static) 멤버 : 참조 카운트
	public static String classVar; //클래스(static) 멤버
	public String instanceVar; //인스턴스 멤버
	
	//인스턴스 영역 -> 클래스 영역 접근 가능
	//클래스 영역 -> 인스턴스 영역 접근 불가

	//클래스 영역의 초기화는 static  블록에서 수행 가능
	static {
		refCount=0;
		classVar="Static Member";
//		instanceVar="InstanceVar"; //static 영역에서 인스턴스 영역으로 접근 불가능하다. 
		System.out.println("Static Block");
	}
	
	//생성자 : 인스턴스 초기화
	public StaticEx() {
		refCount++; //참조 카운트 증가
		System.out.println("refCount:" +refCount);
		System.out.println("새 인스턴스가 생성!");
	}
	
	//소멸자 : 객체가 해제될 때 호출
	// null로 바뀔 때
	@Override
	protected void finalize() throws Throwable {
		//참조 카운트 줄이기
		refCount--;
		super.finalize();
		System.out.println("소멸자 호출");
	}
	

}
