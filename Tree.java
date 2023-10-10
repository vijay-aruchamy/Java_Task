import java.util.*;
public class Tree
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                al.add(Integer.parseInt(""+s.charAt(i)));
            }
        }
        ArrayList<Integer> parent=new ArrayList<>();
        
        for(int i=1;i<al.size();i+=2)
        {
            parent.add(al.get(i));
        }

        boolean b=true;
        
        for(int i=0;i<parent.size()-1;i++)
        {
            int c=1;
            for(int j=i+1;j<parent.size();j++)
            {
                if(parent.get(i)==parent.get(j))
                {
                c++;
                }
            }
            if(c>2)
            {
            b=false;
            break;
            }
            else
            c=1;
        }
        
        System.out.print(b);
    }
}