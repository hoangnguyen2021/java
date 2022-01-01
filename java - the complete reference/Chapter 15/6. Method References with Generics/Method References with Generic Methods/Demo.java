public class Demo
{
   public static <T> int count(MyFunction<T> f, T[] obs, T ob2)
   {
      return f.apply(obs, ob2);
   }
   
   public static void main(String[] args)
   {
      Integer[] array1 = {4, 8, 5, 2, 3, 2, 4, 6, 4, 10};
      System.out.println("Equal to 4: " + count(Count::countMatch, array1, 4));        // or Count::<Integer>countMatch
      System.out.println("Larger than 5: " + count(Count::countLarger, array1, 3));    // or Count::<Integer>countLarger
      System.out.println("Smaller than 6: " + count(Count::countSmaller, array1, 5));  // or Count::<Integer>countSmaller
   }
}