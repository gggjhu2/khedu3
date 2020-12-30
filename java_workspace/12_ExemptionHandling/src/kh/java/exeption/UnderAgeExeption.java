package kh.java.exeption;




	//
	// 커스텀 예외 클래스
	//	-의미전달을 확실히 할수있도록 함
	//
	//	1.checked exeption   :extends exeption
	//	2.unchecked exeption :extends  RuntimeExeption
	//
public class UnderAgeExeption extends Exception {

	//부모 생성자를 따라 만들어두기
	public UnderAgeExeption() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UnderAgeExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public UnderAgeExeption(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public UnderAgeExeption(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
									//원인
	public UnderAgeExeption(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
		//부모 생성자를 따라 만들어 준다. 알트 쉬프트 s 제레이터 컨스트럭터 프롬 슈퍼클래스
	
	
	
	
	
}
