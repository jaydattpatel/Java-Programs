/*
author: Jaydatt Patel

import java.io.*;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

*/

import java.io.*;
//import java.io.BufferedInputStream;
//import java.io.BufferedOutputStream;

public class File_BufferedInput_and_BufferedOutput_Stream_class {
    public static void main(String[] args) throws Exception
	{ 
		FileInputStream readFile  = null;
        BufferedInputStream readFile_buff =  null;

		FileOutputStream writeFile = null;
		BufferedOutputStream writeFile_buff = null;
		 
		try { 

            // -------------Read file program--------------
			readFile  =new FileInputStream("file-in.txt"); 
        	readFile_buff = new BufferedInputStream(readFile);

            System.out.println("Number of remaining bytes:"+ readFile_buff.available());

			for(int i = 0; i < 3; i++)  // reading and printing Characters one by one 
				System.out.println("Char : "+(char)readFile_buff.read()); 

			readFile_buff.mark(0); // mark() : read limiing the 'readFile_buff' input stream 
			
			readFile_buff.skip(1); // skip() 
			
			System.out.println("skip() method comes to play"); 
			System.out.println("mark() method comes to play"); 

			for(int i = 0; i < 6; i++)
				System.out.println("Char : "+(char)readFile_buff.read()); 
            

			boolean check = readFile_buff.markSupported(); 
			if (readFile_buff.markSupported()) 
			{ 
				readFile_buff.reset(); //  repositioning the stram to marked positions.
				System.out.println("reset() invoked"); 
				System.out.println("Char : "+(char)readFile_buff.read()); 
				System.out.println("Char : "+(char)readFile_buff.read()); 
			} 
			else
				System.out.println("reset() method not supported."); 


			System.out.println("readFile_buff.markSupported() supported"+ 
							" reset() : "+check); 
			
		// -------------Write file program--------------
		writeFile = new FileOutputStream("file-out.txt"); 
		writeFile_buff = new BufferedOutputStream(writeFile);

        byte b[] = {65, 66, 67, 68, 69, 70}; 
	
        writeFile_buff.write(b); //illustrating write(byte[] b) method         
  
        for (int i = 71; i <75 ; i++)  //illustrating write(int b) method
            writeFile_buff.write(i); 
          
		String str = "Welcome To Java ";
		byte ch[] = new byte[str.length()];
		ch = str.getBytes();
		writeFile_buff.write('\n');		
		writeFile_buff.write(ch);

        writeFile_buff.flush(); 

		} 

		catch(Exception excpt) 
		{ 
			excpt.printStackTrace(); // in case of I/O error 
		} 

        // -----------close opened both read and write file------------
		finally
		{ 
			if (readFile!=null) 
				readFile.close(); // Use of close() : closing the file and releasing resources 
			if (readFile_buff!=null) 
				readFile_buff.close(); // Use of close() : closing the file and releasing resources

			if (writeFile!=null) 
				writeFile.close(); // Use of close() : closing the file and releasing resources
			if (writeFile_buff!=null) 
				writeFile_buff.close(); // Use of close() : closing the file and releasing resources  
		} 

	} 
}
