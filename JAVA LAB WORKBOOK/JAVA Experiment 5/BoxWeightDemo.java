public class BoxWeightDemo {
    public static void main(String[] args) {

        System.out.println("SHUBHAM YADAV, 24CSU309");

        // Normal Box
        Box b = new Box(2, 3, 4);
        b.displayVolume();

        // Box with Weight
        BoxWeight bw = new BoxWeight(2, 3, 4, 10);
        bw.displayVolume();
        bw.displayWeight();

        // Copy Object
        BoxWeight bw2 = new BoxWeight(bw);
        bw2.displayVolume();
        bw2.displayWeight();
    }
}
