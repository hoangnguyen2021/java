public class ThreadDemo
{
   public static void main(String[] args)
   {
      MyThread r1 = new MyThread("Thread 1");
      MyThread r2 = new MyThread("Thread 2");
      MyThread r3 = new MyThread("Thread 3");
      Thread t1 = r1.getThread();
      Thread t2 = r2.getThread();
      Thread t3 = r3.getThread();
      t1.start();
      t2.start();
      t3.start();
      System.out.println("Thread 1 is alive: " + t1.isAlive());
      System.out.println("Thread 2 is alive: " + t2.isAlive());
      System.out.println("Thread 3 is alive: " + t3.isAlive());
      try
      {
         t1.join();
         t2.join();
         t3.join();
      }
      catch (InterruptedException e)
      {
         System.out.println("Main thread interrupted.");
      }
      System.out.println("Thread 1 is alive: " + t1.isAlive());
      System.out.println("Thread 2 is alive: " + t2.isAlive());
      System.out.println("Thread 3 is alive: " + t3.isAlive());
      System.out.println("Main thread exiting.");
   }
}