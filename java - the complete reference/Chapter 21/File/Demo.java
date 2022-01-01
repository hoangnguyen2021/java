import java.io.File;
import java.util.Arrays;

public class Demo
{
   public static void main(String[] args)
   {
      File f1 = new File("C:\\Users\\vuhoa\\OneDrive\\Desktop\\JAVA\\Java - The Complete Reference\\Java Files\\Chapter 21\\File\\Demo");
      System.out.println("Name: " + f1.getName());
      System.out.println("Parent: " + f1.getParent());
      System.out.println("Path: " + f1.getPath());
      System.out.println("is directory: " + f1.isDirectory());
      System.out.println("is file: " + f1.isFile());
      System.out.println("Names of all files and directories in this directory: " + Arrays.toString(f1.list()));
      System.out.println("Names of all txt files in this directory: " + Arrays.toString(f1.list((f, s) -> s.endsWith(".txt"))));
      System.out.println("All files in this directory: " + Arrays.toString(f1.listFiles(File::isFile)));
   }
}