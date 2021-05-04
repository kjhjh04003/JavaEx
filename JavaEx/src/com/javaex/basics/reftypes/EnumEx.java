package com.javaex.basics.reftypes;

public class EnumEx {

	public static void main(String[] args) {
		enumBasic();
		enumBasic();
		enumEx();
	}
	
	private static void enumBasic() {
		//enum의 여러가지 메서드들
		Week today=Week.TUESDAY;
	
		System.out.printf("Today is %s(%d)%n", today.name(), today.ordinal());
	
		String dayStr = "FRIDAY";
		Week other = Week.valueOf(dayStr); //문자열을 열거 상수로 변환하는 작업
	
		System.out.printf("Other is %s(%d)%n", other.name(), other.ordinal());
	
		//순번 비교
		int diff=today.compareTo(other);
		System.out.println("today와 other의 순번차: "+diff);
		int diff1=other.compareTo(today);
		System.out.println("today와 other의 순번차: "+diff1);
	}
	
	private static void enumEx() {
		//switch문을 enum으로 변경
		Week today=Week.TUESDAY;
String act="";
		
		//월~목요일 까지는 act=열공
		//금요일 act=불금
		//토요일 act=
		//일요일 act=휴식
		//나머지는 요일을 입력하세요.
		
		switch(today) {
		case MONDAY: //case에는 Week enum에 있는 값만 사용 가능
		case THURSDAY:
		case WENDESDAY:
		case TUESDAY:
			act="열공";
			break;
		case FRIDAY:
			act="불금";
			break;
		case SATURDAY:
			act="주말";
			break;
		case SUNDAY:
			act="휴식";
			break;
		default:
			System.out.println("???");
			
		}
		System.out.printf("%s에는 %s%n",today.name(),act);
	}

}
