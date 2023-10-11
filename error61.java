//error2 try catch
class error61
{
public static void  main(String arg[])
{
int a,b,c,d;
a=10;
b=c=d=0;
try
{
c=a+b;
d=a/b;
}
catch(Exception e)
{


System.out.println(e);
}
System.out.println(c);
System.out.println(d);
}
}