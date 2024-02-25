package collection.practice;

import java.util.*;

public class PrintCharByMaxOccurences {
	public static void main(String[] args) {
		System.out.println("Jai Ganesh");
		String str = "YGGGAAEEEE";
//		Output: EGAY

		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(map.get(ch) == null) {
				map.put(ch, 1);
			}else {
				map.put(ch, map.get(ch) + 1);
			}
		}
		
		Map<Character, Integer> hm1 = sortByValue(map);
		
		for(Map.Entry<Character, Integer> e : hm1.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
			
		}
	}
	
	// function to sort hashmap by values
    public static HashMap<Character, Integer> sortByValue(Map<Character, Integer> map)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<Character, Integer> > list =
               new LinkedList<Map.Entry<Character, Integer> >(map.entrySet());
 
        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer> >() {
            public int compare(Map.Entry<Character, Integer> o1, 
                               Map.Entry<Character, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
         
        // put data from sorted list to hashmap 
        HashMap<Character, Integer> temp = new LinkedHashMap<Character, Integer>();
        for (Map.Entry<Character, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
}
