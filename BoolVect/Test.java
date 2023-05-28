import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ArrayList<Boolean> d1 = new ArrayList<Boolean>(Arrays.asList(true,  false, true, true));
        ArrayList<Boolean> d2 = new ArrayList<Boolean>(){{ add(true); add( true); add(true);}};
        ArrayList<Integer> s1 = new ArrayList<Integer>(Arrays.asList(6, 99, 1));
        ArrayList<Integer> s2 = new ArrayList<Integer>(){{ add(0); add(107); add( 2); add(4);}};
        BolArrBoolVect denso1 = new BolArrBoolVect(40, d1);
        BolArrBoolVect denso2 = new BolArrBoolVect(40, d2);
        ArrBoolVect sparso1 = new ArrBoolVect(99, s1);
        ArrBoolVect sparso2 = new ArrBoolVect(200, s2);

        System.out.println("=^.^=");
        System.out.println("<taglia denso1: " +denso1.taglia());
        System.out.println("<taglia sparso2: "+sparso2.taglia());
        System.out.println("<dim denso1: " + denso1.dimensione());
        System.out.println("<dim sparso2: " + sparso2.dimensione());
        System.out.println("valore letto pos0 d1: "+ denso1.leggiPos(0));
        System.out.println("valore letto pos0 s2: "+ sparso2.leggiPos(0));
        System.out.println("valore letto pos3 d1: "+ denso1.leggiPos(3));
        System.out.println("valore letto pos200 s2: "+ sparso2.leggiPos(200));
        System.out.println("=^.^=");
        System.out.println("valore letto pos3 s2: "+ sparso2.leggiPos(3));
        sparso2.scriviPos(3, true);
        System.out.println("valore letto pos3 s2: "+ sparso2.leggiPos(3));
        System.out.println("s2: "+ sparso2);
        sparso2.and(sparso1);
        System.out.println("s2 and s1: "+ sparso2);


        System.out.println("d1: "+ denso1);
        System.out.println("valore letto pos3 d1: "+ denso1.leggiPos(3));
        sparso1.scriviPos(3, false);
        System.out.println("valore letto pos3 s2: "+ sparso2.leggiPos(3));
        System.out.println("s2: "+ sparso2);

        System.out.println("d1: "+ denso1);
        System.out.println("d2: "+ denso2);
        denso1.or(denso2);
        System.out.println("d1 and d2: "+ denso1);
        
    }
}
