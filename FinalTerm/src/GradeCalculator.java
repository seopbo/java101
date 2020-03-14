import java.util.ArrayList;

public class GradeCalculator {
    public final String name;
    public final double previousAverageOfScores;
    public final int previousSumOfCredits;
    private ArrayList<Course> currentCourses = new ArrayList<>();

    public GradeCalculator (String name, double previousAverageOfScores, int previousSumOfCredits) {
        this.name = name;
        this.previousAverageOfScores = previousAverageOfScores;
        this.previousSumOfCredits = previousSumOfCredits;
    }

    public void addCourse (Course course) {
        this.currentCourses.add(course);
    }

    private double calculateCurrentAverageOfScores() {
        return this.calculateCurrentSumOfScores() / this.calculateCurrentSumOfCredits();
    }

    private double calculateCurrentSumOfScores() {
        double CurrentSumOfScores = 0;

        for (Course course: this.currentCourses) {
            CurrentSumOfScores += convertGradeToScore(course.grade) * course.credit;
        }
        return CurrentSumOfScores;
    }

    private int calculateCurrentSumOfCredits() {
        int CurrentSumOfCredits = 0;
        for (Course course: this.currentCourses) {
            CurrentSumOfCredits += course.credit;
        }
        return CurrentSumOfCredits;

    }

    private double calculateAverageOfScores () {
        return this.calculateSumOfScores() / this.calculateSumOfCredits();
    }

    private double calculateSumOfScores () {
        double currentSumOfScores = this.calculateCurrentSumOfScores();
        return this.previousSumOfCredits * this.previousAverageOfScores + currentSumOfScores;
    }

    private int calculateSumOfCredits () {
        int currentSumOfCredits = this.calculateCurrentSumOfCredits();
        return this.previousSumOfCredits + currentSumOfCredits;
    }

    private double convertGradeToScore (String grade) {
        double score;
        switch (grade) {
            case "A+":
                score = 4.5;
                break;
            case "A":
                score = 4.0;
                break;
            case "B+":
                score = 3.5;
                break;
            case "B":
                score = 3.0;
                break;
            case "C+":
                score = 2.5;
                break;
            case "C":
                score = 2.0;
                break;
            case "D+":
                score = 1.5;
                break;
            case "D":
                score = 1.0;
                break;
            default:
                score = 0.0;
                break;
        }
        return score;
    }

    public void print () {
        System.out.printf("직전 학기 성적: %.1f (총 %d학점)\n", this.previousAverageOfScores, this.previousSumOfCredits);
        System.out.printf("이번 학기 성적: %.10f (총 %d학점)\n", this.calculateCurrentAverageOfScores(),
                            this.calculateCurrentSumOfCredits());
        System.out.printf("전체 예상 학점: %.10f (총 %d학점)\n", this.calculateAverageOfScores(),
                            this.calculateSumOfCredits());
    }
}