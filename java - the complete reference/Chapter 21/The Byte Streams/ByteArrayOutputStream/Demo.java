import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo
{
   public static void main(String[] args)
   {
      String s = "I\nlove\nJava";
      byte[] b = s.getBytes();
      
      ByteArrayOutputStream byteArrayOut = new ByteArrayOutputStream();
      byteArrayOut.writeBytes(b);
      
      // toString() method
      System.out.println(byteArrayOut);
      
      // writeTo() method
      try (FileOutputStream f = new FileOutputStream("output.txt"))
      {
         byteArrayOut.writeTo(f);
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