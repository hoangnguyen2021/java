import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo
{
   public static void main(String[] args)
   {
      boolean marked = false;
      try (BufferedReader bIn = new BufferedReader(
           new FileReader("text.txt")))
      {
         int eachChar = bIn.read();
         while (eachChar != -1)
         {
            if (eachChar == '[')
            {
               if (!marked)
               {
                  marked = true;
                  bIn.mark(24);
               }
               else
               {
                  marked = false;
                  bIn.reset();
                  System.out.print('[');
               }
            }
            else if (eachChar == ']')
            {
               if (marked)
               {
                  marked = false;
               }
               else
               {
                  System.out.print(']');
               }
            }
            else
            {
               if (!marked)
               {
                  System.out.print((char) eachChar);
               }
            }
            eachChar = bIn.read();
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