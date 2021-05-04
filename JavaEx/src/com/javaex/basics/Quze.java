package com.javaex.basics;

public class Quze {

	public static void main(String[] args) {
		//for, while 연습문제
		//1. 구구단2~9단까지
		//2. 별모야 1~6까지
		
		//for문이용
		/*
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.println(i + "*" + j + "=" + i*j);
			}
			System.out.println();
		}
		*/
		
		//while문 이용
		/*
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
		*/
		
		int i,j;
		//for문 이용
		for(i=0;i<6;i++) {
			System.out.print("*");
			for(j=0;j<6;j++) {
				
								
			}
			
		}
	}
}
