package predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class PredicateExample {
	
	public static void main(String[] args) throws PredicateTestFailureException  {
	
		Predicate<String> p = i -> i.length() > 5;
		
		String[] al = {"dddd","dfasdfasf","sadfasf"};
		
		// convert the raw String array into an Arraylist.
		ArrayList<String> ayString = new ArrayList<String>(Arrays.asList(al));
		
		/*	ArrayList.removeIf()
		 * Removes all of the elements of this collection that satisfy the given predicate. 
		Errors or runtime exceptions thrown during iteration or by the predicate are relayed to
		the caller.*/
		
		ayString.removeIf(p);
		
		System.out.println(ayString);
	
		
		System.out.println("====== String tests begin ======");
		
		//p.test(String s) outputs true or false.
		if(p.test("123456")) {
			PredicateExample.suvivedTheTest();

		}
		
		if(p.test("123456")) {
			PredicateExample.suvivedTheTest();
		}else {
			throw new PredicateTestFailureException();
		}
		
	}
	
	public static void suvivedTheTest() {
		System.out.println("test passed! String length is greater than 5");
	}

}
