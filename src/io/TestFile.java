package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestFile {
	
	public static void main(String[] args) {
		
		File file = new File("H:\\IOTest");
		if(!file.exists()) {
			file.mkdir();
		}
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("H:\\IOTest\\test.txt"));
			bw.write("Hello io!");
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
