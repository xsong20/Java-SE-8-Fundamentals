package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
	
	public static <E>void printArrayE(ArrayList<E> ay) {
		System.out.println(ay);
	}
	
	public static <T>void printArrayT(ArrayList<T> ay) {
		System.out.println(ay);
	}

	public static void main(String[] args) {
		
		List<String> sl = new ArrayList<String>();
		String s = "1234";
		sl.add(s);
		sl.add(s);
		sl.add(s);

		GenericsExample.printArrayE((ArrayList<String>)sl);
		GenericsExample.printArrayT((ArrayList<String>)sl);
		

	}

}
