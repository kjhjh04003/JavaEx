package com.javaex.basics;

import java.util.Scanner;

public class ConditionalEx {

	public static void main(String[] args) {
		
		//ifElseEx();
		//ifElseEx2();
		//ifElseEx3();
		//switchEx();
		//switchEx1();
		switchEx2();
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
	 
	private static void ifElseEx3() {
		
		//과목번호 입력받아 강의실 번호 출력
		Scanner scanner=new Scanner(System.in);
		System.out.println("과목 번호 입력: 1. Java 2. C, 3. C++, 4. 파이썬");
		
		int subject=scanner.nextInt();
		
		if(subject==1) {
			System.out.println("R101");
		}
		else if(subject==2) {
			System.out.println("R202");
		}
		else if(subject==3) {
			System.out.println("R303");
		}
		else if(subject==4) {
			System.out.println("R404");
		}
		else
			System.out.println("상담원에게 문의하세요.");
	
		scanner.close();
	}
	
	private static void switchEx() {
		//ifElseEx3을 switch-case문으로 변경//과목번호 입력받아 강의실 번호 출력
		Scanner scanner=new Scanner(System.in);
		System.out.println("과목 번호 입력: 1. Java 2. C, 3. C++, 4. 파이썬");
		
		int subject=scanner.nextInt();
		
		//특별한 경우가 아니면 case문과 break문을 쌍으로 생각하자.
		switch(subject) {
		case 1:
			System.out.println("R101");
			break; ///break를 사용하지 않으면 입력값과 같은 case값부터 끝까지 모든것을 출력한다.
		case 2:
			System.out.println("R202");
			break;
		case 3:
			System.out.println("R303");
			break;
		case 4:
			System.out.println("R404");
			break;
		default:
			System.out.println("상담원에게 문의하세요.");
		}
		
		scanner.close();
	}
	
	//해당 월의 일수를 출력
	private static void switchEx1() {
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("월을 입력해주세요 : ");
		
		int month=scanner.nextInt();
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31일 까지입니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일 까지입니다.");
			break;
		case 2:
			System.out.println("28일 까지입니다.");
			break;
		default:
			System.out.println("1에서 12 사이의 숫자를 입력해주세요.");
		}
		
	}
	
	private static void switchEx2() {
		//코드 값을 문자열로 전달하는 경우
		//오타 발생 가능, 원하지 않는 입력이 넘어오는 경우가 있다.
		//코드의 집합을 별도로 선언하여 입력값을 제한해주어야 한다.
		//TODO:enum 열거형으로 재작성으 해 볼 것
		String day = "월요일";
		String act="";
		
		//월~목요일 까지는 act=열공
		//금요일 act=불금
		//토요일 act=
		//일요일 act=휴식
		//나머지는 요일을 입력하세요.
		
		switch(day) {
		case "월요일":
		case "화요일":
		case "수요일":
		case "목요일":
			act="열공";
			break;
		case "금요일":
			act="불금";
			break;
		case "토요일":
			act="주말";
			break;
		case "일요일":
			act="휴식";
			break;
		default:
			System.out.println("???");
			
			
		}
		System.out.println(day+"은 " +act);
	

}
}