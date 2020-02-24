/*
    길이가 100인 배열을 만들고 첫 번째 칸은 1, 두 번째 칸은 2, ..., 마지막 칸은 100으로 채워본다.
 */
public class ExForArray {
    public static void main (String[] args) {
        int[] intArray = new int[100]; // 배열의 사이

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i + 1;
        }

        String[] fruitsArray = new String[5];

        fruitsArray[0] = "딸기";
        fruitsArray[1] = "당근";
        fruitsArray[2] = "수박";
        fruitsArray[3] = "참외";
        fruitsArray[4] = "메론";


        // Java에서 for-each 구문은 아래와 같이 사용할 수 있다.
        for (int i: intArray) {
            System.out.println(i);
        }

        for (String fruit: fruitsArray) {
            System.out.println(fruit);
        }
    }
}
