package practice;

class outer_demo
{
   // int  num;
    private class inner_demo {
        public void print() {
            System.out.println("this is the inner  private function");

        }
    }
    void display_inner()
        {
            inner_demo obj= new inner_demo();
            obj.print();
        }
    }

public class MyClass {
    public static void main(String[] args) {
        outer_demo obj1= new outer_demo();
        obj1.display_inner();
    }
}
