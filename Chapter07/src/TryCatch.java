public class TryCatch {
    public static void main(String[] args) {
        int[] smallArray = new int[3];

        for (int i = 0; i < 10; i++) {
            try {
                smallArray[i] = i;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(i + "번 째 시도에서 예외 발생");
            }
        }

        // 결과 확인
        for (int i: smallArray) {
            System.out.println(i);
        }
    }
}

