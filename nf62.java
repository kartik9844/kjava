//62.try with multiple catches

class nf62
{
public static void  main(String arg[])
{
int a,b,c,d;
a=10;
b=c=d=0;
String s1,s2;
try
{
s1=arg[0];
s2=arg[1];
a=Integer.parseInt(s1);
b=Integer.parseInt(s2);
c=a+b;
d=a/b;
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("plz pass any 2 value");
System.out.println(e);
}
catch(NumberFormatException ne)
{
System.out.println("plz enter only number
");
System.out.println(ne);
}
catch(Exception ae)
{
System.out.println(ae);
}
System.out.println(c);
System.out.println(d);
}
}
