/*29. wp to pattern 
1
23
456
7891011  */

class pp5
{
public static void main(String arg[])
{
int i,j;
for(i=1;i<=3;i++)
{
for(j=1;j<=i;j++)
{
System.out.print(j);
}
System.out.print("\n");
}
for(i=2;i>=1;i--)
{
for(j=1;j<=i;j++)
{
System.out.print(j);
}
System.out.print("\n");
}
}
}
