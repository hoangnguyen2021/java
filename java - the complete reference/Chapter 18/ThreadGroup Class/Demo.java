public class Demo
{
   public static void main(String[] args)
   {
      ThreadGroup groupA = new ThreadGroup("Group A");
      ThreadGroup groupB = new ThreadGroup("Group B");
      MyThread t1 = new MyThread(groupA, "Thread 1");
      MyThread t2 = new MyThread(groupA, "Thread 2");
      MyThread t3 = new MyThread(groupB, "Thread 3");
      MyThread t4 = new MyThread(groupB, "Thread 4");
      
      t1.start();
      t2.start();
      t3.start();
      t4.start();
      
      groupA.list();
      groupB.list();
      System.out.println();
      
      MyThread[] arrayA = new MyThread[groupA.activeCount()];
      groupA.enumerate(arrayA);
      
      System.out.println("Suspending Group A");
      for (MyThread t : arrayA)
      {
         t.mySuspend();
      }
      
      try
      {
         Thread.sleep(4000);
      }
      catch (InterruptedException e)
      {
         System.out.println("Main thread interrupted.");
      }
      
      System.out.println("Resuming Group A");
      for (MyThread t : arrayA)
      {
         t.myResume();
      }
      
      try
      {
         t1.join();
         t2.join();
         t3.join();
         t4.join();
      }
      catch (InterruptedException e)
      {
         System.out.println("Main thread interrupted.");
      }
   }
}