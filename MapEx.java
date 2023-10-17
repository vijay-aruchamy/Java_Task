
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapEx {
  public static void main(String[] args) {
    Map<String, Integer> hm = new HashMap<String, Integer>();
    hm.put("vj", 1);
    hm.put("sabari", 2);
    Set<Entry<String, Integer>> a = hm.entrySet();

    LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
    map.put("mahesh", 3);
    map.put("deepak", 4);

    if (hm.containsKey("vj"))
      System.out.println("contains method in map");

    map.putAll(hm);// used for adding a another map into a map.

    map.remove("vj");// used for removing a object.

    // map is a interface
    // hashmap does not follow order but faster
    // linkedhashmap follows insertion order
    // tree map follows sorted order but slower for insertion and retrival.

    // using key set
    for (String i : hm.keySet()) {
      System.out.println(hm.get(i));
    }

    // using values method
    for (int val : hm.values()) {
      System.out.print(val);
    }

    // using entryset
    for (Entry<String, Integer> i : hm.entrySet()) {
      System.out.println(i.getKey() + i.getValue());
    }

  }

}
