package practice;

public class Abc {
    int i;
    static String name="landran";
    public static void main(String[] args) {

            Abc a = new Abc();
            a.i=100;
           // System.out.println(a);
            Abc b= new Abc();
            b.i=200;
            System.out.println(a.i);
            System.out.println(b.i);
           // System.out.println(i);
        System.out.println(name);
    }
}
