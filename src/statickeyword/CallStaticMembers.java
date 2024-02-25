package statickeyword;

public class CallStaticMembers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticPractice sp = new StaticPractice();
		sp.printValues();
//		printValues();						// Not possbile
//		StaticPractice.printValues();		// Not possbile
		System.out.println(StaticPractice.s);
	}
	
	public void demo() {
		System.out.println(StaticPractice.s);
	}

}
