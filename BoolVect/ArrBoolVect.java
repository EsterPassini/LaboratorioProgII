

import java.util.ArrayList;
import java.util.Objects;

//le istanze di questa classe rappresentano dei vettori di booleani, in una implementazione particolarmente adatta a vettori sparsi
public class ArrBoolVect extends AbsBoolVect{
    //CAMPI
    ArrayList<Integer> vet = new ArrayList<Integer>();


    /*
     * AF: ogni istanza di arrBoolVect rappresenta un vettore di booleani: in vet un vettore di interi, 
     *      sono memorizzate le posizioni partendo da 0 degli indici contenenti true nel vettore reale, la taglia rappresenta la 
     *      massima dimensione che il vettore può raggiungere e può essere infinita, 
     *      la dimensione è 1 più il valore più grande contenuto in vet
     * 
     * IR: vettore non deve essere nullo, non può contenere chiavi nulle o < di 0, elemento maggiore in vet devve essere < di taglia
     *      taglia sempre >=0, 
     */

     public ArrBoolVect(int taglia, ArrayList<Integer> vet) throws IllegalArgumentException {
        super(taglia);
        Objects.requireNonNull(vet, "il vettore non deve essere nullo");

        if (vet.contains(null))
            throw new IllegalArgumentException("il vet non deve contenere null");

        for (Integer el : vet) {
            if (el <0)
                throw new IllegalArgumentException("vet non deve contenere valori < di 0");
        }

        int max = 0;
        for (Integer i : vet) {
            if (i>max)
                max = i;
        };

        if (max>taglia){
            throw new IllegalArgumentException("l'array non deve superare la taglia");
        }
        this.vet = vet;
    }

     @Override
     public int dimensione() {
        int max = 0;
        for (Integer i : vet) {
            if (i>max)
                max = i;
        };
        return max+1;
     }
 

    @Override
     public boolean leggiPos(int i) throws IndexOutOfBoundsException {
        if (taglia()< i)
            throw new IndexOutOfBoundsException("indice > di taglia non avccettabile");
        return vet.contains(i);
     }
 
     @Override
     public void scriviPos(int i, boolean val) throws IndexOutOfBoundsException {
        if (taglia()< i)
        throw new IndexOutOfBoundsException("indice > di taglia non avccettabile");
        if (!val){
            if (vet.contains(i))
                vet.remove((Integer)i);
        } else {
            if (!vet.contains(i))
            vet.add(i);
        }
    
    }

    @Override
    public String toString() {
        return "{true nelle pos=" + vet + " taglia: "+ taglia() + "}";
    }

    
 
}
