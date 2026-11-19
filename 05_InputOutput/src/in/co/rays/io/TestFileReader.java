package in.co.rays.io;

import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {

	public static void main(String[] args) throws IOException {

		FileReader file = new FileReader("C://Users//kanak//OneDrive//Desktop//Test.txt");
		int i = file.read();

		while (i != -1) {

			System.out.println((char) i + "=" + i);
			i = file.read();
		}

	}

}
