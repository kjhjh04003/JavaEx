package com.javaex.basics;

import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
		
		//whileEx();
		//whileGugu();
		//whileInfinity();
		dowhileEx();

	}

	private static void whileEx() {
		
		//1~10까지 반복하여 합산 구하기
		int num=1; //제어 변수
		int total=0; //합산 변수
		
		//while문은 무한 루프에 빠지기 쉬우므로 제어변수를 적절히 변경해주어야 한다.
		while(num<=10) {
			total += num; //total = total + num;
			num++;
		}
		System.out.println("총 합 : "+total);
	}
	
	private static void whileGugu() {
		
		System.out.print("구구단의 단을 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		
		int num=1;
		int dan=scanner.nextInt();
		
		while(num<=9) {
			System.out.println(dan + " * "+ num + " = " + dan*num);
			num++;
		}
		scanner.close();
	}
	
	private static void whileInfinity() {
		//while문은 무한 루프에 빠질 위험이 발생한다.
		//상황에 따라 의도적으로 무한루프를 만들기도 한다.
		//반복 조건이 항상 참(true)이여야 한다.
		while(true) {
			System.out.println("Ctrl+C to quit");
		}
	}
	
	private static void dowhileEx() {
		//while문의 반복 조건을 뒤에서 확인
		//최소 1회늰 실행해야 하는 경우 do~while문을 사용
		//사용자에게 숫자를 입력받아 모두 합산하는 코드
		//만약 사용자가 0을 입력하면 반복 종료
		
		
		int total=0;
		int value=0;
		Scanner scanner = new Scanner(System.in);
				
		do {
			System.out.print("숫자를 입력하세요 : [0이면 종료입니다.] ");
			value=scanner.nextInt();
			total += value;
		}while((value!=0));
		System.out.println("합계 : "+total);
		scanner.close();
	}
}
