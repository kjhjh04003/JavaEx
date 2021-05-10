package com.javaex.api.stringclass;

public class StringEx {

	public static void main(String[] args) {
		stringBasic();
		usefulMethods();
		stringBufferEx();

	}
	
	private static void stringBasic() {
		String s1="Java"; //	리터럴
		String s2=new String("Java"); //	새 객체
		String s3 = "Java"; //	리터럴
		
		System.out.println("s1 == s2 ? "+(s1==s2)); //	리터럴 vs new
		System.out.println("s1 == s3 ? "+(s1==s3)); //	리터럴 vs 리터럴
		System.out.println("s2 == s3 ? "+(s2==s3)); //	new vs 리터럴
	
		//valueOf() 메서드 : 기본타입 -> 문자열로 리턴(변환)
		String s4=String.valueOf(Math.PI);
		System.out.println("valueOf 메서드 : "+s4);
	}
	
	private static void usefulMethods() {
		String str="Java Programming JavaScript Programming";
		
		//길이를 잡을 수 있고, 인덱스 접근 가능
		
		System.out.println("LENGTH: "+str.length());
		System.out.println("5번 인덱스의 글자 : "+str.charAt(5));
		
		//변환 메서드
		System.out.println("소문자 변환: "+str.toLowerCase());
		System.out.println("대문자 변환: "+str.toUpperCase());

		//검색 관련(중요)
		int idx;
		idx=str.indexOf("Java");
		System.out.println("1번째 검색 : "+idx);
		
		idx=str.indexOf("Java", idx+4);
		System.out.println("2번째 검색 : "+idx);
		
		idx=str.indexOf("Java", idx+4);
		System.out.println("3번쨰 검색 : "+idx); //	-1이 나오는 경우는 찾는 것이 없다는 뜻이다.
		
		//역방향 검색
		System.out.println("역방향 검색 : "+str.lastIndexOf("Java"));
		
		//문자열 추출
		System.out.println("substring : "+str.substring(5)); //5번 인덱스부터 끝까지 출력
		System.out.println("substring : "+str.substring(5,16));
	
		//치환
		System.out.println("replace : "+str.replaceAll("Java", "java"));
	
		//공백문자 제거
		String s2="                    Hello           ";
		String s3="         . Java           ";
		
		System.out.println(s2+s3); //공백 포함 출력
		System.out.println(s2.trim()+s3.trim());
	
		//문자 분할 : split
		String[] chunks=str.split(" "); //공백 문자를 기준으로 문자열 분할
		for(String chunk: chunks) {
			System.out.println("WORD: "+chunk);
		}
		
		//문자열 비교 : Unicode 비교
		//같으면 0, 앞의 것이 작으면(먼저면) 음수, 크면(뒤면) 양수
		System.out.println("ABC".compareTo("ABD"));
		System.out.println("ABD".compareTo("ABC"));
	}
	
	//문자열 객체 : 연결, 메서드 수행 시 매번 새 String 반환
	//StringBuffer : 버퍼 가변으로 작동 -> 메모리 절약
	private static void stringBufferEx() {
		//버퍼 생성
		StringBuffer sb=new StringBuffer("This"); 
		
		//문자열 추가 : append
		sb.append(" is pencil");
		
		//문자열 삽입 : insert
		sb.insert(8, "my");
		
		//문자열 치환 : replace
		sb.replace(8, 10, "your ");
		
		System.out.println(sb);
		
		//버퍼 사이즈 변경
		sb.setLength(10); //내부 버퍼의 크기를 10으로 줄인다.
		System.out.println(sb);
		
		//StringBuffer의 메서드를 연속해서 호출 -> 메서드 체이닝 이라고 한다.
		StringBuffer sb2=new StringBuffer("This ").append("is pencil")
				.insert(8, " my").replace(8, 10, "your ");
		
		String s=sb2.toString();
		System.out.println("결과 : " +s);
	}
}
