package byre_system.object;

import java.io.Serializable;
import java.util.Calendar;



	// 직렬화 할수 있는 Serializable
	//
	// 객체 입출력 스트림에서 사용되어질 객체는 반드시
	//	Serializable 을구현해야한다.
	//  그렇지않으면 NotSerializableExeption을 발생시킨다.
public class User implements Serializable {
	//The serializable class User does not
	//declare a static final serialVersionUID
	//field of type long ==>user에 에러메세지
	
	
	
	
	private String id ;
	private String password ;
	private String name;
	private int age ;
	private Calendar regDate ;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Calendar getRegDate() {
		return regDate;
	}
	public void setRegDate(Calendar regDate) {
		this.regDate = regDate;
	}
	public User(String id, String password, String name, int age, Calendar regDate) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.regDate = regDate;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return"";
		
	}
	
	
	
}
