package movingfigure;

import java.awt.Graphics;

public class Round extends Figure{
    private int diameter;
    
    public Round(int x, int y, int diameter) {
        super(x, y);
        this.diameter=diameter;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.fillOval(getX(), getY(), diameter, diameter);
    }
    
}
