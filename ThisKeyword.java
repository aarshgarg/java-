package practice;

public class ThisKeyword {
    int x;
    public ThisKeyword(int num)
    {
        this.x= num;
    }

    public static void main(String[] args) {
        ThisKeyword obj1= new ThisKeyword(1);
        System.out.println("value of x="+obj1.x);
    }
}

