//68. demostrate array list

import java.util.*;
class forj
{
public static void main(String arg[])
{
ArrayList l1 = new ArrayList();
int[] a = new int[5];
int i;
Scanner s1 = new Scanner(System.in);
System.out.println("enter array values");
for (i=0; i<5; i++)
{
 a[i]= s1.nextInt();
}
for (i=0; i<5; i++)
{
System.out.println(a[i]);
}

for (int j=0; j<5; j++)
{
 int b = s1.nextInt();
 l1.add(b); 
}
System.out.println(l1);
}
}