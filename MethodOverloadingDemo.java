package practice;

public class MethodOverloadingDemo {
    int add(int a, int b)

    {

        return a+b;

    }



    void add(int a, int b,int c)

    {

        //return a+b+c;

        int z=a+b;

        System.out.println(z);

    }

    public static void main(String[] args) {

        // TODO Auto-generated method stub



        MethodOverloadingDemo obj=new MethodOverloadingDemo();

        int c=obj.add(10, 20);

        //obj.add(50, 40);

        //int a=obj.add(10, 20, 30);

        //obj.add(10, 20, 30);

        System.out.println(c );

    }




}
