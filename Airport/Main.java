import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Airport PPN = new Airport(reader);
        PPN.start();
    }
}
