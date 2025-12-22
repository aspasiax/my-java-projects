package gr.aueb.cf.cf9.part1pop.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Demonstrates how to read text files using {@link FileReader} and {@link BufferedReader}.
 * FileReader: Reads one character at a time (returns int). Good for simple tasks but slow.
 * BufferedReader: Reads whole lines (returns String). Much faster due to internal buffering.
 */
public class FileReadersJavaIO {

    public static void main(String[] args) {
        // Use a relative path for portability
        String filePath = "src/gr/aueb/cf/cf9/part1pop/ch9/test.txt";
        File testFile = new File("src/gr/aueb/cf/cf9/part1pop/ch9/test.txt");

        try {
            System.out.println("Method 1: Reading Character by Character: ");
            readFileCharByChar(testFile);

            System.out.println("\nMethod 2: Reading Line by Line:");
            readFileLineByLine(testFile);

        } catch (IOException e) {
            System.err.println("File Error: " + e.getMessage());
        }
    }

    /**
     * Reads a file using FileReader (Low-level).
     * Reads character by character.
     * End of File (EOF) is indicated by -1.
     */
    public static void readFileCharByChar(File file) throws IOException {
        try (FileReader fr = new FileReader(file, StandardCharsets.UTF_8)) {
            int charCode;

            // While we haven't reached the End Of File (-1)
            while ((charCode = fr.read()) != -1) {
                // Cast the int back to char to print it
                System.out.print((char) charCode);
            }
        }
    }

    /**
     * Reads a file using BufferedReader (High-level).
     * Reads line by line. Efficient and easier to work with text.
     * End of File (EOF) is indicated by null.
     */
    public static void readFileLineByLine(File file) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(file, StandardCharsets.UTF_8))) {
            String line;

            // While the line read is not null (there is still content)
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    // Helper method to ensure we have a file to read
    public static void createFile(File file) {
        try (PrintWriter pw = new PrintWriter(file, StandardCharsets.UTF_8)) {
            pw.println("Hello World!");
            pw.println("This is line 2.");
            pw.println("Java I/O is powerful.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}