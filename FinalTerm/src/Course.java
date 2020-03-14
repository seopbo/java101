public class Course {
    public final String courseName;
    public final int credit;
    public final String grade;
    public static final int CREDIT_MAJOR = 3;
    public static final int CREDIT_GENERAL = 2;

    public Course (String courseName, int credit, String grade) {
        this.courseName = courseName;
        this.credit = credit;
        this.grade = grade;

    }
}