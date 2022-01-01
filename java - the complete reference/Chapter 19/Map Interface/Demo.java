import java.util.HashMap;
import java.util.Map;

public class Demo
{
   public static void main(String[] args)
   {
      Map<String, String> names = new HashMap<>();
      names.put("Kim", "Kardashian");
      names.put("Justin", "Bieber");
      names.put("Emma", "Watson");
      names.put("Blake", "Shelton");
      names.put("Charlie", "Puth");
      System.out.println(names);
      
      names.merge("Kim", "West", (o, n) -> o + " " + n);
      System.out.println(names);

      names.replaceAll((k, v) -> k + " " + v.charAt(0) + ".");
      System.out.println(names);

      names.forEach((k, v) -> System.out.println(k + ": " + v));
   }
}