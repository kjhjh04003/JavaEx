package com.javaex.basics.reftypes;

public class ArrayEx {

	public static void main(String[] args) {
		arrayBasic();
		multiDimArray();
		arrayCopyFor();
		arrayCopySystem();
	}
	
	private static void arrayBasic() {
		//선언과 초기화, 사용
		//배열의 선언
		String[] names; //type[]
		int scores[]; //식별자[]
		
		//초기화
		names=new String[] {
				"홍길동", "장길산","전우치","임꺽정"
		};
		
		//초기화
		scores = new int[4];
		//인덱스를 이용한 접근
		scores[0]=80;
		scores[1]=90;
		scores[2]=85;
		scores[3]=88;
		//scores[4]=100; //배열의 크기(범위)를 벗어난 접근은 ArrayIndexOutOfBoundsException 에러 발생
	
		//값 목록이 있을 경우
		//선언과 동시에할 때만 유효
		float heights[]= {175.3f,178.2f,165.3f,188};
		
		//출력
		for(int i=0; i<scores.length; i++) {
			System.out.printf("%s (%.2f) : score = %d%n", names[i], heights[i], scores[i]);
		}
		
		//주의	
		//scores2라는 참조배열을 만들어 scores배열을 가리키게 설정하였다. 
		//이런 상태를 참조복사라고 한다.
		int scores2[]=scores; 

		//두 객체는 같은 객체(같은 주소를 가리킨다.)
		System.out.println("scores == scores2 : " + (scores == scores2));
	
		//scores -> 내용 확인
		for(int i=0;i<scores.length;i++) {
			System.out.print(scores[i]+ "\t");
		}
		System.out.println();
		
		scores2[2]=66; //scores2와 scores는같은 주소값을 가리키게 되며, 둘 중 하나의 값을 변경하게 되면 같이 변경되게 된다.
		for(int i=0;i<scores.length;i++) {
			System.out.print(scores[i]+ "\t");
		}
		System.out.println();
	}
	
	//다차원배열-2차원
	private static void multiDimArray() {
		//2차원 배열 new type[행수][열수]
		//3차원 배열 new type[면][행수][열수]
		int[][] towDimen = new int[5][10];
		
		int table[][]= {
				{1,2,3,4,5,6,7,8,9,0},
				{2,3,4,5,6,7,8,9,0,1},
				{3,4,5,6,7,8,9,0,1,2},
				{4,5,6,7,8,9,0,1,2,3},
				{5,6,7,8,9,0,1,2,3,4}
				}; //배열의 배열
		
		//table.length = 행길이
		//배열 내부의 모든 값을 합산
		int total=0;
		System.out.println("table 배열의 행 수 : "+table.length);
		for(int row=0;row<table.length;row++) {
			for(int col=0;col<table[row].length;col++) {
				System.out.print(table[row][col]+"\t");
				total+=table[row][col];
			}
			System.out.println();
		}
		System.out.println("총계 : "+total);
	}
	
	private static void arrayCopyFor() {
		//배열은 크기 변경이 안되기 때문에
		//새 배열을 생성한 후 복사해야 한다.
		int source[]= {1,2,3};
		int target[]=new int[10];
		
		for(int i=0;i<source.length;i++) {
			//복사
			target[i]=source[i];
		}
		for(int i=0; i<target.length;i++) {
			System.out.print(target[i]+"\t");
		}
		System.out.println();
	}
	
	private static void arrayCopySystem() {
		//System 객체를 이용한 배열의 복사
		int source[]= {1,2,3};
		int target[]=new int[10];
		
		System.arraycopy(source, 0, target, 0, source.length);
		
		//출력
		for(int i=0;i<target.length;i++) {
			System.out.print(target[i]+"\t");
		}
		System.out.println();
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		//Enhanced For : 순차 객체로부터 값을 하나씩 추출하여 할당
		for(int value: target) {
			System.out.print(value+"\t");
		}
		System.out.println();
	}

}
