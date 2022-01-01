import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Demo
{
   public static void main(String[] args)
   {
      List<String> words = new ArrayList<>();
      words.add("Hello");
      words.add("Hi");
      words.add("Goodbye");
      System.out.println(words);
      
      words.replaceAll(s -> s.toUpperCase());
      System.out.println(words);
      
      words.sort(null);
      System.out.println(words);
      
      words.sort((s1, s2) -> s1.length() - s2.length());
      System.out.println(words);
   }
}