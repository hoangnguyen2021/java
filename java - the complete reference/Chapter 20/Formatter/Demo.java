import java.util.Calendar;
import java.util.GregorianCalendar;
  
public class Demo
{
   public static void main(String args[])
   {
      GregorianCalendar c = new GregorianCalendar();
      System.out.printf("%tc%n", c);
      
      System.out.println();
      
      // argument index
      System.out.println("Current time:");
      System.out.printf("%1$tl:%<tM %<Tp%n%<tA%n%<tm/%<te/%<tY%n", c);
      
      System.out.println();
      
      System.out.printf("Checking account: $ %5.2f%n", 5.48);
      System.out.printf("Saving account: $ %5.2f%n", 20453.90);
   }
}