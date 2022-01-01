public class Demo
{
   public static void main(String[] args)
   {
      display(n -> n * n + 2, 4);
   }
   
   public static void display(NumericFunction f, int x)
   {
      System.out.println("x = " + x);
      System.out.println("f(x) = " + f.function(x));
   }
}