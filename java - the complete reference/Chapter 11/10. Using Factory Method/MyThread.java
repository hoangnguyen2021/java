public class MyThread implements Runnable
{
   private Thread t;
   
   public MyThread()
   {
      t = new Thread(this);
   }
   
   public static MyThread createAndStart()
   {
      MyThread mt = new MyThread();
      mt.t.start();
      return mt;
   }
   
   // this is the entry point for this thread
   public void run()
   {
      // do something
   }
}