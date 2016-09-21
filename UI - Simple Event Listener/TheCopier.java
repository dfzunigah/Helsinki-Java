package thecopier;

import javax.swing.SwingUtilities;

public class TheCopier {

    public static void main(String[] args) {
        UserInterface UI = new UserInterface();
        SwingUtilities.invokeLater(UI);
    }
    
}
