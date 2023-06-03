public class test {
    public static void main(String[] args) {
        Molo ml=new Molo();
        Nave es=new Nave("Ester", 4);
        Nave ek=new Nave("Rosita", 8);

        ml.attracca(es);
        ml.attracca(ek);
        System.out.println(ml);
        System.out.println(ml.salpa());
        System.out.println(ml);

    }
}
