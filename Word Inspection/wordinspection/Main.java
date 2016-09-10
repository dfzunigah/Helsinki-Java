package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, Exception {

        File file = new File("src/shortList.txt");
        WordInspection list = new WordInspection(file);
        System.out.println(list.wordCount());
        System.out.println(list.wordsContainingZ().size());
        System.out.println(list.wordsEndingInL().size());
        System.out.println(list.palindromes().size());
        System.out.println(list.wordsWhichContainAllVowels().size());
    }
}
