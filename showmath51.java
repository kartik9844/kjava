//51.overloading
class usermath
{
int a,b,ans;
public int sum()
{
return a+b;
}
public void sum()
{
a=10;
b=12;
sum=a+b;
System.out.println(sum);
}
public void sum(int x,int y)
{
System.out.println(x+y);
}
}

class showmath51
{
public static void main(String arg[])
{
usermath m1=new usermath();
int x,a=10,b=2;
x=m1.sum();
System.out.println(x);
m1.sum();
m1.sum(2,3);
}
}