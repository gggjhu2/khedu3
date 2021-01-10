package kh.java.exeption;

import java.io.IOException;
import java.sql.SQLException;

//  OVERRIDE 상속받은 메소드를 고쳐쓸수 있따.
//
//
//
//
//
public class OverrideTest {

	class parent{
		
		public void test() throws SQLException , IOException{
			
			
			
		}
		
		class child extends parent{
			
			public void test() {}
//			public void test() throws SQLException{}
//			public void test() throws FileNotFoundException{}
//			public void test() throws IOException{}
			//이위의 네가지는다가능하지만
			//밑의 익셉션은 상위타입이기에 불가능하다.
//			public void test() exeption{}
			
			
		}
	}
	
	
}
