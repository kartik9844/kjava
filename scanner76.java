//76.scanner

import java.util.*;


class scanner76
{
public static void main(String arg[])
{
String str;
System.out.println("enter a line of text");
Scanner s1 = new Scanner(System.in);

try
{
str=s1.nextLine();
System.out.println(str);
}
catch(Exception e)
{
System.out.println(e);
}
}
}