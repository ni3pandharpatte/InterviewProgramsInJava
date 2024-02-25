package string.practice;

//str.compareTo(str2)
//arr.length

public class SortStringArray {
	public static void main(String[] args) {
	       
	    String[] sa = {"mahesh", "ganesh", "ravi", "nitin"};
	    String temp = "";
	    for(int i = 0; i< sa.length; i++){
			    for(int j = i; j< sa.length; j++){
			        if(sa[i].compareTo(sa[j])>0){
			            temp = sa[i];
			            sa[i] = sa[j];
			            sa[j]=temp;
			        }
		        }
		}
		for(String name : sa){
		    System.out.println(name);
		}
    }
}
