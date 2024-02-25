package comparetor;

import java.util.*;

public class Testing {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		 
        // enter data into hashmap
        hm.put("Math", 98);
        hm.put("Data Structure", 85);
        hm.put("Database", 91);
        hm.put("Java", 95);
        hm.put("Operating System", 79);
        hm.put("Networking", 80);
        Map<String, Integer> hm1 = sortByValue(hm);
 
        // print the sorted hashmap
        for (Map.Entry<String, Integer> en : hm1.entrySet()) {
            System.out.println("Key = " + en.getKey() + 
                          ", Value = " + en.getValue());
        }
	}
	
	public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) {
		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(hm.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> o1,Map.Entry<String, Integer> o2) {
				return (o1.getValue().compareTo(o2.getValue()));
			}
		});
		
		HashMap<String, Integer> sortedHm = new HashMap<String, Integer>();
		for(Map.Entry<String, Integer> l: list) {
			sortedHm.put(l.getKey(), l.getValue());
		}
		return sortedHm;
		
	}
}
