public class Generic<T>
{
   private T ob;
   
   public Generic(T o)
   {
      ob = o;
   }
   
   public T getOb()
   {
      return ob;
   }
   
   public String toString()
   {
      return getClass().getName() + "[ob = " + ob + "]";
   }
   
   public void showType()
   {
      System.out.println("Type of T is " + ob.getClass().getName());
   }
}