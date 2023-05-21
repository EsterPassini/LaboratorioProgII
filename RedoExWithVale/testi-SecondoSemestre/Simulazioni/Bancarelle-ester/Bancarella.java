//questa classe implementa una bancarelle per vendere i giocattoli usati

import java.util.Objects;

public class Bancarella {
    //campi:
    String proprietario;
    Inventario inv;
    Listino list;

    /*
     * AF: tutti e 3 i campi devono essere non nulli, ogni gioco presente nell'inventario deve 
     * esserci anche in listino
     * 
     * IR: proprietario è il nome del proprietario della bancarella
     *      inventario rappresenta ciò che in uno specifico momento è sulla bancarella
     *      listino fornisce informazioni sui prezzi
     */


    public Bancarella(String proprietario, Inventario inv, Listino list) {
        Objects.requireNonNull(proprietario, "proprietario non può essere nullo");
        Objects.requireNonNull(inv, "inventario non può essere nullo");
        Objects.requireNonNull(list, "listino non può essere nullo");

        for (Giocattolo g : inv.getListaGiocattoli()){
            if (!list.isConosciuto(g))
                throw new IllegalArgumentException("ogni giocattolo in inventario deve avere un prezzo in listino");
        }
        this.proprietario = proprietario;
        this.inv = inv;
        this.list = list;
    }

    //effects: restituisce quanti giocattoli di tipo g può vendere e il relativo prezzo totale
    public int[] getNumGiocattolo(Giocattolo g){
        return new int[]{inv.getQuantita(g), list.getPrezzo(g, inv.getQuantita(g))};
    }

    
}
