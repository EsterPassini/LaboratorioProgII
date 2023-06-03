import java.util.Objects;

/**
 * Classe astratta che provvede l'implementazione di alcuni dei metodi dell'inferfaccia {@link
 * BoolVect}.
 */
public abstract class AbstractBoolVect implements BoolVect{

    @Override
    public void and(BoolVect other) throws NullPointerException {
        Objects.requireNonNull(other,"non può essere null");
        try{

        final int dimensioneMax = Math.max(dimensione(), other.dimensione());

        for(int i=0;i<dimensioneMax;i++){
            scrivi(i, leggi(i)&other.leggi(i));

        }  
        }catch (IndexOutOfBoundsException e) {
            throw new IllegalArgumentException(
                "La taglia di questo vettore è minore della dimensione del risultato.");
        }      
        
    }

    @Override
    public void or(BoolVect other) throws NullPointerException, IllegalArgumentException {
        Objects.requireNonNull(other,"non può essere null");
        try{
            final int dimensioneMax = Math.max(dimensione(), other.dimensione());

            for(int i=0;i<dimensioneMax;i++){
                scrivi(i, leggi(i)|other.leggi(i));
    
            }
        }catch (IndexOutOfBoundsException e) {
            throw new IllegalArgumentException(
                "La taglia di questo vettore è minore della dimensione del risultato.");
          }
        
    }

    @Override
    public void xor(BoolVect other) throws NullPointerException, IllegalArgumentException {
        Objects.requireNonNull(other, "L'argomento non può essere null.");

        try {

            final int dimensioneMax = Math.max(dimensione(), other.dimensione());

            for(int i=0;i<dimensioneMax;i++){
                scrivi(i, leggi(i)|other.leggi(i));
    
            }
          } catch (IndexOutOfBoundsException e) {
            throw new IllegalArgumentException(
                "La taglia di questo vettore è minore della dimensione del risultato.");
          }
    }
    
}
