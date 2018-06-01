package threadExample;



public class ThreadExample {
	
	public static void main(String[] args){
		System.out.println("====================");
		System.out.println("CallableEX starting");
		CallableEx.main(args);
	
		System.out.println("====================");
		System.out.println("RunnableEX starting\n");
		RunnableEx.main(args);
	
		System.out.println("====================");
		System.out.println("InvokeAllExampleEX starting\n");
		InvokeAllExample.main(args);
		
	}

	

}
