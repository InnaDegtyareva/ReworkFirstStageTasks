package Collections.OptionalTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ForthTask {
// Сортировка по возрастанию длины строк
    public static void main(String[] args) {
        String firstString = "Буря мглою небо кроет";
        String secondString = "Вихри снежные крутя";
        String thirdString = "То, как зверь, она завоет";
        String fourthString = "То заплачет, как дитя.";
        ArrayList<String> poem = new ArrayList(Arrays.asList(firstString, secondString, thirdString, fourthString));
        System.out.println(poem);
        Collections.swap(poem, poem.indexOf(secondString), poem.indexOf(firstString));
        Collections.swap(poem, poem.indexOf(fourthString), poem.indexOf(thirdString));
        System.out.println(poem);
    }
}

