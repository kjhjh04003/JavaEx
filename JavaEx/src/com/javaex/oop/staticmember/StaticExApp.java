package com.javaex.oop.staticmember;

public class StaticExApp {

	public static void main(String[] args) {
		// 호출 순서 확인
		//1.static 블록 호출
		//2.생성자 호출
		//3.static이 처음에 호출되었기 때문에 두번째엔 호출되지 않는다.
		//4.두번째 생성자 호출
		StaticEx s1=new StaticEx();
		System.out.println("참조 카운트:"+StaticEx.refCount); // = s1.refCount
		//static 멤버는 객세 생성(new) 없어도 접근할 수 있다.
		
		StaticEx s2=new StaticEx();
		System.out.println("참조 카운트:"+StaticEx.refCount);

		//참조 해제
		s1=null; //소멸자를 호출한다 해도 즉시 사라지는 것이 아니다. -> JVM에서 GC이 돌다가 확인 후 사라진다.
		System.out.println("s1 해제!");
		System.out.println("참조 카운트:"+StaticEx.refCount);
		//강제로 GC 호출
		//주의 : 자바가 객체를 관리하는 순서를 보여주기 위함
		//	강제로 Garbage collector을 호출하지 말자.
		System.gc(); //참고 코드로만 활용
		try {
			Thread.sleep(3000); //3초 대기
			System.out.println("참조 카운트:"+StaticEx.refCount);
		}catch(Exception e) {
			
		}
	}

}
