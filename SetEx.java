import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class SetEx {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        Set<Integer> set1=new HashSet<>();
        set1.add(4);
        set1.add(5);
        set.add(1);
        set.add(1);//it replaces the previous same value.
        set.add(2);
        set.add(3);
        set.remove(2);
        set.addAll(set1);// for adding another set.
        System.out.println(set.size());
        Object[] array = set.toArray();    // for converting set into object array
        for(Object i :array)
        System.out.println(i);  
        
        
        //treeset - stores data in sorted order
        // hashset - does not follow any order
        //linkhashset- follows insertion order
    }
    
}
