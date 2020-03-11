import java.lang.Math;
import java.util.Random;

public class MainMath {
    public static void main(String[] args) {
        // 절대값
        System.out.println(Math.abs(-10));
        System.out.println(Math.abs(8));

        // 최대값, 최소값
        System.out.println(Math.min(4, 10));
        System.out.println(Math.max(4, 10));

        // 난수생성
        // 0 이상 n 이하의 랜덤값
        Random rand_1 = new Random();
        System.out.println(rand_1.nextInt(10)); // 0 이상 9 이하의 랜덤한 값

        // a 이상 b 이하의 랜덤 값
        Random rand_2 = new Random();
        int min = 10;
        int max = 30;

        System.out.println(rand_2.nextInt((max - min) + 1) + min); // 10 이상 30 이하의 랜덤
    }
}
