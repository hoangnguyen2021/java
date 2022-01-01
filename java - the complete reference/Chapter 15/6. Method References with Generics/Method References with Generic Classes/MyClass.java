public class MyClass<T>
{
   private T ob;
   
   public void setOb(T anOb)
   {
      ob = anOb;
   }
   
   public String toString()
   {
      return getClass().getName() + "[ob=" + ob + "]";
   }
}