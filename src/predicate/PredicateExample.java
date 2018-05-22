package predicate;

import java.util.function.Predicate;

public class PredicateExample {
	
	public static void main(String[] args) throws PredicateTestFailureException  {
	
		Predicate<String> p = i -> i.length() > 5;

		if(p.test("123456")) {
			PredicateExample.suvivedTheTest();
		}
		
		if(p.test("12345")) {
			PredicateExample.suvivedTheTest();
		}else {
			throw new PredicateTestFailureException();
		}
		
	}
	
	public static void suvivedTheTest() {
		System.out.println("test passed! String length is greater than 5");
	}

}
