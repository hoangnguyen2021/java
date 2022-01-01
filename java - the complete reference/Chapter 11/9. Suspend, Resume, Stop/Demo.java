public class Demo
{
   public static void main(String[] args)
   {
      MyThread r1 = new MyThread("Thread 1");
      MyThread r2 = new MyThread("Thread 2");
      r1.getThread().start();
      r2.getThread().start();
      
      try
      {
         Thread.sleep(5000);
         r1.mySuspend();
         System.out.println("Suspending thread 1.");
         Thread.sleep(5000);
         r1.myResume();
         System.out.println("Resuming thread 1.");
         r2.mySuspend();
         System.out.println("Suspending thread 2.");
         Thread.sleep(5000);
         r2.myResume();
         System.out.println("Resuming thread 2.");
      }
      catch (InterruptedException e)
      {
         System.out.println("Main thread interrupted.");
      }
      
      try
      {
         System.out.println("Waiting for threads to finish.");
         r1.getThread().join();
         r2.getThread().join();
      }
      catch (InterruptedException e)
      {
         System.out.println("Main thread interrupted.");
      }
   }
}