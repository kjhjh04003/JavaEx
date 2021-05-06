package com.javaex.oop;

//210506.by 준형 - 메서드 관련 예제 정리
public class MethodEx {
	public static void main(String[] args) {
		
		printMessage();
		System.out.println("SQUARE:"+square(2));
		System.out.println("4 + 5= "+getSum(4, 5));
		printDivide(7, 3);
		//210506.by 준형 - 정수를 0으로 나누게 되면 오류가 나게된다. 해당 메서드에 0일 때 메서드를 종료할 수 있는 return문을 써준다.
		printDivide(7, 0);
		
		System.out.println(getSumArr(new double[] { 1,2,3,4,5,6,7,8,9,10 }));
		
		System.out.println(getSum(1,2,3,4,5,6,7,8,9,10));
		
		printSum("합계: ", 1,2,3,4,5,6,7,8,9); //210506.by준형 - 합계는 message 인자값으로 전달, 뒤의 숫자는 가변 인수값으로 전달
	}
	
	

	//210506.by 준형 - 입력이 없고, 반환이 없는 메서드 -> void로 막아주어야 한다.
	private static void printMessage() {
		System.out.println("Message");
	}
	
	//210506.by 준형 - 입력이 있고, 반환이 있는 메서드
	//210506.by 준형 - 매개변수는 메서드를 벗어나면 효력이 없다.
	//210506.by 준형 - 반환 타입과 일치하는 데이터를 return 해야 한다.
	private static double square(double num) {
		return num*num;
	}
	
	//210506.by 준형 - 매개 변수의 갯수는 필요한 만큼
	private static double getSum(double num1, double num2) {
		return num1+num2;
	}
	
	//210506.by 준형 - return문을 만나면 메서드 실행을 중단하고 호출한 쪽으로 흐름이 돌아간다.
	private static void printDivide(int num1, int num2) {
		if(num2==0) {
			System.out.println("0으로는 나눌 수 없습니다.");
			return; //210506.by 준형 - return 타입을 잡아주지 않았기 때문에 return뒤에 아무것도 쓰지 않아도 된다.
		}
		System.out.printf("%d / %d = %d%n", num1, num2, (num1/num2));
	}
	
	// 210506.by 준형 - 매개변수로 배열을 전달
	private static double getSumArr(double[] values) {
		//210506.by 준형 - 전달받은 배열의 요소값을 합산 변환
		double total=0; //210506.by 준형 - 합산 변수 선언 및 초기화
		
		for(double value: values) { //210506.by준형 - 전달받은 배열의 길이만큼 반복
			total+=value;
		}
		return total;
	}
	
	//210506.by 준형 - 가변 변수 : ... 사용
	// 210506.by준형 - ...values는 가변 변수로 사용자가 호출할 때 개수 제한을 두지 않는다.
	private static double getSum(double ...values) {
		/*
		double total=0;
		
		for(double value: values) { //210506.by준형 - 전달받은 배열의 길이만큼 반복
			total+=value;
		}
		
		return total;
		*/
		return getSumArr(values); //210506.by준형 - 위의 getSumArr와 동일한 로직을 갖기 때문에 getSumArr메서드를 그대로 호출할 수 있다.
	}
	
	//210506.by준형 - 고정 인수값 + 가변 인수값 같이 쓸 수 있다.
	//210506.by준형 - 제약 : 고정 인수를 먼저 선언, 뒤에 가변 인수를 선언
	// 메시지를 전달받고, 가변 인수로 숫자값을 전달받기
	private static void printSum(String message, double ...values) {//210506.by준형 - message는 고정 인수, values는 가변 인수 
		System.out.println(message + ", " + getSum(values));
	}

}
