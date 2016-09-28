package movingfigure;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingBoard extends JPanel {
    
    private Figure figure;
    
    public DrawingBoard(Figure f) {
        super.setBackground(Color.WHITE);
        this.figure = f;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        figure.draw(g);
    }
    
}