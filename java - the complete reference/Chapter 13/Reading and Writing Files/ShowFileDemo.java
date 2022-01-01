import java.io.*;

public class ShowFileDemo
{
   public static void main(String[] args)
   {
      try (FileInputStream fIn = new FileInputStream("text.txt");
           FileOutputStream fOut = new FileOutputStream("text - Copy.txt"))
      {
         int eachByte = fIn.read();
         while (eachByte != -1)
         {
            fOut.write(eachByte);
            eachByte = fIn.read();
         }
      }
      catch (FileNotFoundException e)
      {
         System.out.println("Cannot open file.");
      }
      catch (IOException e)
      {
         System.out.println("Error reading file.");
      }
   }
}