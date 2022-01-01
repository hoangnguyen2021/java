public class MilkTea extends Tea
{   
   public String topping;
   
   public MilkTea(double aPrice, String aFlavor, String aTopping)
   {
      super("Milk Tea", aPrice, aFlavor);
      topping = aTopping;
   }
   
   public String toString()
   {
      return super.toString() + " " + topping;
   }
}