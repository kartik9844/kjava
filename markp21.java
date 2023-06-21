//21a. write p to display the result with respect to the marks
//if the marks is 35 to 50 display parse 
//if the marks is 50 to 60 dispay 2nd class
//if the makrs is 60to75 first pass
//75to 100 distiction else fail
//give marks is 45

class markp21
{
public static void main(String arg[])
{
int a=70;
if(a>=35 && a<50)
{
 System.out.println("pass");
}
else if(a>=50 && a<60)
{
 System.out.println("2d class");
}
else if(a>=60 && a<75)
{
  System.out.println("1st class");
}
else if(a>=75 && a<=100)
{
 System.out.println("distiction");
}
else 
{
 System.out.println("fail");
}
}
}