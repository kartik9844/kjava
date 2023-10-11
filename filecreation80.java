//80.filecreation

import java.io.*;

class filecreation80

{
public static void main(String a[]) throws Exception
{
DataInputStream tmp =new DataInputStream(System.in);
String s;
System.out.println("enter a line of text");
s=tmp.readLine();

FileOutputStream fout= new FileOutputStream("jcet.txt");
for(int i=0;i<s.length(); i++)
{
fout.write(s.charAt(i));
}
fout.close();

}
}