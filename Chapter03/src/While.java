public class While {
    public static void main (String[] args) {
        int i = 0, sum = 0;

        while (i <= 3) {
            sum = sum + i;
            i++;
        }

        System.out.println(sum);
    }
}
