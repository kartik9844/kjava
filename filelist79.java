//79.fileList

import java.io.*;
class filelist79
{
public static void main(String a[])
{
File f1= new File("E:\\banglore");
String files[] =f1.list();

for(int i=0; i<files.length; i++)
{
System.out.println("file name"+files[i]);
}

System.out.println(files.length);

}
}
