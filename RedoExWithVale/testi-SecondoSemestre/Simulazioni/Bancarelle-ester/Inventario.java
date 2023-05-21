//questa classe implementa un inventario, una struttura capace di tenere informazioni
//su quali e quanti giocattoli sono presenti in un certo momento di tempo

import java.util.HashSet;
import java.util.Map;
//import java.util.Objects;
import java.util.Set;

public class Inventario {
    //campi
    Map<Giocattolo, Integer> magaz;

    /*AF: magaz != null, ogni giocattolo in magaz deve essere diverso da null e associato ad un intero >=0
    IR: magaz rappresenta in un dato momento i giocattoli presenti in una bancarella con la relativa frequenza
    */
    
    /**
     * 
     * @param magaz
     * @throws IllegalArgumentException se un giocattolo nella mappa è null o se un intero è <0
     */
    public Inventario(Map<Giocattolo, Integer> magaz) throws IllegalArgumentException{
        for (var entry : magaz.entrySet()) {
            if(entry.getKey() ==null || entry.getValue()<0)
            throw new IllegalArgumentException("non possono esserci giocattoli nulli o quantità <0");
        }
        this.magaz = magaz;
    }
    /**
     * effects: restituisce true se e solo se l'inventario contiena almeno 1 giocattolo di tipo g
     */
    public boolean isContenuto(Giocattolo g){
        if (g ==null)
            throw new IllegalArgumentException("impossibile trovare un giocattolo nullo");
        if (!magaz.containsKey(g)|| magaz.get(g)<=0)
            return false;
        return true;
    }

    /**
     * effects: restituisce il numero di giocattoli uguali a g presenti nel listino
     * solleva un eccezione se g è nullo
     */
    public Integer getQuantita(Giocattolo g){
        if (g ==null)
            throw new IllegalArgumentException("impossibile trovare un giocattolo nullo");
        if (!magaz.containsKey(g))
            return 0;
        return magaz.get(g);
    }

    //effects: questo metodo rimuove n giocattoli di tipo g dall'inventario, solleva un eccezione se g è nullo, n è minore di 0
    //o se la quantità che voglio togliere non è presente in inventario
    public void rimuovi(Giocattolo g, Integer n){
        if (g ==null)
            throw new IllegalArgumentException("impossibile rimuovere un giocattolo nullo");
        if (n <0)
            throw new IllegalArgumentException("quantità da rimuovere deve essere positiva");
        if (getQuantita(g)<n)
            throw new IllegalArgumentException("quantità da rimuovere deve essere minore dei giocattoli di quel tipo nel listino");
        
        magaz.put(g, getQuantita(g)-n);
    }

    //effects: questo metodo aggiunge n giocattoli di tipo g dall'inventario, anche se non presenti prima
    // solleva un eccezione se g è nullo, n è minore di 0
    public void aggiungi(Giocattolo g, Integer n){
        //Objects.requireNonNull(g);
        if (g ==null)
            throw new IllegalArgumentException("impossibile rimuovere un giocattolo nullo");
        if (n <0)
            throw new IllegalArgumentException("quantità da rimuovere deve essere positiva");
        
        magaz.put(g, getQuantita(g)+n);
    }

    //effect: restituisce una lista contenente tutti i giocattoli in inventario
    public Set<Giocattolo> getListaGiocattoli(){
        return magaz.keySet();
    }

    @Override
    public String toString() {
        return "Inventario [magaz=" + magaz + "]";
    }

    

    
}
