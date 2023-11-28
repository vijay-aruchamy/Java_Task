import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.print(id + " " + name);
    }

}

public class ArrayListEx { 

    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        int id1 = sc.nextInt();
        sc.nextLine();
        String name1 = sc.nextLine();
        Student s = new Student(id, name);
        Student s1 = new Student(id1, name1);
        al.add(s);
        s.display();
        s1.display();

        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(20);
        al1.add(30);
        al1.remove(Integer.valueOf(30));
        System.out.print(al);

        Iterator i = al1.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
