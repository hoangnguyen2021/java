public class Demo
{
   public static void main(String[] args)
   {
      NumericFunctions n1 = new NumericFunctions(6);
      System.out.println("6! = " + functionValue(n1::factorial));
      System.out.println("6^2 = " + functionValue(n1::square));
      
      NumericFunctions n2 = new NumericFunctions(7);
      System.out.println("7! = " + functionValue(n2::factorial));
      System.out.println("7^2 = " + functionValue(n2::square));
   }
   
   /**
      This method computes the value of the function.
      @param f the function
      @return the value of the function
   */
   public static double functionValue(NumericFunction f)
   {
      return f.apply();
   }
}