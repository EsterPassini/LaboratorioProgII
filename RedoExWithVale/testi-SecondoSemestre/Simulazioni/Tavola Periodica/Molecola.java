import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Overview:
 * Questa classe permetterà di rappresentare una  molecola
 */
public class Molecola {
    Map<ElementoChimico,Integer> struttura;
    /**
     * IR: Map non deve contenere elementi duplicati  e non deve contenere elementi con indice nullo
     */
    /**
     * AF: Rappresenterà la struttura della molecola associando ad ogni elemento la sua quantità
     */

    public Molecola(Map<ElementoChimico, Integer> struttura) {
            for (Map.Entry<ElementoChimico, Integer> entry : struttura.entrySet()) {
                Objects.requireNonNull(entry.getKey(),"gli elementi null non sono supportati");
                if(entry.getValue()<=0){
                    throw new IllegalArgumentException("quantità negative non supportate");
                }


            }        
        
        Set<Object> uniqueValues = new HashSet<Object>(struttura.keySet());
       
        
        if(!(uniqueValues.size()==struttura.size())){
            throw new IllegalArgumentException("ELEMENTO DUPLICATO");
        }
        this.struttura=struttura;
    }

   
    /**
     * getPeso permette di ottenere il peso esatto di una melecola
     * @return
     */
    public int getPeso() {
        int peso=0;
        for (Map.Entry<ElementoChimico, Integer> entry : struttura.entrySet()) {
            peso+=entry.getKey().peso()*entry.getValue();
        }    

        return peso;

    }
    /**
     * IsComplex permette di sapere se la molecola è complessa o meno
     * @return
     */
    public boolean isComplex(){
        return struttura.size()>1;
    }

    @Override
    public String toString() {
        String struct="";
        for (Map.Entry<ElementoChimico, Integer> entry : struttura.entrySet()) {

        struct+=entry.getValue()+entry.getKey().symbol();
        
        }
        return struct;
    }
    

    
}
