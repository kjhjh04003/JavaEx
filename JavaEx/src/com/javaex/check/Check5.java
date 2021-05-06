package com.javaex.check;

public class Check5 {

	public static void main(String[] args) {
		// 210506.by 준형 - 사다리꼴 넓이 구하는 코드
		//윗변 = 5, 아랫변 = 10, 높이 = 7
		
		int lengthTop=5; //210506.by 준형 - 윗변
		int lengthBottom=10; //210506.by 준형 - 아랫변
		int height=7; //210506.by 준형 - 높이
		double area=(lengthBottom+lengthTop)*2/height;
		System.out.println(area);

	}

}
