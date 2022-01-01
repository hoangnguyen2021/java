public class Demo
{
   public static void main(String[] args)
   {
      System.out.println("6! = " + functionValue(NumericFunctions::factorial, 6));
      System.out.println("6^2 = " + functionValue(NumericFunctions::square, 6));
      
      System.out.println("7! = " + functionValue(NumericFunctions::factorial, 7));
      System.out.println("7^2 = " + functionValue(NumericFunctions::square, 7));
   }
   
   /**
      This method computes the value of the function.
      @param f the function
      @param x the argument of the function
      @return the value of the function
   */
   public static double functionValue(NumericFunction f, double x)
   {
      return f.apply(x);
   }
}