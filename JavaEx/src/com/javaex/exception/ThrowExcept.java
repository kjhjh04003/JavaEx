package com.javaex.exception;

import java.io.IOException;

//	예외 두 종류
//	종류1. checked Excption -> 반드시 예외처리를 해줘야 한다.
//	종류2. runtime Exception -> 예외처리를 해주지 않아도 된다.
public class ThrowExcept {
	//	Checked Excption
	public void executeException() throws IOException{
		System.err.println("강제 예외 발생");
		throw new IOException("강제 예외"); //	IOException는 checked Excption이다.
	}
	
	//	Unchecked Exception
	public void executeRuntimeException() {
		System.err.println("강제 런타임 예외");
		throw new RuntimeException("런타임 예외");
	}

	public double divide(int num1, int num2) {
		double result;
		
		try {
		//	일반적인 예외 -> 가급적이면 구체적인 예외로 전환해서
		//	예외 상황에서의 상황 정보를 담고 있는 것이 좋다.
		result=num1/num2;
		}catch (ArithmeticException e) {
			//구체적인 예외로 전환
			System.err.println("예외의 전환");
			throw new CumtomArithmeticException("사용자 정의 예외", num1, num2);
		}
		return result;
	}
}
