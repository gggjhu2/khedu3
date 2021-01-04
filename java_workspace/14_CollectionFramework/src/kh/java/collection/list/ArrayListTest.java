package kh.java.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListTest at = new ArrayListTest();

//		at.test0();
//		at.test1();
//		at.test2();
//		at.test3();
//		at.test4();
//		at.test5();
		at.test6();
		
	}

	//
	//
	// 배열의 문제점
	//
	//
	public void test0() {

		Student[] arr = new Student[3];
		arr[0] = new Student(1, "홍길동1");
		arr[1] = new Student(2, "홍길동2");
		arr[2] = new Student(3, "홍길동3");

		// 1. 학생 2명 추가 상황을 예시로 들어보자.

		Student[] arr2 = new Student[10];

		System.arraycopy(arr, 0, arr2, 0, arr.length);

		System.out.println(Arrays.toString(arr2));
		// 10개의 공간을만들었따 기존의 데이터를 복사해 넣고 값이없는 나머지 빈자리를 넉넉히만들어두고 데이터를추가한다.

		arr2[3] = new Student(4, "홍길동4");
		arr2[4] = new Student(5, "홍길동4");

		System.out.println(Arrays.toString(arr2));

		System.out.println(Arrays.toString(arr));

		// 2. 중간의 학생 1명 삭제
		// 데이터는 중간의 빈자리 없이 관리해야된다. 하지만 이런식으로하면 앞뒤의 데이터는그대로이고
		// 널 처리한 데이터자리만 널이된다.
//		arr2[2] =null;//이 런 공백 빵꾸 방식을 안하려면 다음과같이복잡한 수작업으로 처리해야한다.
		arr2[2] = arr2[3];
		arr2[3] = arr2[4];
		arr2[4] = null;

		System.out.println(Arrays.toString(arr2));

		// 3. 중간에 학생 1명 추가 : new Student (6,"뻉덕어멈"); 6번째뻉덕어멈이 0번째자리에들어가고싶다고가정해보자.
		arr2[4] = arr2[3];
		arr2[3] = arr2[2];
		arr2[2] = arr2[1];
		arr2[0] = new Student(6, "뺑덕어멈");
		System.out.println(Arrays.toString(arr2));

	}

	public void test1() {

		ArrayList list1 = new ArrayList();
		List list2 = new ArrayList();
		Collection list3 = new ArrayList();

		// 맨마지막에 요소 추가 add

		list1.add("안녕");
		list1.add("123");
		list1.add("123.456");
		list1.add(true);
		list1.add(new Date());
		list1.add(new Student(1, "고주몽"));
		list1.add("123");
		// 중복 저장 가능
		// toString override 되어있음. 중복허용한다.

		System.out.println(list1);

		// 저장된 요소의 개수

		System.out.println(list1.size() + "개가저장되어있습니다.");

		// 삭제 remove

		list1.remove(3);

		// 중간에 요소 추가

		list1.add(3, false);
		// 반복문을 통해 요소에 접근가능 " 인덱스 사용가능
		for (int i = 0; i < list1.size(); i++) {

			System.out.println(i + " : " + list1.get(i));
		}

	}

	//
	//
	// Generics 타입 제한
	//
	// 기본형을 사용할 수 없다.
	//
	// int 사용못한다 Integer사용해야된다.
	// .
	// .
	// .
	// .
	private void test2() {

		List list1 = new ArrayList();
//		List<object> list1 =new ArrayList(); 타입을안쓴건 이와같다.
		list1.add("안녕");
		list1.add("123");
		Object e1 = list1.get(0);
		Object e2 = list1.get(1);

		System.out.println(((String) e1).length());

		// 다형성 적용

		List<String> list2 = new ArrayList<String>();
		// 제네릭의 사용 예 <String>타입 변수 지정 :요소의 타입 제한

		list2.add("안녕");
		// list2.add(123); //스트링이 아닌요소는 추가할수없당.

		list2.get(0);

		String s1 = list2.get(0);

		System.out.println(s1.length());

		// Wrapper Class

//		List<int> list3 = new ArrayList<int>();//안된다.
		List<Integer> list3 = new ArrayList<Integer>();// 안된다.
		list3.add(31);// 31->new Integer(31) ; auto -boxing
		int num = list3.get(0); // new Integer(31) -> 31: aouto -unboxing

		System.out.println(list3);

	}

	public void test3() {

		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(1, "홍길동1"));
		list.add(new Student(2, "홍길동2"));
		list.add(new Student(3, "홍길동3"));

		// 1.학생 2명 추가

		list.add(new Student(4, "홍길동4"));
		list.add(new Student(5, "홍길동5"));

		// 2. 중간의 학생 1명 삭제.

