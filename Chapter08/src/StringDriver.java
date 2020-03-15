public class StringDriver {
    public static void main(java.lang.String[] args) {
        char[] data = {'a', 'B', 'c'};
        String myString_1 = "aBc";
        String myString_2 = new String(data);

        System.out.println(myString_1);
        System.out.println(myString_2);

        // 대소문자 변환
        System.out.println(myString_1.toUpperCase()); // 모두 대문자로 (not in-place)
        System.out.println(myString_1.toLowerCase()); // 모두 소문자로 (not in-place)

        // 문자열 비교
        System.out.println(myString_1 == myString_2); // 참조형의 비교 연산자는 가리키는 인스턴스가 같은 인스턴스인지 확인
        System.out.println(myString_1.equals(myString_2));

    }
}
