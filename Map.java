import java.util.Collection;

public class Map {

    private Collection Components; //Liste des objets CROISEMENTS qui composent la Map.
    public Map(){
    }

    public Collection Get_Components(){
        return this.Components;
    }

    public void Add_Croisement(CROISEMENTS Croisement){
        this.Components.add(Croisement);
    }
}