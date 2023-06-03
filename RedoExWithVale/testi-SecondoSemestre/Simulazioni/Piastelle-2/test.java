import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        Rivestimento pQ= new PiastrellaQuadrata(5, 4);
        Rivestimento pT= new PiastrellaTriangolare(5, 4,5);
        System.out.println(pQ);
        System.out.println(pT.superfice());
        Map<Rivestimento,Integer> map=new HashMap<>();
        map.put(pQ, 3);
        map.put(pT, 8);
        Pavimentazione pv=new Pavimentazione(map);
    }
    
}
