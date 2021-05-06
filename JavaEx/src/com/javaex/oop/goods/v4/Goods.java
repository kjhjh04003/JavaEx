package com.javaex.oop.goods.v4;

//210506.by 준형 - this : 객체 자신을 지칭
//210506.by 준형 -  this() : 클래스 내부의 다른 생성자를 지칭
public class Goods {
	
	//210506.by 준형 - 필드 선언
	//210506.by 준형 - private 접근 제한자 사용. -> 정보 은닉 -> 동일 클래스 내부에서만 사용 가능
	private String name;
	private int price;
	
	//생성자
	public Goods(String name) {
		this.name=name;
	}
	
	//모든 필드를 초기화하는 생성자 작성
	public Goods(String name, int price) {
		//210506.by 준형 - 클래스 내부의 다른 생성자를 호출할 때는 this()를 사용한다.
		this(name);
		this.price=price;
	}
	
	//210506.by준형 - Getter(읽기만 가능) / Setter(쓰기만 가능)
	//setter가 없을 경우 해당 필드는 읽기 전용으로 된다.
	public String getName() { //210506.by준형 - 다른 클래스에서 접근해야 하기 때문에 public으로 설정
		return name; //210506.by준형 - private로 설정 된 필드를 반환
	}
	
	public void setName(String name) { //210506.by준형 - setter은 반환되는 값이 없고, 외부에서 입력받은 값을 private으로 설정된 필드에 저장
		//210506.by준형 - this.name -> 
		// 여기서 this는 전달받은 name 파라미터 값과 필드선언되어있는 값의 혼란을 줄이기 위해 필드 선언의 name앞에 this를 붙인다.
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
//	public void setPrice(int price) {
//		this.price=price;
//	}
	// 210506.by준형 - 정보 보여주기 메서드 
	
	public void showInfo() {
		System.out.printf("상품명 %s", name);
		System.out.printf("상품가격 %d%n", price);
	}

	
	
}
