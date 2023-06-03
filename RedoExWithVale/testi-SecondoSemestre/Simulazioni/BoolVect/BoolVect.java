/**
 * Overview: interfaccia rappresenta  i comportamenti di un vettore 
 */
public interface BoolVect{
    /**
     * Restiuisce un intero che rappresenta  la taglia
     * @return
     */
    int taglia();
    /**
     * Restiuisce un intero che rappresenta  la dimensione
     * @return
     */
    int dimensione();
    /**
     * Restiuisce il boolean presente nella posizione pos
     * @param pos
     * @return
     * @throws IndexOutOfBoundsException
     */
    boolean leggi(int pos)throws IndexOutOfBoundsException;
    /**
     * inseriesce in posizione pos il valore value
     * @param pos
     * @param value
     * @throws IndexOutOfBoundsException
     */
    void scrivi(int pos,boolean value)throws IndexOutOfBoundsException;
    /**
     * Esegue l'operazione or
     * @param other
     * @return
     * @throws IllegalArgumentException se la taglia di questo BoolVect è minore della dimensione del
     * risultato.
     */
    void or(final BoolVect other) throws NullPointerException, IllegalArgumentException;
    /**
    * Esegue l'operazione xor
    * @param other l'altro BoolVect.
    * @throws IllegalArgumentException se la taglia di questo BoolVect è minore della dimensione del
    *     risultato.
    * @throws NullPointerException se l'agromento è null
    */
   void xor(final BoolVect other) throws NullPointerException, IllegalArgumentException;
    /**
    * Esegue l'operazione and
    * @param other l'altro BoolVect.
    * @throws NullPointerException se l'agromento è null
    */
   void and(final BoolVect other) throws NullPointerException;


}