package kh.java.collection.map;

import java.util.HashMap;
import java.util.Map;

import kh.java.collection.set.Person;

/**
 *
 * Map
 * key, value 한쌍으로 요소를 구성한다.
 * key를 통해서 value를 접근해 사용.
 * key는 중복을 허용하지 않는다. value는 중복되어도 좋다.
 * 
 * 동일한 key로 추가 저장하면, 나중 value로 치환된다.
 *
 */
public class HashMapTest {

	public static void main(String[] args) {
		HashMapTest h = new HashMapTest();
		h.test1();
	}

	private void test1() {
		//<K, V> 두개의 제네릭을 사용
		//key로 Integer만 허용.
		//value로 String만 허용.
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		Map<Integer, Character> map2 = new HashMap<>();
		//요소추가
		map1.put(1, "홍길동");
		map1.put(2, "신사임당");
		map1.put(3, "세종대왕");
		
		System.out.println(map1);
		
		//요소가져오기
		
		String s1 =map1.get(1);
		System.out.println(s1);
		
		//동일한 키값으로 요소 추가
		
		//동일한 카로 추가저장하면 나중 벨류로치환된다.
		map1.put(2, "장영실");
		
		
		System.out.println(map1);
		
		HashMap<Character, Person> map3 = new HashMap<>();
		Map<Character,Person> map4 = new HashMap<Character, Person>();
		map3.put('a', new Person("Aida"));
		map3.put('b', new Person("Bob"));
		map3.put('c', new Person("Clain"));
		map3.put('d', new Person("David"));

		
		
	}

}
