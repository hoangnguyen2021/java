public class HighTemp
{
   private int highTemp;
   
   public HighTemp(int ht)
   {
      highTemp = ht;
   }
   
   public boolean isHigherThan(HighTemp ht2)
   {
      return highTemp > ht2.highTemp;
   }
   
   public boolean isLowerThan(HighTemp ht2)
   {
      return highTemp < ht2.highTemp;
   }
}