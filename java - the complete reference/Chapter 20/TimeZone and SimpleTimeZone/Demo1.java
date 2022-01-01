import java.util.TimeZone;

public class Demo1
{
   public static void main(String[] args)
   {
      System.out.println("All available IDs according to a time zone offset of -05:00:");
      String[] ids = TimeZone.getAvailableIDs(-18000000);
      for (String id : ids)
      {
         System.out.println(id);
      }
      
      System.out.println();
      
      TimeZone tz = TimeZone.getDefault();
      System.out.println(tz.getDisplayName());
      System.out.printf("%-32s%s%n", "Display name, long: ", tz.getDisplayName(false, TimeZone.LONG));
      System.out.printf("%-32s%s%n", "Display name, short: ", tz.getDisplayName(false, TimeZone.SHORT));
      System.out.printf("%-32s%s%n", "Display name, daylight, long: ", tz.getDisplayName(true, TimeZone.LONG));
      System.out.printf("%-32s%s%n", "Display name, daylight, short: ", tz.getDisplayName(true, TimeZone.SHORT));
      System.out.printf("%-32s%s%n", "ID: ", tz.getID());
      
      System.out.println();
      
      TimeZone tz1 = TimeZone.getTimeZone("US/Eastern");
      System.out.println(tz1.getDisplayName());
      System.out.printf("%-32s%s%n", "Display name, long: ", tz1.getDisplayName(false, TimeZone.LONG));
      System.out.printf("%-32s%s%n", "Display name, short: ", tz1.getDisplayName(false, TimeZone.SHORT));
      System.out.printf("%-32s%s%n", "Display name, daylight, long: ", tz1.getDisplayName(true, TimeZone.LONG));
      System.out.printf("%-32s%s%n", "Display name, daylight, short: ", tz1.getDisplayName(true, TimeZone.SHORT));
      System.out.printf("%-32s%s%n", "ID: ", tz1.getID());
      
      System.out.println();
      
      TimeZone tz2 = TimeZone.getTimeZone("US/Central");
      System.out.println(tz2.getDisplayName());
      System.out.printf("%-32s%s%n", "Display name, long: ", tz2.getDisplayName(false, TimeZone.LONG));
      System.out.printf("%-32s%s%n", "Display name, short: ", tz2.getDisplayName(false, TimeZone.SHORT));
      System.out.printf("%-32s%s%n", "Display name, daylight, long: ", tz2.getDisplayName(true, TimeZone.LONG));
      System.out.printf("%-32s%s%n", "Display name, daylight, short: ", tz2.getDisplayName(true, TimeZone.SHORT));
      System.out.printf("%-32s%s%n", "ID: ", tz2.getID());
      
      System.out.println();
      
      TimeZone tz3 = TimeZone.getTimeZone("US/Mountain");
      System.out.println(tz3.getDisplayName());
      System.out.printf("%-32s%s%n", "Display name, long: ", tz3.getDisplayName(false, TimeZone.LONG));
      System.out.printf("%-32s%s%n", "Display name, short: ", tz3.getDisplayName(false, TimeZone.SHORT));
      System.out.printf("%-32s%s%n", "Display name, daylight, long: ", tz3.getDisplayName(true, TimeZone.LONG));
      System.out.printf("%-32s%s%n", "Display name, daylight, short: ", tz3.getDisplayName(true, TimeZone.SHORT));
      System.out.printf("%-32s%s%n", "ID: ", tz3.getID());
      
      System.out.println();
      
      TimeZone tz4 = TimeZone.getTimeZone("US/Pacific");
      System.out.println(tz4.getDisplayName());
      System.out.printf("%-32s%s%n", "Display name, long: ", tz4.getDisplayName(false, TimeZone.LONG));
      System.out.printf("%-32s%s%n", "Display name, short: ", tz4.getDisplayName(false, TimeZone.SHORT));
      System.out.printf("%-32s%s%n", "Display name, daylight, long: ", tz4.getDisplayName(true, TimeZone.LONG));
      System.out.printf("%-32s%s%n", "Display name, daylight, short: ", tz4.getDisplayName(true, TimeZone.SHORT));
      System.out.printf("%-32s%s%n", "ID: ", tz4.getID());
   }
}