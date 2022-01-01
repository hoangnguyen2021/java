public class NumericFunctions
{
   private double n;
   
   public NumericFunctions(double n)
   {
      this.n = n;
   }
   
   public double factorial()
   {
      int result = 1;
      for (int i = 2; i <= n; i++)
      {
         result = result * i;
      }
      return result;
   }
   
   public double square()
   {
      return n * n;
   }
}