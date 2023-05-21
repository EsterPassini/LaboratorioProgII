import java.util.Map;
//questa classe concreta implementa la politica di prezzo moltiplicativa (senza sconti)
public class ListinoMolt extends ListinoAbs{

    public ListinoMolt(Map<Giocattolo, Integer> prezzi) {
        super(prezzi);
    }

    @Override
    public int getPrezzo(Giocattolo g, int n) {
        return getPrezzoUnitario(g)*n;
    }
    
}