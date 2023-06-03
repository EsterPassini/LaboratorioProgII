import java.util.ArrayList;
import java.util.Objects;

/**
 * Permette di rappresentare la tavola periodica
 */
public class TavolaPeriodica {
    public final ArrayList<ElementoChimico> lista = new ArrayList<>();
    /**
     * IR: 
     * lista senza elementi null o ripetuti 
     */
    /**
     * AF:
     * lista rappresenta la lista di elementi 
     */
    public TavolaPeriodica() {
        
    }

     public TavolaPeriodica(ArrayList<ElementoChimico> lista) {
        for (ElementoChimico elemento: lista) {
            Objects.requireNonNull(elemento);
            aggiungiElemento(elemento);
        }
    }
    /**
     * Aggiunge un elemento all tavola periodica
     * @param elemento
     * @throws NullPointerException
     */
    public void aggiungiElemento(ElementoChimico elemento)throws NullPointerException  {
        Objects.requireNonNull(elemento, "Elemento non può essere null");
        //System.out.println(checkIn(elemento)+" "+lista);
        if(!checkIn(elemento)){
            lista.add(elemento);
        }else{
            throw new IllegalArgumentException("elemento duplicato");
        }
    }
    /**
     * controlla se un elemento è contenuto nella tavola periodica
     * @param i
     * @return
     */
    public boolean checkIn(ElementoChimico i) {
        for (ElementoChimico elemento: lista) {
            if(elemento.equals(i)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        //String str;
        return "TavolaPeriodica " + lista;
    }
    /**
     * Elemento che controlla se la string come paramtetro corrisponde  al simbolo di un elemento della tavola periodica.
     * se si ritona quell'elemento altrimenti
     * @param symbol
     * @return
     */
    public ElementoChimico getElbyKey(String symbol){
        for (ElementoChimico elemento: lista) {
            if(elemento.symbol().equals(symbol)){
                return elemento;
            }
        }
        return null;
    }

    
    

 
    

    
}
