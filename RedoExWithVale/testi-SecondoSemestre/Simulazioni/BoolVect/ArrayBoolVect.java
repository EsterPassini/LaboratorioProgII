import java.util.Arrays;
/**
 * Overview: Implemento concretamente un vettore di boooleani usando l'array  come struttura dati denso 
 */
public class ArrayBoolVect extends AbstractBoolVect{
    /**
     * IR:  taglia>0
     * AF:  taglia del nostro vettore  
     * arr: conterrà tutti gli elementi del vettore 
     * dimensione: rappresenta la dimensione del vect di booleani 
     */
    private boolean[] arr;

    private int dimensione = 0;
    private int taglia;

    public ArrayBoolVect(int size) {
        if(size<=0){
            throw new IllegalArgumentException();
        }
        this.taglia = size;
        arr=new boolean[size];
     
    }
    
    @Override
    public int taglia() {
        return taglia;
    }

    @Override
    public int dimensione() {
        return dimensione;
        
    }

    @Override
    public boolean leggi(int pos) throws IndexOutOfBoundsException {
        if(pos<taglia()){
            return arr[pos];
        }
        throw new IndexOutOfBoundsException("pos troppo grande");
    
    }

    @Override
    public void scrivi(int pos, boolean value) throws IndexOutOfBoundsException {
        if(pos<taglia()){
            if(value && pos+1>dimensione){
                dimensione=pos+1;
            }
            arr[pos]=value;
        }else{
            throw new IndexOutOfBoundsException("pos troppo grande");
        }   
    }



    @Override
    public String toString() {
        
        return Arrays.toString(arr);
    }
    
    
}
