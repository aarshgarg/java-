package practice;

public class Exp1 {
    public static void main(String[] args) {
        int i =10;
        try
        {
           i=i/Integer.parseInt(args[4]);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);

        }
        catch(Exception e1)
        {
            System.out.println(e1);
        }
        finally {
            System.out.println("finally");
        }
        System.out.println(" the code is on the wau");
    }
}
