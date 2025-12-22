package gr.aueb.cf.cf9.part1pop.ch9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;
import java.util.UUID;

/**
 * Modern version of File Upload simulation using Java NIO.2.
 * Key Differences from IO:
 * Uses {@link Path} instead of File.
 * Uses {@link Files#copy} utility which abstracts away the loop and buffer mechanism.
 * Simpler, cleaner, and often faster code.
 */
public class CopyAttachedWithMetadataNIO {

    public static void main(String[] args) {
        String fileSystemPath = "./";
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert the input file name:");
        String userInputFile = in.nextLine();

        Path inputFile = Path.of(fileSystemPath, userInputFile);

        // Validation: Check if file exists
        if (!Files.exists(inputFile)) {
            System.err.println("Error: File not found at " + inputFile.toAbsolutePath());
            return;
        }

        // Metadata Extraction
        String extension = "";
        String fileName = inputFile.getFileName().toString();
        int dotIndex = fileName.lastIndexOf('.');

        if (dotIndex > 0 && dotIndex < fileName.length() - 1) {
            extension = fileName.substring(dotIndex);
        }

        // UUID Generation
        String uniqueName = UUID.randomUUID().toString().replace("-", "");
        String outFileName = uniqueName + extension;
        Path outFile = Path.of(fileSystemPath, outFileName);

        try {
            // Ensure parent directories exist (good practice, though ./ usually exists)
            if (outFile.getParent() != null) {
                Files.createDirectories(outFile.getParent());
            }

            // Copy Process
            // StandardCopyOption.REPLACE_EXISTING: If a file with the generated UUID already exists, overwrite it.
            Files.copy(inputFile, outFile, StandardCopyOption.REPLACE_EXISTING);

            System.out.println("\nNIO Copy Successful");
            System.out.println("Input: " + inputFile.toAbsolutePath());
            System.out.println("Output: " + outFile.toAbsolutePath());
            System.out.println("Renamed to: " + outFileName);

        } catch (IOException e) {
            System.err.println("Copy failed: " + e.getMessage());
            e.printStackTrace();
        } finally {
            in.close();
        }
    }
}