public class Country implements Measurable
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

   public double getMeasure() 
   {
      return area;
   }
}