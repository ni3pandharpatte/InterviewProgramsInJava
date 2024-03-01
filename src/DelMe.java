
import java.util.*;

public class DelMe {

	public static void main(String[] args) {
		// Remove the duplicate words from string
		String str = "Jai Shree Ganesh 121 Jai Shree Ram 108";
		Set<String> set = new HashSet<>();
		String[] sa = str.split(" ");
		//Adding the set values in list because Collections.sort does not work on the SET
		List<String> list = new ArrayList<>();
		for (int i = 0; i < sa.length; i++) {
			set.add(sa[i]);
		}
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			list.add(itr.next());
		}
		
		Collections.sort(list);

		for (String s : list) {
				System.out.println(s);
		}
	}

}
