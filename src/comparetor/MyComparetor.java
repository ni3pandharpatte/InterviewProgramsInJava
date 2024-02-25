package comparetor;

import java.util.Comparator;

public class MyComparetor implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		return Integer.compare(o1.getPid(), o2.getPid());
	}
}
