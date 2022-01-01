import java.io.IOException;

public class Demo
{
   public static void main(String[] args)
   {
      ProcessBuilder pb = new ProcessBuilder("notepad.exe");
      try
      {
         Process p = pb.start();
         System.out.println("Exit value: " + p.waitFor());
      }
      catch (IOException e)
      {
         System.out.println("Cannot open notepad");
      }
      catch (InterruptedException e)
      {
         System.out.println("Thread is interrupted");
      }
   }
}