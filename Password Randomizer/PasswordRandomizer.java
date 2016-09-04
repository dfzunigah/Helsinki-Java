import java.util.Random;

public class PasswordRandomizer {
    private int length;
    private Random random = new Random();

    public PasswordRandomizer(int length) {
        this.length=length;
    }

    public String createPassword() {
        int base=0;
        String password="";
        while(base<this.length){
            char x = (char)random.nextInt(122);
            while(x<97 || x>122){
                x = (char)random.nextInt(122);
            }
            password+=x;
            base++;
        }
        
        return "" + password;
    }
}
