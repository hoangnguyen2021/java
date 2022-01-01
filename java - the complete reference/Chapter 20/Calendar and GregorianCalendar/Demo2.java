import java.util.Calendar;
import java.util.GregorianCalendar;
  
public class Demo2
{
   public static void main(String args[])
   {
      GregorianCalendar c = new GregorianCalendar();
      System.out.println("ERA: " + c.get(Calendar.ERA));
      System.out.println("YEAR: " + c.get(Calendar.YEAR));
      System.out.println("MONTH: " + c.get(Calendar.MONTH));
      System.out.println("WEEK_OF_YEAR: " + c.get(Calendar.WEEK_OF_YEAR));
      System.out.println("WEEK_OF_MONTH: " + c.get(Calendar.WEEK_OF_MONTH));
      System.out.println("DATE: " + c.get(Calendar.DATE));
      System.out.println("DAY_OF_MONTH: " + c.get(Calendar.DAY_OF_MONTH));
      System.out.println("DAY_OF_YEAR: " + c.get(Calendar.DAY_OF_YEAR));
      System.out.println("DAY_OF_WEEK: " + c.get(Calendar.DAY_OF_WEEK));
      System.out.println("DAY_OF_WEEK_IN_MONTH: "
                         + c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
      System.out.println("AM_PM: " + c.get(Calendar.AM_PM));
      System.out.println("HOUR: " + c.get(Calendar.HOUR));
      System.out.println("HOUR_OF_DAY: " + c.get(Calendar.HOUR_OF_DAY));
      System.out.println("MINUTE: " + c.get(Calendar.MINUTE));
      System.out.println("SECOND: " + c.get(Calendar.SECOND));
      System.out.println("MILLISECOND: " + c.get(Calendar.MILLISECOND));
      System.out.println("ZONE_OFFSET: "
                         + (c.get(Calendar.ZONE_OFFSET)/(60*60*1000)));
      System.out.println("DST_OFFSET: "
                         + (c.get(Calendar.DST_OFFSET)/(60*60*1000)));
   }
}