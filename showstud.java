//41.CLASS ANF OBJECT 

class student
{
int roll;
String name;
}

class showstud
{
public static void main(String args[])
{
student s1=new student();
s1.roll=10;
s1.name="abc";
System.out.print(s1.roll);
System.out.print(s1.name);
}
}