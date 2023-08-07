//42.create a class for to store staff information create 2 objects and show the information

class LCC
{
String name;
int id;
}

class p42
{
public static void main(String args[])
{
LCC l1=new LCC();
LCC l2=new LCC();
l1.name="sir";
l1.id=50;
l2.name="student";
l2.id=60;
System.out.println(l1.name);
System.out.println(l1.id);
System.out.println(l2.name);
System.out.println(l2.id);
}
}