public class A extends Marks {
    private int subject1, subject2, subject3;

    public A(int s1, int s2, int s3) {
        this.subject1 = s1;
        this.subject2 = s2;
        this.subject3 = s3;
    }

    @Override
    public double getPercentage() {
        double total = subject1 + subject2 + subject3;
        return (total / 300.0) * 100;
    }
}