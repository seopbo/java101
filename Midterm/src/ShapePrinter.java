public class ShapePrinter {
    public void printTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void printPyramid(int height) {
        int totalLength = 2 * height - 1;
        for (int i = 1; i <= height; i++) {
            int numStar = 2 * i - 1;
            int numBlank = (totalLength - numStar) / 2;

            for (int j = 0; j < numBlank; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < numStar; k++) {
                System.out.print("*");
            }
            for (int l = 0; l < numBlank; l++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}



