package Collections.OptionalTask;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

public class FirstTask {
    public FirstTask() {
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Text");
        Stack<String> words = new Stack();
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            words.push(scanner.nextLine());
            words.push("\n");
        }

        String reverseWords = "";
        while (!words.isEmpty()) {
            String i = words.pop();
            reverseWords = reverseWords + i;
        }

        File fileSecond = new File("TextReverse");
        PrintWriter printWriter = new PrintWriter(fileSecond);
        printWriter.println(reverseWords + "\n");
        printWriter.close();
    }
}
