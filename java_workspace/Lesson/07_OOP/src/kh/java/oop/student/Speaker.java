package kh.java.oop.student;

public class Speaker {

	String brand;
	String color;
	int volume;
	int maxVolume;

	public void volumeup() {

		volume++;

	}

	public void volumedown() {

		volume--;

	}
	public String info() {
		
		return brand+", "+color+", "+volume+", "+maxVolume;
		
	}

}
