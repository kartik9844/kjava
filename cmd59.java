//59. wp to demonastrate wrapper class to convert a string data to number.

class cmd59
{
public static void main(String arg[])
{
String s1,s2;
s1=arg[0];
s2=arg[1];
System.out.println(s1);
System.out.println(s2);
System.out.println(s1+s2);
int a,b,c;
a=Integer.parseInt(s1);
b=Integer.parseInt(s2);
c=a+b;
System.out.println(c);
}
}