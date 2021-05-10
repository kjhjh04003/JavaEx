package com.javaex.api.collection.list;

import java.util.LinkedList;
import java.util.Queue;

//큐는 입력방향, 출력방향 반대이다.
//첫번째 입력한 것이 가장 먼저 출력된다.(First In First Out:FIFO)
//중간에 삽입, 삭제 불가능
public class QueueEx {

	public static void main(String[] args) {
		// 큐 생성
		// 큐는 실제 클래스가 존재하지 않고, 인터페이스만 존재한다.
		Queue<Integer> q = new LinkedList<>();

		// 데이터의 입력
		for (int i = 1; i <= 10; i++) {
			q.offer(i);
			System.out.println("OFFER : " + q);
		}

		// peek() 조회만
		System.out.println("PEEK : " + q.peek());
		System.out.println("QUEUE : " + q);

		// 데이터 삭제
		while (!q.isEmpty()) { // queue가 비어있지 않으면 반복
			System.out.println("POLL : " + q.poll()); // poll()은 인출 후 삭제
			System.out.println("QUERE : " + q);
		}
	}
}
