package Generic;

public class ArrayList<T> {
  private Object[] arr ;
  int size;
  int capacity=100;
    ArrayList()
    {
         arr=new Object[capacity];
         size=0;
    }

    void add(T value)
    {
        arr[size]=value;
        size++;
    }

    T get(int index)
    {
       return (T) arr[index];
    }
    
}
