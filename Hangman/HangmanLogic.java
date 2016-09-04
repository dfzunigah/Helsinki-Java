
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        if(!this.guessedLetters.contains(letter)){
            if(!this.word.contains(letter)){
                this.numberOfFaults++; 
            }
            this.guessedLetters+=letter;
        }         
    }

    public String hiddenWord() {
        String hidden="";
        int base=0;
        while(base<this.word.length()){
            if(guessedLetters.indexOf(this.word.charAt(base))==-1){
                hidden+="_";
            }else{
                hidden+=this.word.charAt(base);
            }
            base++;
        }
        return hidden;
    }
}
