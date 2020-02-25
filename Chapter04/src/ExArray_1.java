public class ExArray_1 {
    public static void main(String[] args) {
        int[] intArray = new int[30];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i + 1;
        }

        String[] remainders = {"Zero", "One", "Two", "Three"};

        for (int integer: intArray) {
            System.out.println(remainders[integer % 4]);
        }
    }
}