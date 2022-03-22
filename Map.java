import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

import java.util.List;
import java.util.Random;

public class Map {
    List<Croisement> Intersections;
    List<Road> Lignes;
    List<Vehicule> Effectifs;
    Gestionnaire Genesis;
    Group root;
    Scene thescene;
    Pane pane;

    public Map(Pane pane, Group root, Scene theScene) {
        this.pane = pane;
        this.root = root;
        this.thescene = theScene;
    }


    public List<Road> getLignes() {
        return Lignes;
    }

    public List<Croisement> getIntersections() {
        return Intersections;
    }

    public List<Vehicule> getEffectifs() {
        return Effectifs;
    }

    public void add_Croisement(Croisement CROSS){
        this.Intersections.add(CROSS);
    }

    public void add_Vehicule(Vehicule VEH){
        this.Effectifs.add(VEH);
    }

    public void add_Road(Road ROAD){
        this.Lignes.add(ROAD);
    }

    public void nextstep(long now) {
        for (Road r : Lignes){
            Road.nextstep(now);
        }
        //Rajouter éventuellement des voitures.
        double dice = Math.random();
        if (dice<0.01) {
            Vehicule New_V = this.Genesis.Arithmos();
            this.add_Vehicule(New_V);
            pane.getChildren().addAll(New_V.getVisual());
        }
    }
}
