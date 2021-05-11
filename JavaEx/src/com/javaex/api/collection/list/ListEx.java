package com.javaex.api.collection.list;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListEx {

	public static void main(String[] args) {
		// 리스트 선언
		// 참조 타입을 List 설정, 실제 클래스를 LinkedList로 설정
		// LinkedList를 클래스로 설정함으로써 실제 클래스별 구현을 다르게 할 수 있다.
//		List<String> lst = new LinkedList<>();

		// 실제 클래스를 바꾸어 사용하는 것의 예
		// LinkedList와 ArrayList의 동작 방식은 같으나 구현 방식이 다른 것이기 때문에
		// 실제 클래스만 변경하여 사용 가능한 것
		List<String> lst = new ArrayList<>();
		// 객체 추가
		lst.add("Java"); // add-> 맨뒤에 새 노드 추가
		lst.add("C");
		lst.add("C++");
		lst.add("Python");

		System.out.println(lst);

		// 객체 삽입(중간에 객체 삽입)
		lst.add(2, "C#"); // 2번 인덱스에 위치에 C#추가

		lst.add("Java"); // 중복 값 허용

		System.out.println(lst);

		// 요소의 갯수 확인
		System.out.println("요소의 갯수 : " + lst.size()); // capacity는 확인할 수 없다. 동적으로 동작하기 때문에

		// 요소의 삭제
		// 방법1. 인덱스를 이용한 삭제
		lst.remove(2);
		// 방법2. 객체를 이용한 삭제
		lst.remove("Python");
		System.out.println(lst);

		// TODO: 루프
		// List,set의 경우 => Iterator 이용
		Iterator<String> it = lst.iterator();
		while (it.hasNext()) { // 뒤에 요소가 남아있는지 확인
			String item = it.next();
			System.out.print(item + " ");
		}
		System.out.println();

		// 비우기
		lst.clear();
		System.out.println(lst);

	}

}
