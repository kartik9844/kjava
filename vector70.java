//70. wp to demostarte a deflaut vector


import java.util.*;

class vector70
{
public static void main(String arg[])
{
 Vector l1= new Vector();
System.out.println(l1);
System.out.println(l1.size());
System.out.println(l1.capacity());

l1.addElement(new Integer(1));
l1.addElement(new Integer(2));
l1.addElement(new Integer(3));
l1.addElement(new Integer(4));
l1.addElement(new Integer(5));
l1.addElement(new Integer(6));

System.out.println(l1);
System.out.println(l1.size());
System.out.println(l1.capacity());

l1.addElement(new Integer(7));
l1.addElement(new Integer(8));
l1.addElement(new Integer(9));
l1.addElement(new Integer(10));
l1.addElement(new Integer(11));


System.out.println(l1);
System.out.println(l1.size());
System.out.println(l1.capacity());
}
}