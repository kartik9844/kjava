//78.following example demonstrates data input Stream 

import java.io.*;

class  datainput78
{
public static void main(String arg[])
{
DataInputStream dis=new DataInputStream(System.in);
System.out.println("enter a line of text");
String str;

try
{
str=dis.readLine();
System.out.println(str);
}
catch(Exception e)
{
System.out.println(e);
}

}
}