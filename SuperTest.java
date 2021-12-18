package practice;

class super1
{
    int i=10;
    super1()
    {
        System.out.println("super constructor called ");
    }
}
 class sub extends super1
 {

         int i=20; // override
    void m1()
         {
             System.out.println("the value of the i:=" +i );
             System.out.println("the value of the i:=" +super.i );
         }
 }
public class SuperTest {
    public static void main(String[] args) {
        sub obj= new sub();
        obj.m1();
    }
}
