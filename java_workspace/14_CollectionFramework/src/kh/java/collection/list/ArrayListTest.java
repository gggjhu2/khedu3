package kh.java.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListTest at =new ArrayListTest();
		
//		at.test0();
//		at.test1();
//		at.test2();
		at.test3();
	}

	


	//
	//
	//배열의 문제점 
	//
	//
	public void test0(){
		
		
		Student[] arr =new Student[3];
		arr [0] =new Student(1, "홍길동1");
		arr [1] =new Student(2, "홍길동2");
		arr [2] =new Student(3, "홍길동3");
		
		
		//1. 학생 2명 추가 상황을 예시로 들어보자.
		
		Student[] arr2 = new Student[10];
		
		System.arraycopy(arr, 0, arr2, 0, arr.length);
		
		System.out.println(Arrays.toString(arr2));
		//10개의 공간을만들었따 기존의 데이터를 복사해 넣고 값이없는 나머지 빈자리를 넉넉히만들어두고 데이터를추가한다.
		
		arr2[3] =new Student(4,"홍길동4");
		arr2[4] =new Student(5,"홍길동4");
		
		System.out.println(Arrays.toString(arr2));
		
		System.out.println(Arrays.toString(arr));
		
		//2. 중간의 학생 1명 삭제
		//데이터는 중간의 빈자리 없이 관리해야된다. 하지만 이런식으로하면 앞뒤의 데이터는그대로이고
		//널 처리한 데이터자리만 널이된다.
//		arr2[2] =null;//이 런 공백 빵꾸 방식을 안하려면 다음과같이복잡한 수작업으로 처리해야한다.
		arr2[2] =arr2[3];
		arr2[3] =arr2[4];
		arr2[4]=null;
		
		
		System.out.println(Arrays.toString(arr2));
		
		//3. 중간에 학생 1명 추가 : new Student (6,"뻉덕어멈"); 6번째뻉덕어멈이 0번째자리에들어가고싶다고가정해보자.
		arr2[4]=arr2[3];
		arr2[3]=arr2[2];
		arr2[2]=arr2[1];
		arr2[0]=new Student(6,"뺑덕어멈");
		System.out.println(Arrays.toString(arr2));
		
	}
	public void test1() {
		
		ArrayList list1 =new ArrayList();
		List list2 =new ArrayList();
		Collection list3 =new ArrayList();
	
		//맨마지막에 요소 추가 add
		
		list1.add("안녕");
		list1.add("123");
		list1.add("123.456");
		list1.add(true);
		list1.add(new Date());
		list1.add(new Student(1, "고주몽"));
		list1.add("123");
		//중복 저장 가능
		//toString override 되어있음. 중복허용한다.
		
		
		System.out.println(list1);
		
		//저장된 요소의 개수
		
		System.out.println(list1.size()+"개가저장되어있습니다.");
		
		
		//삭제 remove
		
		list1.remove(3);
		
		//중간에 요소 추가
		
		list1.add(3,false);
		//반복문을 통해 요소에 접근가능 " 인덱스 사용가능
		for(int i =0 ; i < list1.size();i++) {
			
			System.out.println(i + " : " +list1.get(i));
		}
		
	
	
	}
	//
	//
	//Generics 타입 제한
	//
	//	기본형을 사용할 수 없다.
	//	
	//	int 사용못한다  Integer사용해야된다.
	//	.
	//	.
	//	.
	//	.
	private void test2() {
		
		List list1 =new ArrayList();
//		List<object> list1 =new ArrayList(); 타입을안쓴건 이와같다.
		list1.add("안녕");
		list1.add("123");
		Object e1 =list1.get(0);
		Object e2 =list1.get(1);
		
		System.out.println(((String)e1).length());
		
		//다형성 적용
		
		List<String> list2 =new ArrayList<String>();
		//제네릭의 사용 예  <String>타입 변수 지정 :요소의 타입 제한 
		
		list2.add("안녕");
		//list2.add(123); //스트링이 아닌요소는 추가할수없당.
		
		list2.get(0);
		
		String  s1 =list2.get(0);
		
		System.out.println(s1.length());
		
		//Wrapper Class
		
//		List<int> list3 = new ArrayList<int>();//안된다.
		List<Integer> list3 = new ArrayList<Integer>();//안된다.
		list3.add(31);//31->new Integer(31) ; auto -boxing
		int num =list3.get(0); //new Integer(31) -> 31: aouto -unboxing
		
		System.out.println(list3);
		
		
		
		
	}
	
	
	
	public void test3() {
		
		
	}
	
}
