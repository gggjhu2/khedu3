package kh.java.collection.map;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest {
	
	
	
	
	
	
	//
	//	Properties 옜방식의 키맵 그러나 아직도 잘쓰고있는기능이다.
	//				=특징=
	//	K ,V 을  타입을 String ,String 으로 제한한 map클래스.
	//  
	//	-파일 입출력메소드를 지원 
	//  -설정정보 표현에 최적의 형태 
	//	-
	//
	//
	//
	//
	//
	//
	
	public static void main(String[] args) {
		
		PropertiesTest p =new PropertiesTest();
		p.test1();
		p.test2();
		
	}
	
	
	
	//
	// 출력 
	//
	//
	public void test1() {
		
		Properties prop =new Properties();
		
		prop.setProperty("url", "http://localhost:9090/kh-java");
		prop.setProperty("userName", "honggd");
		prop.setProperty("passWord", "123!@#$");
		System.out.println(prop);
		
		//파일에 저장
		//.PROPERTIES
		//.XML
		
		try {
			//프로포티 파일 생성
			//prop.store(new FileWriter("userInfo.properties"),"userInfo.properties");
		
			//xml 파일 생성 사용자 정의 태그
			prop.storeToXML(new FileOutputStream("userInfo.xml"), "userInfo.xml");
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void test2() {
		Properties prop =new Properties();
		try {
			//프로퍼티 부러오기
			//prop.load(new FileReader("userInfo.properties"));
			
			//xml불러오기
			prop.loadFromXML(new FileInputStream("userInfo.xml"));
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(prop);
		//1.요소 가져오기
		String url =prop.getProperty("url");
		String userName=prop.getProperty("userName");
		String password=prop.getProperty("password");
		System.out.println(url);
		System.out.println(userName);
		System.out.println(password);
		
		//2.전체열람메소드 Enumeration
				  //?는 모든 타입을다처리할수있다는것을 나타낸다
		Enumeration<?> en =prop.propertyNames();
		while(en.hasMoreElements()) {
			String name =(String)en.nextElement();
			String value =prop.getProperty(name);
			System.out.println(name);
			
			
		}
		
		
	}

}
