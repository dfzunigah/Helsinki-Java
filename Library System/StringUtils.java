public class StringUtils {
    public static boolean included(String word, String searched){
        if(word.isEmpty() || searched.isEmpty()){
            return false;
        }
         String word2=word.trim();
         word2=word2.toUpperCase();
         String searched2=searched.trim();
         searched2=searched2.toUpperCase();
         if(word2.contains(searched2)){
             return true;
         }else{
             return false;
         }
    }
}
