public class Demo
{
   public static void main(String[] args)
   {
      NumericFunction factorial = n ->
      {
         int result = 1;
         for (int i = 1; i <= n; i++)
         {
            result = result * i;
         }
         return result;
      };
      System.out.println("4! = " + factorial.function(4));
   }
}