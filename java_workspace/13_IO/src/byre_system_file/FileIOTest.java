package byre_system_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOTest {
public static void main(String[] args) {
	FileIOTest ft= new FileIOTest();
//	ft.test1();
	
	ft.test2();
	System.out.println("===정상종료되었습니다====");
}




	
	public void test1() {
		
		String filePath ="test.txt";
		String copyPath = "byte/test_copy.txt";
		FileInputStream fis =null;
		//바이트기반의 입력스트림
		
		FileOutputStream fos =null;
		
		try {
			 fis= new FileInputStream(filePath);
			 fos = new FileOutputStream(copyPath);
			 int data =0;//읽어온 데이터를 담을 변수
			 
			 while((data =fis.read()) != -1) {
				 System.out.print((char)data );
				 fos.write(data);
				 
			 }
			 
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
				try {
					fis.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					fos.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			try {
				fis.close();//널포인트익셉션이떴다.
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	// 내컴퓨터의 이미지파일을 복사해서 byte폴더 하위에 위치시킬것.
	// 경로상의 한글사용 하지말것.
	public void test2() {
		String fileName ="C:\\1\\1.jpg";
		String destName = "byte/test_copy23.jpg";
		FileInputStream fis =null;
		FileOutputStream fos =null;
		
		try {
			 fis= new FileInputStream(fileName);
			 fos = new FileOutputStream(destName);
			 int data =0;//읽어온 데이터를 담을 변수
			 
			 while((data =fis.read()) != -1) {
				 fos.write(data);
				 
			 }
			 
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
				try {
					fis.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					fos.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			try {
				fis.close();//널포인트익셉션이떴다.
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("파일복사완료");
	}
	
	
	
}
