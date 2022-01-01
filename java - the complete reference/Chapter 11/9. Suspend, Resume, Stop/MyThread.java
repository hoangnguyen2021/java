public class MyThread implements Runnable
{
   private Thread t;
   private boolean suspendFlag;
   
   public MyThread(String name)
   {
      t = new Thread(this, name);
      suspendFlag = false;
   }
   
   public Thread getThread()
   {
      return t;
   }
   
   public void run()
   {
      try
      {
         for (int i = 15; i > 0; i--)
         {
            System.out.println(t.getName() + ": " + i);
            Thread.sleep(1000);
            synchronized (this)
            {
               while (suspendFlag) { wait(); }
            }
         }
      }
      catch (InterruptedException e)
      {
         System.out.println(t.getName() + " interrupted.");
      }
   }
   
   public synchronized void mySuspend()
   {
      suspendFlag = true;
   }
   
   public synchronized void myResume()
   {
      suspendFlag = false;
      notify();
   }
}