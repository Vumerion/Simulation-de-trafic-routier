import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.List;

import static java.lang.Math.cos;

public class Vehicule {
    Road route;
    Croisement origin_cross;
    Croisement destination_cross;
    Road next_road;
    Road last_road;
    Vehicule leader;
    List<Vehicule> followers;
    Color leadership_color;
    int pos_x;
    int pos_y;

    int v_x;
    int v_y;

    int T;
    int s0;
    int delta;
    int b;

    boolean decision;
    int angle;

    int accelerate;
    int v_max=120;
    int width=2;

    ImageView Visual=new ImageView("voiture_éclatée.png");

    public Croisement getDestination_cross() {
        return destination_cross;
    }

    public ImageView getVisual() {
        return Visual;
    }

    public Vehicule getLeader() {
        return leader;
    }

    public Croisement getOrigin_cross() {
        return origin_cross;
    }

    public Road getRoute() {
        return route;
    }

    public Road getLast_road() {
        return last_road;
    }

    public Road getNext_road() {
        return next_road;
    }

    public List<Vehicule> getFollowers() {
        return followers;
    }

    public Color getLeadership_color() {
        return leadership_color;
    }

    public int getS0() {
        return s0;
    }

    public boolean isDecision() {
        return decision;
    }

    public int getAccelerate() {
        return accelerate;
    }

    public int getDelta() {
        return delta;
    }

    public int getB() {
        return b;
    }

    public int getT() {
        return T;
    }

    public int getV_y() {
        return v_y;
    }

    public int getPos_x() {
        return pos_x;
    }

    public int getPos_y() {
        return pos_y;
    }

    public int getV_x() {
        return v_x;
    }

    public int getAngle() {
        return angle;
    }

    public int getV_max() {
        return v_max;
    }

    public int getWidth() {
        return width;
    }

    public void Accelerate(int i) {
        this.v_x= (int) (cos(this.angle) *i);
        this.v_y= (int) (cos(this.angle+90)*i);
    }

    public void Rotate(int i) {
        this.angle=this.angle+i;
        this.angle=this.angle%360;
        }

    public boolean IsArrived() {
        if (this.getPos_x() - this.getDestination_cross().getPos_x() < 0.5 & this.getPos_y() - this.getDestination_cross().getPos_y() < 0.5) {
            return true;
        }
        else {
                return false;
        }
    }

        public void Move(){
            //int old_x=getPos_x();
            //int old_y=getPos_y();
            //Au cas où... pour implémenter une vérif d'app. à la route.
            this.pos_x=this.pos_x+this.v_x;
            this.pos_y=this.pos_y+this.v_y;
        }

    public void nexstep(long now) {
        //DAP : déclaration d'accord préhalable.
        boolean DAP = this.Verify();
        if (DAP=true) {
            this.Vroomvroom();
            this.Visual_Update();
        }
    }

    private void Visual_Update(){
        this.Visual.setX(this.getPos_x());
        this.Visual.setY(this.getPos_y());
    }

    private void Vroomvroom() {
        this.Move();
        this.Accelerate(1);
        this.Rotate(30);
    }

    private boolean Verify() {
        boolean B = true;
        return B;
    }
}
