package threadExample;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class InvokeAllExample {
	public static void main(String[] args) {
		List<Callable<String>> cl = Arrays.asList(
								()->"task1",
								()-> "task2",
								()-> "task3"
								);
		
		ExecutorService ex =  Executors.newCachedThreadPool();
			
		try {
			ex.invokeAll(cl)
			.stream()
			.map(future -> {
				try {
					return future.get();
				}catch(Exception e) {
					throw new IllegalStateException();
				}
			}).forEach(System.out::println);
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}finally {
			ex.shutdown();
			try {
				ex.awaitTermination(5, TimeUnit.SECONDS);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				if(!ex.isTerminated()) {
					ex.shutdownNow();	
				}
				
			}
		}
	}
}
