package enumeration.practice;

public class UseOfEnum {
	enum Days {
			Sunday, 
			Monday, 
			Tuesday, 
			Wedensday, 
			Thursday, 
			Friday, 
			Saturday;
	}
	public static void main(String[] args) {
//		Days d = Days.Friday;
//		System.out.println(d);
		for(Days d: Days.values()) {
			System.out.println(d);
		}
	}

}
