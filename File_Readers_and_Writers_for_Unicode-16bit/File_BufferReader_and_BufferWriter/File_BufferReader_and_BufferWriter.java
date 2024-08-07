/*
author: Jaydatt Patel

import java.io.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;

Method of BufferedReader: 
1.void close():	It closes the stream and releases any system resources associated with it.
2.String getEncoding():	It returns the name of the character encoding being used by this stream.
3.int read():	It reads a single character.
4.int read(char[] cbuf, int offset, int length):	It reads characters into a portion of an array.
5.boolean ready():	It tells whether this stream is ready to be read.

Methods of BufferedWriter
1.void close():	It closes the stream, flushing it first.
2.void flush():	It flushes the stream.
3.String getEncoding():	It returns the name of the character encoding being used by this stream.
4.void write(char[] cbuf, int off, int len):	It writes a portion of an array of characters.
5.void write(int c):	It writes a single character.
6.void write(String str, int off, int len):	It writes a portion of a string.

 */
import java.io.*;
// import java.io.BufferedReader;
// import java.io.BufferedWriter;

class File_BufferReader_and_BufferWriter {
    public static void main(String[] args) throws Exception
	{ 
        FileReader readFile = null;
        BufferedReader readFile_reader = null;

		FileWriter writeFile = null;
        BufferedWriter writeFile_writer = null;

		try { 
			// -------------Write file program--------------
			writeFile = new FileWriter("file.txt");
        	writeFile_writer = new BufferedWriter(writeFile); 

			for (int i = 65; i < 70 ; i++)  //illustrating write(int b) method
				writeFile_writer.write(i); 

			writeFile_writer.flush(); 


			// -------------Read file program--------------
			readFile = new FileReader("file.txt");
        	readFile_reader = new BufferedReader(readFile);

	
			for(int i = 0; i < 4; i++)	// reading and printing Characters one by one 
				System.out.println("Char : "+(char)readFile_reader.read());	

 
		} 

		catch(Exception excpt) 
		{ 
			excpt.printStackTrace(); // in case of I/O error 
		} 

        // -----------close opened both read and write file------------
		finally
		{ 
			if (readFile!=null)  
				readFile.close(); //  closing the file and releasing resources  
			if (readFile_reader!=null)  
				readFile_reader.close(); //  closing the file and releasing resources  
			if (writeFile!=null)  
				writeFile.close(); //  closing the file and releasing resources
            if (writeFile_writer!=null)  
				writeFile_writer.close(); //  closing the file and releasing resources  
		} 

    }
}
