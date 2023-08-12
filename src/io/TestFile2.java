package io;

import java.io.File;
import java.io.IOException;

public class TestFile2 {
	public static void main(String[] args) {
		
		try {
			File file = new File("H://IOTest/test2.txt");
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
