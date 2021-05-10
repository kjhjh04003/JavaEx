package com.javaex.api.collection.list;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// 벡터의 선언 - 버퍼 가변의 연속 데이터 처리
		Vector v = new Vector();
		// size : 데이터의 크기
		// capacity : 버퍼의 크기
		System.out.println("Size : " + v.size() + "Capacity : " + v.capacity());

		// 1부터 10까지의 값을 담기
		for (int i = 1; i <= 10; i++) {
			// v.addElement(Integer.valueOf(i)) ->x
			// 값의 추가 : 기본타입은 담을 수 없고 객체만 담을 수 있다.
			v.addElement(i);
		}
		System.out.println("Size : " + v.size() + "Capacity : " + v.capacity());

		v.addElement(11); //허용량 자동 증가
		System.out.println("Size : " + v.size() + "Capacity : " + v.capacity());

		System.out.println("v : " + v);

		v.insertElementAt(12, 5); //12객체를 5번 인덱스에 추가
		System.out.println("v : " + v); 
		
		//객체 조회 : 특정 인덱스의 객체 조회
		System.out.println("5번 인덱스 객체 : "+v.elementAt(5));
		
		//객체 인덱스 조회
		System.out.println("12의 인덱스 조회 : "+ v.indexOf(12));
		
		//없는 객체의 인덱스 조회 : -1
		System.out.println("없는 객체 0의 인덱스 조회 : "+v.indexOf(0));
		
		//포함 여부 확인 
		//포함 : true / 미포함 : false
		System.out.println("v가 10을 포함? " + v.contains(10));
		
		//내부 요소들을 루프로 접근
		for(int i=0;i<v.size();i++) {
			Integer item=(Integer)v.elementAt(i);
			System.out.print(item+ " ");
		}System.out.println();
		
		//TODO:Loop 개선
		
		//버퍼 비우기
		v.clear();
		System.out.println("v : "+v);
		System.out.println("Size : "+v.size()+"Capacity : "+v.capacity());
	}

}
