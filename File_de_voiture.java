import java.util.ArrayList;
import java.util.List;

public class File_de_voiture {
    private int Queue;
    private List<Véhicule> véhiculeList=new ArrayList<Véhicule>();

    public File_de_voiture(int q){
        int Queue=q;
    }

    public void Enfiler(List<Véhicule> véhiculeList, Véhicule v){
        véhiculeList.add(this.Queue, v);
        this.Queue=this.Queue + 1;
    }

    public void Defiler(List<Véhicule> véhiculeList) throws Exception {
        if (this.Queue==0){
            throw new Exception ("La file est vide, impossible d'enlever des éléments");
        }
        else{
            véhiculeList.remove(0);
            this.Queue=this.Queue - 1;
        }
    }

    public boolean EstVide(){
        return (this.Queue==0);
    }

    public void setQueue(int queue) {
        Queue = queue;
    }

    public void setVéhiculeList(List<Véhicule> véhiculeList) {
        this.véhiculeList = véhiculeList;
    }

    public int getQueue() {
        return Queue;
    }

    public List<Véhicule> getVéhiculeList() {
        return véhiculeList;
    }
}
