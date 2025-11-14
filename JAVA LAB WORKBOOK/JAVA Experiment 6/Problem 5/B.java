public class B extends Marks {
    private int subject1, subject2, subject3, subject4;

    public B(int s1, int s2, int s3, int s4) {
        this.subject1 = s1;
        this.subject2 = s2;
        this.subject3 = s3;
        this.subject4 = s4;
    }

    @Override
    public double getPercentage() {
        double total = subject1 + subject2 + subject3 + subject4;
        return (total / 400.0) * 100;
    }
}
