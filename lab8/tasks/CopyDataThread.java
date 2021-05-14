package lab8.tasks;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDataThread extends Thread {
	
    public CopyDataThread(FileWriter f1, File f2) throws IOException, InterruptedException {
    	
    	FileReader fileReader =new FileReader("f1");
    	FileWriter fileWriter = new FileWriter(f2);
    	int x = fileReader.read( );
         
        int i = 0;
    	while( x!=-1)
    	 {  fileWriter.write((char)x);
    	    i++;
    	    if(i%10 == 0) {
    	       System.out.println("10 characters are copied");
    	       sleep(500);
    	    }
    	 x=fileReader.read();
    	 
    	 }
	}
}
