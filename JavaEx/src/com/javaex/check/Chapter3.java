package com.javaex.check;

public class Chapter3 {

	public static void main(String[] args) {
//		check1();
//		check2();
//		check3();
//		check4();
//		check5();
//		check6();
		check7();

	}

	private static void check7() {
		//210510.by 준형 - %연산을 수행한 결과값에 10을 더하는 코드
		//NaN값을 검사해서 올바른 결과를 출력
		double x=5.0;
		double y=0.0;
		
		double z=x%y;
		
		//%의 연산 결과과 Infinity 또는 NaN인지 확인하려면 Double.Infinity() 또는 Double.isNaN()
		//Double.Infinity()-실수값을 0으로 나누면 무한하기 때문에 무한할 때 확인하는 용도
		//Double.isNaN()-실수값을 0으로 나눈 나머지의 값이 존재하지 않을뿐더러 숫자가 아니기 때문에 확인하는 용도
		if(Double.isNaN(z))
			System.out.println("0.0으로 나눌 수 없습니다.");
		else {
			double result=z+10;
			System.out.println("결과 : "+result);
		}

	}

	private static void check6() {
		//210510.by 준형 - 연산식의 출력결과
		int x=10;
		int y=5;
		
		System.out.println((x>7)&&(y<=5)); //true
		System.out.println((x%3==2)||(y%2!=1)); //false
	}

	private static void check5() {
		// 210506.by 준형 - 사다리꼴 넓이 구하는 코드
		// 윗변 = 5, 아랫변 = 10, 높이 = 7

		int lengthTop = 5; // 210506.by 준형 - 윗변
		int lengthBottom = 10; // 210506.by 준형 - 아랫변
		int height = 7; // 210506.by 준형 - 높이
		double area = (double) ((lengthBottom + lengthTop) * height / 2);
		System.out.println(area);

	}

	private static void check4() {
		// 십의 자리 이하를 버리는 코드
		// 변수 value의 값이 356이라면 300이 나올 수 있도록
		// (#1)에 작성 - 산술 연산자만 사용

		int value = 356;
		System.out.println(value - (value % 300));

	}

	private static void check3() {
		// 534자루의 연필을 30명의 학생들에게 똑같은 개수로 나누어 줄 때
		// 학생당 몇 개를 가질 수 있고, 최종적으로 몇 개가 남는지
		// (#1)과 (#2)에 작성

		int pencils = 534;
		int students = 30;

		// 학생 한 명이 가지는 연필 수
		int pencilesPerStudent = pencils / students;
		System.out.println(pencilesPerStudent);

		// 남은 연필 수
		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft);

	}

	private static void check2() {
		// 210506.by 준형 - 실행 결과 출력
		int score = 85;
		String result = (!(score > 90)) ? "가" : "나"; // 210506.by 준형 - score값이 90보다 큰 결과가 아니라면 "가"출력, 아니면 "나"출력
		System.out.println(result); // 210506.by 준형 - "가"출력

	}

	private static void check1() {
		// 210506.by준형 - 실행 결과 출력
		int x = 10;
		int y = 20;
		int z = (++x) + (y--); // 210506.by 준형 - x는 먼저 증감되어 11, y는 20으로, z에 저장 후 차감된다.
		System.out.println(z); // 210506.by 준형 - z는 31
		System.out.println(x); // 210506.by 준형 - 증감된 11
		System.out.println(y); // 210506.by 준형 - 연산 후 차감된 19

	}

}
