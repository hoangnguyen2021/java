public class Count
{
   public static <T extends Comparable<T>> int countMatch(T[] obs, T ob2)
   {
      int count = 0;
      for (T ob : obs)
      {
         if (ob.compareTo(ob2) == 0) { count++; }
      }
      return count;
   }
   
   public static <T extends Comparable<T>> int countLarger(T[] obs, T ob2)
   {
      int count = 0;
      for (T ob : obs)
      {
         if (ob.compareTo(ob2) > 0) { count++; }
      }
      return count;
   }
   
   public static <T extends Comparable<T>> int countSmaller(T[] obs, T ob2)
   {
      int count = 0;
      for (T ob : obs)
      {
         if (ob.compareTo(ob2) < 0) { count++; }
      }
      return count;
   }
}