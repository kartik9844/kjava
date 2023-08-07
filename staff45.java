//45.write a program to demonstarte user user defined constructor 
class staff1
{
int sid;
String sname;

public staff1()
{
sid=1;
sname="abc";
}
public staff1(int id,String n)
{
sid=id;
sname=n;
}
}

class staff45
{
public static void main(String arg[])
{
staff1 s1=new staff1();
System.out.println(s1.sid);
System.out.println(s1.sname);
staff1 s2=new staff1(2,"ajay");
System.out.println(s2.sid);
System.out.println(s2.sname);
}
}