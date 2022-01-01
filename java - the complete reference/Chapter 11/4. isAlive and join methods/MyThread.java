public class MyThread implements Runnable
{
   private Thread t;
   
   public MyThread(String name)
   {
      t = new Thread(this, name);
   }
   
   public Thread getThread()
   {
      return t;
   }
   
   public void run()
   {
      try
      {
         for (int i = 5; i > 0; i--)
         {
            System.out.println(t.getName() + ": " + i);
            Thread.sleep(500);
         }
      }
      catch (InterruptedException e)
      {
         System.out.println(t.getName() + " interrupted.");
      }
      System.out.println(t.getName() + " exiting.");
   }
}
