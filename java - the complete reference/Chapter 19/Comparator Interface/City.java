public class City implements Comparable<City>
{
   private String name;
   private String state;
   private int population;

   public City(String aName, String aState, int aPopulation)
   {
      name = aName;
      state = aState;
      population = aPopulation;
   }
   
   public String getName()
   {
      return name;
   }
   
   public String getState()
   {
      return state;
   }
   
   public int getPopulation()
   {
      return population;
   }
   
   public String toString() 
   {
      return name;
   }
   
   public int compareTo(City other)
   {
      return name.compareTo(other.name);
   }
}