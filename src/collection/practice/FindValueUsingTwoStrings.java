package collection.practice;
import java.util.*;

public class FindValueUsingTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "jjj,ggg 121\naaa,yyy 100\nddd,xxx 050";
		String str2 = "aaa,yyy ddd,xxx jjj,xxx";
		String[] s1 = str1.split("\n");
		String[] s2 = str2.split(" ");
		Map<String, String> map = new HashMap<String,String>();
		
		for(int i=0;i<s1.length;i++) {
			String[] msa = s1[i].split(" "); 
			map.put(msa[0], msa[1]);
		}
		
		for(int i=0;i<s2.length;i++) {
			String value = "undefined";
			for(Map.Entry<String, String> m : map.entrySet()) {
				if(m.getKey().equals(s2[i])) {
					value = m.getValue();
				}
			}
			System.out.println(s2[i]+"->"+value);
		}
	}

}
