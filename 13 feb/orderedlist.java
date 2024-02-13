import java.util.*;
public class Collectionsorting
{
    public static void main(String[] args)
    {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Geeks For Geeks");
        al.add("Friends");
        al.add("Dear");
        al.add("Is");
        al.add("Superb");
        Collections.sort(al);
        System.out.println("List after the use of" + " Collection.sort() :\n" + al);
    }
} 
