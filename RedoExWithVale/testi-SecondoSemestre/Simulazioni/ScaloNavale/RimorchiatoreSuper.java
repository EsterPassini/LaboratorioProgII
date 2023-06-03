import java.util.ArrayList;
import java.util.Objects;

public class RimorchiatoreSuper implements Rimorchiatore {
    private int capienza;
    /**
     * IR: capienza>0
     * AF: capienza massima che è in grado di trasportare
     */
    

    public RimorchiatoreSuper(int capienza) {
        this.capienza = capienza;
    }


    @Override
    public void sposta(Molo partenza, Molo arrivo, int quantità) {
        Objects.requireNonNull(partenza, "Il primo molo non può essere null.");
        Objects.requireNonNull(arrivo, "Il secondo molo non può essere null.");
        if (quantità <= 0) throw new IllegalArgumentException("Non puoi spostare meno di 0 navi.");
        if (quantità < partenza.getNNavi()) throw new IllegalArgumentException("Non ci sono abbastanza navi da rimuovere.");
        ArrayList<Nave> navi = new ArrayList<Nave>();
        
    }
   
    
}
