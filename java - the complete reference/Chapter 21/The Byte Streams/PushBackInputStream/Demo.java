import java.io.ByteArrayInputStream;
import java.io.PushbackInputStream;
import java.io.IOException;

public class Demo
{
   public static void main(String[] args)
   {
      byte[] b = "If a = b -> a - b = 0.".getBytes();
      ByteArrayInputStream byteArrayIn = new ByteArrayInputStream(b);
      
      try (PushbackInputStream pIn = new PushbackInputStream(byteArrayIn))
      {
         int nextByte = pIn.read();
         while (nextByte != -1)
         {
            if (nextByte == '-')
            {
               nextByte = pIn.read();
               if (nextByte == '>')
               {
                  System.out.print("then");
               }
               else
               {
                  System.out.print("-");
                  pIn.unread(nextByte);
               }
            }
            else
            {
               System.out.print((char) nextByte);
            }
            nextByte = pIn.read();
         }
      }
      catch (IOException e)
      {
         System.out.println(e.getMessage());
      }
   }
}