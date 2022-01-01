public class Demo
{
   public static void main(String[] args)
   {
      SomeFunction<Integer> square = n -> n * n;
      System.out.println(square.function(4));
      
      SomeFunction<String> reverse = s ->
      {
         String result = "";
         for (int i = s.length() - 1; i >= 0; i--)
         {
            result = result + s.charAt(i);
         }
         return result;
      };
      System.out.println(reverse.function("apple"));
   }
}