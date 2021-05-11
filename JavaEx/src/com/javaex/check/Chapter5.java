package com.javaex.check;

import java.util.Scanner;

public class Chapter5 {

	public static void main(String[] args) {
//		problem1();
//		problem2();
//		problem3();
		problem4();

	}

	private static void problem4() {
		/* 학생 수와 각 학생들의 점수를 입력받아서, 최소 점수 및 평균 점수를 구하는 프로그램 */
		boolean run=true;
		int studentNum=0;
		int[] scores=null;
		Scanner scanner=new Scanner(System.in);
		
		while(run) {
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println(" 1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료 ");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("선택 > ");
			
			int selectNo=scanner.nextInt();
			
			if(selectNo==1) {
				System.out.print("학생수> ");
				studentNum=scanner.nextInt();
				scores=new int[studentNum]; //학생수만큼 scores변수의 크기를 생성
		
			}else if(selectNo==2) {
				for(int i=0;i<studentNum;i++) {
					System.out.print("scores["+i+"]> ");
					scores[i]=scanner.nextInt();
				}
				
			}else if(selectNo==3) {
				for(int i=0;i<scores.length;i++)
					System.out.println("scores["+i+"]> "+scores[i]);
				System.out.println();
				
			}else if(selectNo==4) {
				int max=0;
				int sum=0;
				double avg=0.0;
				
				for(int i=0;i<scores.length;i++) {
					if(scores[i]>max)
						max=scores[i];
					sum+=scores[i];
					avg=(double)sum/scores.length;
				}
				System.out.println("최고 점수 : "+max);
				System.out.println("평균 점수 : "+avg);
				
			}else if(selectNo==5) {
				run=false;
			}
		}
		System.out.println("프로그램 종료");

	}

	private static void problem3() {
		/* 주어진 배열의 전체 항목의 합과 평균값 구하기(for문 구하기) */
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };

		int sum = 0;
		double avg = 0.0;

		int n = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				n++;
			}
			avg = (double) sum / n;
		}
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
	}

	private static void problem2() {
		/* 주어진 배열의 항목에서 최대값 구하기(for문 구하기) */
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max)
				max = array[i];
		}
		System.out.println("max : " + max);

	}

	private static void problem1() {
		/* array.length의 값과 array[2].length값 */
		int[][] array = { { 95, 86 }, { 83, 92, 96, }, { 78, 83, 93, 87, 88 } };

		System.out.println("array의 길이 : " + array.length);
		System.out.println("array[2]의 길이 : " + array[2].length);
	}

}
