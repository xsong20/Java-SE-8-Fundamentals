package inheritance;

public class Dog extends Animal{
	private String name;
	private String breed;

	public Dog(Integer age, String name, String breed) {
		super(age);
		this.name = name;
		this.breed = breed;
	}
	
	@Override
	public String toString() {
		System.out.println("The dog is: " + name + "   Age:" + super.age + "   breed:" + breed);
		System.out.println();
		return super.toString();
		
	}
	
}
