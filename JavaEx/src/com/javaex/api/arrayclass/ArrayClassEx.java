package com.javaex.api.arrayclass;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayClassEx {

	public static void main(String[] args) {
//		printArrayEx();
//		copyArrayEx();
//		sortEx();
//		sortCustomEx();
		searchEx();

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
			target[i] = arr[i]; // 복사
		System.out.println("배열 복사(for) : " + Arrays.toString(target));

		// 방법2 : System 객체 이용하여 복사
		System.arraycopy(arr, // 원본 배열 변수명
				0, // 원본 배열의 복사 시작 위치
				target, // 복사할 변수명
				0, // 복사할 배열의 시작 위치
				arr.length); // 복사할 길이
		System.out.println("배열 복사(system) : " + Arrays.toString(target));

		// 방법3 : Arrays.copyOf
		target = Arrays.copyOf(arr, // 원본 배열 변수명
				arr.length); // 복사할 길이
		System.out.println("배열 복사(Arrays.copyOf) : " + Arrays.toString(target));

		// 방법4 : Arrays.copyOfRange(부분 복사)
		target = Arrays.copyOfRange(arr, // 원본배열
				5, // 시작인덱스
				arr.length); // 마지막 인덱스
		System.out.println("배열 복사(Arrays.copyOfRange) : " + Arrays.toString(target));
	}

	// 배열 정렬
	// Accending -> 오름차순
	// Descending -> 내림차순
	private static void sortEx() {
		// 기본형 검색
		int[] nums = { 5, 6, 3, 2, 4, 1, 7, 9, 8, 10 };

		System.out.println("원본 : " + Arrays.toString(nums));
		// 배열 정렬 : Arrays.sort()
		Arrays.sort(nums);
		System.out.println("정렬 오름차순 : " + Arrays.toString(nums));

//		nums= new int[] {5,6,3,2,4,1,7,9,8,10};
//		System.out.println("원본 : "+Arrays.toString(nums));
//		//배열 정렬 내림차순 : Arrays.sort(배열이름, Collections.reverseOrder()); -> 기본타입에선 작동하지 않는다.
//		Arrays.sort(nums, );

		Integer num2[] = { 5, 6, 3, 2, 4, 1, 7, 9, 8, 10 };
		System.out.println("원본 : " + Arrays.toString(num2));
		// 내림차순 정렬
		Arrays.sort(num2, Collections.reverseOrder());
		System.out.println("정렬 내림차순 : " + Arrays.toString(num2));

	}

	// 정렬(사용자 정의 클래스)
	// sort()는 객체 내부에서 compareTo 메서드를 수행 -> 두 객체 선후 관계 판별
	private static void sortCustomEx() {
		Member[] members = { new Member("홍길동"), new Member("고길동"), new Member("장길산") };

		System.out.println("원본 : " + Arrays.toString(members));
		Arrays.sort(members);
		System.out.println("정렬 오름차순: " + Arrays.toString(members));
		Arrays.sort(members, Collections.reverseOrder());
		System.out.println("정렬 내림차순 : " + Arrays.toString(members));
	}

	// 배열 내 검색
	private static void searchEx() {
		// int : 기본타입 자료형, 산술연산 가능, null로 초기화 불가능
		// Integer : Wrapper 클래스(객체),null값 처리가 용이하여 sql과 연동할때 용이
		Integer num2[] = { 5, 6, 3, 2, 4, 1, 7, 9, 8, 10 };

		// 배열검색 : 이진검색이용->크기의 반을 먼저 확인 후 없다면 다음 범위내에서 이진검색을 이용
		// 이진 검색은 검색 이전에 배열이 정렬되어 있어야 한다.
		Arrays.sort(num2);
		System.out.println("정렬 : " + Arrays.toString(num2));
		int index = Arrays.binarySearch(num2, 8);
		System.out.println("9의 인덱스 : " + index);

		// String 배열의 검색
		String[] str = { "Java", "C", "C++", "Python", "Linux" };
		Arrays.sort(str);
		System.out.println("원본 : " + Arrays.toString(str));
		index=Arrays.binarySearch(str, "Python");
		System.out.println("Python의 인덱스 : "+index);
		
		//사용자 정의 객체의 검색
		Member[] members = { new Member("홍길동"), new Member("고길동"), new Member("장길산") };
		Arrays.sort(members);
		System.out.println("원본 : "+Arrays.toString(members));
		//찾고자 하는 것은 String 문자열이지만, 배열에는 Member 객체가 들어가 있기 때문에 compareTo()를 이용해야한다.
//		index=Arrays.binarySearch(members, "홍길동"); 
		index=Arrays.binarySearch(members, new Member("홍길동"));
		System.out.println("홍길동의 인덱스 : "+index);
		
	}
}
