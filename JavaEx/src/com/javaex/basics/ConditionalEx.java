package com.javaex.basics;

import java.util.Scanner;

public class ConditionalEx {

	public static void main(String[] args) {
		
		//ifElseEx();
		ifElseEx2();

	}
	
	private static void ifElseEx(){
		
		//정수를 입력 받는다.
		// 양수, 음수, 0을 출력
		Scanner scanner=new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		
		int num=scanner.nextInt();
		
		//일반적인 if문
		/*if(num>0) {
			System.out.println(num+"은 양수입니다.");
		}
		else if(num<0) {
			System.out.println(num+"은 음수입니다.");
		}
		else
			System.out.println(num+"은 0입니다.");
		*/
		
		//중첩 if문
		if(num==0) {
			System.out.println(num+"은 0입니다.");
		}
		else { //0이 아닌 것들
			if(num>0)
				System.out.println(num+"은 양수입니다.");
			else
				System.out.println(num+"은 음수입니다.");
		}
		scanner.close();
	}
	
	private static void ifElseEx2() {
		//정수 입력
		//양수일 때, 짝수 /홀수 출력
		//음수일 때, 음수 출력
		//0일때에는 0출력
		Scanner scanner=new Scanner(System.in);
		System.out.print("정수를 입력해주세요 : ");
		int num=scanner.nextInt();
		
		if(num>0) {
			if(num%2==0)
				System.out.println(num+"은 짝수입니다.");
			else
				System.out.println(num+"은 홀수입니다.");
		}
		else {
			if(num<0)
				System.out.println(num+"은 홀수입니다.");
			else
				System.out.println(num+"은 0입니다.");
		}
		
		scanner.close();
	}
	 

}
