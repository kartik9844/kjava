//57.follwing exmaple demonastrate string buffer

class StringBuffer57
{
public static void main(String arg[])
{
StringBuffer s1=new StringBuffer("i java");
System.out.println(s1);
s1.insert(2,"like");
System.out.println(s1);
s1.append("and python");
System.out.println(s1);
s1.replace(5,10,"adv java");
System.out.println(s1);
s1.reverse();
System.out.println(s1);
}
}