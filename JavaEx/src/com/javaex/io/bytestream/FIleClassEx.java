package com.javaex.io.bytestream;

import java.io.File;

public class FIleClassEx {
	// file이 있는 디렉터리를 찾아내야 한다.
	// user.dir은 실행 시키고 있는 파일의 디렉터리를 의미한다.
	// user.dir = D:\java-poject\JavaEx\JavaEx\files:true
	static String rootPath = System.getProperty("user.dir") + "\\files";

	public static void main(String[] args) {
		// 파일 객체의 생성
		File root = new File(rootPath);

		// 파일이 실제 존재하는지 확인
		System.out.println(rootPath + ":" + root.exists());

		// 파일 정보 출력
		printInfo(root);
	}

	private static void printInfo(File f) {
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

		// 전달받은 파일 객체가 디렉터리인지 확인
		if (f.isDirectory()) {
			// 파일 목록 출력
			System.out.println("Directory 이름 : " + f.getName());
			File[] files=f.listFiles(); //파일의 목록을 배열에 저장할 용도
			for(File file : files) {
				if(file.isFile()) { //파일이면
					System.out.printf("    f %s - %d%n", 
							file.getName(),file.length()); //파일 이름, 파일 크기
				}else { //디렉터리이면
					System.out.printf("    d %s%n",
							file.getName());
				}
			}

		} else {
			System.out.println("File 이름 : " + f.getName());
		}
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
	}
}
