public class PiastrellaQuadrata extends Piastrella {
    private int lato;
    /**
     * AF:
     * lato > 0
     * IR:
     * lato:  definisce il lato di una piastrella quadrata
     */ 
    
    public PiastrellaQuadrata(int costo,int lato) {
        super(costo);
        if(lato<0){
            throw new IllegalArgumentException("Lato negativo non accettato");
        }
        this.lato=lato;
    }
    
    
    

    @Override
    public int superfice() {
        return lato*lato;
    }




    @Override
    public String toString() {
        return "PiastrellaQuadrata [costo="+costo()+",lato=" + lato + "]";
    }
    
}
