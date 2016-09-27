package main;

import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        UserInterface ui = new UserInterface(new Avatar(30, 30));
        SwingUtilities.invokeLater(ui);
    }
    
}
