package comparetor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(3, "Alice", 30));
        people.add(new Person(1, "Bob", 25));
        people.add(new Person(2, "Charlie", 35));

        // Sorting based on pid using Comparator
        Collections.sort(people, new MyComparetor());

        // Print sorted list
        for (Person person : people) {
            System.out.println(person.pid + " " + person.name + " " + person.age);
        }
    }
}
