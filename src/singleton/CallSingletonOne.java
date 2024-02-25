package singleton;

public class CallSingletonOne {
	public static void main(String[] args) {
		Singleton sInstance = Singleton.getInstance();
		System.out.println(sInstance.name);
	}
}

