import java.io.File;
import java.util.Scanner;

public class FileChecker {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Shubham Yadav, 24CSU309");

            System.out.println("Enter a file or directory path:");
            String path = scanner.nextLine();

            File file = new File(path);

            if (file.exists()) {
                System.out.println("SUCCESS: The path '" + path + "' exists.");

                if (file.isFile()) {
                    System.out.println("It is a FILE.");
                    System.out.println("File size: " + file.length() + " bytes");
                } else if (file.isDirectory()) {
                    System.out.println("It is a DIRECTORY.");

                    String[] contents = file.list();
                    if (contents != null && contents.length > 0) {
                        System.out.println("Contains: " + contents.length + " items.");
                        for (int i = 0; i < contents.length && i < 5; i++) {
                            System.out.println("  - " + contents[i]);
                        }
                        if (contents.length > 5) {
                            System.out.println("  ...and " + (contents.length - 5) + " more.");
                        }
                    } else {
                        System.out.println("The directory is empty.");
                    }
                }
            } else {
                System.out.println("ERROR: The path '" + path + "' does not exist.");
            }

        }
    }
}
