public class ExScore {
    public static void main(String[] args) {
        int koreanScore = 86;
        int mathScore = 94;
        int scienceScore = 87;
        int computerScore = 100;

        double average = (koreanScore + mathScore + scienceScore + computerScore) / (double) 4;
        System.out.println(average);
    }
}