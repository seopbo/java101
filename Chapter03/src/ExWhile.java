public class ExWhile {
    public static void main(String[] args) {
        int num = 10000, key = 153;
        int i = 0, result = 0;

        while (key * i < num) {
            result = key * i;
            i++;
        }

        System.out.println(result);
    }
}