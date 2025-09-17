public class Box {
    float width, height, depth;

    // No-arg constructor
    public Box() {
        width = height = depth = 0;
    }

    // Constructor with arguments
    public Box(float w, float h, float d) {
        width = w;
        height = h;
        depth = d;
    }

    // Copy constructor
    public Box(Box b) {
        this.width = b.width;
        this.height = b.height;
        this.depth = b.depth;
    }

    // Method to calculate volume
    public float getVolume() {
        return width * height * depth;
    }

    // Display method
    public void displayVolume() {
        System.out.println("Volume = " + getVolume());
    }
}