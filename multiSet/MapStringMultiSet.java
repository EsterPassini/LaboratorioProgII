package multiSet;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

//questa classe implementa un multiset di stringhe tramite una mappa
public class MapStringMultiSet extends AbsStringMultiSet{

    /*
     * AF: multiset rappresenta un multiinsieme di stringhe ogni chiave è 
     *      un elemento, il valore è la molteplicità
     * 
     * IR: multiset non deve essere nulla, i valori contenuti in multiset 
     *      non devono essere <0 e diversi da null, tra le chiavi non devono esserci null
     */

    //CAMPI
    private final Map <String, Integer> multiset = new HashMap<>();

   /*  public MapStringMultiSet() {
    }*/

    @Override
    public int add(String s) {
        Objects.requireNonNull(s);
        multiset.put(s, multiplicity(s)+1);
        return multiplicity(s);
    }

    @Override
    public int remove(String s) {
        int m = multiplicity(s);
        multiset.replace(s, m-1);
        return m;
    }

    @Override
    public int multiplicity(String s) {
        if (multiset.get(s)==null)
            return 0;
        return multiset.get(s);
    }


    @Override
    public int size() {
        int size = 0;
        for (final int m : multiset.values()) size += m;
        return size;
    }

    @Override
    public StringMultiSet union(StringMultiSet o) throws IllegalArgumentException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public StringMultiSet intersection(StringMultiSet o) throws IllegalArgumentException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Iterator<String> iterator() {
        return Collections.unmodifiableSet(multiset.keySet()).iterator();
    }
    
     
    
}
