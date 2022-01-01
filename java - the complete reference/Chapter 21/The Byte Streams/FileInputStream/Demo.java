import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo
{
   public static void main(String[] args)
   {
      try (FileInputStream f = new FileInputStream("text.txt"))
      {
         int eachByte = f.read();
         while (eachByte != -1)
         {
            System.out.print((char) eachByte);
            eachByte = f.read();
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