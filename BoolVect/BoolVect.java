package BoolVect;

import java.util.Objects;

//questa interfaccia rappresenta i comportamenti di un vetore di booleani

public interface BoolVect {
    //EFFECTS: restituisce un intero che rappresenta la taglia(massima dimensione che il vet può raggiungere e può essere infinita)
    int taglia();

    //EFFECTS: restituisce un intero che rappresenta la dimensione(1 più la posizione più grande in cui si trova un valore di verità)
    int dimensione();

    //EFFECTS: restituisce il valore di verità in posizione i, solleva un eccezione se taglia< i
    boolean leggiPos(int i) throws IndexOutOfBoundsException;

    //EFFECTS: modifica la i-esima pos del vettore, inserendoci val, solleva un eccezione se taglia< i 
    void scriviPos(int i, boolean val) throws IndexOutOfBoundsException;

    //EFFECTS: modifica il vettore su cui è chiamato rimpiazzandolo con l' and logico posizione per posizione tra this e b, 
    //          solleva un eccezione se b è nullo, o la dimensione di b è > della taglia di this
    void and(BoolVect b) throws NullPointerException, IllegalArgumentException;

    //EFFECTS: modifica il vettore su cui è chiamato rimpiazzandolo con l' or logico posizione per posizione tra this e b, 
    //          solleva un eccezione se b è nullo, o la dimensione di b è > della taglia di this
    void or(BoolVect b) throws NullPointerException, IllegalArgumentException;

    //EFFECTS: modifica il vettore su cui è chiamato rimpiazzandolo con lo xor logico posizione per posizione tra this e b,  
    //          solleva un eccezione se b è nullo, o la dimensione di b è > della taglia di this
    void xor(BoolVect b) throws NullPointerException, IllegalArgumentException;

    //EFFECTS: restituisce in un valore booleano che indica se this è compatibile alle operazioni con b, 
    //          cioè la sua taglia non è minore della dimensione di b
    default boolean compatibile(BoolVect b) throws NullPointerException{
        Objects.requireNonNull(b, "il vettore non deve essere null");
        return (taglia()>=b.dimensione());
    }
}
