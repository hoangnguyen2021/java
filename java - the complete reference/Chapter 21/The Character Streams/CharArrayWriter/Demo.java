import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo
{
   public static void main(String[] args)
   {
      CharArrayWriter charArrayOut = new CharArrayWriter();
      try
      {
         charArrayOut.write("I\nlove\nJava");
      }
      catch (IOException e)
      {
         System.out.println(e.getMessage());
      }
      
      // toString() method
      System.out.println(charArrayOut);
      
      // writeTo() method
      try (FileWriter f = new FileWriter("output.txt"))
      {
         charArrayOut.writeTo(f);
      }
      catch (FileNotFoundException e)
      {
         System.out.println(e.getMessage());
      }
      catch (IOException e)
      {
         System.out.println(e.getMessage());
      }
   }
}