package com.javaex.basics;

public class OperEx {

	public static void main(String[] args) {
		//logicOper();
		bitOper();
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

}
