public class IfElse {
    public static void main(String[] args){
        int temp = 30;

        if (temp <= 5) {
            System.out.println("내복과 긴팔과 자켓을 입으세요");
        } else if (temp <= 10) {
            System.out.println("긴팔과 자켓을 입으세요");
        } else if (temp <= 15) {
            System.out.println("긴팔을 입으세요");
        } else {
            System.out.println("반팔을 입으세요");
        }
    }
}