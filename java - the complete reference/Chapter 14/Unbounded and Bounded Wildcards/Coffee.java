public class Coffee extends Beverage
{
   private String temp;
   
   public Coffee(String aName, double aPrice, String aTemp)
   {
      super(aName, aPrice);
      temp = aTemp;
   }
   
   public String toString()
   {
      return super.toString() + " " + temp;
   }
}