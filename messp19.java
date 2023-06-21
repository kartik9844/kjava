//19. wp to display the following messages 
//if a number divides by 3 display hello
//if number divides by 5 diaplay hi
//if number divides by 3 and 5 display hello hi
//3,10,15

class messp19
{
public static void main(String arg[])
{
int a=15,r3,r5;
r3=a%3;
r5=a%5;
if(r3==0 && r5==0)
{
System.out.println("hello hi");
}
else if (r3==0)
{
System.out.println("hello");
}
else
{
System.out.println("hi");
}
}
}
