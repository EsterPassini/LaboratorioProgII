import java.util.Map;

public class Pavimentazione implements Rivestimento{
    Map<Rivestimento,Integer> componenti;
    /**
     * AF:
     * componenti non può contenere elementi  null e gli interi devono essere >1
     * RI:
     * componenti rappresenta la lista dei componenti della pavimentazione con assciata la quantità 
     */
    public Pavimentazione(Map<Rivestimento,Integer> componenti){
            for (Rivestimento key : componenti.keySet()) {
                System.out.println(key + ":" + componenti.get(key));
            }
        
    }
    @Override
    public int costo() {

        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'costo'");
    }

    @Override
    public int superfice() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'superfice'");
    }
    
}
