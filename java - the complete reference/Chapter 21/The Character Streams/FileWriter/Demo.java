import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo
{
   public static void main(String[] args)
   {
      String s = "Hello\nCan you write me?\nCool";
     
      try (FileWriter f = new FileWriter("output.txt"))
      {
         f.write(s);
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