package string.practice;

//str.charAt(index)
//str.indexOf(char)
//str.length()

class VowelsFinding {
    public static void main(String[] args) {
        
        String str = "online Java Compiler, and run your Java code online";
        String vowels = "aeiouAEIOU";
        int count=0;
		char ch;
        for(int i = 0; i< str.length(); i++){
            ch = str.charAt(i);
//            if(vowels.contains(Character.toString(ch))){
            if(vowels.indexOf(ch)!=-1){
                count++;
            }
        }
        System.out.println(count);
    }
}