/*
author: Jaydatt Patel

import java.io.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;

Methods of DataInputStream :
1.String readLine()	reads a line that has been terminated by a \n, \r, \r\n or EOF.
2.int read(byte[] b) : It is used to read the number of bytes from the input stream.
3.int read(byte[] b, int off, int len) :	It is used to read len bytes of data from the input stream.
4.long readLong()	Reading eight input bytes and returns a long value
5.short readShort()	Read two input bytes and return a short value.
6.unsigned short readUnsignedShort()	Read two input bytes and returns as an integer array
7.int readInt() :	It is used to read input bytes and return an int value.
8.byte readByte() : It is used to read and return the one input byte.
9.unsigned byte readUnsignedByte()	Read byte and return as an integer
10.char readChar() : It is used to read two input bytes and returns a char value.
11.float readFloat()	Read four input bytes and returns a float value.
12.double readDouble() : It is used to read eight input bytes and returns a double value.
13.boolean readBoolean() :	It is used to read one input byte and return true if byte is non zero,false if byte is zero.
14.int skipBytes(int x) : It is used to skip over x bytes of data from the input stream.
15.String readUTF() :	It is used to read a string that has been encoded using the UTF-8 format.
16.void readFully(byte[] b) :	It is used to read bytes from the input stream and store them into the buffer array.
17.void readFully(byte[] b, int off, int len) : It is used to read len bytes from the input stream


Methods of DataOutputStream :

Method	Description
1.int size() :	It is used to return the number of bytes written to the data output stream.
2.void write(int b) :	It is used to write the specified byte to the underlying output stream.
3.void write(byte[] b, int off, int len) :	It is used to write len bytes of data to the output stream.
4.void writeBoolean(boolean v) :	It is used to write Boolean to the output stream as a 1-byte value.
5.void writeChar(int v) :	It is used to write char to the output stream as a 2-byte value.
6.void writeChars(String s) :	It is used to write string to the output stream as a sequence of characters.
7.void writeByte(int v) :	It is used to write a byte to the output stream as a 1-byte value.
8.void writeBytes(String s) :	It is used to write string to the output stream as a sequence of bytes.
9.void writeInt(int v) :	It is used to write an int to the output stream
10.void writeShort(int v) :	It is used to write a short to the output stream.
11.void writeShort(int v) :	It is used to write a short to the output stream.
12.void writeLong(long v) :	It is used to write a long to the output stream.
13.void writeUTF(String str) :	It is used to write a string to the output stream using UTF-8 encoding in portable manner.
14.void flush() :	It is used to flushes the data output stream.

 */
import java.io.*;
//import java.io.DataInputStream;
//import java.io.DataOutputStream;

public class File_DataInput_and_DataOutput_Stream {
    public static void main(String[] args) throws Exception
	{ 
		FileInputStream readFile = null;
		FileOutputStream writeFile = null;
        
        DataInputStream readFile_data = null;
        DataOutputStream writeFile_data = null;

		try {

            // -------------Write file program--------------
            writeFile = new FileOutputStream("file_data.txt");		
            writeFile_data = new DataOutputStream(writeFile);
    
            String str = "Welcome To Java\n";
            byte ch[] = new byte[str.length()];
            ch = str.getBytes();		
            writeFile_data.write(ch);
            writeFile_data.writeDouble(1.1); 
            writeFile_data.writeInt(55); 
            writeFile_data.writeBoolean(true); 
            writeFile_data.writeChar('4'); 

            writeFile_data.flush(); 

            // -------------Read file program--------------

            readFile = new FileInputStream("file_data.txt");		
            readFile_data = new DataInputStream(readFile);
            System.out.println("Number of remaining bytes:"+ readFile_data.available());

            System.out.println("readLine() : "+readFile_data.readLine()); 
            System.out.println("readDouble() : " + readFile_data.readDouble()); 
            System.out.println("readInt() : " + readFile_data.readInt()); 
            System.out.println("readBoolean() : " + readFile_data.readBoolean()); 
            System.out.println("readChar() : " + readFile_data.readChar()); 

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
            if (readFile_data!=null) 
				readFile_data.close(); // Use of close() : closing the file and releasing resources 

			if (writeFile!=null) 
				writeFile.close(); // Use of close() : closing the file and releasing resources 
            if (writeFile_data!=null) 
				writeFile_data.close(); // Use of close() : closing the file and releasing resources 
		} 

	} 
}
