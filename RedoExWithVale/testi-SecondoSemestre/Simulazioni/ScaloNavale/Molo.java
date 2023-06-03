import java.util.ArrayList;
import java.util.List;

public class Molo {
  
    private List<Nave> molo;

    public Molo() {
        molo=new ArrayList<Nave>();
    }
    /**
     * Metodo che si occupa di inserire la nave passata come parametro in cima al nostro molo
     * @param nave
     * @throws IllegalArgumentException
     * @throws NullPointerException
     */
    public void attracca(Nave nave)throws IllegalArgumentException,NullPointerException{
        molo.add(nave);
    }
    /**
     * Metodo che si occupa di rimuovere la nave presente sulla cima del molo
     * @return
     */

    public Nave salpa(){
        Nave n=molo.get(molo.size()-1);
        molo.remove(molo.size()-1);
        return n;

    }
    @Override
    public String toString() {
        return "Molo=" + molo + "]";
    }
    public int getNNavi(){
        return molo.size();
    }
    

        
    
}
