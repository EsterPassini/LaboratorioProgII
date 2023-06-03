/**
 * Overview: Classe che rappresenta  una piastrella
 */
public abstract class Piastrella implements Rivestimento {
    private int costo;
    /**
     * AF:
     * costo>0
     * IR:
     * costo rappresenta il costo della singola piastrella
     * 
     */

    public Piastrella(int costo) {
        if(costo<0){
            throw new IllegalArgumentException("Costo non può essere negativo");
        }
        this.costo = costo;
    }
    @Override
    public int costo() {
        return costo;
    }

    
    

    
    
}
