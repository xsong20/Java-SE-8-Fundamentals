package immutableClassExample;

/*
 *  How Do We Create an Immutable Class
In order to create an immutable class, you should follow the below steps:
1.	Make your class final, so that no other classes can extend it.
2.	Make all your fields final, so that they’re initialized only once inside the constructor 
	and never modified afterward.
3.	Don’t expose setter methods.
4.	When exposing methods which modify the state of the class, 
	you must always return a new instance of the class.
5.	If the class holds a mutable object:
	o		Inside the constructor, make sure to use a clone copy of the passed argument 
	and never set your mutable field to the real instance passed through constructor, 
	this is to prevent the clients who pass the object from modifying it afterwards.
	o		Make sure to always return a clone copy of the field and never return the real object instance.
*/

public final class MyImmutableClass {
	private final String name; 
	private final String id;
	// set obj to private and expose an getter method,
	private ObjectToModify obj ;

	public MyImmutableClass() {
		this.name = "sx";
		this.id ="1234"; 
		this.obj = new ObjectToModify();
	}
	
	public class ObjectToModify {
		private boolean status = false;
		
		public void setStatus(boolean status) {
			this.status = status;
		}
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		System.out.println(this.name);
		System.out.println(this.id);
		System.out.println(this.obj.status);
		return super.toString();
	}
	
	
	public MyImmutableClass modifyName() {
		MyImmutableClass object = new MyImmutableClass();
		object.obj.setStatus(true);
		return object;
	}
	
	

}
