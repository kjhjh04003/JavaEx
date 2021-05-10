package com.javaex.api.arrayclass;

import java.util.Arrays;
import java.util.Collection;

public class ArrayClassEx {

	public static void main(String[] args) {
//		printArrayEx();
//		copyArrayEx();
		sortEx();

	}

	private static void printArrayEx() {
		int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// 출력
		System.out.println("arr[] : " + arr);

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();

		// Arrays.toString(); -> 배열의 문자값 리턴
		System.out.println("arr[]: " + Arrays.toString(arr));
	}

	private static void copyArrayEx() {
		int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// 복제
		// 방법1 : 루프를 돌면서 복사
		int target[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++)
			target[i] = arr[i]; //복사
		System.out.println("배열 복사(for) : "+Arrays.toString(target));
		
		//방법2 : System 객체 이용하여 복사
		System.arraycopy(arr, //원본 배열 변수명
				0, //원본 배열의 복사 시작 위치
				target, //복사할 변수명
				0, //복사할 배열의 시작 위치
				arr.length); //복사할 길이
		System.out.println("배열 복사(system) : "+Arrays.toString(target));
		
		//방법3 : Arrays.copyOf
		target=Arrays.copyOf(arr, //원본 배열 변수명
				arr.length);	//복사할 길이
		System.out.println("배열 복사(Arrays.copyOf) : "+Arrays.toString(target));
		
		//방법4 : Arrays.copyOfRange(부분 복사)
		target=Arrays.copyOfRange(arr,	//원본배열
				5, //시작인덱스
				arr.length); //마지막 인덱스
		System.out.println("배열 복사(Arrays.copyOfRange) : "+Arrays.toString(target));
	}
	
	//배열 정렬
	//Accending -> 오름차순
	//Descending -> 내림차순
	private static void sortEx() {
		//기본형 검색
		int[] nums= {5,6,3,2,4,1,7,9,8,10};
		
		System.out.println("원본 : " +Arrays.toString(nums));
		//배열 정렬 : Arrays.sort()
		Arrays.sort(nums);
		System.out.println("정렬 오름차순 : "+Arrays.toString(nums));
		
//		nums= new int[] {5,6,3,2,4,1,7,9,8,10};
//		System.out.println("원본 : "+Arrays.toString(nums));
//		//배열 정렬 내림차순 : Arrays.sort(배열이름, Collections.reverseOrder())
//		Arrays.sort(nums, );
	}
	//배열 내 검색
}
