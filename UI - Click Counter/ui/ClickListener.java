package clicker.ui;

import clicker.applicationlogic.Calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

public class ClickListener implements ActionListener{
    private Calculator increased;
    private JLabel counter;
    
    public ClickListener(Calculator increased, JLabel counter){
        this.increased=increased;
        this.counter=counter;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        this.increased.increase();
        this.counter.setText(this.increased.giveValue()+"");
    }
    
}
