package com.javaex.api.collection.hash;

public class Student {
	// 필드 생성
	String name; // 학생 이름
	int id; // 학번

	// 생성자
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

	// 객체 동등성의 비교
	// 1. 객체의 hashCode()의 반환값을 비교
	// 2. 객체의 equals()로 동일성을 비교
	// 1과2 조건을 모두 통과하면 두 객체는 동등한 객체로 판별

	@Override
	public int hashCode() {
		// 해시코드 : 객체 식별을 위한 하나의 정수값
		return id; // 학생은 학번으로 식별한다.
	}

	@Override
	// Object obj가 외부에서 받은 값
	public boolean equals(Object obj) {
		// 두 Student 객체의 필드값을 비교
		if (obj instanceof Student) {
			Student other = (Student) obj;
			return name == other.name && id == other.id;
		}
		return super.equals(obj);
	}

}
