package com.javaex.api.collection.hash;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {

//		hashSetBasic();
		hashsetCumstom();

	}

	private static void hashSetBasic() {
		// HashSet 선언
		HashSet<String> hs = new HashSet<>();

		// 객체 추가
		// 1. 추가한 순서에 상관이 없다.
		// 2. 중복 삽입은 허용하지 않는다.
		hs.add("Java");
		hs.add("C");
		hs.add("C++");
		hs.add("Python");
		hs.add("Java"); // 중복됨으로 출력이 안된다.

		System.out.println("HASHSET : " + hs);
		System.out.println("SIZE : " + hs.size());

		//포함여부 확인
		System.out.println(hs.contains("C++"));
		System.out.println(hs.contains("Linux"));
		
		//객체 삭제
		hs.remove("C++");
		System.out.println("HASHSET : "+hs);
	}

	private static void hashsetCumstom() {
		//사용자 정의 클래스 - HashSet
		HashSet<Student> hs=new HashSet<>();
		
		Student s1=new Student("홍길동", 10);
		Student s2=new Student("홍길동", 10);
		Student s3=new Student("홍길동", 20);
		
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		
		System.out.println(hs);
		
		//포함 여부 확인
		System.out.println("홍길동, 10번 학생이 있는가? "+
		hs.contains(new Student("홍길동",10)));
		
	}
}
