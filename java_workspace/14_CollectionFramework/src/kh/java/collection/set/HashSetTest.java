package kh.java.collection.set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//
	// collection - set - hashset
	//	중복을 허용하지않는다. 저장된 순서를보장하지않는다.
	//
	//	LinkedHashSet : 중복허용하지 않는다. 저장된 순서 유지   
	//	TreeSet 	  : 중복혀용하지 않는다. 오름차순 정렬 유지
	//
	//
	//
public class HashSetTest {

	public static void main(String[] args) {
		
		HashSetTest hs =new HashSetTest();
		//hs.test1();
		//hs.test2();
		//hs.test3();
		//hs.test4();
		hs.test5();
		
		
	}

	private void test1() {
		
		HashSet<Integer> set1 =new HashSet<>();
		Set <String> set2 =new HashSet();
		Collection<Double> set3 = new HashSet<>();
		
		set2.add("안녕");
//		set2.add(123);//제네릭 덕분에 다르타입의 오소는 추가가 불가능하다.
		set2.add("hello world");
		set2.add("zzz");
		set2.add("zzz");
		set2.add("ㅋㅋㅋ");
		set2.add("123"); //숫자가아니라 문자열이다
		
		
		//저장된 요소 개수 확인
		System.out.println("요소는 모두 "+set2.size()+"개입니다.");
		System.out.println(set2);
		
		//인덱스 통한 요소 가져오기는 지원하지 않는다.
		//가져올때는 반복문을 통한 전체열람만 가능하다.
		//일반포문은 사용불가.
		//1.포이치문은 가능하다.
		System.out.println("===포이치문===");
		for(String s : set2)
		System.out.println(s);
		
		//2.iterator 객체
		System.out.println("==이터레이터===");
		Iterator <String> iter =set2.iterator();
		while(iter.hasNext()) {
			String s =iter.next();
			System.out.println(s);
		}
		System.out.println("===단순 총 출력===");
		System.out.println(set2);
		
		//삭제  :동등한 객체를 찾아 삭제 
		//(equals &hashCOde override 가필수)
		System.out.println("===zzz삭제===");
		set2.remove("zzz");
		System.out.println(set2);
		
		//전체삭제
		System.out.println("===전체삭제===");
		set2.clear();
		System.out.println(set2);
		
		//비어있는지 검사
		System.out.println("===비어있는지 검사===");
		System.out.println(set2.isEmpty());
		
	}

	//  서로 변환해서 사용할수있다.
	//	List -> set		=> 중복을 제거할때 사용한다.
	//					
	//	Set  -> List	=> 정렬을 하기위해 사용한다.
	//
	public void test2() {
		
		List <Integer> list =new ArrayList<>();
		
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(1);
		list.add(3);
		list.add(2);
		System.out.println(list);
		
		//겹치는것 제거 하기위해 셋으로 변환
		System.out.println("[중복제거 를위해 셋으로 변환해본다]");
		Set <Integer> set =new HashSet<>(list);
										//해당메서드에 리스트를 넣는다.
		System.out.println(set);
		//중복제거 성공
		
		//list변환 :내림차순 정렬
		System.out.println("내림차순 정렬 컬랙션스.소트. 리버스오더로 내림차순으로정렬해본다.");
		
		List <Integer> list2 = new ArrayList<>(set);
		Collections.sort(list2, Collections.reverseOrder());
		//list.sort ~~~~도 같은결과 다.
		System.out.println(list2);
		
	}

	
	
	//
	// 커스텀 클래스 중복처리
	//
	//
	public void test3() {
		
		Set<Person> set =new HashSet<>();
		
		set.add(new Person("홍길동"));
		set.add(new Person("신사임당"));
		set.add(new Person("홍길동"));
		//홍길동이 중복되어 삽입이된다.
		//셋이면 중복이안되는데 삽입이되는이유는. 외부적으로는 값이같지만
		//내부적 해시코드를봤을때는 다른 참조변수(필드값) 스트링이기때문이다.
		//이를 해결하기위해서는 펄슨의 이퀄즈 해쉬코드를 오버라이드하여야한다. 퍼슨 클래스에서이어서진행
		//hashcode 오버라이딩을 하지않았다.
		//이또한해줘야한다.
		System.out.println(set);
	
	
	}
	
	//
	// LinkedHashSet
	// TreeSet
	//
	public void test4() {
		
		Set <Integer> set1 =new LinkedHashSet<>();
		
		set1.add(34);
		set1.add(25);
		set1.add(100);
		set1.add(1);
		set1.add(34);
		//저장한 순서 그대로유지되나 인덱스접근은 여전히안된다.
		System.out.println(set1);
		
										//요소 입력대신 set1을 그대로 사용한다.
		Set <Integer> set2 = new TreeSet<>(set1);
		//정렬이 필요하여 트리셋을 이용하였다 (오름차순정렬지원)
		System.out.println(set2);
		
	}

	//@실습문제
	//
	//	로또 숫자 출력하기
	//
	//	1~45 사이의 중복없는 난수를 오름차순 정렬해서 출력하세요.
	public void test5() {
		
		Set<Integer> set = new TreeSet<>();
		while(true) {
			int num = (int)(Math.random()*45) + 1;
			set.add(num);
			if(set.size()==6) {
				break;
			}
		}
		System.out.println(set);
	}

		
	}

