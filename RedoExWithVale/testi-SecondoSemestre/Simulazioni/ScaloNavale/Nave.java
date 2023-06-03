import java.util.Objects;

/**
 * Overview: Rappresenta una nave con  nome e peso  
 */
public record Nave(String Nome,int peso) {
    /**
     * IR: nome non può essere null 
     * peso>0
     * AF: nome della nave
     * peso:  peso  della nave
     */
    public Nave(String Nome,int peso){
        if(peso<0){
            throw new IllegalArgumentException("peso non può essere negativo");
        }
        this.peso=peso;
        Objects.requireNonNull(Nome,"non può essere nullo");
        this.Nome=Nome;
    }
    @Override
    public String toString() {
        return("["+Nome+","+peso+"]");
    }
    
}
