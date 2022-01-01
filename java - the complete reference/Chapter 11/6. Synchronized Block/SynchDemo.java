public class SynchDemo
{
   public static void main(String[] args)
   {
      CallMe target = new CallMe();
      Caller c1 = new Caller("Thread 1", target, "Hello");
      Caller c2 = new Caller("Thread 2", target, "Hi");
      Caller c3 = new Caller("Thread 3", target, "Goodbye");
      c1.getThread().start();
      c2.getThread().start();
      c3.getThread().start();
      try
      {
         c1.getThread().join();
         c2.getThread().join();
         c3.getThread().join();
      }
      catch (InterruptedException e)
      {
         System.out.println("Interrupted");
      }
   }
}