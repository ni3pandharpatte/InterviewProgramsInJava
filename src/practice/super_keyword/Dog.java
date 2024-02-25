package practice.super_keyword;

public class Dog extends Animal {
	String name;
	public Dog(String type, String name){
		super(type);	// calls the parent call constructor
		this.name = name;
		System.out.println("Child Dog Class is Called");
	}
}

