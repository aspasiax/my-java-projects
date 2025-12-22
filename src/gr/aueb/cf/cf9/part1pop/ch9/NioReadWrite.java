package gr.aueb.cf.cf9.part1pop.ch9;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;

/**
 * Demonstrates the Modern Java NIO (New I/O) API.
 * Path & Files: Replacing java.io.File.
 * Files.writeString/readString: Java 11 features for easy text handling.
 * transferTo: Java 9 feature for efficient stream copying.
 * var: Java 10 Local Variable Type Inference.
 */
public class NioReadWrite {

    public static void main(String[] args) {
        Path source = Path.of("src/gr/aueb/cf/cf9/part1pop/ch9/auebLogo.png");
        Path target = Path.of("src/gr/aueb/cf/cf9/part1pop/ch9/auebLogo-copy-nio.png");
        Path textTarget = Path.of("src/gr/aueb/cf/cf9/part1pop/ch9/nio-hello.txt");

        try {
            // 1. Write Text
            textWriter(textTarget);

            // 2. Read Text
            textReader(textTarget);

            // 3. Copy Binary (Image)
            // Ensure source exists before trying to copy
            if (Files.exists(source)) {
                binaryReadWrite(source, target);
                System.out.println("Binary copy completed via NIO.");
            } else {
                System.out.println("Source image not found, skipping binary copy.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Writes a string to a file using Java 11 Files.writeString().
     */
    public static void textWriter(Path path) throws IOException {
        // Ensure the parent directory exists
        if (path.getParent() != null) {
            Files.createDirectories(path.getParent());
        }

        Files.writeString(
                path,
                "Hello Coding Factory from NIO!\n", // Added newline
                StandardCharsets.UTF_8,
                StandardOpenOption.CREATE, // Create if not exists
                StandardOpenOption.APPEND  // Append if exists
        );
        System.out.println("Text written to: " + path);
    }

    /**
     * Reads a whole file into a String using Java 11 Files.readString().
     * Only use for small text files to avoid OutOfMemoryError.
     */
    public static void textReader(Path path) throws IOException {
        String text = Files.readString(path, StandardCharsets.UTF_8);
        System.out.println("Reading File Content: ");
        System.out.println(text);
        System.out.println();
    }

    /**
     * Copies binary data using Input/Output Streams and transferTo().
     */
    public static void binaryReadWrite(Path source, Path target) throws IOException {
        // 'var' (Java 10) infers the type automatically.
        // sourceStream is InputStream, targetStream is OutputStream.
        try (var sourceStream = Files.newInputStream(source);
             var targetStream = Files.newOutputStream(target)) {

            // Java 9 feature: transferTo()
            // Replaces the manual while-loop with buffer!
            // It transfers all bytes from input to output.
            sourceStream.transferTo(targetStream);

        } catch (IOException e) {
            System.err.println("Binary copy failed.");
            throw e;
        }
    }
}