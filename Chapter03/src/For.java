/*
    for (초기화식; 종결제어식; 증감제어식) {
    반복 수행부분
    }
    초기화 뒤에는, 종결제어식 -> 반복 수행부분 -> 증감 제어식 -> 종결 제어식 -> 반복 수행 부분 -> 증감 제어식... 이렇게
 */
public class For {
    public static void main (String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
