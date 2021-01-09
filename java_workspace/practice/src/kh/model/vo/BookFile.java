package kh.model.vo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class BookFile {

	public static void main(String[] args) {
		
		fileSve(fileName);
		
		
	}
	public void fileSve(String fileName) {
		
		File f =new File("fileName");
		
		FileReader fr =null;
		
		try(BufferedReader br = new BufferedReader(new FileReader(f));
		BufferedWriter bw = new BufferedWriter(new FileWriter(f));
	){
			String data =null;
			
			while((data = br.readLine()) !=null) {
				
				System.out.println(data + ":");
				bw.write(data + "\n");
				
				
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
