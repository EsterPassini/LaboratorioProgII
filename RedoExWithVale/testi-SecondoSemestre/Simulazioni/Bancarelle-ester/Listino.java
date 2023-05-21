//questa interfaccia definisce i metodi di un listino

public interface Listino {

    //effects: dato un tipo di giocattolo e il numero di giocattoli che voglio vendere o comprare
    // restituisce il prezzo totale
    public int getPrezzo(Giocattolo g, int n);

    //effects: dato un tipo di giocattolo dice se è presente il suo prezzo nel listino
    public boolean isConosciuto(Giocattolo g);
}
