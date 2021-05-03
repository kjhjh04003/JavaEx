package com.javaex.basics;
import java.util.Scanner; //java.util 패키지의 Scanner 클래스를 로드
//패키지를 import 할 때 사용 목적에 따라 정확한 패키지를 import 해주어야 한다.

public class ConsoleEx {

	public static void main(String[] args) {
		
		//consoleOutputEx();
		consoleInputEx();

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
	
	/*연습문제*/
	//자원반환 .close(); -> 정상 종료가 되었을 때에는 JVM이 알아서 닫아주지만, 어떤 이유때문에 비정상 종료가 되면 다른 프로세스에서 해당 시스템 자원을 못쓰는 경우가 발생할 수 있다.
	//콘솔 입력, 이름, 나이 입력받고 출력
	private static void consoleInputEx() {
		
		//Scanner 객체를 사용하기 위해서는 자바가 지원하는 Scanner 클래스를 import 해주어야 한다.
		//팁1. 클래스가 어느 패키지인지 모를 때, Ctrl+Shift+O -> import 할 수 있는 패키지는 보여준다.
		//팁2. 자동 완성 기능을 활용 : Ctrl+Space 키를 이용하여 원하는 패키지 선택 가능
		Scanner scanner = new Scanner(System.in); //Scanner 객체 생성
		
		System.out.println("이름을 입력해 주세요.");
		
		System.out.println("이름 :");
		String name=scanner.next();
		
		System.out.println("나이 : ");
		int age = scanner.nextInt();
		
		
		System.out.println("당신의 이름은 " + name+"이고 "+age+"살 입니다.");
		
		//쓰고 자원 닫기
		scanner.close();
	}

}
