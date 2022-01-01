import java.io.IOException;

public class Demo
{
   public static void main(String[] args)
   {
      Runtime r = Runtime.getRuntime();
      try
      {
         Process p = r.exec("notepad.exe");
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