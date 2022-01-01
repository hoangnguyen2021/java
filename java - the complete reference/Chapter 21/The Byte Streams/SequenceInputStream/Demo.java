import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.SequenceInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo
{
   public static void main(String[] args)
   {
      String s = "Java ";
      byte[] b = s.getBytes();
      
      try (SequenceInputStream sIn = new SequenceInputStream(
                                        new ByteArrayInputStream(b),
                                        new FileInputStream("text.txt")))
      {
         int eachByte = sIn.read();
         while (eachByte != -1)
         {
            System.out.print((char) eachByte);
            eachByte = sIn.read();
         }
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