package com.javaex.io.charstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx {
//Scanner는 여러가지 입력 소스로부터 데이터 입력 받는 클래스
	static String rootPath = System.getProperty("user.dir") + "\\files\\";
	static String filename = rootPath + "thieves.txt";

	public static void main(String[] args) {
		// 파일 정보 설정
		File file = new File(filename);

		try {
			Scanner sc = new Scanner(file);

			String name;
			float height;
			float weight;

			// 줄 단위 읽어오기
			while (sc.hasNextLine()) { // 라인이 끝났는지
				name = sc.next(); // 문자열
				height = sc.nextFloat(); // 실수형
				weight = sc.nextFloat(); // 실수형

				System.out.printf("이름 : %s, 키 : %f, 몸무게 : %f%n", name, height, weight);

				sc.nextLine(); // thieves.txt의 5번째 줄

			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
