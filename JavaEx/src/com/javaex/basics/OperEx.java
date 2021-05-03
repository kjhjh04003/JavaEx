package com.javaex.basics;

public class OperEx {

	public static void main(String[] args) {
		
		arithOperEx(); // 산술 연사자 메소드 호출
		logicOper();
		bitOper();
		bitShift();
		conditionalOper();

	}
	
	// 산술연산자
	private static void arithOperEx() {
		int a=7;
		int b=3;
		
		//부호 연산자 : + , -
		System.out.println(-a); //a*-1
		
		//사칙연산 : +, -, *, /, %
		System.out.println(a+"/"+b+"="+(a/b)); //정수/정수=정수값
		System.out.println(a+"%"+b+"="+(a%b)); //정수%정수=정수값
		
		
		//실제 나눗셈의 결과
		System.out.println((float)a/(float)b); //int a,b가 float로 변환
		System.out.println((float)a/b);
		System.out.println(a/(float)b);
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		//증감연산자 ++,--
		//위치에 따라 연산순서가 달라진다.
		//증감의 목적으로만 사용하는 것이 가독성을 높일 수 있는 코드
		a=7;
		System.out.println("a : "+a);
		System.out.println("전위 증감연산자 : "+ (++a));
		System.out.println("최종 a : "+a);
		
		a=7; //여기서 a를 다시 초기화 하지 않으면 위의 저장된 a의 값 8을 그대로 가지고 오게 된다.
		System.out.println("a : "+a);
		System.out.println("후위 증감연산자 : "+ (a++));
		System.out.println("최종 a : "+a);
		
		//나눗셈 보충
		a=7;
		//System.out.println(a/0); //에러 발생 -> 정수를 0으로 나누게 되면 ArithmeticException 오류 발생
		System.out.println((float)a/0); //Infinity
		
		//Infinity가 포함된 연산식은 향상 Infinity
		//Infinity의 체크 확인 => 유한수인지 확인
		System.out.println("7.0/0은 유한수인가? "+Double.isFinite(7.0/0));
		//Infinity가 포함된 연산식->Infinity가 나온다.
		
		System.out.println("0.0 / 0.0 ? " +(0.0/0.0)); //결과 : NaN(Not A Number) -> non이 포함된 연산식의 결과는 non이 나온다.
		
		//NaN인지 확인 - > NaN이면 연산 불가의 의미
		System.out.println("0.0 / 0.0 is NaN? "+Double.isNaN(0.0/0.0));
		System.out.println(0.0 / 0.0 +10);
		
	}
	
	private static void logicOper() {
		//비교연산, 논리연산
		//결과로 boolean 반환, 논리값으로 프로그램의 흐름제어 -> 중요
		//비교 연산자 >,>=,<,<=,==,!=
		int n1=7;
		int n2=3;
		
		System.out.println("a가 b와 같은가? "+ (n1==n2));
		System.out.println("a가 b와 같지 않은가? "+ (n1!=n2));
		
		//논리 연산 : AND(논리곱:&&), OR(논리합:||), NOT(논리부정:!)
		//-> 집합을 떠올리자
		
		int n3=5;
		
		//n3는 0초과, 10미만의 값인가?
		//조건1. n3>0
		//조건2. n3<10
		//->조건1을 만족 시키면서 조건2를 만족시키는 것 : 조건1 AND 조건2 : 교집합 영역
		boolean r1 = n3 > 0; //조건1
		boolean r2 = n3 < 10; //조건2
		boolean r1andr2 = r1 && r2; //n3>0 && n3<10
		
		System.out.println("n3가 0초과 10미만 영역에 있는가?"+r1andr2);
		
		//n3는 0 이하이거나 10이상의 값인가?
		//조건1. n3<=0
		//조건2. n3>=10
		//->조건1을 만족 시키거나 조건2를 만족시키는 것 : 조건 1 or 조건 2 : 합집합 영역
		r1=n3<=0;
		r2=n3>=10;
		boolean r1orr2=r1||r2;
		
		System.out.println("n3가 0이하이거나 10 이상 영역에 있는가? "+r1orr2);
		
		//not 논리 부정 -> true <=>false 반전
		//boolean rNot = n3 > 0 && n3 <10;
		boolean rNot = !(n3 > 0 && n3 <10); //여집합 영역
		//->n3<=0 || n3>=0
		System.out.println("논리부정 : " +rNot); //n3는 0초과, 10미만의 값 결과의 여집합 결과
	}
	
	//비트 연산자
	//비트단위로 미세한 조작이 필요할 때 사용
	//하드웨어 제어, 이미지 프로세싱
	private static void bitOper() {
		
		//논리 곱
		byte b1=0b1101;
		byte b2=0b0111;
		int result=b1&b2;//비트 논리 곱
		System.out.println("b1: " +Integer.toBinaryString(b1));
		System.out.println("b2: "+Integer.toBinaryString(b2));
		System.out.println("b1&b2: "+Integer.toBinaryString(result));
		
		//논리합
		result=b1|b2;
		System.out.println("b1|b2: "+Integer.toBinaryString(result));
		
		//비트 논리 부정
		result=~b1;
		System.out.println("~b1 :"+Integer.toBinaryString(result));
	}
	
	//비트 시프트 연산자
	//비트 단위 이동
	private static void bitShift() {
		int data=1;
		
		System.out.println(data);
		System.out.println("1비트 왼쪽 시프트 : " + Integer.toBinaryString(data <<1));
		System.out.println("1비트 왼쪽 시프트 : " + (data <<1));
		
		System.out.println("4비트 왼쪽 시프트 : " + Integer.toBinaryString(data << 4));
		System.out.println("4비트 왼쪽 시프트 : " + (data<<4));
		
		data=0b1000;
		System.out.println(data);
		System.out.println("1비트 오른쪽 시프트 : "+Integer.toBinaryString(data>>1));
		System.out.println("1비트 오른쪽 시프트 : "+(data >>1));

		System.out.println("3비트 오른쪽 시프트 : "+Integer.toBinaryString(data>>3));
		System.out.println("3비트 오른쪽 시프트 : "+(data >>3));
	}
	
	//삼항 연산자(조건부 연산자)
	private static void conditionalOper() {
		int a=11;
		
		//a가 짝수(2의 배수)면 짝수 출력, 짝수가 아니면 홀수 출력(%를 이용하여 나머지가 0인 경우가 짝수)
		String message;
		
		message= a%2==0?"짝수":"홀수";
		System.out.println("결과값 : " +message);
		
		int score=49;
		
		//80점 이상이면 Good
		//80~50점이면 pass
		//그 이하면 fail
		//복잡한 비교는 3항으로 나타나지 않고 간단한 조건일 때 사용
		message=score>=80?"Good":score>=50?"Pass":"Fail";
		System.out.println("결과값 : "+message);
	}
	
}
