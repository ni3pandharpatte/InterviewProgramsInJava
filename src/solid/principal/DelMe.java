package solid.principal;

import java.util.*;

public class DelMe {

	int pid;
	String name;
	int age;

	public DelMe(int pid, String name, int age) {
		this.pid = pid;
		this.name = name;
		this.age = age;
	}

	public int getPid() {
		return this.pid;
	}

	public int getAge() {
		return this.age;
	}

	public static void main(String[] args) {
		DelMe d1 = new DelMe(108, "Jai", 108);
		DelMe d2 = new DelMe(121, "Ganesh", 1001);
		DelMe d3 = new DelMe(21, "Shiv", 1008);

		List<DelMe> list = new LinkedList<DelMe>();
		list.add(d1);
		list.add(d2);
		list.add(d3);

		Collections.sort(list, new Comparator<DelMe>() {
			public int compare(DelMe o1, DelMe o2) {
				return Integer.compare(o1.getPid(), o2.getPid());
			}
		});
		
		for(DelMe l : list) {
			System.out.println(l.pid);
			System.out.println(l.name);
			System.out.println(l.age);
		}
	}
}
