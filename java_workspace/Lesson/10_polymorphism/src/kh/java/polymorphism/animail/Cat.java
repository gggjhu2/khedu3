package kh.java.polymorphism.animail;

public class Cat extends Animal{

	
	public void punch() {
		
		System.out.println("냥냥 펀치!");
		System.out.println("앙냥냥");
	}
	@Override
	public void say() {
		
		System.out.println("안냥냥냥.");
		
		
	}
	@Override
	public void attack() {
	
	punch();
}
	
	
}
