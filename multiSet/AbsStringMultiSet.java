package multiSet;
import java.util.Iterator;

public abstract class AbsStringMultiSet implements StringMultiSet{

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        final Iterator<String> ite = this.iterator();
        while (ite.hasNext()) {
            final String s = ite.next();
            sb.append(s+ ":" + this.multiplicity(s));    
            if (ite.hasNext()) sb.append(", "); // la virgola separa dal successivo elemento, se presente
        } 
        sb.append("}");
    
        return sb.toString();
    }
}
