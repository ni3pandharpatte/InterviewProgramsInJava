package statickeyword;

public class StaticPractice {
	int a = 10;
	static int s = 20;
	public static void main(String[] args) {
		int b =30;
		System.out.println(s);
		StaticPractice sp = new StaticPractice();
		sp.printValues();
//		a =30;	Non static global variable not allowed in static method
	}
	
	public void printValues() {
		
		System.out.println(a);
		System.out.println(s);
	}

}
