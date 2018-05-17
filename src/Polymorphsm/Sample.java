package Polymorphsm;

// Lesson 8 & 9

public class Sample extends SuperClass {
	
/*	When this section is uncommented:
 *  SuperClass was called
	SuperClass was called


	When this section is commented: 
	Sample was called
	SuperClass was called
	*/	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Sample was called";
	}
	
	
	private void privateMethodofSample() {
		System.out.println("This method is unique to sample class");
	}


	public static void main(String[] args) {
		
		System.out.println(new Sample());
		System.out.println(new SuperClass());
		
		SuperClass ref = new Sample();
		System.out.println(ref);
		
		// Cast the type to subclass to access the unique classes.
		// keyword instanceof can be used to check type casting error
		if(ref instanceof SuperClass) {
		((Sample)ref).privateMethodofSample();
		}
		else {
			System.out.println("the casted instance is not a type of SuperClass, Error!");
		}
	}

}
