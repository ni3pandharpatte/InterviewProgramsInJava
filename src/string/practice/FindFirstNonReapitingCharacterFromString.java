package string.practice;

public class FindFirstNonReapitingCharacterFromString {

	public static void main(String[] args) {
		String name = "nitin pandharpatte";		//output d
        for(int i=0 ; i<name.length();i++){
            boolean isDuplicate = false;
            char ch1 = name.charAt(i);
            for(int j=0; j<name.length();j++){
                char ch2 = name.charAt(j);
                if(i == j) {
                	continue;
                }
                if(ch1 == ch2 || ch1 ==' '){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate) {
            	System.out.println(ch1);
            	break;
            }
             
        }
	}

}
