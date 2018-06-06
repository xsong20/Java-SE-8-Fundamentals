package SimpleFileIOApp;

/*
 * This program simly 
 */
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Arrays;

public class CopyFileApp {
	public static void main(String[] args) {
		System.out.println("====== Example with CharArray=========");
		try {
			FileReader fi = new FileReader(args[0]);
			FileWriter fo = new FileWriter(args[1]);
			
			// declare a char array to store chars read from file;
			char cbuf[] = new char[30];
			
			// readChars stores the number of chars read from file.
			int readChars = fi.read(cbuf);
			
			//print readChars to see the result;
			System.out.println(readChars + " characters were read from file.");
				
			// to convert char[] to string
			String stringTmp = new String(cbuf);
			
			// to strip extra \s white spaces.
			stringTmp = stringTmp.replaceAll("\\s", "");
			
			// output the stripped string to console
			System.out.println("The converted string looks like:" + stringTmp);
			
			// output string length
			System.out.println("Converted string stringTmp's length: " + stringTmp.length());
			
			// output char array length
			System.out.println("cbuf length: " + cbuf.length);
			
			// write the string to file with FileWriter.
			fo.write(stringTmp);
			
			// necessary file closing
			fi.close();
			fo.close();

		} catch (IOException e) {
			e.printStackTrace();
		}


		/*
		 * In the following lines of code, I use CharBuffer to store chars read from file.
		 */
		System.out.println("\n====== Example with CharBuffer =========");
		/*
		 * public abstract class Buffer extends Object: A container for data of a specific primitive type.
		 * 
			A buffer is a linear, finite sequence of elements of a specific primitive type. 
			Aside from its content, the essential properties of a buffer are its capacity, limit, 
			and position:
			 
			A buffer's capacity is the number of elements it contains. 
			The capacity of a buffer is never negative and never changes.
			
			A buffer's limit is the index of the first element that should not be read or written.
			A buffer's limit is never negative and is never greater than its capacity.
			
			A buffer's position is the index of the next element to be read or written. 
			A buffer's position is never negative and is never greater than its limit.
			
			positon <= limit <= capacity
			
			There is one subclass of this class for each non-boolean primitive type.
		 */
		
		
		try {
			FileReader fi = new FileReader(args[0]);
			
			// allocate: Distribute (resources or duties) for a particular purpose.
			// CharBuffer java.nio.CharBuffer.allocate(int capacity) 	
			CharBuffer cbuf = CharBuffer.allocate(10);
			
			int numOfCharRead;
			
			// put the returned int value in numOfCharRead
			// (numOfCharRead = fi.read(cbuf)) != 0 && fi.read(cbuf) is supposed to be true
			// fi.read(cbuf) != GlobalStaticVars.FILE_END
			numOfCharRead = fi.read(cbuf);
			
			System.out.println("Limit: " + cbuf.limit());
			
			System.out.println("Position: " + cbuf.position());
			// Position: 5 after last line.
					
			// output the number of chars read from file
			System.out.println("Number of chars read from file:" + numOfCharRead);
				
			// output the stripped string to console
			// Why clear()?
			// read: https://docs.oracle.com/javase/8/docs/api/index.html?java/nio/CharBuffer.html
			// Clears this buffer. The position is set to zero, the limit is set to the capacity, and the mark is discarded. 
			System.out.println("Char buffer:" + cbuf.clear());
			
			System.out.println("Position: " + cbuf.position());
			// Position: 5 after last line.
			
			// output string length
			System.out.println("Actual char buffer length: " + cbuf.capacity());
			
			/*
			 *  When viewed as a character sequence, 
			 *  the length of a character buffer is simply the number of characters 
			 *  between the position (inclusive) and the limit (exclusive); 
			 *  that is, it is equivalent to remaining(). 
			 */
			System.out.println("Remaining number of slots: " + cbuf.length());

			// necessary clean up
			fi.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
