import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SimpleReadWrite {
    public static void main(String[] args) {
        System.out.println("Shubham Yadav, 24CSU309");
        System.out.println("\n1. Simple Write Operation ");
        String filename = "simple_file.txt";
        String content = "This is a simple line of text.\nHello from Java!\n";
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(content);
            System.out.println("SUCCESS: Wrote content to '" + filename + "'");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
            return;
        }

        System.out.println("\n2. Simple Read Operation ");
        try (FileReader reader = new FileReader(filename)) {
            int c;

            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }

        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}
