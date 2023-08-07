//48.inhertance
class dept
{
int deptid;
String deptname;
}

class student extends dept
{
int sid;
String sname;
}

class inh48
{
public static void main(String arg[])
{
student s1=new student();
s1.deptid=101;
s1.deptname="abc";
s1.sid=1;
s1.sname="xyz";
System.out.println(s1.sid);
System.out.println(s1.sname);
System.out.println(s1.deptid);
System.out.println(s1.deptname);
}
}