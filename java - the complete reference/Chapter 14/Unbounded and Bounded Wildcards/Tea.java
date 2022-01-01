public class Tea extends Beverage
{
   private String flavor;
   
   public Tea(String aName, double aPrice, String aFlavor)
   {
      super(aName, aPrice);
      flavor = aFlavor;
   }
   
   public String toString()
   {
      return super.toString() + " " + flavor;
   }
}