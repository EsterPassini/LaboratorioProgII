

import java.util.Objects;

//EFFICIENZA BLEEEE :(

//DESCRIZIONE: questa classe astratta che implementa l'interfaccia BoolVect, rappresenta un vettore di booleani 
public abstract class AbsBoolVect implements BoolVect{
    //CAMPI
    private final int taglia;

    /*
     * AF: le istanze di questa classe rappresentano dei vettori di booleani di taglia = a taglia
     * IR: taglia >=0
     */

    public AbsBoolVect(int taglia) throws IllegalArgumentException{
        if (taglia<0)
            throw new IllegalArgumentException("taglia deve essere non <0");
        this.taglia = taglia;
    }

    @Override
    public int taglia() {
        return taglia;
    }

    //EFFECTS: modifica il vettore su cui è chiamato rimpiazzandolo con l' and logico posizione per posizione tra this e b, 
    //          solleva un eccezione se b è nullo, o la dimensione di b è > della taglia di this
    @Override
    public void and(BoolVect b) throws NullPointerException, IllegalArgumentException{
        Objects.requireNonNull(b);
        if (!compatibile(b)) 
            throw new IllegalArgumentException("vettori non compatibili per un operazione");
        
        if (b.dimensione()<dimensione()){
            for (int i=0; i<b.dimensione(); i++ ){
                    scriviPos(i, (leggiPos(i) && b.leggiPos(i)));
            }

        } else {

            for (int i=0; i<dimensione(); i++ ){
                scriviPos(i, (leggiPos(i) && b.leggiPos(i)));
            }
            for (int i=dimensione(); i<b.dimensione(); i++ ){
                scriviPos(i, b.leggiPos(i));   
            }
        }
    }

    //EFFECTS: modifica il vettore su cui è chiamato rimpiazzandolo con l' or logico posizione per posizione tra this e b, 
    //          solleva un eccezione se b è nullo, o la dimensione di b è > della taglia di this
    @Override
    public void or(BoolVect b) throws NullPointerException, IllegalArgumentException{
        Objects.requireNonNull(b);
        if (!compatibile(b)) 
            throw new IllegalArgumentException("vettori non compatibili per un operazione");
        
        if (b.dimensione()<dimensione()){

            for (int i=0; i<b.dimensione(); i++ ){
                    scriviPos(i, (leggiPos(i) || b.leggiPos(i)));
            }

        } else {

            for (int i=0; i<dimensione(); i++ ){
                scriviPos(i, (leggiPos(i) || b.leggiPos(i)));
            }
            for (int i=dimensione(); i<b.dimensione(); i++ ){
                scriviPos(i, b.leggiPos(i));   
            }
        }
    }

    //EFFECTS: modifica il vettore su cui è chiamato rimpiazzandolo con lo xor logico posizione per posizione tra this e b, 
    //          solleva un eccezione se b è nullo, o la dimensione di b è > della taglia di this
    @Override
    public void xor(BoolVect b) throws NullPointerException, IllegalArgumentException{
        Objects.requireNonNull(b);
        if (!compatibile(b)) 
            throw new IllegalArgumentException("vettori non compatibili per un operazione");
        
        if (b.dimensione()<dimensione()){

            for (int i=0; i<b.dimensione(); i++ ){
                scriviPos(i, ((leggiPos(i) && !b.leggiPos(i)) || (!leggiPos(i) && b.leggiPos(i))));
            }

        } else {

            for (int i=0; i<dimensione(); i++ ){
                scriviPos(i, ((leggiPos(i) && !b.leggiPos(i)) || (!leggiPos(i) && b.leggiPos(i))));
            }
            for (int i=dimensione(); i<b.dimensione(); i++ ){
                scriviPos(i, b.leggiPos(i));   
            }
        }
    }

    
}
