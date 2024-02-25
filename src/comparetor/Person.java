package comparetor;

public class Person {
	int pid;
	String name;
	int age;
	
	public Person(int pid, String name, int age){
		this.pid = pid;
		this.name = name;
		this.age = age;
	}
	
	public int getPid() {
		return pid;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}	
}
