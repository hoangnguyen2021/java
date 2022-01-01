public class Item
{
   private String name;
   private double price;
   
   public Item(String aName, double aPrice)
   {
      name = aName;
      price = aPrice;
   }
   
   public String toString()
   {
      return name + " " + price;
   }
}