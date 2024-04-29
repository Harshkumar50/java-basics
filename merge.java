package q28247;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileMerger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first file name:");
        String file1Name = scanner.nextLine().trim();

        System.out.println("Enter the second file name:");
        String file2Name = scanner.nextLine().trim();

        mergeFiles(file1Name, file2Name);

        scanner.close();
    }

    public static void mergeFiles(String file1Name, String file2Name) {
        try {
            BufferedReader reader1 = new BufferedReader(new FileReader(file1Name));
            BufferedReader reader2 = new BufferedReader(new FileReader(file2Name));

            String mergedFileName = "mergedFile.txt";
            BufferedWriter writer = new BufferedWriter(new FileWriter(mergedFileName));

            String line;

            // Read and write contents of file1
            while ((line = reader1.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            // Add a separator between file contents
            writer.write("\n");

            // Read and write contents of file2
            while ((line = reader2.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("Merged file content:");

            // Close all resources
            reader1.close();
            reader2.close();
            writer.close();

            // Print merged file content
            BufferedReader mergedReader = new BufferedReader(new FileReader(mergedFileName));
            while ((line = mergedReader.readLine()) != null) {
                System.out.println(line);
            }
            mergedReader.close();

        } catch (IOException e) {
            System.out.println("File does not exist");
        }
    }
}
