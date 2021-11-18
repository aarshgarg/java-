package practice;

public class StringException {
    public static void main(String[] args) {
        try
        {
            String a= "This is like chipping";
            char c= a.charAt(25);
        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println("string exception");
        }
    }
}
