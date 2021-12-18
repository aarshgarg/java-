package practice;
// DEFAULT CONSTRUCTOR

// Example 1:

/*

class Student

{

	int uid;

	String name;



	Student()

	{



		System.out.println("Constructor of Student class");

	}

}

*/



//Example 2:

/*

class Student

{

	int uid;

	String name;

	Student()

	{

		uid=101;

		name="Gagan";

	}

	void display()

	{

		System.out.println("Uid:"+uid+"\nName:"+name);

	}

}

*/

//PARAMETERIZED CONSTRUCTOR

// Example 3:



class Student

{



    int uid;

    String name;



	/*Student(int n)

	{

		this.uid=n;

		System.out.println("Hello!!"+n);

	}*/

    Student(int u, String n)

    {

        int uid;



        this.uid=u;

        this.name=n;  //this: used to refer to the current object



    }



}





//Constructor Overloading

public class ConstructorDemo {



    ConstructorDemo(){

        System.out.println("Constrcutor of Demo class");

    }

    public static void main(String[] args) {



//Student obj=new Student();

        //ConstructorDemo obj1= new ConstructorDemo();



        //obj.display();

// Student s1=new Student(101);

        Student s=new Student(102,"Amrit");



        System.out.println("Uid:"+s.uid+"\nName:"+s.name);



    }



}

