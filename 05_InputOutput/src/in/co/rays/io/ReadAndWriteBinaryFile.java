package in.co.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWriteBinaryFile {
	
	
	public static void main(String[] args) throws IOException {
		
		
		String source = "C://Users//kanak//OneDrive//Desktop//download.webp";

		String target = "C://Users//kanak//OneDrive//Desktop//downloadcopy.webp";
		FileInputStream in = new FileInputStream(source); // read binary
		FileOutputStream out = new FileOutputStream(target); // write binary
		
		int i = in.read();

		while (i != -1) {

			System.out.println(i);
			
			out.write(i);

			i = in.read();

		}

		in.close();
		out.close();
		System.out.println("sucessfullyy......");

	}
	}


