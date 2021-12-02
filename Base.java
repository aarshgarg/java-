package practice;

class Base1 {
    public void myMethod() {
        System.out.println("Overridden method");
    }
}

class Demo extends Base1 {
    public void myMethod() {
        //This will call the myMethod() of parent class
       // super.myMethod();
        System.out.println("Overriding method");
        super.myMethod();
    }
}
    public class Base {
        public static void main(String[] args) {
            Demo obj = new Demo();
            obj.myMethod();
        }
    }