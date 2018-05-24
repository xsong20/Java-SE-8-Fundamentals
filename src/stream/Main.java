package stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// how to filter unequal to.
		//  p-> !p.equals("a1")
			List<String> st = Stream.of("a1", "a2", "a3")
					.filter( p-> !p.equals("a1") )
					.collect(Collectors.toList());
				System.out.println(st);
		}

}