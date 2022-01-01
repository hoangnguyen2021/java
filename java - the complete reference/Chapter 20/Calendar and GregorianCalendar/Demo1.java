import java.util.Calendar;
import java.util.Locale;

public class Demo1
{
   public static void main(String[] args)
   {
      Calendar c = Calendar.getInstance();
      System.out.println(c.getTime());
      
      System.out.println();
      
      System.out.println("Date: "
                       + c.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, Locale.getDefault()) + ", "
                       + c.getDisplayName(Calendar.MONTH, Calendar.SHORT, Locale.getDefault()) + " "
                       + c.get(Calendar.DATE) + ", "
                       + c.get(Calendar.YEAR));
      System.out.println("Time: "
                       + c.get(Calendar.HOUR) + ":"
                       + c.get(Calendar.MINUTE) + ":"
                       + c.get(Calendar.SECOND) + " "
                       + c.getDisplayName(Calendar.AM_PM, Calendar.SHORT, Locale.getDefault()));
      System.out.println("Time Zone: "
                       + c.getTimeZone().getDisplayName());
   }
}