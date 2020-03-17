import java.util.ArrayList;
import java.util.Collections;

public class ComparableDriver {
    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person("Charlie", 25));
        personList.add(new Person("Ben", 35));
        personList.add(new Person("Alex", 32));
        personList.add(new Person("Daniel", 41));

        Collections.sort(personList);
        System.out.println(personList);
    }
}
