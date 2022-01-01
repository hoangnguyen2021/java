import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo
{
   public static void main(String[] args)
   {
      try (FileReader f = new FileReader("input.txt"))
      {
         int eachChar = f.read();
         while (eachChar != -1)
         {
            System.out.print((char) eachChar);
            eachChar = f.read();
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