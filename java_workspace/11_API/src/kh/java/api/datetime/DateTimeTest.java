package kh.java.api.datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTimeTest {

	
	
	//
	//	java.utll.Calendar//Date의 대채사용 클래스.
	//	java.util.Date  기본생성자 ,long타입 생성자를 제외하고 사용금지 deprecates처리 가되었다.
	//
	//	java.time.LocalDateTime
	//	
	public static void main(String[] args) {

		DateTimeTest dt =new DateTimeTest();
//		dt.test1();
//		dt.test2();
		dt.test3();
		
		
		
	}
	//
	//Calendar
	//
	//
	//
	public void test1() {
		//현재 날짜, 시각정보 조회
		Calendar cal1 = Calendar.getInstance();
		//추상클래스라서 new를 쓸수없다.
		
		Calendar cal2=new GregorianCalendar();
		
		System.out.println(cal1);
		System.out.println(cal2);
		
		//조회
		
		System.out.println(cal1.get(Calendar.YEAR));
		System.out.println(cal1.get(1));
		System.out.println(cal1.get(Calendar.MONTH)+1);
		System.out.println(cal1.get(Calendar.DATE));
		System.out.println(cal1.get(Calendar.HOUR));
		System.out.println(cal1.get(Calendar.MINUTE));
		System.out.println(cal1.get(Calendar.SECOND));

		//요일 (일1,월2,화3,수4,목5,금6,토7)
		System.out.println(cal1.get(Calendar.DAY_OF_WEEK));
		char[] daypfWeek = {'일','월','화','수','목','금','토'};
		System.out.println(daypfWeek[cal1.get(Calendar.DAY_OF_WEEK)-1]);
		
		printCalender(cal1);
		
		
	}
	
	
	
	//
	//	yyyy//mm/dd  hh24:mm:ss
	//
	//
	//
	public void printCalender(Calendar c) {
		
		System.out.printf("%d/ %02d / %02d : %02d:%02d%n",
				c.get(Calendar.YEAR),
				c.get(Calendar.MONTH)+1,
				c.get(Calendar.DATE),
				c.get(Calendar.HOUR_OF_DAY),
				c.get(Calendar.MINUTE),
				c.get(Calendar.SECOND)
				);
		
	}
	
	
	//
	//	특정일 특정시각을 Calendar 객체로 생성
	//
	//
	public void test2() {
		
		Calendar cal2 =Calendar.getInstance();
		
		cal2.set(2021,0,1,0,0,0);
		
		printCalender(cal2);
		
		Calendar cal3 =new GregorianCalendar(2021,1,1,0,0,0);
		printCalender(cal3);
		
		//날짜 차이 계산하기
		
		Calendar now =Calendar.getInstance();
		
		
//		System.out.println(now-cal3);//이렇게 하고싶은걸 구현해보자
		
		//밀리초 단위로 변환해서 차이를 구한후, 다시 초 분 시  일 단위로 환산하면된다.
		
		long num1 =now.getTimeInMillis();
		long num2 =cal3.getTimeInMillis();
		System.out.println(num1);
		System.out.println(num2);
							//millis/1000(초)/60(분)/60(초)/24(일)
		long num3 = (num2-num1)/1000/60/60/24;
		System.out.println(num3);
		
		System.out.println(num3);
		System.out.println("새해까지 D-"+(num3+1)+"일 남았씁니다.");

	}
	
	
	// Date()
	// Date(long millis)
	// 위 생성자만 사용가능하다.
	//
	public void test3() {
	
		Date now= new Date();
		
		System.out.println(now);
		
		//to Calendr
		
		Calendar cal =Calendar.getInstance();
		cal.setTime(now);
		
		System.out.println(cal);
		
		//to Date
		
		long millis =cal.getTimeInMillis();
	
}
}

