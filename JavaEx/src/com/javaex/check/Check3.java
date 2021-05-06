package com.javaex.check;

public class Check3 {

	public static void main(String[] args) {
		// 534자루의 연필을 30명의 학생들에게 똑같은 개수로 나누어 줄 때
		// 학생당 몇 개를 가질 수 있고, 최종적으로 몇 개가 남는지
		// (#1)과 (#2)에 작성
		
		int pencils=534;
		int students=30;
		
		//학생 한 명이 가지는 연필 수
		int pencilesPerStudent=pencils/students;
		System.out.println(pencilesPerStudent);
		
		//남은 연필 수
		int pencilsLeft=pencils%students;
		System.out.println(pencilsLeft);

	}

}
