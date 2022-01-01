public class Q
{
   private int n;
   private boolean valueSet = false;
   
   public synchronized int get()
   {
      while (!valueSet)
      {
         try
         {
            wait();
         }
         catch (InterruptedException e)
         {
            System.out.println("InterruptedException caught");
         }
      }
      valueSet = false;
      System.out.println("Got: " + n);
      notify();
      return n;
   }
   
   public synchronized void put(int n)
   {
      while (valueSet)
      {
         try
         {
            wait();
         }
         catch (InterruptedException e)
         {
            System.out.println("InterruptedException caught");
         }
      }
      this.n = n;
      valueSet = true;
      System.out.println("Put: " + n);
      notify();
   }  
}