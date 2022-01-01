import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo
{
   public static void main(String[] args)
   {
      boolean marked = false;
      try (BufferedInputStream bIn = new BufferedInputStream(new FileInputStream("text.txt")))
      {
         int eachByte = bIn.read();
         while (eachByte != -1)
         {
            if (eachByte == '[')
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
            else if (eachByte == ']')
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
                  System.out.print((char) eachByte);
               }
            }
            eachByte = bIn.read();
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