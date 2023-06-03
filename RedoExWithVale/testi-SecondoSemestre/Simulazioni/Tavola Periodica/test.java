import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test{
    /**
     * Nota: il numero atomico da dove lo prendo?
     */
    public static void main(String[] args) throws FileNotFoundException {
        TavolaPeriodica tv=new TavolaPeriodica();
        
        Scanner reader = new Scanner(new FileInputStream(args[0]));
        int i=0;
        while (reader.hasNext()) {
            String s = reader.nextLine();   
            String[] parts = s.split(" ");

            //System.out.println(parts[0]);
            ElementoChimico el= new ElementoChimico(i, parts[0], parts[1], Double.parseDouble(parts[2]));
            i++;
            tv.aggiungiElemento(el);

        }
        //System.out.println(tv);
        System.out.println(tv.getElbyKey("O"));

        Scanner sc=new Scanner(System.in);
        System.out.println(sc.nextLine());
        tv.lista.get(0);
        //System.out.println(tv.checkIn(        tv.lista.get(0)        ));


        
    }
    public void test(){
        ElementoChimico o=new ElementoChimico(1,"Ossigeno","O", 10);  
        ElementoChimico g=new ElementoChimico(2,"Gran","g", 15);  
        ElementoChimico h=new ElementoChimico(3,"Idrogeno","h", 20);  
        ElementoChimico cl=new ElementoChimico(4,"Cloro","Cl", 30);  
        Map<ElementoChimico,Integer> formula=new HashMap<>();
        formula.put(o,3);
        //formula.put(o,3);
        formula.put(g,3);
        //formula.put(h,3);
        //formula.put(cl,3);

        //System.out.println(formula);
        Molecola mol=new Molecola(formula);
        System.out.println(mol);

    }
}