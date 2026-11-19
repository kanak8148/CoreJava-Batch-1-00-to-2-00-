package in.co.rays.io;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {
	public static void main(String[] args) throws IOException {
		
		FileWriter file = new FileWriter("C://Users//kanak//OneDrive//Desktop//Test2.txt" , true);
		file.write("Heelo Java");
		
		System.out.println("Text Sussesfully write");
		file.close();
		
	}

}
