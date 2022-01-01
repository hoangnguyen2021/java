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
      
   }
}