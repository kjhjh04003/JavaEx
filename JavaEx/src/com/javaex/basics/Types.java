package com.javaex.basics;

// 기본 타입 예제
public class Types {

	public static void main(String[] args) {
		/*
		integerTypes(); //정수형 메소드 호출
		floatTypes(); //실수형 메소드 호출
		booleanEx(); //논리형 메서드 호출
		charEx(); //문자형 메서드 호출
		constantEx(); //상수형 메서드 호출
		implicitCasting(); //암묵적 형변환 메서드 호출
		*/
		explicitCasting(); //명시적 형변환 메서드 호출
	}
	
	//정수형 자료 예제
	private static void integerTypes() {
		// byte(!) < short(2) < int(4) < long(8)
		//선언
		int intVar1;
		int intVar2;
		long longVar1;
		long longVar2;
		
		//초기화
		intVar1 = 2021; //int는 4byte기 때문에 정상 출력
		//intVar2 = 12345678901234; int는 4byte이기 때문에 크기를 초과하는 것은 에러
		
		//정수형 데이터의 기본은 int
		longVar1 = 2021;
		longVar2 = 12345678901234L; //뒤에 L or l을 붙여 long형임을 알려줘야 한다.
		
		//출력
		System.out.println(intVar1);
		System.out.println(longVar1);
		System.out.println(longVar2);
		
		//2진수, 8진수, 16진수 형태로 입력 가능
		int bin = 0b1101; //2진수를 나타내기 위해선 0b를 붙여준다.
		int oct = 072; // 8진수를 나타내기 위해선 0을 붙여준다.
		int hex = 0xFF; //16진ㅅ를 나타내기 위해선 0x 붙여준다.
		
		System.out.println("0b1101 -> " + bin);
		System.out.println("072 -> " + oct);
		System.out.println("0xFF -> " + hex);
	}
	
	//실수형 자료 예제
	private static void floatTypes() {
		
		//선언과 초기화
		//실수형은 기본이 doule
		float floatVar = 3.12345f; //뒤에 F or f을 붙여 float형임을 알려줘야 한다
		double doubleVar = 3.12345;
		
		//출력
		System.out.println("floatVar : " + floatVar);
		System.out.println("doubleVar : " + doubleVar);
		
		//지수 표기법 m * 10의 n승
		int intVar = 3000000;
		floatVar = 3E6f; //3.0*10 ^ 6
		doubleVar = 3E-6; //3.0*10 ^ -6
		
		//주의 : float, double -> 정밀도를 포기, 표현 범위를 넓힌 자료형 -> 오차
		System.out.println(0.1 * 3);
		System.out.println(floatVar);
		System.out.println(doubleVar);
	}
	
	//논리형 자료 예제
	private static void booleanEx() {
		
		//선언, 초기화
		boolean b1 = true; //참
		boolean b2 = false; //거짓
		
		//출력
		System.out.println("b1 -> " + b1);
		System.out.println("b2 -> " +b2);
		
		//비교 연산, 논리 연산의 결과를 담을 수 있는 자료형
		//선언, 초기화
		int var1 = 7;
		int var2 = 5;
		boolean result = var1 > var2; //var1이 var2보다 큰가?의 결과르르 저장
		
		System.out.println( var1 + " > " + var2 + ":" + result);
	}
	
	//문자형 자료 예제
	//내부에 문자에 해당하는 부호 없는 정수 코드 저장(2바이트)
	private static void charEx() {
		char ch1 = 'A'; //내부에서는 정수형 코드 저장 65
		char ch2= '한'; //4620
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		System.out.println(ch1 + ch2);
		
		//문자는 '' , 문자열은 ""
		String str = "Java";
		System.out.println(str);
	}
	
	//상수 예제
	//이유1 . 변경되면 안되는 값을 보호하고자 사용
	//이유2 . 코드이 가독성을 높일 때 사용
	private static void constantEx() {
		float PI = 3.14159f;
		final int SPEED_LIMIT = 110; //상수 생성 -> final
		
		System.out.println("PI : " + PI);
		System.out.println("SPEED_LIMiT : " + SPEED_LIMIT);
		
		int speed = 105;
		
		//과속 단속
		boolean overspeed = speed > SPEED_LIMIT;
		
		System.out.println("과속을 했는가 ? " + overspeed);
		
		//내부에서 고의로든 실수로든 변경되면 안되는 값 -> 상수
		//SPEED_LIMIT = 80;
		overspeed = speed > SPEED_LIMIT;
		System.out.println("과속을 했는가 ? " + overspeed);
		
	}
	
	//암묵적 형변환
	//표현의 범위 좁은 자료형 -> 넓은 자료형으로 변환 -> 자료의 유실은 일어나지 않는다.
	//명시적으로 변환하지 않아도 자바가 변환해준다.
	private static void implicitCasting() {
		//byte(1) < short(2) < int(4) < long(8)
		//float(4) < double(8)
		byte b = 10; //1바이트 정수형
		System.out.println("byte : "+b);
		int i=b; //4바이트 정수형
		System.out.println("int : "+b);
		long l=i; //8바이트 정수형
		System.out.println("long : "+l);
		float f=l; //4바이트 실수형
		System.out.println("float : "+f); //long 정수형 10이 float 실수형 10.0으로 출력
		double d=f;
		System.out.println("double : +d");
		
	}
	
	//명시적 형변환
	//표현의 범위가 넓은 자료형 -> 좁은 자료형으로 변환 -> 자료의 유실이 발생할 수도 있다.
	//개바자가 명시적으로 변환을 해줘야 한다.
	private static void explicitCasting(){
		byte b; //1바이트 정수형
		int i=2021; //4바이트 정수형
		float f=123.456f; //4바이트 실수형
		
		System.out.println(Integer.toBinaryString(i)); //10진수 형태를 2진수 형태로 표현하는 방법. Integer.toBinaryString(i)
		b=(byte)i; //int형 i를 byte형으로 강제변환
		System.out.println("int " +i+"->byte "+b);
		
		i=(int)f; //float형 f를 int형 정수로 강제 변환
		System.out.println("float "+f+"->int "+i);
	}

}
