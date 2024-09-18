import java.io.File;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) {
        int filmReleaseYear = 2022;
        boolean includedInThePlan = true;
        double filmPublicScore = (8.1 + 9.3 + 6.6) / 3;
        try {
            File file = new File("C:\\MyProjects\\readme.txt");
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
            scan.close();
        } catch (java.io.FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
