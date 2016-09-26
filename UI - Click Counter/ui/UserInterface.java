package clicker.ui;

import clicker.applicationlogic.Calculator;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class UserInterface implements Runnable {
    private JFrame frame;
    private Calculator calculus;

    public UserInterface(Calculator calculus){
        this.calculus=calculus;
    }
    
    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(2,1);
        container.setLayout(layout);
        JLabel counter = new JLabel(0+"");
        JButton increase = new JButton("Click!");
        ClickListener listen = new ClickListener(calculus, counter);
        increase.addActionListener(listen);
        container.add(counter);
        container.add(increase);
    }

    public JFrame getFrame() {
        return frame;
    }
}
