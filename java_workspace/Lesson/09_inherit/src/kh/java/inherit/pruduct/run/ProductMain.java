package kh.java.inherit.pruduct.run;

import kh.java.inherit.pruduct.model.vo.Desktop;
import kh.java.inherit.pruduct.model.vo.SmartPhone;
import kh.java.inherit.pruduct.model.vo.TV;

public class ProductMain {

	public static void main(String[] args) {

		Desktop d =new Desktop("삼성" , "삼성대땅" , 1_000_000, "Windows10","UHD커브드","기계식키보드");
		
		System.out.println(d.getDesktopInfo());
		
		SmartPhone s = new SmartPhone("애플","iphon12" ,500_000,"ios14", "KT");
		
		System.out.println(s.getSmartPhoneInfo());
		
		TV tv =new TV("LG","LG롤러블",1_000_000_000 , 30 , 60 );
		
		System.out.println(tv.getTVInfo());
		
		
		
	}

}
