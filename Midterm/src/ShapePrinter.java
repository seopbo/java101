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

    public void printFloydsPyramid(int height) {
        int maxInteger = height * (height + 1) / 2;
        int digits = Integer.toString(maxInteger).length();

        int i = 1;
        for (int j = 1; j <= height; j++){
            int maxIntegerOfRow = j * (j + 1) / 2;
            while (i <= maxIntegerOfRow){
                int numBlank = digits - Integer.toString(i).length();
                String blank = "";
                for (int k = 0; k < numBlank; k++){
                    blank = blank + " ";
                }
                System.out.printf(blank + "%d ", i);
                i++;
            }
            System.out.println();
        }
    }
}



