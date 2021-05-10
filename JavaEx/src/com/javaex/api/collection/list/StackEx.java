package com.javaex.api.collection.list;

import java.util.Stack;

//스택 : 입력과 출력이 한쪽 방향에서만 이루어진다.
//중간에 삽입, 삭제 불가
public class StackEx {

	public static void main(String[] args) {
		// 스택 선언
		Stack<Integer> s = new Stack<>();
		
		// 입력, 1~10개 데이터 입력
		for(int i=1;i<=10;i++) {
			//스낵에 데이터 입력 : push() 사용
			s.push(i);
			System.out.println("PUSH : "+s); //항상 마지막에서 데이터가 삽입된다.
		}
		
		// 가장 위의 데이터 확인 : peek() 사용
		//peek()는 데이터를 확인하는 용도로 사용, 데이터를 삭제하지 않는다.
		System.out.println("PEEK : "+s.peek());
		System.out.println("Stack : "+s);
		
		//데이터 인출 : pop() 사용
		//peek()와 다르게 pop()을 사용하면 데이터를 추출하고 삭제한다.
		System.out.println("POP : "+s.pop());
		System.out.println("Stack : "+s);
		
		//주의 : 스택이 비어있는 상태에서 pop() -> EmptyStackException
		while(!s.empty()) { //스낵이 비어 있지 않으면 실행, 아니면 while문을 벗어난다.
			//마지막 하나까지 인출한 후 스택이 비어있을 때 pop()이 이루어지면 에러가 난다. -> stackunderflow <->stackoverflow
			System.out.println("POP : "+s.pop()); 
			System.out.println("Stack : "+s);
		}

	}

}
