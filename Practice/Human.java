package Practice;

public class Human {
	
	String name;
	int age;
	int heightInInches;
	String eyeColor;
	
	
	

	public Human(String name, int age, int heightInInches, String eyeColor) {
		super();
		this.name = name;
		this.age = age;
		this.heightInInches = heightInInches;
		this.eyeColor = eyeColor;
	}

	public void speak() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(heightInInches);
		System.out.println(eyeColor);
		
	}
	
	public void eat() {
		System.out.println("eating...");
		
	}
	
	
	public void walk() {
		System.out.println("walking...");
	}
	
	public void work() {
		System.out.println("working...");
	}

}
