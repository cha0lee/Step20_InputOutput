package test.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainClass03 {
	public static void main(String[] args) {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		
		BufferedReader br = new BufferedReader(isr);
		try {
			System.out.println("한줄 입력:");
			String line = br.readLine();
			System.out.println("=입력한 문자열 =");
			System.out.println(line);
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
