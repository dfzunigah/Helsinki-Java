package thecopier;

import java.awt.Container;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.GridLayout;

public class UserInterface implements Runnable{
    private JFrame frame;
    
    public UserInterface(){
    }
    
    public void run(){
        frame = new JFrame("The Copier");
        frame.setPreferredSize(new Dimension(300,175));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }
    
    private void createComponents(Container container){
        GridLayout layout = new GridLayout(1, 3);
        container.setLayout(layout);

        JTextArea textAreaLeft = new JTextArea("The Copier");
        JTextArea textAreaRight = new JTextArea();
        JButton copyButton = new JButton("Copy!");

        AreaCopier copier = new AreaCopier(textAreaLeft, textAreaRight);
        copyButton.addActionListener(copier);

        container.add(textAreaLeft);
        container.add(copyButton);
        container.add(textAreaRight);
    }
    
    public JFrame getFrame(){
        return frame;
    }
    
}
