public class MyClass<T>
{
   private T ob;
   
   public MyClass(T o)
   {
      ob = o;
   }
   
   public String toString()
   {
      return getClass().getName() + "[ob=" + ob + "]";
   }
}