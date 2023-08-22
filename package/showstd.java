import college.student;
import college.staff;
class showstd
{
public static void main(String arg[])
{
student s1=new student();
s1.roll=1;
s1.name="abc";
System.out.println(s1.roll);
System.out.println(s1.name);
staff s2=new staff();
s2.id=11;
s2.name="xyz";
System.out.println(s2.id);
System.out.println(s2.name);
}

}