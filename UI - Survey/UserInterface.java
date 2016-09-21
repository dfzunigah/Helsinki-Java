package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Survey");
        frame.setPreferredSize(new Dimension(200,300));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }
    
    private void createComponents(Container container){
        container.setLayout(new BoxLayout(container,BoxLayout.Y_AXIS));
        JRadioButton no = new JRadioButton("No reason.");
        JRadioButton fun = new JRadioButton("Because it is fun!");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(no);
        buttonGroup.add(fun);
        container.add( new JLabel ("Are you?"));
        container.add(new JCheckBox("Yes!"));
        container.add(new JCheckBox("No!"));
        container.add( new JLabel ("Why?"));
        container.add(no);
        container.add(fun);
        container.add(new JButton("Done!"));
    }

    public JFrame getFrame() {
        return frame;
    }
    
}
