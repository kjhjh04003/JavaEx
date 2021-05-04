package com.javaex.basics;

import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
		
		//whileEx();
		//whileGugu();
		//whileInfinity();
		//dowhileEx();
		//forLoofEx();
		//continueEx();
		//breakEx();
		randomEx();
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
	
	private static void forLoofEx() {
		//for문을 이용하여 구구단
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("단을 입력하세요 : ");
		
		int dan=scanner.nextInt();
		
		//for(제어변수초기화;반복조건체크;증감식)
		for(int i=1; i<=9; i++) {
			System.out.println(dan + "*" + i + "=" + (dan*i));
		}
		
		scanner.close();
	}
	
	private static void continueEx() {
		//1~20 중 2의 배수, 3의 배수를 제외한 나머지를 출력
		
		for(int i=1;i<=20;i++) {
			if(i%2==0||i%3==0)
				continue; //2의배수이거나 3의 배수이면 뒷 문장을 수행하지 않는다.
			System.out.println(i);
		}
	}
	
	private static void breakEx() {
		//6의 배수이자 14의 배수
		
		System.out.println("6의 배수이자 14의 배수인 가장 작은 숫자를 찾아보자.");
		
		int i=1; //제어변수
		while(true) {
			if(i%6==0 && i%14==0)
				break;
			//System.out.println(".");
			i++;
		}
		System.out.println("\n"+i);
	}
	
	private static void randomEx() {
		//int num=(int)(Math.random()*최대값)+최소값;
		//1~45 임의의 6개 숫자 출력(쭝복 제외)
		/*
		for(int i=1;i<6; i++) {
			int randnum=(int)(Math.random()*45)+1;
			System.out.print(randnum+"  ");
		}
		System.out.println();
		*/
		
		int i=0;
		
		while(i<6) {
			System.out.println((int)(Math.random()*45)+1);
			System.out.print("  ");
			i++;
		}
		System.out.println();
	}
}
