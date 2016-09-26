package clicker.ui;

import clicker.applicationlogic.*;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        Calculator thisone = new PersonalCalculator();
        UserInterface ui = new UserInterface(thisone);
        SwingUtilities.invokeLater(ui);
        
    }
}
