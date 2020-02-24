/*
    Java에서는 Array의 instance를 생성하는 방법이 몇 가지 존재한다.

    1. 초기화하지 않고, 선언만 해두는 경우
    ex) int[] array;
        int[] array = null;

    2. 특정 길이로 초기화만 하는 경우
    ex) int[] array = new int[10];

    3. 특정 값들로 초기화 하는 경우
    ex) int[] array = {1, 2, 3, 4, 5};
        int[] array = new int[]{1, 2, 3, 4, 5};

 */

public class Array {
    public static void main(String[] args) {
        int[] intArray = new int[5];

        intArray[0] = 2;
        intArray[1] = 3;
        intArray[2] = 5;
        intArray[3] = 7;
        intArray[4] = 11;

        System.out.println(intArray[2] + intArray[4]);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
