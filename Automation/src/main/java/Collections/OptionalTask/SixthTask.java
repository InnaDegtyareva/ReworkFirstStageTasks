package Collections.OptionalTask;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SixthTask {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> words = new ArrayList<>();
        File file = new File("Text");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            words.add(scanner.nextLine());
        }
        System.out.println(words);
        Collections.sort(words);
        System.out.println(words);
    }
}

