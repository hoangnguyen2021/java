public class Producer implements Runnable
{
   private Thread t;
   private Q q;
   
   public Producer(Q q)
   {
      t = new Thread(this, "Producer");
      this.q = q;
   }
   
   public Thread getThread()
   {
      return t;
   }
   
   public void run()
   {
      for (int i = 0; i < 10; i++)
      {
         q.put(i);
      }
   }
}