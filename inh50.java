//50.hierarchial inheritance
class dept
{
int deptid;
String deptname;
}

class Staff extends dept
{
String sname;
}

class student extends dept
{
String studname;
}

class inh50
{
public static void main(String arg[])
{
Staff s1=new Staff();
s1.deptid=1;
s1.deptname="cs";
s1.sname="abc";
System.out.println(s1.deptid);
System.out.println(s1.deptname);
System.out.println(s1.sname);
student s2=new student();
s2.deptid=2;
s2.deptname="es";
s2.studname="xyz";
System.out.println(s2.deptid);
System.out.println(s2.deptname);
System.out.println(s2.studname);
}
}