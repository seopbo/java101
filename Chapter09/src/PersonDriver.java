public class PersonDriver {
    public static void main(String[] args) {
        Person person = new Person("신의" , "김");

        // Object 최상위 클래스, 모든 클래스의 부모 클래스
        // Object object = new Object();
        System.out.println(person.toString());
        System.out.println(person);
    }
}
