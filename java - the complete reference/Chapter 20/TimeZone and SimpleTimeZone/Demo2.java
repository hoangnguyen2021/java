import java.util.Calendar;
import java.util.SimpleTimeZone;

public class Demo2
{
   public static void main(String[] args)
   {
      SimpleTimeZone stz = new SimpleTimeZone(-18000000, "US/Eastern",
         Calendar.MARCH, 8, -Calendar.SUNDAY, 7200000,
         Calendar.NOVEMBER, 1, -Calendar.SUNDAY, 7200000);
   }
}