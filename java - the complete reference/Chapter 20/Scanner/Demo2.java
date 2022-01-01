import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo2
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Search for: ");
      String key = "";
      if (in.hasNext())
      {
         key = in.next().toLowerCase();
      }
      int count = 0;
      
      try (Scanner file = new Scanner(new File("alice30.txt")))
      {
         while (file.hasNext())
         {
            String word = file.next().toLowerCase();
            if (word.contains(key)) { count++; }
         }
      }
      catch (FileNotFoundException e)
      {
         System.out.println(e.getMessage());
      }
      
      System.out.println("Key: " + key);
      System.out.println(count + " match(es)");
   }
}