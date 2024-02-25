package singleton;

public class Singleton {
	public static Singleton singletonInstance = null;
	public String name;

	private Singleton() {
		this.name = "Jai Ganesh";
	}

	public static synchronized Singleton getInstance() {
		if (singletonInstance == null) {
			singletonInstance = new Singleton();
		}
		return singletonInstance;
	}
}
