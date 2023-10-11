//72.following example demostrate stack class

import java.util.*;

class stack72
{
public static void main(String arg[])
{
Stack s1= new Stack();
System.out.println(s1);
System.out.println(s1.size());

s1.push("1");
s1.push("2");
s1.push("3");

System.out.println(s1);
System.out.println(s1.size());

s1.pop();

System.out.println(s1);
System.out.println(s1.size());

}
}