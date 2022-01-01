import java.util.Locale;

public class Demo
{
   public static void main(String[] args)
   {
      Locale l1 = Locale.getDefault();
      System.out.println("Country: " + l1.getDisplayCountry());
      System.out.println("Country code: " + l1.getCountry());
      System.out.println("Language: " + l1.getDisplayLanguage());
      System.out.println("Language code: " + l1.getLanguage());
      System.out.println("Display name: " + l1.getDisplayName());
      
      System.out.println();
      
      Locale l2 = Locale.GERMANY;
      System.out.println("Country: " + l2.getDisplayCountry());
      System.out.println("Country code: " + l2.getCountry());
      System.out.println("Language: " + l2.getDisplayLanguage());
      System.out.println("Language code: " + l2.getLanguage());
      System.out.println("Display name: " + l2.getDisplayName());
   }
}