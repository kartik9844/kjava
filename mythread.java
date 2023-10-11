//63.therad creation and excution

class mythread extends Thread
{
public  void run()
{
for(int i=1;i<=5;i++)
{
try
{
System.out.println(i);
sleep(2000);
}
catch(Exception e)
{
System.out.println(e);
}
}
}
}