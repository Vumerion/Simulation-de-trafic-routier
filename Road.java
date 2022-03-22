public class Road {
    private static Vehicule[] L_Veh;
    Croisement Cross1;
    Croisement Cross2;
    float speed_limit;

    public static void nextstep(long now) {
        for (Vehicule V : L_Veh){
            V.nexstep(now);
        }
    }

    public Croisement getCross2() {
        return Cross2;
    }

    public Croisement getCross1() {
        return Cross1;
    }

    public float getSpeed_limit() {
        return speed_limit;
    }

    public Vehicule[] getVehicules(){
        return L_Veh;
    }
}
