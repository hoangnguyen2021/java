import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo
{
   public static void main(String[] args)
   {
      String source = "Hello\nCan you write me?\nCool";
      byte[] b = source.getBytes();
      
      try (FileOutputStream f = new FileOutputStream("text.txt"))
      {
         f.write(b);
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