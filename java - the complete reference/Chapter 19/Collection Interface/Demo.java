import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Demo
{
   public static void main(String[] args)
   {
      Collection<String> seasons = new ArrayList<>();
      seasons.add("spring");
      System.out.println("seasons is now: " + seasons);
      
      ArrayList<String> strs = new ArrayList<>();
      strs.add("summer");
      strs.add("fall");
      strs.add("winter");
      seasons.addAll(strs);
      System.out.println("seasons is now: " + seasons);
      
      System.out.println("seasons contains summer: " + seasons.contains("summer"));
      System.out.println("seasons contains strs: " + seasons.containsAll(strs));
      System.out.println("seasons equals strs: " + seasons.equals(strs));
      System.out.println("seasons is empty: " + seasons.isEmpty());
      
      seasons.remove("winter");
      System.out.println("seasons is now: " + seasons);
      
      seasons.removeAll(strs);
      System.out.println("seasons is now: " + seasons);
      
      seasons.addAll(strs);
      System.out.println("seasons is now: " + seasons);
      seasons.removeIf(s -> s.charAt(0) == 'w');
      System.out.println("seasons is now: " + seasons);
      
      seasons.retainAll(strs);
      System.out.println("seasons is now: " + seasons);
      
      String[] seasonsArray = seasons.toArray(String[]::new);
      System.out.println("seasonArray: " + Arrays.toString(seasonsArray));
      
      seasons.clear();
      System.out.println("seasons is now: " + seasons);
   }
}