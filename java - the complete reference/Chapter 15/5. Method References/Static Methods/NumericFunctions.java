public class NumericFunctions
{
   public static double factorial(double n)
   {
      int result = 1;
      for (int i = 2; i <= n; i++)
      {
         result = result * i;
      }
      return result;
   }
   
   public static double square(double n)
   {
      return n * n;
   }
}