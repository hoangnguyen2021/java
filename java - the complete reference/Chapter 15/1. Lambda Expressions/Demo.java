public class Demo
{
   public static void main(String[] args)
   {
      NumericTest isEven = n -> n % 2 == 0;
      int a = 7;
      if (isEven.test(a))
      {
         System.out.println(a + " is even");
      }
      else
      {
         System.out.println(a + " is odd");
      }
      
      NumericTest isPositive = n -> n > 0;
      int b = -5;
      System.out.println(b + " is positive: " + isPositive.test(b));
   }
}