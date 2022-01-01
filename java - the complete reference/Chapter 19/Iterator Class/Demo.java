import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo
{
   public static void main(String[] args)
   {
      Collection<String> seasons = new ArrayList<>();
      seasons.add("spring");
      seasons.add("summer");
      seasons.add("fall");
      seasons.add("winter");
      Iterator<?> i = seasons.iterator();
      i.forEachRemaining(s -> System.out.println(s));
      System.out.println();
      
      Collection<String> continents = new ArrayList<>();
      continents.add("Africa");
      continents.add("North America");
      continents.add("South America");
      continents.add("Europe");
      continents.add("Asia");
      continents.add("Antarctica");
      continents.add("Australia");
      i = continents.iterator();
      while (i.hasNext())
      {
         System.out.println(i.next());
      }
   }
}