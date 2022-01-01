public class Beverage implements Measurable
{
   private String name;
   private double price;
   
   public Beverage(String aName, double aPrice)
   {
      name = aName;
      price = aPrice;
   }
   
   public double getMeasure()
   {
      return price;
   }
   
   public String toString()
   {
      return name + " " + price;
   }
}