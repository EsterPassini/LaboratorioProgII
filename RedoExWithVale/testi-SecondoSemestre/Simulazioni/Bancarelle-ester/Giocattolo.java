
//questa classe implementa il tipo giocattolo
public class Giocattolo {
    String Nome;
    String Materiale;
    //AF: nome e materiale != null
    //IR: rappresenta il giocattolo di tipo : nome e materiale: materiale


    /**
     * 
     * @param nome
     * @param materiale
     */
    public Giocattolo(String nome, String materiale) {
        Nome = nome;
        Materiale = materiale;
    }
    @Override
    public String toString(){
        return "-tipo: "+ Nome + ", materiale: " + Materiale;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Nome == null) ? 0 : Nome.hashCode());
        result = prime * result + ((Materiale == null) ? 0 : Materiale.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Giocattolo other = (Giocattolo) obj;
        if (Nome == null) {
            if (other.Nome != null)
                return false;
        } else if (!Nome.equals(other.Nome))
            return false;
        if (Materiale == null) {
            if (other.Materiale != null)
                return false;
        } else if (!Materiale.equals(other.Materiale))
            return false;
        return true;
    }

    
    
    
}
