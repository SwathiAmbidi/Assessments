package lab8.tasks;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileProgram {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		File f = new File("source.txt");
		f.createNewFile();
		FileWriter f1 = new FileWriter(f);
		f1.write("Hello! How are you?");
		File f2 = new File("target.txt");
		
		 CopyDataThread obj = new CopyDataThread(f1,f2);
		 
		
		
	}

}