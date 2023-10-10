 class Parent1 {
    Parent1()
    {
        System.out.println("First");
    }

    void display()
    {
        System.out.println("Parent class");
    }

    void display(int value)
    {
       System.out.println("Value"+value);
    }
}

class Child1 extends Parent1
{
    Child1()
    {
        super(); //must be in first line
        System.out.println("second");

    }
    
  //override
    void display()
    {
       System.out.println("Child1 class");
    }

    //overloading
    
}

public class Oops{
    public static void main(String[] args)
    {
        //upcasting

    Parent1 p=new Child1();

    // Child1 p=new Child1();
         p.display(); //Child's display method is called
         p.display(10);
    }
}
