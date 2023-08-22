//52.interfaces

interface display
{
public void show();
}

class dept
{
int deptid;
String deptname;
}

class student extends dept implements display
{
int roll;
String name;
public void show()
{
System.out.println(deptid);
System.out.println(deptname);
System.out.println(roll);
System.out.println(name);
}
}


class showstudent52
{
public static void main(String agrc[])
{
student s1=new student();
s1.deptid=1;
s1.deptname="cs";
s1.roll=2;
s1.name="guru";
s1.show();
}
}