//		list.remove(2);

		list.remove(new Student(3, "홍길동3"));// 이렇게하면 지워지진않는다.
		// 객체를 전달해 삭제하려면, 전달한 객체와 저장된 객체의 동등성을 인정받아야한다.
		// 두객체의 equals비교 결과가 true가 나오도록 equals 오버라이딩해야한다.
		// 두객체의 equals 비교 결과가 true 여야 한다.
		System.out.println("===========");
		System.out.println(new Student(3, "홍길동3").equals(new Student(3, "홍길동3")));

		System.out.println(list.remove(new Student(3, "홍길동3")));

		list.remove(2);

		System.out.println(list);

		// 3. 중간에 학생 1명 추가 :new Student(6,"뺑덕어멈");

		list.add(0, new Student(6, "뻉덕어멈"));

		for (Student s : list) {

			System.out.println(s);
		}
	}

	//
	//
	//
	//
	public void test4() {
		// 객체 할당부 제네릭 타입은 샌략이 가능 //이부분 인티저는 생략가능 :이유는 좌항의 제네릭이있어 생략가능
		// JDK1.7이상에서 추가된기능.
		List<Integer> list = new ArrayList<Integer>();

		list.add(5);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(4);
		list.add(4);
		list.add(4);
		System.out.println(list);
		// 두번째자리에 채워넣고싶을때
		list.add(1, 100);
		// 인덱스 , new Integer(100)으로 오토박싱이되어 들어간다.
		System.out.println(list);

		// 삭제메소드
		// (remove)
		//
		// 1.index 로 삭제

		list.remove(3); // 3번 인덱스삭제

		System.out.println(list);

		//
		//
		// 2. 동등 객체로 삭제 : 객체가 가진 값이 동일한 객체 (equals 가동일한 객체)

		list.remove(new Integer(100));
		// 0인덱스부터 끝까지가면서 처음만난 100를 날려준다
		// 수정 :해당인덱스의 객체를 제공된 매개인자로 대체
		System.out.println(list);

		list.set(1, 888);

		// 다른 Collection 객체 추가

		List<Integer> another = new ArrayList<>();

		another.add(7);
		another.add(8);
		another.add(9);

		System.out.println(list);
		System.out.println(another);

		list.addAll(another);
		System.out.println(list);

		// 매개인자 요소를 포함하고 있는가.(동등객체)

		System.out.println(list.contains(9));

		// 매개인자 요소가 몇번지에 있는가 :index값을 리턴하는것이 indexof
		// 9라는 매개인자요소가 몇번지에있니 8번째에있다 출력
		System.out.println(list.indexOf(9));
		// 없다면 -1 을 뱉어낸다
		System.out.println(list.indexOf(900));

		// 모든요소를 열람한다.
		// 기존포문 포이치문 iterator방식가능
		// iterator 방식 실습
		Iterator<Integer> iter = list.iterator();
		while (iter.hasNext()) {

			Integer i = iter.next();
			System.out.print(i + " / ");

		}
		System.out.println();
		// 모든요소 삭제

		list.clear();

		// 리스트가 비어있는가?
		// 비어있으면 트루
		System.out.println(list.isEmpty());

	}

	
	//
	//	정렬 관련 메소드 (list)
	//		두가지 방식의 정렬 규격이있따.
	//	 
	//	 
	//	 1. Comparable 이너페이스
	//		-기본정렬(한가지) 클래스에서 구현. CompareTo메소드 오버라이딩
	//		 
	//
	//	 2. Comparator 인터페이스
	//		-기본정렬외에 추가적으로 정렬기준을 제시해야할때.
	//			별도의 컴페어러터 구현 클래스를 작성한다. =>갯수제한 X
	//			내부적으로 Compare 메소드 오버라이딩하게된다.
	//
	private void test5() {

		//리스트에는 정렬이중요하다 이유는 리스트만 정렬 기능이가능하다. 제일중요한기능
		List<String> list =new ArrayList<>();
		
		
		list.add("허허허");
		list.add("가버려");
		list.add("다나가");
		list.add("나나나~");
		list.add("b");
		list.add("a");
		list.add("z");
		list.add("1");
		list.add("4");
		list.add("6");
		list.add("2");
		
		//정렬 메소드 호출
		
		Collections.sort(list);//기본 정렬 기준에 따라 정렬
								//사전등재순 가나다순 abc순...
	   System.out.println(list);
	   
	   //사전 등재 역순 :별도의 정렬 기준객체를 만들어줘야한다.
	   
	   Comparator<String>comp =Collections.reverseOrder();
	   
	   Collections.sort(list,comp);
	   System.out.println(list);
		
	}
	
	//
	// 커스텀 클래스 정렬하기
	//
	//
	public void test6() {
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student(2, "홍길동2"));
		list.add(new Student(1, "강길동1"));
		list.add(new Student(5, "낭길동5"));
		list.add(new Student(4, "당길동4"));
		list.add(new Student(3, "랄길동3"));
		
		
		System.out.println(list);
		
		//정렬 기본정렬
		//1. 학번오름차순
		//Collections.sort(list);//오류가난다.
//The method sort(List<T>) in the type Collections is not
//		applicable for the arguments (List<Student>)	
		//정렬기준이없어서 오류가난다.
		
		System.out.println("==학번 오름차순-=");
		Collections.sort(list);
		System.out.println(list);
		list.sort(null);
		//기본 정렬인 경우 Comparator 객체 필요치 않다.
		System.out.println(list);
		
		//학번 내림차순
		System.out.println("--학번 내림차순--");
		Collections.sort(list,Collections.reverseOrder());
		
		//커스텀 정렬을 하고싶다. 의경우 예제
		//추가적인 정렬기준 생성하기
		
		//1.이름 오름차순차순
		System.out.println("이름오름차순=======");
		Comparator<Student> comp =new StudentNameAscending();
		
		Collections.sort(list,comp);
		
		System.out.println(list);
		
		//2. 이름 내림차순
		System.out.println("이름 내림차순=========");
		Comparator<Student> comp2 =new StudentNameAscending().reversed();
		
		Collections.sort(list,comp2);
		
		System.out.println(list);
		
		
	}
	
	

}
