import javafx.scene.Scene;
import javafx.scene.paint.Color;

import java.util.List;

public class Gestionnaire {
    List<Integer> POS_IN_x;
    List<Integer> POS_IN_y;
    List<Integer> POS_OUT_x;
    List<Integer> POS_OUT_y;
    Scene thescene;

    public List<Integer> getPOS_IN_x() {
        return POS_IN_x;
    }

    public List<Integer> getPOS_IN_y() {
        return POS_IN_y;
    }

    public List<Integer> getPOS_OUT_x() {
        return POS_OUT_x;
    }

    public List<Integer> getPOS_OUT_y() {
        return POS_OUT_y;
    }

    public Scene getThescene() {
        return thescene;
    }

    public Vehicule Arithmos() {
        int R = (int) ((Math.random() * (this.POS_IN_x.size() - 0)) + 0);
        Vehicule V = new Vehicule();

        return V;
    }
}
