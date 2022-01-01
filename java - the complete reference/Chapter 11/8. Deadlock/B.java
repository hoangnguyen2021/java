public class B
{
   public synchronized void bar(A a)
   {
      String name = Thread.currentThread().getName();
      System.out.println(name + " entered B.bar()");
      
      try
      {
         Thread.sleep(1000);
      }
      catch (InterruptedException e)
      {
         System.out.println("B interrupted.");
      }
      
      System.out.println(name + " trying to call A.last()");
      a.last();
   }
   
   public synchronized void last()
   {
      System.out.println("Inside B.last()");
   }
}