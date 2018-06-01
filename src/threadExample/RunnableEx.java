package threadExample;

public class RunnableEx {
	public static void main(String[] args) {
		// The Runnable interface should be implemented by any class 
		// whose instances are intended to be executed by a thread.
		// It has only one method run() and therefore is a functional interface
		
		
	 /*	 what type is a lambda expresion?? Object
		 but in Java, the lambda expressions are represented as objects,
		 and so they must be bound to a particular object type known as a 
		 functional interface. This is called the target type.
		 
		 https://en.wikipedia.org/wiki/First-class_function
	 */		
		Runnable task = ()->{
			System.out.println("the Task was executed");
		};
		
  		task.run();
  		
  		// thread inherit directly from Object
  		Thread td = new Thread(task);
  		td.getState();
  		td.start();
  		
	}

}
