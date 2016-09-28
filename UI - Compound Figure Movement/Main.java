package movingfigure;

import javafx.scene.shape.Circle;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        CompoundFigure truck = new CompoundFigure();
        truck.add(new Box(220, 110, 75, 100));
        truck.add(new Box(80, 120, 200, 100));
        truck.add(new Round(100,200,50));
        truck.add(new Round(220,200,50));
        UserInterface ui = new UserInterface(truck);
        SwingUtilities.invokeLater(ui);
    }
}
