//49.multileve inhertance:

class exam extends student
{
String result;
}

class inh49
{
public static void main(String arg[])
{
exam s1=new exam();
s1.deptid=101;
s1.deptname="abc";
s1.sid=1;
s1.sname="xyz";
s1.result="pass";
System.out.println(s1.sid);
System.out.println(s1.sname);
System.out.println(s1.deptid);
System.out.println(s1.deptname);
System.out.println(s1.result);
}
}