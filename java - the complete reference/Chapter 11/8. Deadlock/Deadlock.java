public class Deadlock implements Runnable
{
   private A a;
   private B b;
   Thread t;
   
   public Deadlock()
   {
      a = new A();
      b = new B();
      t = new Thread(this, "RacingThread");
   }
   
   public void deadlockStart()
   {
      t.start();
      a.foo(b);
      System.out.println("Back in main thread");
   }
   
   public void run()
   {
      b.bar(a);
      System.out.println("Back in other thread");
   }
}