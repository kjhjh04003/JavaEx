package com.javaex.basics;

public class ConsoleEx {

	public static void main(String[] args) {
		
		consoleOutputEx();

	}
	
	private static void consoleOutputEx() {
		
		//콘솔 출력
		//System.out -> 표준 출력
		//System.err ->  표준 에러
		//System.in -> 표준 입력
		
		//print메서드 -> 출력 후 개행안함
		//println메서드 -> 출력 후 개행함
		//printf 메서드 -> 형식화된 출력 => TODO:뒤쪽 String 항목에서 정리
		
		System.out.print("Hello ");
		System.out.println("Java");
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		//이스케이프 시퀀스 : 특수한 의미를 가진 문자를 표기하기 위해서 사용
		System.out.println("Hello\nJava"); //\n 개행
		System.out.println("Hello\tJava"); //\t tab
		System.out.println("Hello, \"Java\""); // \"큰따옴표 사용 가능
		
		String dir="C:\\Windows\\System"; // \\경로를 나타낼 때 사용될 수 있다.
		System.out.println("경로 : "+dir);
		
		System.err.println("표준 에러 출력");
		
		
	}

}
