package thecopier;

import java.awt.Container;
import javax.swing.*;
import java.awt.Dimension;

public class UserInterface implements Runnable{
    private JFrame frame;
    
    public UserInterface(){
    }
    
    public void run(){
        frame = new JFrame("The Copier");
        frame.setPreferredSize(new Dimension(200,400));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }
    
    private void createComponents(Container container){
        JButton button = new JButton("Send!");
        button.addActionListener(new MessageListener());

        container.add(button);
    }
    
    public JFrame getFrame(){
        return frame;
    }
}
