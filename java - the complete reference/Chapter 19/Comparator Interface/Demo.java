import java.util.Comparator;
import java.util.TreeMap;
import java.util.Map;

public class Demo
{
   public static void main(String[] args)
   {
      City c1 = new City("Los Angeles", "California", 3970219);
      City c2 = new City("Dallas", "Texas", 1343266);
      City c3 = new City("Chicago", "Illnois", 2677643);
      City c4 = new City("San Antonio", "Texas", 1567118);
      City c5 = new City("Phoenix", "Arizona", 1708127);
      City c6 = new City("San Jose", "California", 1013616);
      City c7 = new City("New York City", "New York", 8253213);
      City c8 = new City("San Diego", "California", 1422420);
      City c9 = new City("Houston", "Texas", 2316120);
      City c10 = new City("Philadelphia", "Pennsylvania", 1578487);
      
      // map1, sorted by city name alphabetically
      Map<City, Integer> map1 = new TreeMap<>();
      map1.put(c1, 1);
      map1.put(c2, 2);
      map1.put(c3, 3);
      map1.put(c4, 4);
      map1.put(c5, 5);
      map1.put(c6, 6);
      map1.put(c7, 7);
      map1.put(c8, 8);
      map1.put(c9, 9);
      map1.put(c10, 10);
      System.out.println(map1);
      
      // map2, sorted by population from high to low
      Map<City, Integer> map2 = new TreeMap<>(
         Comparator.comparing(City::getPopulation).reversed());
      map2.put(c1, 1);
      map2.put(c2, 2);
      map2.put(c3, 3);
      map2.put(c4, 4);
      map2.put(c5, 5);
      map2.put(c6, 6);
      map2.put(c7, 7);
      map2.put(c8, 8);
      map2.put(c9, 9);
      map2.put(c10, 10);
      System.out.println(map2);
      
      // map3, sorted by state name and then by city name alphabetically
      Map<City, Integer> map3 = new TreeMap<>(
         Comparator.comparing(City::getState)
                   .thenComparing(City::getName));
      map3.put(c1, 1);
      map3.put(c2, 2);
      map3.put(c3, 3);
      map3.put(c4, 4);
      map3.put(c5, 5);
      map3.put(c6, 6);
      map3.put(c7, 7);
      map3.put(c8, 8);
      map3.put(c9, 9);
      map3.put(c10, 10);
      System.out.println(map3);
      
      // map4, sorted by city name's length and then by city name alphabetically
      Map<City, Integer> map4 = new TreeMap<>(
         Comparator.comparing(City::getName, Comparator.comparing(String::length))
                   .thenComparing(City::getName));
      map4.put(c1, 1);
      map4.put(c2, 2);
      map4.put(c3, 3);
      map4.put(c4, 4);
      map4.put(c5, 5);
      map4.put(c6, 6);
      map4.put(c7, 7);
      map4.put(c8, 8);
      map4.put(c9, 9);
      map4.put(c10, 10);
      System.out.println(map4);
   }
}