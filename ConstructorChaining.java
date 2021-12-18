package practice;
/*

 * CONSTRUCTOR CHAINING: Process of calling one constructor from another

  with respect to current object

  Done in 2 ways:

  1.Within same class(using this keyword)

  -- this must be the first line of constructor while using constructor chaining

  --there must be at least one constructor without this

  2. From base class(using super keyword) --achieved using inheritance

 this- reference variable used to refer to current object

 super-used to refer immediate parent class object



 */



//1. Within same class



public class ConstructorChaining {



    ConstructorChaining()

    {

        this(5);

        System.out.println("Default Constructor");

    }

    ConstructorChaining(int x)

    {

        this(5,15);

        System.out.println(x);

    }

    ConstructorChaining(int x,int y)

    {



        System.out.println(x*y);

    }



    public static void main(String[] args) {

        ConstructorChaining obj=new ConstructorChaining();



    }



}





//2. From base class

/*

class Base

{

	String name;

	Base()

	{

		System.out.println("No argument constrcutor of base class");

	}

	Base(String nm )

	{

	 this.name=nm;

		System.out.println("Parameterized constructor of base class");

	System.out.println(name);

	}

}

class ConstructorChaining extends Base

{

	ConstructorChaining()

	{

		System.out.println("No argument constrcutor of derived class");

	}

	ConstructorChaining(String n)

	{

		super(n);

		System.out.println("Parameterized constructor of derived class");

	}

	public static void main(String args[])

	{

		ConstructorChaining obj=new ConstructorChaining("Test");

	}

}

*/

