package multiSet;

//questa interfaccia rappresenta i comportamenti di un multiset di stringhe, 
//cioè un insieme di stringhe in cui gli elementi posssono essere ripetuti,
//in cui non conta l'ordine

interface StringMultiSet extends Iterable<String> {

    //EFFECTS: aggiunge s a questo multiset, restituendo la molteplicità di tale elemento dopo l’inserimento
    int add(String s);

    /**
     * EFFECTS: rimuovere s da questo multiset, restituendo la molteplicità di tale elemento prima della rimozione
     */
    int remove(String s);

    /**
     * EFFECTS: restituire true se e solo se s appartiene a questo multiset
     */
    default boolean contains(String s){
        return multiplicity(s) >0;
    }

    /**
     * restituire la molteplicità di s in questo multiset, se non è contenuto restituisce 0
     */
    int multiplicity(String s);

    /*
     * restituire la cardinalità di questo multiset
     */
    int size();

    /*
     * EFFECTS: restituire UN NUOVO multiset ottenuto come unione di questo multiset 
     * con quello indicato come argomento, solleva un eccezione illegal argument se o è nullo
     */
    StringMultiSet union(StringMultiSet o) throws IllegalArgumentException;

    /*
     * EFFECTS: restituire UN NUOVO multiset ottenuto come intersezione di questo multiset 
     * con quello indicato come argomento, solleva un eccezione illegal argument se o è nullo
     */
    StringMultiSet intersection(StringMultiSet o)throws IllegalArgumentException;
  }