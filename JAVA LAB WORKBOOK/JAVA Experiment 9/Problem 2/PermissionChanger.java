import java.io.File;
import java.io.IOException;

public class PermissionChanger {

    public static void main(String[] args) {

        System.out.println("Shubham Yadav, 24CSU309");

        File file = new File("permission_test.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("New file 'permission_test.txt' created.");
            } else {
                System.out.println("File 'permission_test.txt' already exists.");
            }

            System.out.println("Initial state: Can write? " + file.canWrite());

            boolean success = file.setWritable(false);

            if (success) {
                System.out.println("SUCCESS: File permissions changed. Made read-only.");
            } else {
                System.out.println("WARNING: Could not change file permissions.");
                System.out.println("Note: This often fails on Windows or if you don't own the file.");
            }

            System.out.println("New state: Can write? " + file.canWrite());

            if (file.delete()) {
                System.out.println("File was deleted (permissions were not set).");
            } else {
                System.out.println("File could not be deleted (likely due to read-only permission).");

                file.setWritable(true);
                file.delete();
                System.out.println("Permissions reset and file cleaned up.");
            }

        } catch (IOException e) {
            System.err.println("An I/O error occurred: " + e.getMessage());
        }
    }
}
