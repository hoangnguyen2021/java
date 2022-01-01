public class Country implements Comparable<Country>
{
   private String name;
   private double area;

   public Country(String aName, double anArea) 
   { 
      name = aName;
      area = anArea; 
   }

   public String getName() 
   {
      return name;
   }

   public double getArea() 
   {
      return area;
   }

   public int compareTo(Country other) 
   {
      return Double.compare(area, other.getArea());
   }
   
   public String toString()
   {
      return getClass().getName() + "[name=" + name + ", area=" + area + "]";
   }
}