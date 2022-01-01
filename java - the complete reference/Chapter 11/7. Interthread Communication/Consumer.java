public class Consumer implements Runnable
{
   private Q q;
   private Thread t;
   
   public Consumer(Q q)
   {
      this.q = q;
      t = new Thread(this, "Consumer");
   }
   
   public Thread getThread()
   {
      return t;
   }
   
   public void run()
   {
      for (int i = 0; i < 10; i++)
      {
         q.get();
      }
   }
}