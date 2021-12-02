package practice;

public class Employee {
    private String firstName = null;

    private String lastName = null;

    private int   birthYear = 0;



    public Employee(String first,

                    String last,

                    int   year  ) {



        firstName = first;

        lastName = last;

        birthYear = year;

    }




    void display()
    {
        System.out.println(firstName+""+ lastName+""+birthYear);
    }



    public static void main(String[] args) {
         Employee obj1= new Employee("Aarsh","Garg",101);
         obj1.display();

    }
}
