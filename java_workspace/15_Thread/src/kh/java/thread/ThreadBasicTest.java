package kh.java.thread;

public class ThreadBasicTest {
	public static void main(String[] args) {
		ThreadBasicTest t = new ThreadBasicTest();
	
		//싱글 스레가어떻게되는지 살펴보는 메서드
		t.test0();
		
		
		
		
		//thread 첫 강의 메서드
		//쓰레드를 생성하는방법 두가지 해보는 메서드
		t.test1();

	}

	
	
	//싱글 스레드
	public void test0() {
		//A
		for(int i =0 ; i < 100 ; i++) {
			System.out.print('|');
		}
		//B
		for(int i =0 ; i < 100 ; i++) {
			System.out.print('-');
		}		
	//이방식이 싱글스레드이다 한 작업완료후 다른작업이완료된다.	
		
	}

	
	//쓰래드 생성방식은 두가지가있다.
	//1. THRE  클래스 상속
	public void test1() {
						//커스텀 쓰레드1 클래스를 작성해준다.
		Thread th1 =new CustomThread1('|');
		//쓰레드 객체를 만든것
		Thread th2 =new CustomThread1('-');
		
		//객체에 명령을 주면된다. ㅇㅇ.start();
		//어떤쓰레드가 몇번을더찍고 몇번후에 어떤쓰레드가 일할지 지정해줄순없다.
		th1.start();
		th2.start();
		System.out.println("");
		
		
		//우선순위 지정은가능하다 (1에서 10까지 나눌수있고 기본값은 5이다)
		th2.setPriority(Thread.MAX_PRIORITY);
		th1.setPriority(Thread.MIN_PRIORITY);
		//위두줄처럼 맥스와 최소를 했지만 원하는만큼 지정할순없다 우선순위정도지정이할수있는전부다.

	
	}


	
	
	
	
	
	
	
	
}
