import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StudentReadWrite {

    public static void main(String[] args) {

        String filename = "student_data.txt";

        System.out.println("Shubham Yadav, 24CSU309");

        System.out.println("Writing student data to '" + filename + "'...");
        try (FileWriter fw = new FileWriter(filename);
                BufferedWriter writer = new BufferedWriter(fw)) {

            writer.write("1,Amit,9.2,A");
            writer.newLine();

            writer.write("2,Sunita,8.5,B");
            writer.newLine();

            writer.write("3,Rohan,9.8,A");
            writer.newLine();

            System.out.println("Data written successfully.");

        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
            return;
        }

        System.out.println("\n2. Read Data using BufferedReader ");
        try (FileReader fr = new FileReader(filename);
                BufferedReader reader = new BufferedReader(fr)) {

            String line;
            System.out.println("S.No | Name   | CGPA | Grade");
            System.out.println("----------------------------");

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");

                if (parts.length == 4) {
                    try {
                        int serialNo = Integer.parseInt(parts[0]);
                        String firstName = parts[1];
                        float cgpa = Float.parseFloat(parts[2]);
                        char grade = parts[3].charAt(0);

                        System.out.printf("%-4d | %-6s | %-4.1f | %-1c\n",
                                serialNo, firstName, cgpa, grade);

                    } catch (NumberFormatException e) {
                        System.err.println("Skipping malformed line: " + line);
                    }
                }
            }

        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}
