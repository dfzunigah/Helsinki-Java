package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class WordInspection {
    private Scanner reader;
    private ArrayList<String> strings;
    
    public WordInspection(File file) throws FileNotFoundException{
        Scanner reader = null;
        try{
            reader = new Scanner(file, "UTF-8");
        }catch(Exception e){
            System.out.println("we could not find the file");
            return;
        }
        strings = new ArrayList<String>();
        
        while(reader.hasNextLine()){
            String line = reader.nextLine();
            strings.add(line);
        }
    }
 
    
    public int wordCount(){
        return strings.size();
    }
    
    public List<String> wordsContainingZ() throws Exception{
        ArrayList<String> wordsContainingZ = new ArrayList<String>();
        for(String string : strings){
            if(string.contains("z")){
                wordsContainingZ.add(string);
            }
        }
        return wordsContainingZ;
    }
    
    public List<String> wordsEndingInL() throws Exception{
        ArrayList<String> wordsEndingInL= new ArrayList<String>();
        for(String string: strings){
            if(string.charAt(string.length()-1)=='l'){
                wordsEndingInL.add(string);
            }
        }
        return wordsEndingInL;
    }
    
    public List<String> palindromes() throws Exception{
        ArrayList<String> palindromes = new ArrayList<String>();
        for(String string : strings){
            if(string.equals(reverse(string))){
                palindromes.add(string);
            }
        }
        return palindromes;
    }
    
     public static String reverse(String text){
        int base=text.length()-1;
        String reverse="";
        while(base>-1){
            reverse+=text.charAt(base);
            base--;
        }
        return reverse;
    }
    
    public List<String> wordsWhichContainAllVowels() throws Exception{
        ArrayList<String> wordsWhichContainAllVowels = new ArrayList<String>();
        for(String string : strings){
            if(string.contains("a") && string.contains("e") && string.contains("i") && string.contains("o") && string.contains("u") && string.contains("y") && string.contains("ä") && string.contains("ö")){
                wordsWhichContainAllVowels.add(string);
            }
        }
        return wordsWhichContainAllVowels;
    }
}
