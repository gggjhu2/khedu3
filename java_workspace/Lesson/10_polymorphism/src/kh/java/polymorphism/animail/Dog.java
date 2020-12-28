package kh.java.polymorphism.animail;

public class Dog extends Animal {

	public void kick() {
		
		System.out.println("개 발차기!");
		
	}
	@Override
	public void say() {
		System.out.println("안녕하세요 , 저는 개입니다.");
		
	}
	@Override
	public void attack() {
		kick();
	}
}
