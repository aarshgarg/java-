package practice;

public class NullPointer {
    public static void main(String[] args) {
        try {
            String a = null;
            System.out.println(a.charAt(0));
        } catch (NullPointerException e) {
            System.out.println("null exception ");
        }

    }
}