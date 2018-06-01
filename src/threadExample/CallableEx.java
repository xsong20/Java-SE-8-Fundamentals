package threadExample;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CallableEx{
	public static void main(String[] args) {

		/*
		 * Working with the Thread class can be very tedious and error-prone. 
		 * Due to that reason the Concurrency API has been introduced back in 
		 * 2004 with the release of Java 5.
		 */
		
		/*
		 * Executor - Functional Interface with only execute().
		 * ExecutorService - Interface
		 * java.util.concurrent.Executors - Class inherits from java.lang.Object.
		 * 
		 * The Concurrency API introduces the concept of an ExecutorService 
		 * as a higher level replacement for working with threads directly.
		 * Executors are capable of running asynchronous tasks and typically
		 * manage a pool of threads, so we don't have to create new threads
		 * manually. All threads of the internal pool will be reused under 
		 * the hood for revenant tasks, so we can run as many concurrent tasks 
		 * as we want throughout the life-cycle of our application with a single 
		 * executor service.
		 */
		Callable<String> cTask = ()->{
				return "Callable task starts running!";	
	};
	
		ExecutorService ex = Executors.newCachedThreadPool();
		Future<String> ft = ex.submit(cTask);
		
		while(!ft.isDone()) {
			System.out.println("Task not done yet");
		}
		/*
		 * 	get()	Waits if necessary for the computation to complete, and then retrieves its result.
		get(long timeout, TimeUnit unit)
		 */try {
			 System.out.println("The result is: " + ft.get());	
			 
		 }catch(InterruptedException e) {
			 e.printStackTrace();
		 }catch(ExecutionException ee) {
			 ee.printStackTrace();
		 };
			
		
		/*
		 * The Callable interface is similar to Runnable, 
		 * in that both are designed for classes whose instances are potentially 
		 * executed by another thread. A Runnable, however,
		 * does not return a result and cannot throw a checked exception.
		 */
		try{
			ex.shutdown();
			ex.awaitTermination(5, TimeUnit.SECONDS);
			System.out.println("Executor shut down without interruption");
		}catch(InterruptedException e){
			System.out.println("task interrupted");
		}finally {
		if(!ex.isTerminated()) {
			ex.shutdownNow();
		}
		System.out.println("Executor shut down");
		
	}

	}

}


