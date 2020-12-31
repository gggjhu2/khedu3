package byre_system.object;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;

public class ObjectIOTest {

	public static void main(String[] args) {

		ObjectIOTest o = new ObjectIOTest();
		o.test1();
	}

	private void test1() {

		File f = new File("object/user.ser");

		try (ObjectOutputStream oos =
				new ObjectOutputStream
				(new BufferedOutputStream
						(new FileOutputStream(f)));
				) {
			
			User u =new User("hot","1234", "dsadasd",15,Calendar.getInstance());
			oos.writeObject(u);
			System.out.println("객체쓰기완료!");
			
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
