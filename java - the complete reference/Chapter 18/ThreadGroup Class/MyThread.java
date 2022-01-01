public class MyThread extends Thread
{
   private boolean suspendFlag;
   
   public MyThread(ThreadGroup group, String name)
   {
      super(group, name);
      suspendFlag = false;
   }
   
   public void run()
   {
      try
      {
         for (int i = 5; i > 0; i--)
         {
            System.out.println(getName() + ": " + i);
            Thread.sleep(1000);
            synchronized (this)
            {
               while (suspendFlag) { wait(); }
            }
         }
      }
      catch (InterruptedException e)
      {
         System.out.println(getName() + " interrupted.");
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
