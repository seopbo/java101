public class ExIfElse {
    public static void main (String[] args) {
        int a = 38, b = 27;

        if (a == b) {
            System.out.printf("a와 b가 같습니다. a = b = %d\n", a);
        } else {
            System.out.println("a와 b는 같지 않습니다");

            if (a > b) {
                System.out.printf("a가 b보다 %d만큼 더 큽니다.", a - b);
            } else {
                System.out.printf("b가 a보다 %d만큼 더 큽니다.");
            }
        }

    }
}
