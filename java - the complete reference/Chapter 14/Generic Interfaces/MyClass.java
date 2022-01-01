// the implementing class must specify the same bound as the generic interface
// the implementing class takes a type parameter and pass it to the type parameter of the interface
public class MyClass<T extends Comparable<T>> implements MinMax<T>
{
   private T[] values;
   
   public MyClass(T[] v)
   {
      values = v;
   }
   
   public T min()
   {
      T min = values[0];
      for (int i = 1; i < values.length; i++)
      {
         if (values[i].compareTo(min) < 0)
         {
            min = values[i];
         }
      }
      return min;
   }
   
   public T max()
   {
      T max = values[0];
      for (int i = 1; i < values.length; i++)
      {
         if (values[i].compareTo(max) > 0)
         {
            max = values[i];
         }
      }
      return max;
   }
}