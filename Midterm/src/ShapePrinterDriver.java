public class ShapePrinterDriver {
    public static void main(String[] args) {
        ShapePrinter printer = new ShapePrinter();

        // 테스트 (printTriangle method)
        printer.printTriangle(3);
        System.out.println("----------");
        printer.printTriangle(5);
        System.out.println("----------");
        printer.printTriangle(10);

        // 테스트 (printPyramid method)
        printer.printPyramid(3);
        System.out.println("----------");
        printer.printPyramid(5);
        System.out.println("----------");
        printer.printPyramid(10);

        // 테스트 (printFloydsPyramid)
        printer.printFloydsPyramid(3);
        System.out.println("----------");
        printer.printFloydsPyramid(5);
        System.out.println("----------");
        printer.printFloydsPyramid(15);
    }
}