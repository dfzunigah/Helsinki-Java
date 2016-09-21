package dictionary;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class MindfulDictionary {
    private HashMap<String, String> engToFin;
    private HashMap<String, String> finToEng;
    private Scanner reader;
    private FileWriter writer;
    private File file;
    
    public MindfulDictionary(){
        this.engToFin = new HashMap<String, String>();
        this.finToEng = new HashMap<String, String>();
    }
    
    public MindfulDictionary(String file) throws FileNotFoundException, IOException{
        this.engToFin = new HashMap<String, String>();
        this.finToEng = new HashMap<String, String>();
        this.file = new File(file);
        try{
            this.reader = new Scanner(this.file);
        }
        catch (FileNotFoundException e){
            System.out.println("file not found");
        }
    }
    
    public boolean load(){
        if(!this.reader.hasNextLine()){
            return false;
        }else{
            while(this.reader.hasNextLine()){
                String line = reader.nextLine();
                String [] parts = line.split(":");
                this.engToFin.put(parts[0], parts[1]);
                this.finToEng.put(parts[1], parts[0]);
            }
            return true;
        }
    }
    
    public boolean save(){
        try{
            this.writer = new FileWriter(this.file);
            for(String a : this.engToFin.keySet()){
                String line = a + ":" + this.engToFin.get(a) + "\n";
                this.writer.write(line);
            }
            this.writer.close();
        }catch (IOException e){
            return false;
        }
        return true;
    }
    
    public void add(String word, String translation){
        if(!this.engToFin.containsKey(word) && !this.finToEng.containsKey(translation)){
            this.engToFin.put(word, translation);
            this.finToEng.put(translation, word);
        }
    }
    
    public String translate(String word){
        if(this.engToFin.containsKey(word)){
            return this.engToFin.get(word);
        }else if(this.finToEng.containsKey(word)){
            return this.finToEng.get(word);
        }else{
            return null;
        }
    }
    
    public void remove(String word){
        if(this.engToFin.containsKey(word)){
            String key = this.engToFin.get(word);
            this.engToFin.remove(word);
            this.finToEng.remove(key);
        }else if(this.finToEng.containsKey(word)){
            String key = this.finToEng.get(word);
            this.finToEng.remove(word);
            this.engToFin.remove(key);
        }
    }
    
}