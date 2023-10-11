//77.javaio

import java.io.*;

class javaio77
{
public static void main(String arg[])
{
String str="";
byte b[] = new byte[200];
System.out.println("enter the text");

try
{
System.in.read(b,0,200);
str= new String(b);

}
catch(Exception e)
{
System.out.println(e);
}
System.out.println(str);
}
}