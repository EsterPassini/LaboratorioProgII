package multiSet;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

//questa classe implementa un multiset di stringhe tramite una lista
public class ListStringMultiSet extends AbsStringMultiSet{

    /*
     * AF: multiset rappresenta un multiinsieme di stringhe tramite una lista degli elementi
     * 
     * IR: multiset non può essere nulla e non contiene null
     */

    //CAMPI
    private final List<String> multiset = new LinkedList<>();

    @Override
    public int add(String s) {
        Objects.requireNonNull(s);
        multiset.add(s);
        return multiplicity(s);
    }


    @Override
    public int multiplicity(String s) {
        if (!multiset.contains(s))
             return 0;

        int m = 0;
        for (String st : multiset) {
            if (st == s)
                m = m+1;
        }
        return m;
    }

    @Override
    public int remove(String s) {
        int m = multiplicity(s);
        multiset.remove(s);
        return m;
    }

    @Override
    public int size() {
        return multiset.size();
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
        // TODO Auto-generated method stub
        return null;
    }

    
}
