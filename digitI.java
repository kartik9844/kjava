//33. wp to read a 3 digit number and display indivial digits
import java.util.*;
class digitI
{
public static void main(String arg[])
{
int num,temp;
Scanner s1=new Scanner(System.in);

System.out.println("enter the number");
num=s1.nextInt();
while(num>0)
{
temp=num%10;
System.out.println(temp);
num=num/10;
}
}
}