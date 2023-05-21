//questa classe astratta implementa l'interfaccia listino

import java.util.Map;
import java.util.Objects;

public abstract class ListinoAbs implements Listino{
    //campi
    Map<Giocattolo, Integer> prezzi;

    /*
     * AF: prezzi!= null, per ogni coppia giocatttolo intero, giocattolo non può essere nullo e l'intero deve
     * essere >0
     * IR: listino associa ad ogni giocattolo (chiave di prezzi), il costo a lui associato nella mappa
     */

    //solleva eccezione se un giocattolo è nullo o se un prezzo è <=0
    public ListinoAbs(Map<Giocattolo, Integer> prezzi) {
        Objects.requireNonNull(prezzi);
        for (var entry : prezzi.entrySet()) {
            if(entry.getKey() ==null || entry.getValue()<=0)
            throw new IllegalArgumentException("non possono esserci giocattoli nulli o prezzi<=0");
        }
        this.prezzi = prezzi;
    }

    @Override
    public abstract int getPrezzo(Giocattolo g, int n);

    @Override
    public boolean isConosciuto(Giocattolo g) {
        Objects.requireNonNull(g);
        return prezzi.containsKey(g);
    }
    
    //effects: restituisce il prezzo unitario del giocattolo g, solleva un eccezione se g è nullo o se g 
    //non è presente nel listino
    public int getPrezzoUnitario(Giocattolo g){
        if (!isConosciuto(g))
            throw new IllegalArgumentException("giocattolo non contenuto in listino");
        return prezzi.get(g);
    }

    @Override
    public String toString(){
        return "questo listino applica una politica lineare-moltiplicativa";
    }
}
