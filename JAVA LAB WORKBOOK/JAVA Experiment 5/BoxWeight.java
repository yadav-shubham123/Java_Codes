public class BoxWeight {
    float width, height, depth;
    float weight;

    // No-arg constructor
    public BoxWeight() {
        width = height = depth = weight = 0;
    }

    // Constructor with arguments
    public BoxWeight(float w, float h, float d, float m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }

    // Copy constructor
    public BoxWeight(BoxWeight bw) {
        this.width = bw.width;
        this.height = bw.height;
        this.depth = bw.depth;
        this.weight = bw.weight;
    }

    // Method to calculate volume
    public float getVolume() {
        return width * height * depth;
    }

    // Display methods
    public void displayVolume() {
        System.out.println("Volume = " + getVolume());
    }

    public void displayWeight() {
        System.out.println("Weight = " + weight);
    }
}