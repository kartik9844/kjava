























































//28. wp to display the following messages for the range 1 to 30
//if the number divideds by 3 display hi
//if no divides by 5 display hello
//if a number divides by 3 and 5 dispay hi hello

class loopm28
{
public static void main(String arg[])
{
int i,r3,r5;
for(i=0;i<=30;i++)
{
 r3=i%3;
 r5=i%5;
 if(r3==0 && r5==0)
 {
  System.out.println(i+"hi hello");
 }
 else if(r3==0)
{
  System.out.println(i+"hi");
}
else if(r5==0)
{
 System.out.println(i+"hello");
}
System.out.println(i);
}
}
}