package com.javaex.basics;

public class Quze {

	public static void main(String[] args) {
		
		
		//for, while 연습문제
		//1. 구구단2~9단까지
		//2. 별모야 1~6까지
		forEx();
		//whileEx();
	}
	private static void forEx() {
		//for문이용 구구단
	/*
			for(int i=2;i<=9;i++) {
				for(int j=1;j<=9;j++) {
					System.out.println(i + "*" + j + "=" + i*j);
				}
				System.out.println();
			}
			*/
			//for문 이용 별모양
			for(int i=0;i<6;i++) {
				for(int j=0;j<=i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
	}
	
	private static void whileEx() {
		
		//while 구구단
		int i=2, j=1;
	
		while(i<10) {
			while(j<10) {
				System.out.println(i + "*" + j + "=" + i*j);
				j++;
			}
			i++;
			j=1; //j를 다시 초기화 해주지 않으면 2단에서 끝나버린다.
			System.out.println();
		}
		
	}
}
