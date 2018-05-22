package innerClassMethodCall;

/*
 Nested classes are divided into two categories: static and non-static. 
Nested classes that are declared static are called static nested classes.
Non-static nested classes are called inner classes.


A nested class is a member of its enclosing class. 
Non-static nested classes (inner classes) have access to 
other members of the enclosing class, even if they are declared private. 
Static nested classes do not have access to other members of the enclosing class.
 As a member of the OuterClass, a nested class can be declared private, public, protected, 
 or package private. (Recall that outer classes can only be declared public or 
 package private.)
 */


public class InnerClassMethodCall {
	private String Name;
	private int Age;
	
	
	// A static nested class
	public static class NestedStaticClass{
		private String Name;
		private int Age;
		
		public InnerClassMethodCall.NestedStaticClass setName(String name){
			this.Name = name;
			return this;
		}
		public InnerClassMethodCall.NestedStaticClass setAge(int age){
			this.Age= age;
			return this;
		}
		
		private InnerClassMethodCall build() {
			return new InnerClassMethodCall(this);
		}

		
	}// NestedStaticClass
	
	public InnerClassMethodCall(NestedStaticClass p) {
		this.Name = p.Name;
		this.Age = p.Age;
	}// InnerClassMethodCall Constructor

	
	public static void main(String[] args) {
		
	/*	 Method call order: 
		1. NestedStaticClass Constructor
		2. setAge
		3. setName
		4. build() to return an InnerClassMethodCall object reference to ip. 
		*/
		InnerClassMethodCall ip = 
				new InnerClassMethodCall.NestedStaticClass()
					.setAge(16)
					.setName("sx")
					.build();
	}




}
