package com.javaex.api.collection.hash;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTableEx {

	public static void main(String[] args) {
		// 해시테이블 생성 : Map 인터페이스
		Map<String, ClassRoom> map = new Hashtable<>(); // 키로 String사용, 값 ClassRoom사용

		// 데이터 담기 : put
		map.put("101", new ClassRoom("Java", "R101"));
		map.put("202", new ClassRoom("C", "R202"));
		map.put("303", new ClassRoom("Python", "R303"));
		map.put("404", new ClassRoom("Linux", "R404"));

		// 키의 순서는 없고, 키는 중복될 수 없다.
		System.out.println(map);

		// 키가 중복될 경우 기존 키에 해당하는 값은 지워지고 새로운 값으로 덮어씌워진다.
		map.put("404", new ClassRoom("SQL", "R404"));
		System.out.println(map);

		// 키에 연결된 값 가져오기 : get()
		System.out.println("303 : " + map.get("303"));

		// 키가 있는지 확인 : containsKey
		System.out.println("303이 있는가 ? " + map.containsKey("303"));
		System.out.println("505가 있는가 ? " + map.containsKey("505"));

		// 값 중에서 subject가 Java인 값이 있는가
		// containsValue()
		System.out.println("Java가 있는가 ? " + map.containsValue(new ClassRoom("Java", "R101")));

		// iterator 이용
		Iterator<String> it = map.keySet().iterator(); // 키로부터 반복
		while (it.hasNext()) {
			// 키를 뽑아내기
			String key = it.next();

			System.out.println(map.get(key));
		}
		// 맵지우기
		map.clear();
		System.out.println(map);
	}

}
