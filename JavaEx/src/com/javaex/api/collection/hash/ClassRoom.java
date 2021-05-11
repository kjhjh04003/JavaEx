package com.javaex.api.collection.hash;

public class ClassRoom {
	private String subject;
	private String roomName;
	
	//생성자 및 초기화
	public ClassRoom(String subject) {
		this.subject=subject;
	}
	
	public ClassRoom(String subject, String roomName) {
		this(subject);
		this.roomName=roomName;
	}

	//containsValue 할 때 객체의 동등성을 비교하기 위해
	//hashCode : 객체 식별을 위한 단 하나의 정수값
	@Override
	public int hashCode() {
		
		return subject.hashCode();
	}

	//containsValue 할 때 객체의 동등성을 비교하기 위해
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof ClassRoom) {
			ClassRoom other=(ClassRoom)obj;
			return subject.equals(other.subject) == roomName.equals(other.roomName);
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "ClassRoom [subject=" + subject + ", roomName=" + roomName + "]";
	}
	
	

}
