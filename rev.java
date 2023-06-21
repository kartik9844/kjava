//34. wp to read a number and reverse it
import java.util.*;
class rev
{
public static void main(String arg[])
{
int num,temp,rev=0;
Scanner s1=new Scanner(System.in);

System.out.println("enter the number");
num=s1.nextInt();
while(num>0)
{
temp=num%10;
rev=rev*10+temp;
num=num/10;
}
System.out.println(rev);
}
}