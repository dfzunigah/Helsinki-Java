package dictionary;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary{
    private Map<String,Set<String>> words;
    
    public PersonalMultipleEntryDictionary(){
        this.words = new HashMap<String, Set<String>>();
    }
    
    public void add(String word, String entry){
        if(!this.words.containsKey(word)){
            this.words.put(word, new HashSet<String>());
        }
        this.words.get(word).add(entry);        
    }
    
    public Set<String> translate(String word){
        if(!words.containsKey(word)){
            return null;
        }
        return words.get(word);
    }
    
    public void remove(String word){
        words.remove(word, words.get(word));
    }
}
