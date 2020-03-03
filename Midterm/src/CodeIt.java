import java.util.Scanner;

public class CodeIt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("(I)ntro (C)courses (E)xit");
            String command = scanner.next();
            if (command.equals("e") || command.equals("E")) {
                System.out.println("E");
                System.out.println("안녕히 가세요.");
                break;
            } else if (command.equals("i") || command.equals("I")) {
                System.out.println("I");
                System.out.println("안녕하세요! 우리는 코드잇입니다.");
                System.out.println("함께 공부합시다!");
            } else if (command.equals("c") || command.equals("C")) {
                while (true) {
                    System.out.println("코드잇 수업을 소개합니다.");
                    System.out.println("(P)ython (J)ava (i)Os (B)ack");
                    String subCommand = scanner.next();

                    if (subCommand.equals("p") || subCommand.equals("P")) {
                        System.out.println("Python 언어를 통해 컴퓨터 사이언스의 기초를 배웁니다.");
                        System.out.println("강사: 강영훈");
                        System.out.println("추천 선수과목: 없음");
                    } else if (subCommand.equals("j") || subCommand.equals("J")) {
                        System.out.println("Java의 기본 문법과 객체지향적 프로그래밍을 배웁니다.");
                        System.out.println("강사: 김신의");
                        System.out.println("추천 선수과목: Python");
                    } else if (subCommand.equals("i") || subCommand.equals("I")) {
                        System.out.println("최신 Swift 언어를 통해 iOS 개발을 시작할 수 있습니다.");
                        System.out.println("강사: 성태호");
                        System.out.println("추천 선수과목: Python, Java");
                    } else if (subCommand.equals("b") || subCommand.equals("B")) {
                        break;
                    }
                }
            }
        }
    }
}
