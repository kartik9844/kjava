//66. wp to display the the date after 45days


import java.util.*;
class datedemo66
{
public static void main(String arg[])
{
Date d1=new Date();
System.out.println(d1.getDate());
System.out.println(d1.getMonth());
System.out.println(d1.getYear());
System.out.println(d1.getDay());
int dd=d1.getDate();
d1.setDate(dd+45);
System.out.println(d1.getDate());
System.out.println(d1.getMonth()+1);
System.out.println(d1.getYear());
System.out.println(d1.getDay());
}
}