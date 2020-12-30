package kh.java.exeption;

import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

//Exeption
// 예외처리를 통해서 정상복구될수있는오류
//
//	1.checked exeption   :RuntimeExeption의  후손클래스가아님. 예외처리 강제화.
//
//	2.unchecked exeption :RuntimeExeption의 후손클래스
//
//
//
//
public class ExeptionTest {

	public static void main(String[] args) {

		ExeptionTest et = new ExeptionTest();

//		et.test1();
//		et.test2();
//		et.test3();
//		et.test4();
		try {
			et.test5();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("===정상종료되었습니다====");
	}

	//
	// try 절
	// catch 절
	// -여러개의 예외 클래스를 처리할 수 잇도록 catch절을 여러개 작성할 수있다.
	// -부모 예외 클래스타입의 catch절로 통합해서 처리할수도있따(다형성)
	// -여러개의 예외 클래스 타입이 캐치절을 사용하는경우 , 자식 -부모 타입순으로 작성한다.
	public void test1() {

		// String s =null;
		// System.out.println(s.length());
		// 컴파일은 정상작동 빨간줄이안떳다.
		// Exception in thread "main" java.lang.NullPointerException

		// Scanner sc =new Scanner(System.in);
		// System.out.println("정수입력:");
		// int num =sc.nextInt();
		// 숫자대신 문자를 입력하면
		// Exception in thread "main" java.util.InputMismatchException
		// 인풋미스메치 예외가 발생한다.
		// System.out.println(num/0);//수를 0으로나눌수없다.
		// Exception in thread "main" java.lang.ArithmeticException: / by zero
		// 산술연산자 에러이다.

		// 예외처리
		try {
			String s = null;
			System.out.println(s.length());
			Scanner sc = new Scanner(System.in);
			System.out.println("정수입력:");
			int num = sc.nextInt();
			// 예외가 발생할수있는 코드를 작성
			System.out.println(num / 0);

		} catch (InputMismatchException e) {

			System.out.println("정확한 입력값을 기입하시오");
		}
//	}catch(ArithmeticException e) {
//		
//		System.out.println("숫자를 0으로 나눌수없습니다.");
//	}
//	
//	catch(NullPointerException e) {
//		
//		System.out.println("널포익 발생!");
//	e.printStackTrace(); //예외가 발생했을떄의 콜스택의 상황출력
//	 //예외가발생했을때 출려글하고 종료를하는것이다.
//	}
//	
		// catch 절에도 다형성이 적용되기떄문이다.
		catch (RuntimeException e) {

			e.printStackTrace();
		}
	}

	// 처리순서
	//
	// finally 절 :try절에서 예외가 던져지든 아니든 무조건 실행되는 코드
	// 자원 반납 등의 목적으로 사용.
	// 조기리턴시에도 실행됨.
	//
	//
	public void test2() {
		System.out.println(1);
		try {
			System.out.println(2);
			if (true)
				return;

			int[] arr = new int[3];
			System.out.println(arr[5]);
			// java.lang.ArrayIndexOutOfBoundsException: 3
			// 배열 크기를 넘어섯다.

			System.out.println(3);

		} catch (Exception e) {

			e.printStackTrace();
			System.out.println(4);

		} finally {

			System.out.println(5);
		}
		System.out.println(6);
	}

	//
	// 사용자의 임력에 대해 예외처리하기.
	//
	//
	//
	public void test3() {

		Scanner sc = new Scanner(System.in);
		while (true) {

			try {

				System.out.println("정수하나를 입력하시오");
				System.out.println(sc.nextInt());
				// 정수이외의 수를 입력하면 Exception in thread "main" java.util.InputMismatchException
				// 익셉션이뜬다.

				// 정상 입력한 경우
				break;
			} catch (Exception e) {

			
				System.out.println("올바른 정수를 입력하세요");
				sc.next();//사용자의 잘못된 입력값이 남겨진 버퍼비우기용
				continue;
			}

		}

	}
	
	
	//  실습 문제
	//
	//  사용자로부터 정수 2개를 입력받고 , 합을 출력하는 프로그램을 만드세요.
	//  부정입력이 잇다면, 처음부터 다시 입력 받으세요.
	//
	public void test4() {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {

			try {

				System.out.println("정수하나를 입력하시오");
				int num1 = sc.nextInt();
				
				System.out.println("정수하나를 입력하시오");
				int num2 =sc.nextInt();

				System.out.println("두수의합은"+num1 + num2+"입니다용?");
				// 정수이외의 수를 입력하면 Exception in thread "main" java.util.InputMismatchException
				// 익셉션이뜬다.

				// 정상 입력한 경우
				break;
			} catch (Exception e) {

			
				System.out.println("올바른 정수를 입력하세요");
				sc.next();//사용자의 잘못된 입력값이 남겨진 버퍼비우기용
				continue;
			}

		}
		
			
			
		}
	
	
	
	
	//
	// 	CheckedExeption
	//
	//	예외처리를 강제화하고잇따.
	//	1.try~catch
	//  2.throws 절 통해 회피
	//		-복수개의 예외를 던지는게 가능하다.
	//		-다형성을 적용할 수 잇다.
	public void test5()throws /*FileNotFoundException*/ IOException{//,를해서 여러개도가능하다.
		
//		FileReader fr =new FileReader("text.txt");
		//Unhandled exception type FileNotFoundException 처음보는 에러문구이다.
		
		
		//다음과같이 사용가능하다
		
		
		
		//1.try ~catch 처리
//		try {
//			FileReader fr =new FileReader("test.txt");
//			System.out.println("파일을 찾았습니다.");
//		}catch(FileNotFoundException e) {
//			
//			e.printStackTrace();
//			//java.io.FileNotFoundException: text.txt (지정된 파일을 찾을 수 없습니다)
//			//파일을못찾겠다는 오류발생
//		}
//		
		//2.throws 를 통해 예외 회피
			FileReader fr =new FileReader("test.txt");
			System.out.println("파일을 찾았습니다.");
			//java.io.FileNotFoundException: text.txt (지정된 파일을 찾을 수 없습니다)
			//파일을못찾겠다는 오류발생
		}
		
}

