/*
author: Jaydatt Patel

import java.io.*;
import java.io.RandomAccessFile;

constructor:
RandomAccessFile(File file, String mode)	
RandomAccessFile(String name, String mode)	

Methods of RandomAccessFile: 
1.	void close() : This method Closes this random access file stream and releases any system resources associated with the stream.
2.	FileChannel getChannel() : This method returns the unique FileChannel object associated with this file.
3.	FileDescriptor getFD() : This method returns the opaque file descriptor object associated with this stream.
4.	long getFilePointer() : This method returns the current offset in this file.
5.	long length() : This method returns the length of this file.

6.	int read() : This method reads a byte of data from this file.
7.	int read(byte[] b) : This method reads up to b.length bytes of data from this file into an array of bytes.
8.	int read(byte[] b, int off, int len) : This method reads up to len bytes of data from this file into an array of bytes.
9.	boolean readBoolean() : This method reads a boolean from this file.
10.	byte readByte() : This method reads a signed eight-bit value from this file.
11.	char readChar() : This method reads a character from this file.
12.	double readDouble() : This method reads a double from this file.
13.	float readFloat() : This method reads a float from this file.
14.	void readFully(byte[] b) : This method reads b.length bytes from this file into the byte array, starting at the current file pointer.
15.	void readFully(byte[] b, int off, int len) : This method reads exactly len bytes from this file into the byte array, starting at the current file pointer.
16.	int readInt() : This method reads a signed 32-bit integer from this file.
17.	String readLine() : This method reads the next line of text from this file.
18.	long readLong() : This method reads a signed 64-bit integer from this file.
19.	short readShort() : This method reads a signed 16-bit number from this file.
20.	int readUnsignedByte() : This method reads an unsigned eight-bit number from this file.
21.	int readUnsignedShort() : This method reads an unsigned 16-bit number from this file.
22.	String readUTF() : This method reads in a string from this file.

23.	void seek(long pos) : This method sets the file-pointer offset, measured from the beginning of this file, at which the next read or write occurs.
24.	void setLength(long newLength) : This method sets the length of this file.
25.	int skipBytes(int n) : This method attempts to skip over n bytes of input discarding the skipped bytes.
26.	void write(byte[] b) : This method writes b.length bytes from the specified byte array to this file, starting at the current file pointer.

27.	void write(byte[] b, int off, int len) : This method writes len bytes from the specified byte array starting at offset off to this file.
28.	void write(int b) : This method writes the specified byte to this file.
29.	void writeBoolean(boolean v) : This method writes a boolean to the file as a one-byte value
30.	void writeByte(int v) : This method writes a byte to the file as a one-byte value.
31.	void writeBytes(String s) : This method writes the string to the file as a sequence of bytes.
32.	void writeChar(int v) : This method writes a char to the file as a two-byte value, high byte first.
33.	void writeChars(String s) : This method writes a string to the file as a sequence of characters.
34.	void writeDouble(double v) : This method converts the double argument to a long using the doubleToLongBits method in class Double, and then writes that long value to the file as an eight-byte quantity, high byte first.
35.	void writeFloat(float v) : This method converts the float argument to an int using the floatToIntBits method in class Float, and then writes that int value to the file as a four-byte quantity, high byte first.
36.	void writeInt(int v) : This method writes an int to the file as four bytes, high byte first.
37.	void writeLong(long v) : This method writes a long to the file as eight bytes, high byte first.
38.	void writeShort(int v) : This method writes a short to the file as two bytes, high byte first.
39.	void writeUTF(String str) : This method writes a string to the file using modified UTF-8 encoding in a machine-independent manner.

 */

import java.io.*;
//import java.io.RandomAccessFile;

class File_RandomeAccessFile {
    public static void main(String[] args) throws Exception
    { 
        RandomAccessFile file = null;
        try
        { 
            file = new RandomAccessFile("File.txt", "rw"); 

            file.writeInt(999);
            file.writeFloat((3.14f));
            file.writeDouble(123.546984);            
            file.writeBoolean(true);
            file.writeChar('c');
            file.writeUTF("Welcome To Java Programming");

  
            file.seek(0); // File Pointer at index position - 0         
            System.out.println("file.readInt() : " + file.readInt());      
            System.out.println("file.readFloat() : " + file.readFloat());      
            System.out.println("file.readDouble() : " + file.readDouble());      
            System.out.println("file.readBoolean() : " + file.readBoolean());      
            System.out.println("file.readChar() : " + file.readChar());              
            System.out.println("file.readUTF() : " + file.readUTF());      

            file.seek(0); 
            System.out.println("file.readLine() : " + file.readLine());    
      
    
            file.seek(0); 
            byte[] arr = new byte[(int)file.length()]; // Create array upto file.length
            file.readFully(arr); // readFully()
              
            String str1 = new String(arr); 
            System.out.println("readFully() : " + str1); 
  
            file.seek(0); 
            file.readFully(arr, 0, 8); // readFully(byte[] b, int off, int len)
            
            String str2 = new String(arr); 
            System.out.println("readFully(byte[] b, int off, int len) : " + str2);
        } 
        catch (Exception ex) 
        { 
            ex.printStackTrace(); 
        } 

        finally
        {
            if(file != null)
                file.close();
        }
    } 
}
