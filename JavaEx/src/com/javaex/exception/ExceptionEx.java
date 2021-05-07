package com.javaex.exception;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

//	예외사항
public class ExceptionEx {

	public static void main(String[] args) {
//		arithmeticException();
//		nullPointerExceptionEx();
//		arrayExceptionEx();
		throwExceptEx();
		
	}
	
	private static void arithmeticException() {
		//	스캐너로부터 정수를 입력받는다.
		//	100을 입력받은 수로 나눈다.
		
		double result=0;
		int num;
		
		Scanner in=new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		
		//	예외가 있다 : try -> catch -> finally 순으로 
		//	예외가 없다 : try -> finally 순으로
		//	catch블록은 순서 : 앞쪽에는 구체적인 예외 -> 마지막에 Exception(혹시나 남아있을 수 있는 예외)
		try {
//			예외 발생 가능 영역
			num=in.nextInt();
			result=100/num; //	정수를 0으로 나누며 에러가 발생한다.	
		}catch(ArithmeticException e) {
			//0으로 나눴을 때의 처리
			System.err.println("0으로는 나눌 수 없어요");
			System.err.println("에러 메시지 : "+ e.getMessage());
		}catch (InputMismatchException e) {
			System.out.println("정수를 입력해주세요!!");
		}catch (Exception e) { //	Exception은 모든 예외 처리 클래스의 부모이다. -> 구체적인 예외처리는 할 수 없다.
			e.printStackTrace(); //	에러의 전체 메시지 출력
		}finally {
			System.out.println("예외처리 종료");
		}
		
		System.out.println("결과 : "+result);
		
		in.close();
	}
	
	//	null값일 떄
	private static void nullPointerExceptionEx() {
		String str=new String("Hello");
		str = null;
		
		try {
			System.out.println(str.toUpperCase()); // toUpperCase() - 문자열을 모두 대ㅜㅁㄴ자로
		}catch(NullPointerException e) {
			System.err.println("널입니다.");
		}
		System.out.println("End of Code");
		
	}
	
	private static void arrayExceptionEx() {
		int[] intArray = new int[] {3,6,9};
		
		try {
			System.out.println(intArray[3]);			
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Error : "+e.getMessage());
			e.printStackTrace(); //전체에러 정보 출력
		}
		
		System.out.println("End of Code");
	}
	
	private static void throwExceptEx() {
		ThrowExcept te=new ThrowExcept();
		
		try {
			te.divide(100, 0);
			te.executeRuntimeException();
			te.executeException(); //IOException -> checked -> 반드시 예외 필요
		}catch (CumtomArithmeticException e) {
			System.err.println("사용자 정의 예외: "+e.getMessage());
			//상황 정보 확인
			System.err.println("num1: "+e.getMessage());
			System.err.println("num2: "+e.getMessage());
		}catch(IOException e) {
			System.err.println("예외 메시지: " +e.getMessage());
		}catch(RuntimeException e) {
			System.err.println("런타임 예외: "+e.getMessage());
		}
		System.out.println("End of Code");
	}
}
