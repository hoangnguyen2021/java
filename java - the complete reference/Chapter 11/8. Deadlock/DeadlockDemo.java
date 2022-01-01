public class DeadlockDemo
{
   public static void main(String[] args)
   {
      Thread.currentThread().setName("MainThread");
      Deadlock d = new Deadlock();
      d.deadlockStart();
   }
}