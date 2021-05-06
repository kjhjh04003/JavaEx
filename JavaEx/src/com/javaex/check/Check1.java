package com.javaex.check;

public class Check1 {

	public static void main(String[] args) {
		
		//210506.by준형 - 실행 결과 출력
		int x=10;
		int y=20;
		int z=(++x)+(y--); //210506.by 준형 - x는 먼저 증감되어 11, y는 20으로, z에 저장 후 차감된다.
		System.out.println(z); //210506.by 준형 - z는 31
		System.out.println(x); //210506.by 준형 - 증감된 11
		System.out.println(y); //210506.by 준형 - 연산 후 차감된 19
	}

}
