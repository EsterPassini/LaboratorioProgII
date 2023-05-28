
import java.util.ArrayList;
import java.util.Objects;


//le istanze di questa classe rappresentano dei vettori di booleani, in una implementazione particolarmente adatta a vettori densi
public class BolArrBoolVect extends AbsBoolVect{
    //CAMPI
    ArrayList<Boolean> vect = new ArrayList<Boolean>();

    /*
     * AF: vect rappresenta un vettore di booleani, ogni elemento in posizione i di vect rappresenta l'iesimo elemento del vettore, 
     *      la taglia è ereditata dalla classe astratta 
     * 
     * IR: vect non deve essere null, e non deve contenere null, l'ultimo vero contenuto in vect deve essere in una posizione
     *      minore della taglia
     */
    
     public BolArrBoolVect(int taglia, ArrayList<Boolean> vect) throws IllegalArgumentException, NullPointerException {
        super(taglia);
        Objects.requireNonNull(vect, "il vettore non deve essere nullo");
        
        if (vect.size()>taglia){
            throw new IllegalArgumentException("l'array non deve superare la taglia");
        }
        this.vect = vect;
    }

    @Override
    public int dimensione() {
        int d = 0;
        for (int i=0; i<vect.size(); i++) {
            if (vect.get(i))
                d = 1+i;
        }
        return d;
    }

    @Override
    public boolean leggiPos(int i) throws IndexOutOfBoundsException {
        if (i>taglia())
            throw new IndexOutOfBoundsException("indice maggiore di taglia, non accettato");
        if (i>=dimensione())
            return false;
        return vect.get(i);
    }

    @Override
    public void scriviPos(int i, boolean val) throws IndexOutOfBoundsException {
        if (i>taglia())
            throw new IndexOutOfBoundsException("indice maggiore di taglia, non accettato");
        vect.remove(i);
        vect.add(i, val);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("") ;
        for (int i= 0; i<dimensione(); i++){
            if (leggiPos(i))
                sb.append("T");
            else 
                sb.append("F");
        }
        
        return sb.toString();
    }

    
    
}
