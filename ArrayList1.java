import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
class Student{
    int id;
    String name;
    Student(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    void display()
    {
        System.out.print(id+" "+name);
    }
    
}

public class ArrayList1 {
    
    
    public static void main(String[] args)
    {
        ArrayList<Student> al=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int id=sc.nextInt();
        sc.nextLine();
        String name=sc.nextLine();
         int id1=sc.nextInt();
        sc.nextLine();
        String name1=sc.nextLine();
          Student s=new Student(id,name);
           Student s1=new Student(id1,name1);
           al.add(s);
          s.display();
          s1.display();


          ArrayList<Integer> al=new ArrayList<>();
          al.add(10);
          al.add(20);
          al.add(30);
          al.remove(Integer.valueOf(30));
          System.out.print(al);
          a s1=new a();
          System.out.println(s1);
          Iterator i =al.iterator();
          while(i.hasNext())
          {
              System.out.println(i.next());
          }
      }
    }

    
}
