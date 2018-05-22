package predicate;


// https://www.w3resource.com/java-tutorial/types-of-exception.php

public class PredicateTestFailureException extends Exception {
	public PredicateTestFailureException() {
		super("Predicate test has failed");
	}

}
