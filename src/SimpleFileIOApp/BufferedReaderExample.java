package SimpleFileIOApp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
	/*
	 * 	Reads text from a character-input stream, buffering characters so as to provide for the efficient reading of characters, arrays, and lines.
		The buffer size may be specified, or the default size may be used. The default is large enough for most purposes.

		In general, each read request made of a Reader causes a corresponding read request to be made of the underlying character or byte stream. It is therefore advisable to wrap a BufferedReader around any Reader whose read() operations may be costly, such as FileReaders and InputStreamReaders. For example,

 		BufferedReader in = new BufferedReader(new FileReader("foo.in"));
 
		will buffer the input from the specified file. Without buffering, each invocation of read() or readLine() could cause bytes to be read from the file, converted into characters, and then returned, which can be very inefficient.
		Programs that use DataInputStreams for textual input can be localized by replacing each DataInputStream with an appropriate BufferedReader.
	 */
		
	public static void main(String[] args) {
		try {
			// to declare a bufferedReader
			// returned value is a stream
			BufferedReader bf = new BufferedReader(new FileReader(args[0]));
			
			// to output each line to console
			bf.lines().forEach(line -> System.out.println(line));
			
			bf.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
