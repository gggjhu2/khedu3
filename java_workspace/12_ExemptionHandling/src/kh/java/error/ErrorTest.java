package kh.java.error;




	//	Error
	// 예외 처리 등 프로그램적으로 해결할 수 없는 심각한 오류
	//	
	//
public class ErrorTest {

	
	public static void main(String[] args) {
		ErrorTest e=new ErrorTest();
//		e.test1();
		e.test2();
		System.out.println("프로그램정상종료=======");
	}
	
	
	
	
	
	
	public void test1() {
		
		long[] arr =new long[Integer.MAX_VALUE];
		//Exception in thread "main" java.lang.OutOfMemoryError:
		//Requested array size exceeds VM limit

		
		
	}
	
	public void test2() {
		
		System.out.println("test2호출!");
		test2(); //종료조건없는 재귀 호출
		//Exception in thread "main" java.lang.StackOverflowError
		//콜스택에 메모리호출 이 너무많아서 콜스택공간을 다 사용한것.
	}
}
