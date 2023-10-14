//68. demostrate array list
import java.util.*;
class arraylist68
{
public static void main(String arg[])
{
ArrayList l1 = new ArrayList();
System.out.println(l1);
System.out.println(l1.size());
l1.add(1);          //1,x,abc,3
l1.add("abc");
l1.add(3);
l1.add(1,"x");
System.out.println(l1);
System.out.println(l1.size());
l1.remove(2);
System.out.println(l1);
System.out.println(l1.size());
}
}