package com.javaex.check;

public class Check4 {

	public static void main(String[] args) {
		// 십의 자리 이하를 버리는 코드
		// 변수 value의 값이 356이라면 300이 나올 수 있도록
		// (#1)에 작성 - 산술 연산자만 사용
		
		int value=356;
		System.out.println(value-(value%300));

	}

}
