import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        Map<Giocattolo, Integer> magaz = new HashMap<Giocattolo, Integer>();
        Map<Giocattolo, Integer> prezzi = new HashMap<Giocattolo, Integer>();
        Giocattolo ester = new Giocattolo("ester", "pezza");
        Giocattolo tino = new Giocattolo("tino", "pezza");
        magaz.put(tino, 3);
        magaz.put(ester, 4);
        prezzi.put(tino, 1);
        prezzi.put(ester, 2);
        Inventario i = new Inventario(magaz);
        ListinoMolt l = new ListinoMolt(prezzi);
        System.out.println (i);
        System.out.println (l.getPrezzo(ester, 3));
        System.out.println (l);
    }
}
