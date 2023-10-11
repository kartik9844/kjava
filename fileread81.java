//81.filereading


import java.io.*;
class fileread81
{
public static void main(String arg[]) throws Exception
{
int size;
InputStream f=new FileInputStream(arg[0]);
System.out.println("Bytes available to read:"+(size=f.available()));
char str[]= new char[size];
for(int i=0;i<size;i++)
{
str[i]=((char)f.read());
System.out.println(str[i]);
}
System.out.println("");
f.close();
}
}