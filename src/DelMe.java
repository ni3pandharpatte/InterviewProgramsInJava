
import java.util.*;

public class DelMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Jai Shree Ganesh 121 Jai Shree Ram 108";
		Set<String> set = new HashSet<>();
		List<String> list = new ArrayList<>();
		String[] sa = str.split(" ");
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
