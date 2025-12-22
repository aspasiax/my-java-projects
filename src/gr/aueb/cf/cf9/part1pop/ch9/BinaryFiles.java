package gr.aueb.cf.cf9.part1pop.ch9;

import java.io.*;

/**
 * Demonstrates copying Binary Files (e.g., images, videos, audio) using Buffered Streams.
 *FileInputStream/FileOutputStream: Low-level streams for raw bytes.
 * BufferedInputStream/BufferedOutputStream: Wrapper classes that add an internal
 *                                           memory buffer for performance.
 * Byte Array Buffer: We explicitly read chunks of 8KB (8192 bytes) at a time.
 */
public class BinaryFiles {

    public static void main(String[] args) {
        String inputFile = "src/gr/aueb/cf/cf9/part1pop/ch9/auebLogo.png";
        String outputFile = "src/gr/aueb/cf/cf9/part1pop/ch9/auebLogo-copy.png";

        try {
            long start = System.nanoTime();
            binaryFileReadWrite(inputFile, outputFile);
            long end = System.nanoTime();

            System.out.printf("Copy finished in %.4f seconds.\n", (end - start) / 1_000_000_000.0);

        } catch (IOException e) {
            System.err.println("Error: Copy file failed. " + e.getMessage());
        }
    }

    /**
     * Copies a binary file from source to destination using buffering.
     *
     * @param inputFile  the path of the source file
     * @param outputFile the path of the destination file
     * @throws IOException if any I/O error occurs
     */
    public static void binaryFileReadWrite(String inputFile, String outputFile) throws IOException {
        final int BUFFER_SIZE = 8192; // 8KB is a standard efficient size
        byte[] buffer = new byte[BUFFER_SIZE];
        int bytesRead = 0;

        // Try-with-resources creates and automatically closes the streams.
        // We wrap FileInputStream inside BufferedInputStream for maximum efficiency.
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(inputFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(outputFile))) {

            // Loop: Read a chunk of bytes into the buffer
            while ((bytesRead = bis.read(buffer)) != -1) {
                // Write exactly the number of bytes read (bytesRead)
                // This prevents writing garbage data at the end of the file.
                bos.write(buffer, 0, bytesRead);
            }

            System.out.println("Binary File copied successfully: " + outputFile);

        } catch (IOException e) {
            // Log the error and re-throw it to the caller
            System.err.println("Detailed Error: " + e.getMessage());
            throw e;
        }
    }
}