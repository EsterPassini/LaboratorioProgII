/**
 * Overview: Rappresenta una piastrella a forma di triangolo rettangolo 
 */
public class PiastrellaTriangolare extends Piastrella {
    private int base;
    private int altezza;
    /**
     * AF:
     * base > 0
     * altezza >0
     * IR:
     * base: rappresemta la base del triangolo
     * altezza: rappresemta l'altezza del triangolo
     */ 
    
    public PiastrellaTriangolare(int costo,int base,int altezza) {
        super(costo);
        if (base <= 0) throw new IllegalArgumentException("La base dev'essere positiva.");
        if (altezza <= 0) throw new IllegalArgumentException("L'altezza dev'essere positiva.");
        this.base = base;
        this.altezza = altezza;
    }
    
    
    

    @Override
    public int superfice() {
        return (base*altezza)/2;
    }




    @Override
    public String toString() {
        return "PiastrellaTriangolare [base=" + base + ", altezza=" + altezza + "]";
    }
    
}
