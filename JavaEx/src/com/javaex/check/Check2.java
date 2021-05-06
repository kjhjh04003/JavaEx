package com.javaex.check;

public class Check2 {

	public static void main(String[] args) {
		//210506.by 준형 - 실행 결과 출력
		int score=85;
		String result=(!(score>90))?"가":"나"; //210506.by 준형 - score값이 90보다 큰 결과가 아니라면 "가"출력, 아니면 "나"출력
		System.out.println(result); //210506.by 준형 - "가"출력
	}

}
