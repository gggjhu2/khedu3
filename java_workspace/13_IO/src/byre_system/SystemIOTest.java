package byre_system;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//  byte기반의 표준 입출력
	//	System.in : 사용자 키보드 입력
	//	System.out: 콘솔 출력
	//	
	//
	//
public class SystemIOTest {

	public static void main(String[] args) {
		SystemIOTest s =new SystemIOTest();
		
	//	s.test1();
		s.test2();
//		s.test1();
//		s.test1();
//		s.test1();
		
	}
	//
	//
	//system.in 단독 사용 예제
	//
	//read():int -> 대상으로부터 1byte 읽어와서 int로 리턴하는 메소드
	//256가지 (0~255)+1(-1 : 읽어올값이 없는경우)
	//
	//이클립스에서는 컨트롤 +Z를 입력하면 -1을 리턴한다. =>종료 할수있다.
	//
	public void test1() {
		
		System.out.println("키보드로 입력값을 주세요:");
		int data = 0;//읽어온 값을 처리할 변수
		
		
		
		
		try {
		
		while((data = System.in.read()) != -1) {
		
			System.out.println("input = " +data);
			
		}
	}catch(IOException e) {
		e.printStackTrace();
	}

}
	
	
	
	//
	// 2004sus JDK 1.5 버전이 나오기전
	// Scanner 클래스가 등장전의 사용자 입력값 처리는 다음과 같다.
	//
	//
	public void test2() {
		//보조 스트림  : 기본스트림에 연결해서사용.보조스트림 여러개를 연결할수있다.
		//마지막 연결된 보조스트림으로 입출력 제어 및 자원 반납을 한다.
		
		//BufferedReader br =new BufferedReader(System.in);
		//The constructor BufferedReader(InputStream) is undefined
		//시스템 인은 바이트기반 버퍼드리더는 문자기반
		//다음과같이 사용할수있다.
		//System.in ->브릿지스트림(보조) ->보조스트림
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

			String data = "";
			System.out.println("키보드로 입력하세요!: ");
			try {
			
			int sum =0;	
			while((data = br.readLine()) !=null) {
			//System.out.println(data);
				//sum+=data;//문자형이라서 안된다.
				sum +=Long.parseLong(data);
				System.out.println(sum);
			}
			//표준 입출력을 사용하는 스트림클래스는 반납하면 안된다.
			//한번 닫힌 표준입출력은 재사용할수는 없다.
		
		
	}catch(IOException e) {
		
		e.printStackTrace();
	}
}
}