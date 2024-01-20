/*
author: Jaydatt Patel

import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;

Methods of the FileInputStream Class :
1. int read (): Reads a byte of data from the input stream. 
2. int read (byte [] b) : Reads bytes of data from the input stream and stores them in the array. 
3. int read (byte [] b,int off, int len):  Reads the number of bytes specified by the third argument from the input stream and stores it in the array. The second argument specifies the position from where the bytes have to be read. 
4. int available () : Returns the number of bytes available for reading from theinput stream. 
5. void close () : Close an input stream and releases all the resourcesassociated with it. 
6. boolean markSupported () : Returns true if the stream supports a bookmark.
7. void mark (int readlimit ) : Marks a position on the stream and identifies the number of bytes that can be read before the mark becomes invalid.
8. void reset () : Repositions the stream to its last marked position. 
9. long skip (long n) : Skips a specific number of bytes in the stream. 
10. finalize() : Cleans up the connection to the file, and ensures that the close method of this file output stream is called when there are no more references to this stream.
11. FileChannel	getChannel() : Returns the unique FileChannel object associated with this file output stream.
12. FileDescriptor	getFD() : Returns the file descriptor associated with this stream.


Methods of the FileOutputStream Class :
1. void write (int n) : Writes the specified byte of data to the output stream.
2. void write (byte [] b ) : Writes an array of bytes to the output stream.
3. void write (byte []b, int off, int len ) : Writes a segment of an array to the output streams. 
4. void flush () : Force writes whenever the data accumulates in the output stream. 
5. void close () : Cause the output stream to close. Any data present on it is stored before the stream is de-allocated from the memory. 
 */

import java.io.*;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;


public class File_FileInputStream_and_FileOutputStream {
    public static void main(String[] args) throws Exception
	{ 
		FileInputStream readFile = null;
		FileOutputStream writeFile = null;
		try { 

            // -------------Read file program--------------
			readFile = new FileInputStream("file-in.txt");

            System.out.println("Number of remaining bytes:"+ readFile.available());
            System.out.println("readFile.getChannel() : "+ readFile.getChannel());            
            System.out.println("readFile.getFD() : "+ readFile.getFD());

			for(int i = 0; i < 3; i++)  // reading and printing Characters one by one 
				System.out.println("Char : "+(char)readFile.read()); 

			readFile.mark(0); // mark() : read limiing the 'readFile' input stream 

			
			readFile.skip(1); // skip() 
			System.out.println("skip() method comes to play"); 
			System.out.println("mark() method comes to play"); 

			for(int i = 0; i < 6; i++)
				System.out.println("Char : "+(char)readFile.read()); 
            

			boolean check = readFile.markSupported(); 
			if (readFile.markSupported()) 
			{ 
				readFile.reset(); //  repositioning the stram to marked positions.
				System.out.println("reset() invoked"); 
				System.out.println("Char : "+(char)readFile.read()); 
				System.out.println("Char : "+(char)readFile.read()); 
			} 
			else
				System.out.println("reset() method not supported."); 


			System.out.println("readFile.markSupported() supported"+ 
							" reset() : "+check); 
			
			// -------------Write file program--------------
			writeFile = new FileOutputStream("file-out.txt");
			
			byte b[] = {65, 66, 67, 68, 69, 70}; 
		
			writeFile.write(b); //illustrating write(byte[] b) method         
	
			for (int i = 71; i <75 ; i++)  //illustrating write(int b) method
				writeFile.write(i); 
			
			String str = "Welcome To Java ";
			byte ch[] = new byte[str.length()];
			ch = str.getBytes();
			writeFile.write('\n');		
			writeFile.write(ch);

			writeFile.flush(); 

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

			if (writeFile!=null) 
				writeFile.close(); // Use of close() : closing the file and releasing resources 
		} 



	} 
}
