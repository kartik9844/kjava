//69. example demostartes the linkedlist 

import java.util.*;

class linkedlist69
{
public static void main(String arg[])
{
LinkedList l1= new LinkedList();
System.out.println(l1);
System.out.println(l1.size());
l1.add(10);
l1.add(1,"abc");
l1.add(11);
l1.add("c");
System.out.println(l1);
System.out.println(l1.size());
l1.addFirst("A");
l1.addLast("z");
System.out.println(l1);
System.out.println(l1.size());
}
}