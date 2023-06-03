import java.util.Objects;

/**
 * Overview: 
 * Il seguente recordo permette la rappresentazione di un elemento chimco attraverso la definizione delle sue caratteristiche quali: 
 * nome, simpbolo e peso
 */
public record ElementoChimico(int numeroAtomico,String nome,String symbol,double peso ) {
    /**
     * IR: nome not null 
     * symbol not null
     * peso  > 0
     * A
     * AF: nome rappresenterà il nome dell'elemento chimico 
     * symbol  rappresenta il simbolo dell'elemento 
     * peso rappresenta ile peso del nostro elemento
     */
    
    
    public ElementoChimico{
        Objects.requireNonNull(nome,"nome non non può essere null");
        Objects.requireNonNull(symbol,"symbol non non può essere null");
        if(peso<=0){
            throw new IllegalArgumentException("peso negativo inaccettabile");
        }
    }

    @Override
    public String toString(){
        String str="";
        str+="nome: "+nome.toString()+"\n";
        str+="simbolo: "+symbol.toString()+"\n";
        str+="nome: "+peso+"\n";
        return str;
    }
    @Override
    public boolean equals(Object obj){
        ElementoChimico elementoChimico = (ElementoChimico) obj;
        return elementoChimico.nome().equals(nome());
    }

    
}
