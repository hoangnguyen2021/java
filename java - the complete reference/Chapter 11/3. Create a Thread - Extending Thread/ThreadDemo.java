public class ThreadDemo
{
   public static void main(String[] args)
   {
      MyThread t1 = new MyThread();
      t1.start();
      try
      {
         
      }
      catch (InterruptedException e)
      {
         System.out.println("Main thread interrupted.");
      }
   }
}