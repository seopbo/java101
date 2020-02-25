public class MultiArray {
    public static void main (String[] args) {
        int[][] multiArray_1 = {{1, 2, 3, 4},
                              {5, 6, 7, 8},
                              {9, 10, 11, 12}};
        int[][] multiArray_2 = new int[3][4];

        for (int i = 0; i < multiArray_1.length; i++) {
            for (int j = 0; j < multiArray_1[i].length; j++) {
                System.out.println(multiArray_1[i][j]);
            }
        }

        for (int i = 0; i < multiArray_2.length; i++){
            for (int j = 0; j < multiArray_2[i].length; j++){
                multiArray_2[i][j] = i * 4 + j + 1;
            }
        }
    }
}