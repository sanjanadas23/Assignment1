package FileCreation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class fileHandlingAssignment {
	public static void main(String[] args) {
		String filePath = "C:\\Users\\sanjana.das\\Desktop\\aurionproproj\\Java program\\sanjana.txt"; 

        File file = new File("C:\\Users\\sanjana.das\\Desktop\\aurionproproj\\Java program\\sanjana.txt");

        // Check if the file exists
        if (!file.exists() || !file.isFile()) {
            System.out.println("File does not exist or is not a valid file.");
            return;
        }

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try (FileInputStream fis = new FileInputStream(file)) {
            int byteRead;
            boolean inWord = false; // To track if we are inside a word

            while ((byteRead = fis.read()) != -1) {
                char ch = (char) byteRead;
                charCount++; // Count characters

                // Count lines
                if (ch == '\n') {
                    lineCount++;
                }

                // Count words
                if (Character.isWhitespace(ch)) {
                    inWord = false;
                } else if (!inWord) {
                    wordCount++;
                    inWord = true;
                }
            }

            
            if (charCount > 0 && fis.available() == 0) {// when the last line doesn't end with a newline, we count it
                lineCount++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Output the results
        System.out.println(" Total number of Lines: " + lineCount);
        System.out.println("Total number of Words: " + wordCount);
        System.out.println("Total number of Characters: " + charCount);
    }

}
