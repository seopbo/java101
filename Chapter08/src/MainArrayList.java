import java.util.ArrayList;

public class MainArrayList {
    public static void main(String[] args) {
        // ArrayList는 기본 자료형 (primitive type)을 item으로 가지도록 만들 수 없고, 참조형 (reference type)만 가질 수 있다.
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("김신의");
        nameList.add("이윤수");
        nameList.add("성태호");

        nameList.remove(2);
        System.out.println(nameList.size());
        System.out.println(nameList.get(1));

        ArrayList<Integer> numList = new ArrayList<>();

        numList.add(0);
        numList.add(1);
        numList.add(2);

        for (int num: numList) {
            System.out.println(num * num);
        }
    }
}
