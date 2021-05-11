package com.javaex.io.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileStreamEx {
	//불러올 이미지의 경로 확인 -> source이미지를 불러들여 target으로 쓰기
	static String rootPath = System.getProperty("user.dir") + "\\files\\";
	static String source=rootPath+"img.jpg";
	static String target=rootPath+"img_copy.jpg";
	public static void main(String[] args) {
		
		try {
			InputStream is=new FileInputStream(source);
			OutputStream os=new FileOutputStream(target);
		
			int data=0;
			while((data=is.read())!=-1) {
				//출력
				os.write(data); //8.5메가 사이즈르 바이트  단위로 읽어들이기 때문에 느리다.
			}
			os.close();
			is.close();
			
			System.out.println("파일을 복사했어요!");
			//TODO : 성능 개선
		}catch(FileNotFoundException e) {
			System.err.println("파일을 찾을 수 없습니다.");
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
