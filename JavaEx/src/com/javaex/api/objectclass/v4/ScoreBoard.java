package com.javaex.api.objectclass.v4;

import java.util.Arrays;

//	깊은 복제
//	얕은 복제 : 필드 값만 복제 -> 참조 타입 필드는 주소가 복사
//		참조 타입의 필드는 같은 객체를 참조하게 된다.
//	깊은 복제 : 내부에 있는 참조 필드도 복사해서 새로운 주소를 참조해야 한다.
//		Object 객체의 clone 메서드를 Override 해야한다.
public class ScoreBoard implements Cloneable{
	
	private int scores[]; //참조타입 필도
	
	//생성자
	public ScoreBoard(int[] scores) {
		this.scores=scores;
	}

	public int[] getScores() {
		return scores;
	}
	

	public void setScores(int[] scores) {
		this.scores = scores;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	public ScoreBoard getClone() {
		ScoreBoard clone=null;
		try {
			clone=(ScoreBoard)clone(); //	복제
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//1. 먼저 얕은 목제를 시도
		ScoreBoard clone=(ScoreBoard)super.clone();
		
		//2. 내부의 참조 객체 복제, 새로할당
		clone.scores=Arrays.copyOf(scores, scores.length);
		return clone();
	}
}
