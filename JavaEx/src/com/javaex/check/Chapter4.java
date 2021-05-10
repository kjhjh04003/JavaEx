package com.javaex.check;

import java.util.Random;
import java.util.Scanner;

public class Chapter4 {

	public static void main(String[] args) {
//		problem1();
//		problem2();
//		problem3();
//		problem4();
		problem5();


	}

	private static void problem5() {
		/*while문과 스캐너 이용
		 * 예금, 출금, 조회, 종료 기능 작성*/
		boolean run=true;
		int balance=0;
		Scanner sc=new Scanner(System.in);

		while(run) {
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println(" 1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("선택> ");
			int n=sc.nextInt();
			
			switch(n) {
			case 1:
				System.out.println("예금액> ");
				balance+=sc.nextInt();
				break;
			case 2:
				System.out.println("출금액> ");
				balance-=sc.nextInt();
				break;
			case 3:
				System.out.println("잔고> "+balance);
				break;
			case 4:
				System.out.println("프로그램 종료");
				System.exit(0);
				break;
			}
		}
	}

	private static void problem4() {
		/*for문을 이용해서 삼각형을 출력*/
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++)
				System.out.print("*");
			System.out.println();
		}
	}

	private static void problem3() {
		/*
		 * 중첩 for문을 이용하여 방정식4x+5y=60의 모든 해를 구해서 (x,y)형태로 출력 x,y는 10 이하의 자연수
		 */
		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				if (((4 * x) + (5 * y)) == 60)
					System.out.printf("%d, %d%n", x, y);
			}
		}
	}

	private static void problem2() {
		/*
		 * while문과 Math.random()메소드 이용 두 개의 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2)형태로 출력 눈의 합이 5가
		 * 아니면 계속 주사위를 던지고 눈의 합이 5면 실행중단
		 */
//		Random r=new Random(6);

		while (true) {
			int r1 = (int) (Math.random() * 6 + 1);
			int r2 = (int) (Math.random() * 6 + 1);
			if ((r1 + r2) != 5) {
				System.out.printf("(%d, %d)%n", r1, r2);
			} else {
				System.out.printf("(%d, %d)%n", r1, r2);
				break;
			}

		}

	}

	private static void problem1() {
		/* for문을 이용해서 1~100까지 정수 중에서 3의 배수의 총합 */
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0)
				sum += i;
		}
		System.out.println("3의 배수의 합 : " + sum);

	}

}
