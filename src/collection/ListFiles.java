package collection;

import java.io.File;
 
public class ListFiles
{
 
 public static void main(String[] args)
{
 
  // Directory path here
  String path = "D:\\Dowload\\Music";
 
  String files;
  File folder = new File(path);
  File[] listOfFiles = folder.listFiles();
 
  for (int i = 0; i < listOfFiles.length; i++)
  {
 
   if (listOfFiles[i].isFile())
   {
   files = listOfFiles[i].getName();
       if (files.endsWith(".mp3"))
       {
          System.out.println(files);
        }
     }
  }
}
}