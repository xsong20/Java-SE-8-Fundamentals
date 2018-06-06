package SimpleFileIOApp;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
	public static void main(String[] args) {
		char content[] = new char[100];
		
		try{
			// FileInputStream is meant for reading streams of raw bytes such as image data. For reading streams of characters, consider using FileReader.
			FileReader fi = new FileReader(args[0]);
			
			/*
			 * 	FIleReader::read(int java.io.Reader.read(char[] cbuf) throws IOException
			 * 
				Reads characters into an array. This method will block until some input is available, an I/O error occurs, 
				or the end of the stream is reached.
				
				@par
				cbuf : Destination buffer
				@return
				Returns:The number of characters read, or -1 if the end of the stream has been reached
				@Throw
				Throws:IOException - If an I/O error occurs
			 */
			
			/*
			 * To make the returned value -1, run: touch dataSrc and read from it
			 */
			System.out.println(fi.read(content));
			System.out.println(new String(content));
			fi.close();
		}catch(FileNotFoundException fe) {
			fe.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}
}
