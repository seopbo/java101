import java.awt.desktop.SystemEventListener;

public class TypeConversionCasting {
    public static void main(String[] args){
        double x = 3.14;
        int y = (int) x; // type casting

        System.out.println(y);

        int a = 9;
        int b = 5;
        System.out.println((double) a / b);
    }
}
