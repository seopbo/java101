public class Person implements Comparable<Person>{

    public final String name;
    public final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ": " + age + "세";
    }

    @Override
    public int compareTo(Person o) {
        if (age == o.age) {
            return 0;
        } else if (age > o.age) {
            return -1;
        } else {
            return 1;
        }
    }
}
